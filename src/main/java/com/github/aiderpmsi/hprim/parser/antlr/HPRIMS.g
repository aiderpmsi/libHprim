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
  private final static List<String> p_3 = Arrays.asList(new String[] {"^.{1,}$", ".*", ".*"});
  private final static List<String> p_6 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
  private final static List<String> p_11 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
  private final static List<String> p_13 = Arrays.asList(new String[] {".*", ".*"});
  private final static List<String> p_14 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
  private final static List<String> p_19 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
  private final static List<String> p_26 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*", ".*", ".*"});

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
  (line_h2_2_oru[false]) =>
    (line_h2_2_oru[true] body_p_oru+ EOF)
  |
  (line_h2_2_adm[false]) =>
    (line_h2_2_adm[true] body_p_oru+ EOF)
  ;

body_p_oru :
  (start_line_p) => (
    line_p ((start_line_c) => line_c)*);

// =========== Définition des des lignes hprim =================

// == Ligne C ==
// Ligne C (commentaires)
start_line_c:
  CR spec_field["^C$", false, true];

line_c
@init{startElement("C");}
@after{endElement();}:
  CR {startElement("C.1");} spec_field["^C$", true, true] {endElement();} 
  DELIMITER1 {startElement("C.2");} spec_field["^[0-9]{1,10}$", true, false] {endElement();}
  (DELIMITER1 {startElement("C.3");} spec_field["^(P|L)?$", true, false] {endElement();}
   (DELIMITER1 {startElement("C.4");} spec_field["^.{0,64000}$", true, false] {endElement();} (REPETITEUR {startElement("C.4");} spec_field["^.{0,64000}$", true, false] {endElement();})*  
    DELIMITER1?)?)?;

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
  DELIMITER1 {startElement("H.12");} spec_field["^[P|D|T]$", true, false] {endElement();};

// Bloc définissant les lines H en fonction de leur version
bloc_line_h_2_2 :
    DELIMITER1 {startElement("H.13");startElement("H.13.1");} spec_field["^H2\\.2$", true, true] {endElement();}
             DELIMITER2 {startElement("H.13.2");} spec_field["^[C|L|R]$", true, false] {endElement();endElement();};
  
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

// == Ligne P (patient) ==
start_line_p:
  CR spec_field["^P$", false, true];
  
