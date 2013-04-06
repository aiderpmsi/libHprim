grammar HPRIMS;

options {
  language = Java;
}

@header {
package aider.org.hprim.parser.antlr;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedList;

import aider.org.hprim.parser.MatchRegexTokenException;
import aider.org.hprim.parser.ContentHandlerException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

}


@lexer::header {
package aider.org.hprim.parser.antlr;

}

@lexer::members {
}

@members {

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
    public void matchRegex(String text, String regex, Token startToken) throws RecognitionException {
      Pattern my_p = Pattern.compile(regex, Pattern.DOTALL);
      Matcher my_m = my_p.matcher(text);
      if (!my_m.matches())
        throw new MatchRegexTokenException(input, startToken, text, regex);
    }

}  

// =========== Définition de la structure hprim ================

hprim
@init{startDocument();}
@after{endDocument();}:
  hprim_oru_2_2 | hprim_oru_2_1 | hprim_oru_2_0 |
  hprim_orm_2_2 | hprim_orm_2_1 | hprim_orm_2_0 |
  hprim_ora_2_2 | hprim_ora_2_1 | hprim_ora_2_0 ;

// Messages ORU
hprim_oru_2_2
@init{startElement("HPRIM.ORU.2.2");startElement("H");}
@after{endElement();endElement();}:
  line_h2_2_oru
  body_p_oru+
  line_l
  CR?
  EOF;

hprim_oru_2_1
@init{startElement("HPRIM.ORU.2.1");startElement("H");}
@after{endElement();endElement();}:
  line_h2_1_oru
  body_p_oru+
  line_l
  CR?
  EOF;

hprim_oru_2_0
@init{startElement("HPRIM.ORU.2.0");startElement("H");}
@after{endElement();endElement();}:
  line_h2_0_oru
  body_p_oru+
  line_l
  CR?
  EOF;

// Messages ORA
hprim_ora_2_2
@init{startElement("HPRIM.ORA.2.2");startElement("H");}
@after{endElement();endElement();}:
  line_h2_2_ora
  body_p_ora+
  line_l
  CR?
  EOF;

hprim_ora_2_1
@init{startElement("HPRIM.ORA.2.1");startElement("H");}
@after{endElement();endElement();}:
  line_h2_1_ora
  body_p_ora+
  line_l
  CR?
  EOF;

hprim_ora_2_0
@init{startElement("HPRIM.ORA.2.0");startElement("H");}
@after{endElement();endElement();}:
  line_h2_0_ora
  body_p_ora+
  line_l
  CR?
  EOF;

// Messages ORM
hprim_orm_2_2
@init{startElement("HPRIM.ORM.2.2");startElement("H");}
@after{endElement();endElement();}:
  line_h2_2_orm
  body_p_orm+
  line_l
  CR?
  EOF;

hprim_orm_2_1
@init{startElement("HPRIM.ORM.2.1");startElement("H");}
@after{endElement();endElement();}:
  line_h2_1_orm
  body_p_orm+
  line_l
  CR?
  EOF;

hprim_orm_2_0
@init{startElement("HPRIM.ORM.2.0");startElement("H");}
@after{endElement();endElement();}:
  line_h2_0_orm
  body_p_orm+
  line_l
  CR?
  EOF;

// Définitions ORM
body_p_orm
@init{startElement("P");}
@after{endElement();} :
  line_p (line_c)*
  body_obr_orm+;

body_obr_orm
@init{startElement("OBR");}
@after{endElement();} :
   line_obr (line_c)*
   body_obx_orm*;

body_obx_orm
@init{startElement("OBX");}
@after{endElement();} :
   line_obx (line_c)*;
   
// Définitions ORA
body_p_ora
@init{startElement("P");}
@after{endElement();} :
  line_p (line_c)*
  body_ap_ora*;

body_ap_ora
@init{startElement("AP");}
@after{endElement();} :
  line_ap (line_c)*
  body_ac_ora;

body_ac_ora
@init{startElement("AC");}
@after{endElement();} :
  body_ac_ora_second_level*
  body_obr_ora+;

body_ac_ora_second_level
@init{startElement("AC");}
@after{endElement();} :
  line_ac (line_c)*;

body_obr_ora
@init{startElement("OBR");}
@after{endElement();} :
   line_obr (line_c)*
   body_obx_ora*;

body_obx_ora
@init{startElement("OBX");}
@after{endElement();} :
   line_obx (line_c)*;
   
