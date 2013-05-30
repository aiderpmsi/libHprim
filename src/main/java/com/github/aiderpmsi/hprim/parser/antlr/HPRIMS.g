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
  private int strictNess = 2;

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
    public boolean matchRegex(String text, String regex) {
      if (strictNess <= 1)
        return true;
      Pattern my_p = Pattern.compile(regex, Pattern.DOTALL);
      Matcher my_m = my_p.matcher(text);
      return my_m.matches();
    }

}  

// =========== Définition de la structure hprim ================

// =========== Définition des des lignes hprim =================

hprim
@init{startDocument();}
@after{endDocument();} :
  start_line_h EOF;

// Début de ligne H, identique pour toutes les versions
start_line_h :
  {startElement("H.1");content("H");endElement();}
  {startElement("H.2");} delimiters {endElement();}
  DELIMITER1 {startElement("H.3");} field {endElement();}
  DELIMITER1 {startElement("H.4");} field {endElement();}
  DELIMITER1 {startElement("H.5");}
    ({startElement("H.5.1");} h_5_1=spec_field["^.{1,}$"] {endElement();}
     DELIMITER2 {startElement("H.5.2");} h_5_2=spec_field["^.{1,}$"] {endElement();}
     (| {strictNess <= 2}? (DELIMITER2 spec_field[""])?)) {matchRegex($h_5_1.text + $h_5_2.text, "^.{0,15}$")}? {endElement();};

// ========== Définitions de types spéciaux réutilisables ======

// Champ, avec spécification de champ
spec_field[String fieldPattern] :
  {matchRegex(input.LT(1).getText(), fieldPattern)}?
  CONTENT
  {content($text);};

// Champ sans spécification de type
field :
  CONTENT
  {content($text);};

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