line_p
@init{startElement("P");}
@after{endElement();} :
  CR {startElement("P.1");} spec_field["^P$", true, true] {endElement();} 
  DELIMITER1 {startElement("P.2");} spec_field["^[0-9]{1,4}$", true, false] {endElement();}
  DELIMITER1 lvl1_fields["P.3", p_3, 1, "^.{1,36}$"]
  DELIMITER1 {startElement("P.4");} spec_field["^.{0,16}$", true, false] {endElement();}
  (DELIMITER1 {startElement("P.5");} spec_field["^.{0,16}$", true, false] {endElement();}
   (DELIMITER1 lvl1_fields["P.6", p_6, 0, "^.{0,48}$"]
    (DELIMITER1 {startElement("P.7");} spec_field["^.{0,24}$", true, false] {endElement();}
     (DELIMITER1 {startElement("P.8");} spec_field["^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false] {endElement();}
      (DELIMITER1 {startElement("P.9");} spec_field["^[M|F|U]?$", true, false] {endElement();}
       (DELIMITER1 {startElement("P.10");} spec_field["^$", true, false] {endElement();}
        (DELIMITER1 lvl1_fields["P.11", p_11, 0, "^.{0,200}$"]
         (DELIMITER1 {startElement("P.12");} spec_field["^.{0,120}$", true, false] {endElement();}
          (DELIMITER1 lvl1_fields_repet["P.13", p_13, 0, "^.{0,40}$"]
           // Je ne sais pas si c'est chaque CNA qui ne doit pas faire plus de 60 caractères ou si c'est
           // l'ensemble qui ne doit pas en faire plus de 60. Je considère le premier
           (DELIMITER1 spec_sized_cna["P.14", p_14, 0, "^.{0,60}$"] (REPETITEUR spec_sized_cna["P.14", p_14, 0, "^.{0,60}$"])*
            (DELIMITER1 {startElement("P.15");} spec_field["^.{0,60}$", true, false] {endElement();}
             (DELIMITER1 {startElement("P.16");} spec_field["^.{0,60}$", true, false] {endElement();}
              // Le champ 8.17 (taille) est de type CQ : impossible d'en trouver la norme, je mets un numérique
              (DELIMITER1 {startElement("P.17");} spec_field["^[0-9]{0,10}$", true, false] {endElement();}
               // Le champ 8.18 (poids) est de type CQ : impossible d'en trouver la norme, je mets un numérique
               (DELIMITER1 {startElement("P.18");} spec_field["^[0-9]{0,10}$", true, false] {endElement();}
                (DELIMITER1 lvl1_fields["P.19", p_19, 0, "^.{0,200}$"] (REPETITEUR lvl1_fields["P.19", p_19, 0, "^.{0,200}$"])*
                 (DELIMITER1 {startElement("P.20");} spec_field["^.{0,200}$", true, false] {endElement();} (REPETITEUR {startElement("P.20");} spec_field["^.{0,200}$", true, false] {endElement();})*
                  (DELIMITER1 {startElement("P.21");} spec_field["^.{0,200}$", true, false] {endElement();}
                   (DELIMITER1 {startElement("P.22");} spec_field["^.{0,60}$", true, false] {endElement();}
                    (DELIMITER1 {startElement("P.23");} spec_field["^.{0,60}$", true, false] {endElement();}
                     (DELIMITER1 {startElement("P.24");} spec_field["^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false] {endElement();} (REPETITEUR {startElement("P.24");} spec_field["^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false] {endElement();})*
                      (DELIMITER1 {startElement("P.25");} spec_field["^(OP|IP|ER|PA|MP)?^$", true, false] {endElement();}
                       (DELIMITER1 lvl1_fields["P.26", p_26, 0, "^.{0,100}$"]
                        // Je n'ai pas la table des classification du diagnostic, je mets une chaine de caractères 
                        (DELIMITER1 {startElement("P.27");} spec_field["^.{0,100}$", true, false] {endElement();}
                         (DELIMITER1 {startElement("P.28");} spec_field["^$", true, false] {endElement();}
                          // Je n'ai pas la table de classification de situation maritale, je mets une chaine de caractères
                          (DELIMITER1 {startElement("P.29");} spec_field["^.{0,2}$", true, false] {endElement();}
                           // Je n'ai pas la table des précautions à prendre, je mets une chaine de caractères
                           (DELIMITER1 {startElement("P.30");} spec_field["^.{0,20}$", true, false] {endElement();}
                            (DELIMITER1 {startElement("P.31");} spec_field["^.{0,20}$", true, false] {endElement();}
                             // Je n'ai pas la table du statut de confidentialité, je mets une chaine de caractères
                             (DELIMITER1 {startElement("P.32");} spec_field["^.{0,20}$", true, false] {endElement();}
                              (DELIMITER1 {startElement("P.33");} spec_field["^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false] {endElement();}
                               (DELIMITER1 {startElement("P.34");} spec_field["^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false] {endElement();}
                                DELIMITER1?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?;

// ======= Définitions de types spécaux non réutilisables ==========
spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern]
@init{startElement($nameElement);}
@after{endElement();}:
  {startElement($nameElement + ".1");} h=field[true] {endElement();}
   (DELIMITER2 i=lvl2_fields[$nameElement + ".2", $patterns, $nbMandatory, ".*"]
    (DELIMITER2 {startElement($nameElement + ".3");} j=field[true] {endElement();})?)?
  {matchRegex(($h.text == null ? "" : $h.text) + ($i.contentText == null ? "" : $i.contentText) + ($j.text == null ? "" : $j.text), $completeFieldPattern, false)}?;

// ========== Définitions de types spéciaux réutilisables ======
// Répétitions de champs entre délimiteurs 2
lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText]
@init{startElement(nameElement);}
@after{endElement();} :
  r=lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] {$contentText = $r.contentText;};
  
lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText]:
  {$size == $patterns.size()}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                     ({strictNess <= 2}? DELIMITER2 spec_field["", false, false])?
                                   {$contentText = $recorded.toString();} {matchRegex($recorded.toString(), $completeFieldPattern, false)}?)
  |
  {$size < $nbMandatory}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                DELIMITER2 h=lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                                {$contentText = $h.contentText;})
  |
  ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
     ((DELIMITER2 h=lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] {$contentText = $h.contentText;}) |
       {$contentText = $recorded.toString();} {matchRegex($recorded.toString(), $completeFieldPattern, false)}?))
  ;

lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern]
@init{startElement(nameElement);}
@after{endElement();} :
  r=lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern];

lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText]:
  {$size == $patterns.size()}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                     ({strictNess <= 2}? (REPETITEUR spec_field["", false, false])? | )
                                   {$contentText = $recorded.toString();} {matchRegex($recorded.toString(), $completeFieldPattern, false)}?)
  |
  {$size < $nbMandatory}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                REPETITEUR h=lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                                {$contentText = $h.contentText;})
  |
  ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
     ((REPETITEUR h=lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] {$contentText = $h.contentText;}) |
       {$contentText = $recorded.toString();} {matchRegex($recorded.toString(), $completeFieldPattern, false)}?))
  ;

// Répétition de champs entre délimiteurs 3
lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText]
@init{startElement(nameElement);}
@after{endElement();} :
  r=lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] {$contentText = $r.contentText;};

lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText]:
  {$size == $patterns.size()}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                     ({strictNess <= 2}? (DELIMITER3 spec_field["", false, false])? | )
                                   {$contentText = $recorded.toString();} {matchRegex($recorded.toString(), $completeFieldPattern, false)}?)
  |
  {$size < $nbMandatory}? => ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
                                DELIMITER3 h=lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                                {$contentText = $h.contentText;})
  |
  ({startElement($nameElement + "." + $size);} g=spec_field[$patterns.get($size - 1), true, false] {$recorded.append($g.text);endElement();}
     ((DELIMITER3 h=lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] {$contentText = $h.contentText;}) |
       {$contentText = $recorded.toString();} {matchRegex($recorded.toString(), $completeFieldPattern, false)}?))
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