// Définitions ORU
body_p_oru
@init{startElement("P");}
@after{endElement();} :
  line_p (line_c)*
  body_obr_oru+;

body_obr_oru
@init{startElement("OBR");}
@after{endElement();} :
   line_obr (line_c)*
   body_obx_oru+;

body_obx_oru
@init{startElement("OBX");}
@after{endElement();} :
   line_obx (line_c)*;

// Définitions ADM
body_p_adm
@init{startElement("P");}
@after{endElement();} :
  line_p (line_c)*
  body_ap_adm*;

body_ap_adm
@init{startElement("AP");}
@after{endElement();} :
  line_ap (line_c)*
  body_ac_adm;

body_ac_adm
@init{startElement("AC");}
@after{endElement();} :
  line_ac (line_c)*;

// =========== Définition des des lignes hprim =================

// Début de ligne H, identique pour toutes les versions
start_line_h :
  {startElement("H.1");content("H");endElement();} delimiters
  DELIMITER1 st_sized_optionnal["H.3", 12]
  DELIMITER1 st_sized_optionnal["H.4", 12]
  DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2["H.5", 40]
  DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["H.6", 100];

// Milieu de ligne H, identique pour toutes les versions
midd_line_h :
  DELIMITER1 spec_sized_tn["H.8", 40]
  DELIMITER1 st_sized_optionnal["H.9", 40]
  DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2["H.10", 40]
  DELIMITER1 st_sized_optionnal["H.11", 80]
  DELIMITER1 spec_const_7_12["H.12"];

// Messages ORU

