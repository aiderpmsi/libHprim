grammar HPRIMS;

options {
  language = Java;
}

@parser::header {
package com.github.aiderpmsi.hprim.parser.antlr;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedList;
import java.util.Arrays;

import com.github.aiderpmsi.hprim.parser.MatchRegexTokenException;
import com.github.aiderpmsi.hprim.parser.ContentHandlerException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

}

@lexer::header {
package com.github.aiderpmsi.hprim.parser.antlr;

}

@lexer::members {
}

@parser::members {

  // ========== Elements de définition des documents ===========
  private final static List<String> h_5 = Arrays.asList(new String[] {"^.{1,}$", "^.{1,}$"});
  private final static List<String> h_6 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
  private final static List<String> h_8 = Arrays.asList(new String[] {".*", ".*"});
  private final static List<String> h_10 = Arrays.asList(new String[] {"^.{1,}$", "^.{1,}$"});

  /**
   * Indicateur définissant s'il faut ou non enregistrer le parsing
   */
  boolean record = false;

  /**
   * Collecteur utilisé dans cette classe
   */
  public ContentHandler contentHandler;

  /**
   * Logger de la classe
   */
  private static final Logger logger = Logger.getLogger(HPRIMSParser.class.getCanonicalName());
  
  /**
   * Type utilisé pour se souvenir du dernier élément
   */
  private class XmlElement {
      public String uri;
      public String localName;
      public String qName;
  }
  
  /**
   * Liste des éléments parcourus
   */
  private LinkedList<XmlElement> xmlElements = new LinkedList<XmlElement>(); 

  /**
   * Niveau de conformance à HPRIM demandé
   * 1 = faible
   * 2 = moyen
   * 3 = fort
   */
  private int strictNess = 3;

  /**
   * Constructeur
   * @param lexer
   * @param my_col
   */
  public HPRIMSParser(TokenStream input, ContentHandler contentHandler) {
    this(input);
    this.contentHandler = contentHandler;
  }
  
  /**
   * Formate une erreur sous forme de chaine de caractères
   * @param err
   * @return
   */
  public String formatError(RecognitionException err) {
    return getErrorHeader(err) + " / " + getErrorMessage(err, this.getTokenNames());
  }

  /**
   * Encadre l'appel du contentHandler
   */
  public void startElement(String nameElement) throws ContentHandlerException {
    if (!record) return;

      try {
          // Enregistrement de cet élément
          XmlElement xmlElement = new XmlElement();
          xmlElement.uri = "";
          xmlElement.localName = nameElement;
          xmlElement.qName = nameElement;
          xmlElements.add(xmlElement);
          // Ajout de ce élément
          contentHandler.startElement("", nameElement, nameElement, new AttributesImpl());
       } catch (SAXException e) {
          ContentHandlerException exc = new ContentHandlerException(e.getMessage());
          exc.setIntStream(input);
          exc.setStartToken(input.LT(1));
          throw exc;
       }
    }
   
  /**
   * Encadre l'appel du contentHandler
   */
  public void endElement() throws ContentHandlerException {
    if (!record) return;

    try {
        XmlElement xmlElement = xmlElements.pollLast();
        contentHandler.endElement(xmlElement.uri,
            xmlElement.localName, xmlElement.qName);
     } catch (SAXException e) {
        ContentHandlerException exc = new ContentHandlerException(e.getMessage());
        exc.setIntStream(input);
        exc.setStartToken(input.LT(1));
        throw exc;
     }
  }

  /**
   * Début de document hprim
   */
  public void startDocument() throws ContentHandlerException {
    if (!record) return;

    try {
        contentHandler.startDocument();
     } catch (SAXException e) {
        ContentHandlerException exc = new ContentHandlerException(e.getMessage());
        exc.setIntStream(input);
        exc.setStartToken(input.LT(1));
        throw exc;
     }
  }

  /**
   * Fin de document hprim
   */
  public void endDocument() throws ContentHandlerException {
    if (!record) return;

    try {
        contentHandler.endDocument();
     } catch (SAXException e) {
        ContentHandlerException exc = new ContentHandlerException(e.getMessage());
        exc.setIntStream(input);
        exc.setStartToken(input.LT(1));
        throw exc;
     }
  }

  /**
   * Encadre l'appel du contentHandler
   */
  public void content(String content) throws ContentHandlerException {
    if (!record) return;

    try {
        contentHandler.characters(content.toCharArray(),
            0, content.length());
     } catch (SAXException e) {
         ContentHandlerException exc = new ContentHandlerException(e.getMessage());
         exc.setIntStream(input);
         exc.setStartToken(input.LT(1));
         throw exc;
     }
  }

  /**
   * Méthode pour permettre d'envoyer un message d'erreur correct lors d'une erreur de type
   * MatchRegexTokenException
   * @param e
   * @param tokenNames
   */
  public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    if (e instanceof MatchRegexTokenException) {
      MatchRegexTokenException mrte = (MatchRegexTokenException) e;
      return "Malformed message : " + mrte.getText() +
        " does not match " + mrte.getRegex();
    } else if (e instanceof ContentHandlerException) {
      ContentHandlerException che = (ContentHandlerException) e;
      return "Content handling error : " + che.getText();
    } else {
       return super.getErrorMessage(e, tokenNames);
    }
  }
  
  /**
   * La reconnaissance d'une erreur dans le parser 
   * lance une erreur et arrête l'ensemble du parsing immédiatement
   * @param tokenNames
   * @param e
   */
   public void emitErrorMessage(String msg) {
      throw new IllegalArgumentException(msg);
   }
    
    /**
     * Réalise un regexp
     * @param text
     * @param regex
     * @param input
     * @throws RecognitionException
     */
    public boolean matchRegex(String text, String regex, boolean force) {
      if (force == false && strictNess <= 1)
        return true;
      Pattern my_p = Pattern.compile(regex, Pattern.DOTALL);
      Matcher my_m = my_p.matcher(text);
      return my_m.matches();
    }

}  

// =========== Définition de la structure hprim ================
hprim[int strictNess]
@init{this.strictNess = $strictNess;startDocument();}
@after{endDocument();} :
  (line_h2_2_oru[false]) => (line_h2_2_oru[true] EOF)
  |
  (line_h2_2_adm[false]) => (line_h2_2_adm[true] EOF)
  ;


// =========== Définition des des lignes hprim =================

// == Ligne H ==

// Début de ligne H, identique pour toutes les versions
start_line_h :
  {startElement("H.1");content("H");endElement();}
  {startElement("H.2");} delimiters {endElement();}
  DELIMITER1 {startElement("H.3");} spec_field["^.{0,12}$", true, false] {endElement();}
  DELIMITER1 {startElement("H.4");} spec_field["^.{0,12}$", true, false] {endElement();}
  DELIMITER1 lvl1_fields["H.5", h_5, 2, "^.{0,15}$"]
  DELIMITER1 lvl1_fields["H.6", h_6, 0, "^.{0,100}$"];

// Milieu de ligne H, identique pour toutes les versions
midd_line_h :
  DELIMITER1 lvl1_fields_repet["H.8", h_8, 0, "^.{0,40}$"]
  DELIMITER1 {startElement("H.9");} spec_field["^.{0,40}$", true, false] {endElement();}
  DELIMITER1 lvl1_fields["H.10", h_10, 2, "^.{0,40}$"]
  DELIMITER1 {startElement("H.11");} spec_field["^.{0,80}$", true, false] {endElement();}
  DELIMITER1 {startElement("H.12");} spec_field["^(P|D|T)$", true, false] {endElement();};

// Bloc définissant les lines H en fonction de leur version
bloc_line_h_2_2 :
    DELIMITER1 {startElement("H.13");startElement("H.13.1");} spec_field["^H2\\.2$", true, true] {endElement();}
             DELIMITER2 {startElement("H.13.2");} spec_field["^(C|L|R)$", true, false] {endElement();endElement();};
  
// Fin de ligne, identiqu pour toutes les versions
end_line_h :
  DELIMITER1 {startElement("H.14");} spec_field["^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false] {endElement();}
  DELIMITER1? spec_field["", false, false]?;

// Messages ORU :
start_line_h_oru :
  start_line_h
  DELIMITER1 {startElement("H.7");} spec_field["^ORU$", true, true] {endElement();}
  midd_line_h;

line_h2_2_oru[boolean record]
@init{this.record = $record;startElement("H");}
@after{endElement();} :
  start_line_h_oru
  bloc_line_h_2_2
  end_line_h;

// Messages ADM :
start_line_h_adm :
  start_line_h
  DELIMITER1 {startElement("H.7");} spec_field["^ADM$", true, true] {endElement();}
  midd_line_h;

line_h2_2_adm[boolean record]
@init{this.record = $record;startElement("H");}
@after{endElement();} :
  start_line_h_adm
  bloc_line_h_2_2
  end_line_h;

// ========== Définitions de types spéciaux réutilisables ======
lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern]
@init{startElement(nameElement);}
@after{endElement();} :
  r=lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern];

lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern]:
  {$size == $patterns.size()}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                     ({strictNess <= 2}? (DELIMITER2 spec_field["", false, false])? | )
                                   {matchRegex($recorded.toString(), $completeFieldPattern, false)}?)
  |
  {$size < $nbMandatory}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                DELIMITER2 lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern])
  |
  ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
     ((DELIMITER2 lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]) | {matchRegex($recorded.toString(), $completeFieldPattern, false)}?))
  ;

lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern]
@init{startElement(nameElement);}
@after{endElement();} :
  r=lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern];

lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern]:
  {$size == $patterns.size()}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                     ({strictNess <= 2}? (REPETITEUR spec_field["", false, false])? | )
                                   {matchRegex($recorded.toString(), $completeFieldPattern, false)}?)
  |
  {$size < $nbMandatory}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                REPETITEUR lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern])
  |
  ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
     ((REPETITEUR lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]) | {matchRegex($recorded.toString(), $completeFieldPattern, false)}?))
  ;

// Champ, avec spécification de type
spec_field[String fieldPattern, boolean record, boolean forceRegex] :
  {matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)}?
  CONTENT
  {if (record) content($text);};

// Champ sans spécification de type
field[boolean record] :
  CONTENT
  {if (record) content($text);};

// Données de type délimiteurs
delimiters :
  DELIMITERS
  {content($text);};
 
// =========== Définitions pour le lexer perso =========

CR : 'h';
DELIMITER1: 'f';
DELIMITER2: 'e';
DELIMITER3: 'd';
DELIMITERS: 'c';
REPETITEUR: 'b';
CONTENT: 'a';