line_h2_2_oru :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORU["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_2["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

// Ligne H 2.1 : comme la date est nécessaire, en fait tous les champs
// sont obligatoires
line_h2_1_oru :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORU["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_1["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

// Ligne H 2.0
line_h2_0_oru :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORU["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_0["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

// Messages ORM :
line_h2_2_orm :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORM["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_2["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

line_h2_1_orm :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORM["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_1["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

line_h2_0_orm :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORM["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_0["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

// Messages ORA
line_h2_2_ora :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORA["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_2["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

line_h2_1_ora :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORA["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_1["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

line_h2_0_ora :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ORA["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_0["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

// Messages ADM
line_h2_2_adm :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ADM["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_2["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

line_h2_1_adm :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ADM["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_1["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

line_h2_0_adm :
  start_line_h
  DELIMITER1 spec_const_7_7_contexte_ADM["H.7"]
  midd_line_h
  DELIMITER1 spec_const_7_13_version_2_0["H.13"]
  DELIMITER1 ts_sized_mandatory["H.14", 26]
  DELIMITER1?;

// Ligne AP (assuré primaire)
line_ap :
  (CR CHARA CHARP) {startElement("AP.1");content("AP");endElement();}
  DELIMITER1 nm_integer_sized_mandatory["AP.2", 4]
  DELIMITER1 st_sized_mandatory["AP.3", 2]
  DELIMITER1 ts_sized_optionnal["AP.4", 8]
  DELIMITER1 ts_sized_optionnal["AP.5", 8]
  DELIMITER1 nm_integer_sized_mandatory["AP.6", 15]
  DELIMITER1 st_sized_mandatory["AP.7", 3]
  DELIMITER1 nm_integer_sized_mandatory["AP.8", 2]
  DELIMITER1 nm_integer_sized_mandatory["AP.9", 2]
  DELIMITER1 nm_integer_sized_mandatory["AP.10", 3]
  DELIMITER1 nm_integer_sized_mandatory["AP.11", 4]
  DELIMITER1 nm_integer_sized_mandatory["AP.11", 4]
  DELIMITER1 st_sized_mandatory["AP.12", 1]
  DELIMITER1 st_sized_mandatory["AP.13", 2]
  DELIMITER1 spec_sized_mult_lvl1_st_mandatory_6["AP.14", 48]
  DELIMITER1 st_sized_optionnal["AP.15", 24]
  DELIMITER1 nm_integer_sized_mandatory["AP.16", 6]
  (DELIMITER1 nm_sized_optionnal["AP.17", 9]
   (DELIMITER1 spec_on_optionnal["AP.18"]
    (DELIMITER1 ts_sized_optionnal["AP.19", 8]
     (DELIMITER1 ts_sized_optionnal["AP.20", 8]
      (DELIMITER1 st_sized_optionnal["AP.21", 30]
       (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["AP.22", 200]
        (DELIMITER1 ts_sized_optionnal["AP.23", 15]
         DELIMITER1?)?)?)?)?)?)?)?;

// Ligne AC (assuré complémentaire)
line_ac
@init{startElement("AC");}
@after{endElement();}:
  (CR CHARA CHARC) {startElement("AC.1");content("AC");endElement();}
  DELIMITER1 nm_integer_sized_mandatory["AC.2", 4]
  DELIMITER1 st_sized_mandatory["AC.3", 9]
  DELIMITER1 st_sized_mandatory["AC.4", 15]
  DELIMITER1 ts_sized_optionnal["AC.5", 8]
  DELIMITER1 ts_sized_mandatory["AC.6", 8]
  DELIMITER1 st_sized_optionnal["AC.7", 28]
  DELIMITER1 spec_ac_8["AC.8", 10]
  (DELIMITER1 st_sized_optionnal["AC.9", 40]
   (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["AC.10", 200]
    DELIMITER1?)?)?;
    
// Ligne P
line_p :
  (CR CHARP) {startElement("P.1");content("P");endElement();}
  DELIMITER1 nm_integer_sized_mandatory["P.2", 4]
  DELIMITER1 spec_sized_8_3["P.3", 36]
  DELIMITER1 st_sized_optionnal["P.4", 16]
  (DELIMITER1 st_sized_optionnal["P.5", 16]
   (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["P.6", 48]
    (DELIMITER1 st_sized_optionnal["P.7", 24]
     (DELIMITER1 ts_sized_optionnal["P.8", 26]
      (DELIMITER1 spec_const_sexe["P.9"]
       (DELIMITER1 spec_const_race["P.10"]
        (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["P.11", 200]
         (DELIMITER1 st_sized_optionnal["P.12", 120]
          (DELIMITER1 spec_sized_tn["P.13", 40]
           // Je ne sais pas si c'est chaque CNA qui ne doit pas faire plus de 60 caractères ou si c'est
           // l'ensemble qui ne doit pas en faire plus de 60. Je considère le premier
           (DELIMITER1 spec_sized_cna["P.14", 60] (REPETITEUR spec_sized_cna["P.14", 60])*
            (DELIMITER1 st_sized_optionnal["P.15", 60]
             (DELIMITER1 st_sized_optionnal["P.16", 60]
              // Le champ 8.17 (taille) est de type CQ : impossible d'en trouver la norme, je mets un numérique
              (DELIMITER1 nm_sized_optionnal["P.17", 10]
               // Le champ 8.18 (poids) est de type CQ : impossible d'en trouver la norme, je mets un numérique
               (DELIMITER1 nm_sized_optionnal["P.18", 10]
                (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["P.19", 200] (REPETITEUR spec_sized_mult_lvl1_st_optionnal_6["P.19", 200])*
                 (DELIMITER1 st_sized_optionnal["P.20", 200] (REPETITEUR st_sized_optionnal["P.20", 200])*
                  (DELIMITER1 st_sized_optionnal["P.21", 200]
                   (DELIMITER1 st_sized_optionnal["P.22", 60]
                    (DELIMITER1 st_sized_optionnal["P.23", 60]
                     (DELIMITER1 ts_sized_optionnal["P.24", 26] (REPETITEUR ts_sized_optionnal["P.24", 26])?
                      (DELIMITER1 spec_const_8_25["P.25"]
                       (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8["P.26", 100]
                        // Je n'ai pas la table des classification du diagnostic, je mets une chaine de caractères 
                        (DELIMITER1 st_sized_optionnal["P.27", 100]
                         (DELIMITER1 spec_const_race["P.28"]
                          // Je n'ai pas la table de classification de situation maritale, je mets une chaine de caractères
                          (DELIMITER1 st_sized_optionnal["P.29", 2]
                           // Je n'ai pas la table des précautions à prendre, je mets une chaine de caractères
                           (DELIMITER1 st_sized_optionnal["P.30", 20]
                            (DELIMITER1 st_sized_optionnal["P.31", 20]
                             // Je n'ai pas la table du statut de confidentialité, je mets une chaine de caractères
                             (DELIMITER1 st_sized_optionnal["P.32", 20]
                              (DELIMITER1 ts_sized_optionnal["P.33", 26]
                               (DELIMITER1 ts_sized_optionnal["P.34", 26]
                                DELIMITER1?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?;

line_obr :
  (CR CHARO CHARB CHARR) {startElement("OBR.1");content("OBR");endElement();}
  DELIMITER1 nm_integer_sized_mandatory["OBR.2", 4]
  DELIMITER1 spec_sized_9_3["OBR.3", 23]
  DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2["OBR.4", 23]
  DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["OBR.5", 640000] (REPETITEUR spec_sized_mult_lvl1_st_optionnal_6["OBR.5", 64000])*
  // Je n'ai pas la table de specs pour la priorité, je mets une chaine de caractères
  DELIMITER1 st_sized_optionnal["OBR.6", 2] (REPETITEUR st_sized_optionnal["OBR.6", 2])*
  DELIMITER1 ts_sized_optionnal["OBR.7", 26]
  DELIMITER1 spec_non_sized_9_8["OBR.8"]
  DELIMITER1 ts_sized_optionnal["OBR.9", 26]
  // Le volume de recueil est de type CQ dont je ne connais pas la norme, je mets une chaine de caractères
  DELIMITER1 st_sized_optionnal["OBR.10", 20]
  DELIMITER1 spec_sized_cna["OBR.11", 60]
  // Je n'ai pas les specs du code action, je mets une chaine de caractères en attendant
  DELIMITER1 st_sized_optionnal["OBR.12", 1]
  // TODO : vérifier que le cm du 9.13 correspond aux mêmes que 9.3 et 9.4
  (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2["OBR.13", 60]
   (DELIMITER1 st_sized_optionnal["OBR.14", 300]
    (DELIMITER1 ts_sized_optionnal["OBR.15", 26]
     (DELIMITER1 spec_sized_9_16["OBR.16", 300]
      (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["OBR.17", 60]
       (DELIMITER1 spec_sized_tn["OBR.18", 40]
        (DELIMITER1 st_sized_optionnal["OBR.19", 60]
         (DELIMITER1 st_sized_optionnal["OBR.20", 60]
          (DELIMITER1 st_sized_optionnal["OBR.21", 60]
           (DELIMITER1 st_sized_optionnal["OBR.22", 60]
            (DELIMITER1 ts_sized_optionnal["OBR.23", 26]
             (DELIMITER1 spec_const_race["OBR.24"]
              (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2["OBR.25", 10]
               (DELIMITER1 spec_const_9_26["OBR.26"]
                (DELIMITER1 spec_const_race["OBR.27"]
                 (DELIMITER1 spec_const_race["OBR.28"]
                  (DELIMITER1 spec_sized_cna["OBR.29", 150] (REPETITEUR spec_sized_cna["OBR.29", 150])*
                   (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4["OBR.30", 150]
                    (DELIMITER1 spec_const_9_31["OBR.31"]
                     // Les specs du motif de la demande sont inconnues, on met une chaine de caractères que l'on peut répéter
                     (DELIMITER1 st_sized_optionnal["OBR.32", 300] (REPETITEUR st_sized_optionnal["OBR.32", 300])*
                      (DELIMITER1 spec_sized_cna["OBR.33", 60]
                       (DELIMITER1 spec_sized_cna["OBR.34", 60]
                        (DELIMITER1 spec_sized_cna["OBR.35", 60]
                         (DELIMITER1 spec_sized_cna["OBR.36", 60]
                          (DELIMITER1 ts_sized_optionnal["OBR.37", 26]
                            DELIMITER1?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?;

line_obx :
  (CR CHARO CHARB CHARX) {startElement("OBX.1");content("OBX");endElement();}
  DELIMITER1 nm_integer_sized_mandatory["OBX.2", 10]
  DELIMITER1
    ((spec_const_10_3_nm["OBX.3"]
     (DELIMITER1 spec_sized_10_4["OBX.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX.5", 10]
       (DELIMITER1 nm_sized_optionnal["OBX.6", 64000] (REPETITEUR nm_sized_optionnal["OBX.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_ce["OBX.3"]
     (DELIMITER1 spec_sized_10_4["OBX.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX.5", 10]
       (DELIMITER1 spec_sized_10_6["OBX.6", 64000] (REPETITEUR spec_sized_10_6["OBX.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_fic["OBX.3"]
     (DELIMITER1 spec_sized_10_4["OBX.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX.5", 10]
       (DELIMITER1 spec_sized_10_6["OBX.6", 64000] (REPETITEUR spec_sized_10_6["OBX.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_st["OBX.3"]
     (DELIMITER1 spec_sized_10_4["OBX.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX.5", 10]
       (DELIMITER1 spec_sized_10_6_tx["OBX.6", 64000] (REPETITEUR spec_sized_10_6_tx["OBX.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_gc["OBX.3"]
     (DELIMITER1 spec_sized_10_4["OBX.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX.5", 10]
       (DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2["OBX.6", 64000] (REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2["OBX.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_tx["OBX.3"]
     (DELIMITER1 spec_sized_10_4["OBX.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX.5", 10]
       (DELIMITER1 spec_sized_10_6_tx["OBX.6", 64000] (REPETITEUR spec_sized_10_6_tx["OBX.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_std["OBX.3"]
     (DELIMITER1 spec_sized_10_4["OBX.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX.5", 10]
       (DELIMITER1 st_sized_optionnal["OBX.6", 64000] (REPETITEUR st_sized_optionnal["OBX.6", 64000])*
        line_obx2_1_post10_6?)?)?)?));

line_obx2_1_post10_6:
    (DELIMITER1 st_sized_optionnal["OBX.7", 20]
     (DELIMITER1 st_sized_optionnal["OBX.8", 60] (REPETITEUR st_sized_optionnal["OBX.8", 60])*
      (DELIMITER1 spec_const_10_9["OBX.9"] (REPETITEUR spec_const_10_9["OBX.9"])*
       (DELIMITER1 nm_sized_optionnal["OBX.10", 5]
        (DELIMITER1 spec_const_10_11["OBX.11"] (REPETITEUR spec_const_10_11["OBX.11"])*
         (DELIMITER1 spec_const_10_12["OBX.12"] 
          (DELIMITER1 ts_sized_optionnal["OBX.13", 26] 
           (DELIMITER1 st_sized_optionnal["OBX.14", 20]
            (DELIMITER1 ts_sized_optionnal["OBX.15", 26]
             (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["OBX.16", 60]
              (DELIMITER1 st_sized_optionnal["OBX.17", 60] DELIMITER1?)?)?)?)?)?)?)?)?)?)?);

line_c
@init{startElement("C");}
@after{endElement();}:
  CR CHARC
  DELIMITER1 nm_integer_sized_mandatory["C.2", 10]
  DELIMITER1 spec_const_12_3["C.3"]
  DELIMITER1 st_sized_optionnal["C.4", 64000] (REPETITEUR st_sized_optionnal["C.4", 64000])*  
  DELIMITER1?;

line_l
@init{startElement("L");}
@after{endElement();}:
  CR CHARL
  (DELIMITER1 nm_integer_sized_optionnal["L.2", 1]
   (DELIMITER1 spec_const_race["L.3"]
    (DELIMITER1 nm_integer_sized_optionnal["L.4", 4]
     (DELIMITER1 nm_integer_sized_optionnal["L.5", 10]
      (DELIMITER1 st_sized_optionnal["L.6", 12] DELIMITER1?)?)?)?)?)?;

// =========== Définition des éléments des champs hprim ===============

// Je définis que :
// Il est défini que quand il n'y a rien dans un champ, ce champ est déclaré comme existant,
//   (startElement / endElement sont envoyés), mais le content n'est pas défini (content non envoyé)

// Données constantes

spec_ac_8[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  nm_nonsized_mandatory[$nameElement + ".1"]
  DELIMITER2 spec_ac_8_2[$nameElement + ".2"]
  DELIMITER2 spec_ac_8_3[$nameElement + ".3"]
  nm_nonsized_mandatory[$nameElement + ".4"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_ac_8_2[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_TM | final_TR | final_FR;
  
spec_ac_8_3[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_PF | final_SS | final_TR;


spec_on_optionnal[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charO | final_charN)?;

spec_const_sexe[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charM | final_charF | final_charU)?;

spec_const_race[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  ;

spec_const_7_13_version_2_0[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  spec_const_7_13_1_version_2_0[$nameElement + ".1"] DELIMITER2 spec_const_7_13_2[$nameElement + ".2"];
  
spec_const_7_13_version_2_1[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  spec_const_7_13_1_version_2_1[$nameElement + ".1"] DELIMITER2 spec_const_7_13_2[$nameElement + ".2"];

spec_const_7_13_version_2_2[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  spec_const_7_13_1_version_2_2[$nameElement + ".1"] DELIMITER2 spec_const_7_13_2[$nameElement + ".2"];

spec_const_7_13_2[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_charC | final_charL | final_charR;

spec_const_7_7_contexte_ORU[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_ORU;

spec_const_7_7_contexte_ORM[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_ORM;

spec_const_7_7_contexte_ORA[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_ORA;

spec_const_7_7_contexte_ADM[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_ADM;

spec_const_7_12[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charP | final_charD | final_charT);

spec_const_9_31[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_PORT | final_CART | final_WHLC | final_WALK)?;

spec_const_8_25[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_OP | final_IP | final_ER | final_PA | final_MP)?;

spec_const_9_26[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO |
  final_charD | final_charX)?; 

spec_const_10_3_nm[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  CHARN CHARM {content($text);}; 

spec_const_10_3_ce[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  CHARC CHARE {content($text);}; 

spec_const_10_3_st[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  CHARS CHART {content($text);}; 

spec_const_10_3_gc[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  CHARG CHARC {content($text);};
  
spec_const_10_3_tx[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  CHART CHARX {content($text);};

spec_const_10_3_fic[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (CHARF CHARI CHARC) {content($text);};

spec_const_10_3_std[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (CHARA CHARD) | (CHARC CHARK) | (CHARC CHARN CHARA) | (CHARD CHART) |
  (CHARP CHARN) | (CHART CHARN) |
  (CHARG CHARB) | (CHARG CHARN) {content($text);};

// Données spéciales (associant plusieurs données générales)

spec_sized_10_6[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_sized_optionnal[$nameElement + ".1", 10]
  (DELIMITER2 st_sized_optionnal[$nameElement + ".2", 60]
   (DELIMITER2 st_sized_optionnal[$nameElement + ".3", 10])?)?
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_const_10_9[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup |
  final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB |
  final_charW | final_charR | final_charI | final_charS | final_MS | final_VS)?;

spec_const_10_11[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charA | final_charS | final_charR | final_charN)?;

spec_const_10_12[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charR | final_charP | final_charF | final_charC | final_charI | final_charD |
   final_charX | final_charU)?;

spec_const_12_3[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  (final_charP | final_charL)?;

spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_nonsized_mandatory[$nameElement + ".1"]
   DELIMITER2 st_nonsized_mandatory[$nameElement + ".2"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"])?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"]
    (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"])?)?)?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_mandatory_6[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_nonsized_mandatory[$nameElement + ".1"]
   DELIMITER2 st_nonsized_mandatory[$nameElement + ".2"]
    DELIMITER2 st_nonsized_mandatory[$nameElement + ".3"]
     DELIMITER2 st_nonsized_mandatory[$nameElement + ".4"]
      DELIMITER2 st_nonsized_mandatory[$nameElement + ".5"]
       DELIMITER2 st_nonsized_mandatory[$nameElement + ".6"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
    (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"]
     (DELIMITER2 st_non_sized_optionnal[$nameElement + ".4"]
      (DELIMITER2 st_non_sized_optionnal[$nameElement + ".5"]
       (DELIMITER2 st_non_sized_optionnal[$nameElement + ".6"])?)?)?)?)?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"]
    (DELIMITER2 st_non_sized_optionnal[$nameElement + ".4"]
     (DELIMITER2 st_non_sized_optionnal[$nameElement + ".5"]
      (DELIMITER2 st_non_sized_optionnal[$nameElement + ".6"]
       (DELIMITER2 st_non_sized_optionnal[$nameElement + ".7"]
        (DELIMITER2 st_non_sized_optionnal[$nameElement + ".8"])?)?)?)?)?)?)?
  {if ($text != null)
    matchRegex($text, "^.{0," + maxSize + "}$", retval.start);};

spec_sized_mult_lvl2_st_optionnal_3[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER3 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER3 st_non_sized_optionnal[$nameElement + ".3"])?)?;

spec_sized_mult_lvl2_st_optionnal_6[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER3 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER3 st_non_sized_optionnal[$nameElement + ".3"]
    (DELIMITER3 st_non_sized_optionnal[$nameElement + ".4"]
     (DELIMITER3 st_non_sized_optionnal[$nameElement + ".5"]
      (DELIMITER3 st_non_sized_optionnal[$nameElement + ".6"])?)?)?)?)?;

spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  nm_nonsized_optionnal[$nameElement + ".1"]
  DELIMITER2 nm_nonsized_optionnal[$nameElement + ".2"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};
  
spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  nm_nonsized_mandatory[$nameElement + ".1"]
  DELIMITER2 nm_nonsized_mandatory[$nameElement + ".2"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_cna[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
   (DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + ".2"]
    (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"])?)?
  {if ($text != null)
     matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

// Le segment 8.3.1 est de type C
// HPRIM Santé -Version 2.2-modifs Octobre 2003 Page 9
//  C : consigné (à retourner à l'identique s'il a été renseigné par l'émetteur)
// Donc, il peut être vide si non renseigné par l'émetteur
spec_sized_8_3[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  (st_sized_mandatory[$nameElement + ".1", 16]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
     DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"])?)?
   {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

 
//H.PR.I.M Santé - Version 2.1 Avril 1999 Page 17
// D'après le manuel, L'identifiant de la demande est obligatoire et unique (sous-entendu pour un patient probablement)
// L'identifiant de l'échantillon est facultatif et consigné. Il identifie de manière univoque un échantillon physique transmis.
// Ceci étant, ce n'est pas sur ces numéros qu'on peut reconnaitre des rajouts ou corrections pour un même examen mais
// sur le numéro de demande pour l'exécutant (9.4.2)
// Certains n'envoient pas de numéros dans ces champs. Ceci est interdit par la norme et je ne
// le tolère pas dans l'application sinon ce n'est plus la norme
spec_sized_9_3[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  //st_sized_mandatory[$nameElement + ".1", 12]
  st_sized_optionnal[$nameElement + ".1", 12]
  (DELIMITER2 st_sized_optionnal[$nameElement + ".2", 10])?
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_non_sized_9_8[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  ts_sized_optionnal[$nameElement + ".1", 26]
   (REPETITEUR ts_sized_optionnal[$nameElement + ".2", 26])?;

spec_sized_9_16[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  spec_sized_mult_lvl2_st_optionnal_3[$nameElement + ".2"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"])?)?
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_10_4[String nameElement, int maxsize]
@init{startElement($nameElement);}
@after{endElement();}:
  st_nonsized_mandatory[$nameElement + ".1"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"]
    (DELIMITER2 st_non_sized_optionnal[$nameElement + ".4"]
     (DELIMITER2 st_non_sized_optionnal[$nameElement + ".5"]
      (DELIMITER2 st_non_sized_optionnal[$nameElement + ".6"])?)?)?)?)?
  {matchRegex($text, "^.{0," + $maxsize + "}$", retval.start);};

spec_sized_10_6_tx[String nameElement, int maxSize]
@init{
  ParserRuleReturnScope retval = new ParserRuleReturnScope();
  retval.start = input.LT(1);
  startElement($nameElement);}
@after{endElement();}:
  g=final_spec_10_6_tx?
  {if ($g.consoText != null)
    matchRegex($g.consoText, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_tn[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
 st_non_sized_optionnal[$nameElement + ".1"]
  (REPETITEUR st_non_sized_optionnal[$nameElement + ".2"])?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

// Chaines de caractères, nombres, ...
 
st_sized_optionnal[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  final_st?
  {if ($text != null)
     matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

st_sized_mandatory[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  final_st
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

st_non_sized_optionnal[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_st?;

st_nonsized_mandatory[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_st;

nm_sized_optionnal[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  final_nm?
  {if ($text != null)
     matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

nm_integer_sized_optionnal[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  final_nm_integer?
  {if ($text != null)
     matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};
     
nm_integer_sized_mandatory[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  final_nm_integer
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

// Dates
ts_sized_optionnal[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  final_ts?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

ts_sized_mandatory[String nameElement, int maxSize]
@init{startElement($nameElement);}
@after{endElement();}:
  final_ts
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

nm_nonsized_mandatory[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_nm;

nm_nonsized_optionnal[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_nm?;

spec_const_7_13_1_version_2_0[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_version_2_0;

spec_const_7_13_1_version_2_1[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_version_2_1;
  
spec_const_7_13_1_version_2_2[String nameElement]
@init{startElement($nameElement);}
@after{endElement();}:
  final_version_2_2;

// Données finales construites

final_spec_10_6_tx returns [String consoText]:
  g=content_spec_10_6
  {content($g.consoText);
   $consoText = $g.consoText;};
  
content_spec_10_6 returns [String consoText]:
  (r=character {$consoText = $r.text;} | DELIMITER2 {$consoText = "\n";})
    p=content_spec_10_6? {if ($p.consoText != null) { $consoText += $p.consoText; }};

final_ts:
  chiffre chiffre
  chiffre chiffre chiffre
  chiffre (chiffre chiffre
  (chiffre chiffre chiffre
  chiffre (chiffre chiffre)?)?)?
  {content($text);};

final_st:
  character+
  {content($text);};

final_nm:
  ((PLUS | MOINS)? 
  ((chiffre+ (POINT chiffre*)?)
  |(POINT chiffre+)))
  {content($text);};

final_nm_integer:
  chiffre+
  {content($text);};

final_ADM: CHARA CHARD CHARM {content($text);};
final_ORA: CHARO CHARR CHARA {content($text);};
final_ORU: CHARO CHARR CHARU {content($text);};
final_ORM: CHARO CHARR CHARM {content($text);};

final_CART: CHARC CHARA CHARR CHART {content($text);};
final_PORT: CHARP CHARO CHARR CHART {content($text);};
final_WHLC: CHARW CHARH CHARL CHARC {content($text);};
final_WALK: CHARW CHARA CHARL CHARK {content($text);};

final_LL: CHARL CHARL {content($text);};
final_AA: CHARA CHARA {content($text);};
final_HH: CHARH CHARH {content($text);};
final_MS: CHARM CHARS {content($text);};
final_VS: CHARV CHARS {content($text);};
final_Null: CHARN CHARu CHARl CHARl {content($text);};
final_symbol_inf: CHAR_SYMBOL_INF {content($text);};
final_symbol_sup: CHAR_SYMBOL_SUP {content($text);};

final_version_2_0: CHARH CHIFFRE2 POINT CHIFFRE0 {content($text);};
final_version_2_1: CHARH CHIFFRE2 POINT CHIFFRE1 {content($text);};
final_version_2_2: CHARH CHIFFRE2 POINT CHIFFRE2 {content($text);};

final_OP: CHARO CHARP {content($text);};
final_IP: CHARI CHARP {content($text);};
final_ER: CHARE CHARR {content($text);};
final_PA: CHARP CHARA {content($text);};
final_MP: CHARM CHARP {content($text);};
final_TM: CHART CHARM {content($text);};
final_TR: CHART CHARR {content($text);};
final_FR: CHARF CHARR {content($text);};
final_PF: CHARP CHARF {content($text);};
final_SS: CHARS CHARS {content($text);};

final_charA: CHARA {content($text);};
final_charB: CHARB {content($text);};
final_charC: CHARC {content($text);};
final_charD: CHARD {content($text);};
final_charF: CHARF {content($text);};
final_charH: CHARH {content($text);};
final_charI: CHARI {content($text);};
final_charL: CHARL {content($text);};
final_charM: CHARM {content($text);};
final_charN: CHARN {content($text);};
final_charO: CHARO {content($text);};
final_charP: CHARP {content($text);};
final_charR: CHARR {content($text);};
final_charS: CHARS {content($text);};
final_charT: CHART {content($text);};
final_charU: CHARU {content($text);};
final_charW: CHARW {content($text);};
final_charX: CHARX {content($text);};
 
// Données de type délimiteurs
delimiters
@init{startElement("H.2");}
@after{endElement();}:
  DELIMITERS
  {content($text);};

// Données de base

character:
  (lettre | chiffre);

chiffre:
  (CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 |
   CHIFFRE9);

lettre:
  ~(CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 |
    CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR);

// =========== Définitions pour le lexer perso =========

CR : 'CR';
TOKENMISMATCH : 'MISMATCH';
DELIMITER1: '|';
DELIMITER2: '~';
DELIMITER3: '&';
DELIMITERS: 'DDWWDD';
REPETITEUR: '^';

CHIFFRE0: '0';
CHIFFRE1: '1';
CHIFFRE2: '2';
CHIFFRE3: '3';
CHIFFRE4: '4';
CHIFFRE5: '5';
CHIFFRE6: '6';
CHIFFRE7: '7';
CHIFFRE8: '8';
CHIFFRE9: '9';

POINT: '.';
PLUS: '+';
MOINS: '-';

CHARA : 'A';
CHARB : 'B';
CHARC : 'C';
CHARD : 'D';
CHARE : 'E';
CHARF : 'F';
CHARG : 'G';
CHARH : 'H';
CHARI : 'I';
CHARK : 'K';
CHARL : 'L';
CHARM : 'M';
CHARN : 'N';
CHARO : 'O';
CHARP : 'P';
CHARR : 'R';
CHARS : 'S';
CHART : 'T';
CHARU : 'U';
CHARV : 'V';
CHARW : 'W';
CHARX : 'X';

CHARl : 'l';
CHARu : 'u';

CHAR_SYMBOL_INF : '<';
CHAR_SYMBOL_SUP : '>';

LETTRE: 'A' .. 'Z' | 'a' .. 'z';
