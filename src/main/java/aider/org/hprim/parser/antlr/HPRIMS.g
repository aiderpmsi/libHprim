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

import aider.org.hprim.parser.ContentHandler;
import aider.org.hprim.parser.MatchRegexTokenException;

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
   * Méthode pour permettre d'envoyer un message d'erreur correct lors d'une erreur de type
   * MatchRegexTokenException
   * @param e
   * @param tokenNames
   */
  public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    if (e instanceof MatchRegexTokenException) {
      MatchRegexTokenException mrte = (MatchRegexTokenException) e;
      return "malformed message : " + mrte.getText() +
        " does not match " + mrte.getRegex();
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
   public void recover(RecognitionException e) {
     throw new IllegalArgumentException(e);
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

// TODO : vraiment faire la différence entre la version 2.1 et la version 2.2 
//hprim:
//  hprim_2_2 | hprim_2_1;

hprim_2_2
@init{contentHandler.startElement("message", "hprim_2_2");}
@after{contentHandler.endElement();}:
  line_h2_2
  body_p2_1*
  line_l2_1
  CR?
  EOF;

hprim_2_1
@init{contentHandler.startElement("message", "hprim_2_1");}
@after{contentHandler.endElement();}:
  line_h2_1
  body_p2_1*
  line_l2_1
  CR?
  EOF;

body_p2_1
@init{contentHandler.startElement("body", "P");}
@after{contentHandler.endElement();}:
  line_p2_1 (line_c2_1)*
   body_obr2_1+;

body_obr2_1
@init{contentHandler.startElement("body", "OBR");}
@after{contentHandler.endElement();}:
   line_obr2_1 (line_c2_1)*
    body_obx2_1+;

body_obx2_1
@init{contentHandler.startElement("body", "OBX");}
@after{contentHandler.endElement();}:
   line_obx2_1 (line_c2_1)*;

// =========== Définition des des lignes hprim =================

// Ligne H 2.2 : a exactement la même structure que H 2.1
line_h2_2
@init{contentHandler.startElement("ligne", "H");}
@after{contentHandler.endElement();}:
  delimiters
  DELIMITER1 st_sized_optionnal["H_7.3", 12]
  DELIMITER1 st_sized_optionnal["H_7.4", 12]
  DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2["H_7.5", 40]
  DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["H_7.6", 100]
  DELIMITER1 spec_const_7_7_contexte["H_7.7"]
  DELIMITER1 spec_sized_tn["H_7.8", 40]
  DELIMITER1 st_sized_optionnal["H_7.9", 40]
  DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2["H_7.10", 40]
  DELIMITER1 st_sized_optionnal["H_7.11", 80]
  DELIMITER1 spec_const_7_12["H_7.12"]
  DELIMITER1 spec_const_7_13_version_2_2["H_7.13"]
  DELIMITER1 ts_sized_mandatory["H_7.14", 26]
  DELIMITER1?;

// Ligne H 2.1 : comme la date est nécessaire, en fait tous les champs
// sont obligatoires
line_h2_1
@init{contentHandler.startElement("ligne", "H");}
@after{contentHandler.endElement();}:
  delimiters
  DELIMITER1 st_sized_optionnal["H_7.3", 12]
  DELIMITER1 st_sized_optionnal["H_7.4", 12]
  DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2["H_7.5", 40]
  DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["H_7.6", 100]
  DELIMITER1 spec_const_7_7_contexte["H_7.7"]
  DELIMITER1 spec_sized_tn["H_7.8", 40]
  DELIMITER1 st_sized_optionnal["H_7.9", 40]
  DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2["H_7.10", 40]
  DELIMITER1 st_sized_optionnal["H_7.11", 80]
  DELIMITER1 spec_const_7_12["H_7.12"]
  // On force la lecture des hprim 2.0 et 2.2 avec le lecteur 2.1
  DELIMITER1 (spec_const_7_13_version_2_0["H_7.13"] | spec_const_7_13_version_2_1["H_7.13"] | spec_const_7_13_version_2_2["H_7.13"])
  DELIMITER1 ts_sized_mandatory["H_7.14", 26]
  DELIMITER1?;

line_p2_1
@init{contentHandler.startElement("ligne", "P");}
@after{contentHandler.endElement();}:
  CR CHARP
  DELIMITER1 nm_integer_sized_optionnal["P_8.2", 4]
  DELIMITER1 spec_sized_8_3["P_8.3", 36]
  DELIMITER1 st_sized_optionnal["P_8.4", 16]
  (DELIMITER1 st_sized_optionnal["P_8.5", 16]
   (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["P_8.6", 48]
    (DELIMITER1 st_sized_optionnal["P_8.7", 24]
     (DELIMITER1 ts_sized_optionnal["P_8.8", 26]
      (DELIMITER1 spec_const_sexe["P_8.9"]
       (DELIMITER1
        (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["P_8.11", 200]
         (DELIMITER1 st_sized_optionnal["P_8.12", 120]
          (DELIMITER1 spec_sized_tn["P_8.13", 40]
           // Je ne sais pas si c'est chaque CNA qui ne doit pas faire plus de 60 caract�res ou si c'est
           // l'ensemble qui ne doit pas en faire plus de 60. Je consid�re le premier
           (DELIMITER1 spec_sized_cna["P_8.14", 60] (REPETITEUR spec_sized_cna["P_8.14", 60])*
            (DELIMITER1 st_sized_optionnal["P_8.15", 60]
             (DELIMITER1 st_sized_optionnal["P_8.16", 60]
              // Le champ 8.17 (taille) est de type CQ : impossible d'en trouver la norme, je mets un num�rique
              (DELIMITER1 nm_sized_optionnal["P_8.17", 10]
               // Le champ 8.18 (poids) est de type CQ : impossible d'en trouver la norme, je mets un num�rique
               (DELIMITER1 nm_sized_optionnal["P_8.18", 10]
                (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["P_8.19", 200] (REPETITEUR spec_sized_mult_lvl1_st_optionnal_6["P_8.19", 200])*
                 (DELIMITER1 st_sized_optionnal["P_8.20", 200] (REPETITEUR st_sized_optionnal["P_8.20", 200])*
                  (DELIMITER1 st_sized_optionnal["P_8.21", 200]
                   (DELIMITER1 st_sized_optionnal["P_8.22", 60]
                    (DELIMITER1 st_sized_optionnal["P_8.23", 60]
                     (DELIMITER1 ts_sized_optionnal["P_8.24", 26] (REPETITEUR ts_sized_optionnal["P_8.24", 26])?
                      (DELIMITER1 spec_const_8_25["P_8.25"]
                       (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8["P_8.26", 100]
                        // Je n'ai pas la table des classification du diagnostic, je mets une chaine de caract�res 
                        (DELIMITER1 st_sized_optionnal["P_8.27", 100]
                         (DELIMITER1
                          // Je n'ai pas la table de classification de situation maritale, je mets une chaine de caract�res
                          (DELIMITER1 st_sized_optionnal["P_8.29", 2]
                           // Je n'ai pas la table des pr�cautions � prendre, je mets une chaine de acract�res
                           (DELIMITER1 st_sized_optionnal["P_8.30", 20]
                            (DELIMITER1 st_sized_optionnal["P_8.31", 20]
                             // Je n'ai pas la table du statut de confidentialit�, je mets une chaine de caract�res
                             (DELIMITER1 st_sized_optionnal["P_8.32", 20]
                              (DELIMITER1 ts_sized_optionnal["P_8.33", 26]
                               (DELIMITER1 ts_sized_optionnal["P_8.34", 26]
                                DELIMITER1?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?;
   
line_obr2_1
@init{contentHandler.startElement("ligne", "OBR");}
@after{contentHandler.endElement();}:
  CR CHARO CHARB CHARR
  DELIMITER1 nm_integer_sized_mandatory["OBR_9.2", 4]
  DELIMITER1 spec_sized_9_3["OBR_9.3", 23]
  DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2["OBR_9.4", 23]
  DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["OBR_9.5", 640000] (REPETITEUR spec_sized_mult_lvl1_st_optionnal_6["OBR_9.5", 64000])*
  // Je n'ai pas la table de specs pour la priorité, je mets une chaine de caractères
  DELIMITER1 st_sized_optionnal["OBR_9.6", 2] (REPETITEUR st_sized_optionnal["OBR_9.6", 2])*
  DELIMITER1 ts_sized_optionnal["OBR_9.7", 26]
  DELIMITER1 spec_non_sized_9_8["OBR_9.8"]
  DELIMITER1 ts_sized_optionnal["OBR_9.9", 26]
  // Le volume de recueil est de type CQ dont je ne connais pas la norme, je mets une chaine de caract�res
  DELIMITER1 st_sized_optionnal["OBR_9.10", 20]
  DELIMITER1 spec_sized_cna["OBR_9.11", 60]
  // Je n'ai pas les specs du code action, je mets une chaine de caract�res en attendant
  DELIMITER1 st_sized_optionnal["OBR_9.12", 1]
  // TODO : vérifier que le cm du 9.13 correspond aux mêmes que 9.3 et 9.4
  (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2["OBR_9.13", 60]
   (DELIMITER1 st_sized_optionnal["OBR_9.14", 300]
    (DELIMITER1 ts_sized_optionnal["OBR_9.15", 26]
     (DELIMITER1 spec_sized_9_16["OBR_9_16", 300]
      (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["OBR_9.17", 60]
       (DELIMITER1 spec_sized_tn["OBR_9.18", 40]
        (DELIMITER1 st_sized_optionnal["OBR_9.19", 60]
         (DELIMITER1 st_sized_optionnal["OBR_9.20", 60]
          (DELIMITER1 st_sized_optionnal["OBR_9.21", 60]
           (DELIMITER1 st_sized_optionnal["OBR_9.22", 60]
            (DELIMITER1 ts_sized_optionnal["OBR_9.23", 26]
             (DELIMITER1 
              (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2["OBR_9.25", 10]
               (DELIMITER1 spec_const_9_26["OBR_9.26"]
                (DELIMITER1
                 (DELIMITER1
                  (DELIMITER1 spec_sized_cna["OBR_9.29", 150] (REPETITEUR spec_sized_cna["P_8.14", 150])*
                   (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4["OBR_9.30", 150]
                    (DELIMITER1 spec_const_9_31["OBR_9.31"]
                     // Les specs du motif de la demande sont inconnues, on met une chaine de caract�res que l'on peut r�p�ter
                     (DELIMITER1 st_sized_optionnal["OBR_9.32", 300] (REPETITEUR st_sized_optionnal["OBR_9.32", 300])*
                      (DELIMITER1 spec_sized_cna["OBR_9.33", 60]
                       (DELIMITER1 spec_sized_cna["OBR_9.34", 60]
                        (DELIMITER1 spec_sized_cna["OBR_9.35", 60]
                         (DELIMITER1 spec_sized_cna["OBR_9.36", 60]
                          (DELIMITER1 ts_sized_optionnal["OBR_9.37", 26]
                            DELIMITER1?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?;

line_obx2_1
@init{contentHandler.startElement("ligne", "OBX");}
@after{contentHandler.endElement();}:
  CR CHARO CHARB CHARX
  DELIMITER1 nm_integer_sized_mandatory["OBX_10.2", 10]
  DELIMITER1
    ((spec_const_10_3_nm["OBX_10.3"]
     (DELIMITER1 spec_sized_10_4["OBX_10.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX_10.5", 10]
       (DELIMITER1 nm_sized_optionnal["OBX_10.6", 64000] (REPETITEUR nm_sized_optionnal["OBX_10.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_ce["OBX_10.3"]
     (DELIMITER1 spec_sized_10_4["OBX_10.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX_10.5", 10]
       (DELIMITER1 spec_sized_10_6["OBX_10.6", 64000] (REPETITEUR spec_sized_10_6["OBX_10.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_fic["OBX_10.3"]
     (DELIMITER1 spec_sized_10_4["OBX_10.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX_10.5", 10]
       (DELIMITER1 spec_sized_10_6["OBX_10.6", 64000] (REPETITEUR spec_sized_10_6["OBX_10.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_st["OBX_10.3"]
     (DELIMITER1 spec_sized_10_4["OBX_10.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX_10.5", 10]
       (DELIMITER1 spec_sized_10_6_tx["OBX_10.6", 64000] (REPETITEUR spec_sized_10_6_tx["OBX_10.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_gc["OBX_10.3"]
     (DELIMITER1 spec_sized_10_4["OBX_10.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX_10.5", 10]
       (DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2["OBX_10.6", 64000] (REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2["OBX_10.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_tx["OBX_10.3"]
     (DELIMITER1 spec_sized_10_4["OBX_10.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX_10.5", 10]
       (DELIMITER1 spec_sized_10_6_tx["OBX_10.6", 64000] (REPETITEUR spec_sized_10_6_tx["OBX_10.6", 64000])*
        line_obx2_1_post10_6?)?)?)?)
    | (spec_const_10_3_std["OBX_10.3"]
     (DELIMITER1 spec_sized_10_4["OBX_10.4", 200]
      (DELIMITER1 st_sized_optionnal["OBX_10.5", 10]
       (DELIMITER1 st_sized_optionnal["OBX_10.6", 64000] (REPETITEUR st_sized_optionnal["OBX_10.6", 64000])*
        line_obx2_1_post10_6?)?)?)?));

line_obx2_1_post10_6:
    (DELIMITER1 st_sized_optionnal["OBX_10.7", 20]
     (DELIMITER1 st_sized_optionnal["OBX_10.8", 60] (REPETITEUR st_sized_optionnal["OBX_10.8", 60])*
      (DELIMITER1 spec_const_10_9["OBX_10.9"] (REPETITEUR spec_const_10_9["OBX_10.9"])*
       (DELIMITER1 nm_sized_optionnal["OBX_10.10", 5]
        (DELIMITER1 spec_const_10_11["OBX_10.11"] (REPETITEUR spec_const_10_11["OBX_10.11"])*
         (DELIMITER1 spec_const_10_12["OBX_10.12"] 
          (DELIMITER1 ts_sized_optionnal["OBX_10.13", 26] 
           (DELIMITER1 st_sized_optionnal["OBX_10.14", 20]
            (DELIMITER1 ts_sized_optionnal["OBX_10.15", 26]
             (DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6["OBX_10.16", 60]
              (DELIMITER1 st_sized_optionnal["OBX_10.17", 60] DELIMITER1?)?)?)?)?)?)?)?)?)?)?);

line_c2_1
@init{contentHandler.startElement("ligne", "C");}
@after{contentHandler.endElement();}:
  CR CHARC
  DELIMITER1 nm_integer_sized_mandatory["C_12.2", 10]
  DELIMITER1 spec_const_12_3["C_12.3"]
  DELIMITER1 st_sized_optionnal["C_12.4", 64000] (REPETITEUR st_sized_optionnal["C_12.4", 64000])*  
  DELIMITER1?;

line_l2_1
@init{contentHandler.startElement("ligne", "L");}
@after{contentHandler.endElement();}:
  CR CHARL
  (DELIMITER1 nm_integer_sized_optionnal["L_14.2", 1]
   (DELIMITER1
    (DELIMITER1 nm_integer_sized_optionnal["L_14.4", 4]
     (DELIMITER1 nm_integer_sized_optionnal["L_14.5", 10]
      (DELIMITER1 st_sized_optionnal["L_14.6", 12] DELIMITER1?)?)?)?)?)?;

// =========== Définition des éléments des champs hprim ===============

// Je d�finis que :
// Il est d�fini que quand il n'y a rien dans un champ, ce champ est d�clar� comme existant,
//   (startElement / endElement sont envoy�s), mais le content n'est pas d�fini (content non envoy�)

// Donn�es constantes

spec_const_sexe[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_charM | final_charF | final_charU)?;

spec_const_7_13_version_2_0[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  spec_const_7_13_1_version_2_0[$nameElement + ".1"] DELIMITER2 spec_const_7_13_2[$nameElement + ".2"];
  
spec_const_7_13_version_2_1[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  spec_const_7_13_1_version_2_1[$nameElement + ".1"] DELIMITER2 spec_const_7_13_2[$nameElement + ".2"];

spec_const_7_13_version_2_2[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  spec_const_7_13_1_version_2_2[$nameElement + ".1"] DELIMITER2 spec_const_7_13_2[$nameElement + ".2"];

spec_const_7_13_2[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_charC | final_charL | final_charR;

spec_const_7_7_contexte[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_ORU;

spec_const_7_12[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_charP | final_charD | final_charT);

spec_const_9_31[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_PORT | final_CART | final_WHLC | final_WALK)?;

spec_const_8_25[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_OP | final_IP | final_ER | final_PA | final_MP)?;

spec_const_9_26[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO |
  final_charD | final_charX)?; 

spec_const_10_3_nm[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  CHARN CHARM {contentHandler.content($text);}; 

spec_const_10_3_ce[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  CHARC CHARE {contentHandler.content($text);}; 

spec_const_10_3_st[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  CHARS CHART {contentHandler.content($text);}; 

spec_const_10_3_gc[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  CHARG CHARC {contentHandler.content($text);};
  
spec_const_10_3_tx[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  CHART CHARX {contentHandler.content($text);};

spec_const_10_3_fic[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (CHARF CHARI CHARC) {contentHandler.content($text);};

spec_const_10_3_std[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (CHARA CHARD) | (CHARC CHARK) | (CHARC CHARN CHARA) | (CHARD CHART) |
  (CHARP CHARN) | (CHART CHARN) |
  (CHARG CHARB) | (CHARG CHARN) {contentHandler.content($text);};

// Données spéciales (associant plusieurs données générales)

spec_sized_10_6[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  st_sized_optionnal[$nameElement + ".1", 10]
  (DELIMITER2 st_sized_optionnal[$nameElement + ".2", 60]
   (DELIMITER2 st_sized_optionnal[$nameElement + ".3", 10])?)?
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_const_10_9[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup |
  final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB |
  final_charW | final_charR | final_charI | final_charS | final_MS | final_VS)?;

spec_const_10_11[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_charA | final_charS | final_charR | final_charN)?;

spec_const_10_12[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_charR | final_charP | final_charF | final_charC | final_charI | final_charD |
   final_charX | final_charU)?;

spec_const_12_3[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  (final_charP | final_charL)?;

spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  st_nonsized_mandatory[$nameElement + ".1"]
   DELIMITER2 st_nonsized_mandatory[$nameElement + ".2"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"])?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"]
    (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"])?)?)?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
    (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"]
     (DELIMITER2 st_non_sized_optionnal[$nameElement + ".4"]
      (DELIMITER2 st_non_sized_optionnal[$nameElement + ".5"]
       (DELIMITER2 st_non_sized_optionnal[$nameElement + ".6"])?)?)?)?)?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
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
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER3 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER3 st_non_sized_optionnal[$nameElement + ".3"])?)?;

spec_sized_mult_lvl2_st_optionnal_6[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  st_non_sized_optionnal[$nameElement + ".1"]
  (DELIMITER3 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER3 st_non_sized_optionnal[$nameElement + ".3"]
    (DELIMITER3 st_non_sized_optionnal[$nameElement + ".4"]
     (DELIMITER3 st_non_sized_optionnal[$nameElement + ".5"]
      (DELIMITER3 st_non_sized_optionnal[$nameElement + ".6"])?)?)?)?)?;

spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  nm_nonsized_optionnal[$nameElement + ".1"]
  DELIMITER2 nm_nonsized_optionnal[$nameElement + ".2"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};
  
spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  nm_nonsized_mandatory[$nameElement + ".1"]
  DELIMITER2 nm_nonsized_mandatory[$nameElement + ".2"]
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_cna[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
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
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
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
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  //st_sized_mandatory[$nameElement + ".1", 12]
  st_sized_optionnal[$nameElement + ".1", 12]
  (DELIMITER2 st_sized_optionnal[$nameElement + ".2", 10])?
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_non_sized_9_8[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  ts_sized_optionnal[$nameElement + ".1", 26]
   (REPETITEUR ts_sized_optionnal[$nameElement + ".2", 26])?;

spec_sized_9_16[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  spec_sized_mult_lvl2_st_optionnal_3[$nameElement + ".2"]
  (DELIMITER2 st_non_sized_optionnal[$nameElement + ".2"]
   (DELIMITER2 st_non_sized_optionnal[$nameElement + ".3"])?)?
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_10_4[String my_NameElement, int my_maxsize]
@init{contentHandler.startElement("champ", $my_NameElement);}
@after{contentHandler.endElement();}:
  st_nonsized_mandatory[$my_NameElement + ".1"]
  (DELIMITER2 st_non_sized_optionnal[$my_NameElement + ".2"]
   (DELIMITER2 st_non_sized_optionnal[$my_NameElement + ".3"]
    (DELIMITER2 st_non_sized_optionnal[$my_NameElement + ".4"]
     (DELIMITER2 st_non_sized_optionnal[$my_NameElement + ".5"]
      (DELIMITER2 st_non_sized_optionnal[$my_NameElement + ".6"])?)?)?)?)?
  {matchRegex($text, "^.{0," + $my_maxsize + "}$", retval.start);};

spec_sized_10_6_tx[String nameElement, int maxSize]
@init{
  ParserRuleReturnScope retval = new ParserRuleReturnScope();
  retval.start = input.LT(1);
  contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  g=final_spec_10_6_tx?
  {if ($g.consoText != null)
    matchRegex($g.consoText, "^.{0," + $maxSize + "}$", retval.start);};

spec_sized_tn[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
 st_non_sized_optionnal[$nameElement + ".1"]
  (REPETITEUR st_non_sized_optionnal[$nameElement + ".2"])?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

// Chaines de caract�res, nombres, ...
 
st_sized_optionnal[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_st?
  {if ($text != null)
     matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

st_sized_mandatory[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_st
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

st_non_sized_optionnal[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_st?;

st_nonsized_mandatory[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_st;

nm_sized_optionnal[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_nm?
  {if ($text != null)
     matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

nm_integer_sized_optionnal[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_nm_integer?
  {if ($text != null)
     matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};
     
nm_integer_sized_mandatory[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_nm_integer
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

// Dates
ts_sized_optionnal[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_ts?
  {if ($text != null)
    matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

ts_sized_mandatory[String nameElement, int maxSize]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_ts
  {matchRegex($text, "^.{0," + $maxSize + "}$", retval.start);};

nm_nonsized_mandatory[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_nm;

nm_nonsized_optionnal[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_nm?;

spec_const_7_13_1_version_2_0[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_version_2_0;

spec_const_7_13_1_version_2_1[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_version_2_1;
  
spec_const_7_13_1_version_2_2[String nameElement]
@init{contentHandler.startElement("champ", $nameElement);}
@after{contentHandler.endElement();}:
  final_version_2_2;

// Donn�es finales construites

final_spec_10_6_tx returns [String consoText]:
  g=content_spec_10_6
  {contentHandler.content($g.consoText);
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
  {contentHandler.content($text);};

final_st:
  character+
  {contentHandler.content($text);};

final_nm:
  ((PLUS | MOINS)? 
  ((chiffre+ (POINT chiffre*)?)
  |(POINT chiffre+)))
  {contentHandler.content($text);};

final_nm_integer:
  chiffre+
  {contentHandler.content($text);};

final_ORU: CHARO CHARR CHARU {contentHandler.content($text);};

final_CART: CHARC CHARA CHARR CHART {contentHandler.content($text);};
final_PORT: CHARP CHARO CHARR CHART {contentHandler.content($text);};
final_WHLC: CHARW CHARH CHARL CHARC {contentHandler.content($text);};
final_WALK: CHARW CHARA CHARL CHARK {contentHandler.content($text);};

final_LL: CHARL CHARL {contentHandler.content($text);};
final_AA: CHARA CHARA {contentHandler.content($text);};
final_HH: CHARH CHARH {contentHandler.content($text);};
final_MS: CHARM CHARS {contentHandler.content($text);};
final_VS: CHARV CHARS {contentHandler.content($text);};
final_Null: CHARN CHARu CHARl CHARl {contentHandler.content($text);};
final_symbol_inf: CHAR_SYMBOL_INF {contentHandler.content($text);};
final_symbol_sup: CHAR_SYMBOL_SUP {contentHandler.content($text);};

final_version_2_0: CHARH CHIFFRE2 POINT CHIFFRE0 {contentHandler.content($text);};
final_version_2_1: CHARH CHIFFRE2 POINT CHIFFRE1 {contentHandler.content($text);};
final_version_2_2: CHARH CHIFFRE2 POINT CHIFFRE2 {contentHandler.content($text);};

final_OP: CHARO CHARP {contentHandler.content($text);};
final_IP: CHARI CHARP {contentHandler.content($text);};
final_ER: CHARE CHARR {contentHandler.content($text);};
final_PA: CHARP CHARA {contentHandler.content($text);};
final_MP: CHARM CHARP {contentHandler.content($text);};
  
final_charA: CHARA {contentHandler.content($text);};
final_charB: CHARB {contentHandler.content($text);};
final_charC: CHARC {contentHandler.content($text);};
final_charD: CHARD {contentHandler.content($text);};
final_charF: CHARF {contentHandler.content($text);};
final_charH: CHARH {contentHandler.content($text);};
final_charI: CHARI {contentHandler.content($text);};
final_charL: CHARL {contentHandler.content($text);};
final_charM: CHARM {contentHandler.content($text);};
final_charN: CHARN {contentHandler.content($text);};
final_charO: CHARO {contentHandler.content($text);};
final_charP: CHARP {contentHandler.content($text);};
final_charR: CHARR {contentHandler.content($text);};
final_charS: CHARS {contentHandler.content($text);};
final_charT: CHART {contentHandler.content($text);};
final_charU: CHARU {contentHandler.content($text);};
final_charW: CHARW {contentHandler.content($text);};
final_charX: CHARX {contentHandler.content($text);};
 
// Données de type délimiteurs
delimiters
@init{contentHandler.startElement("champ", "delimiteurs");}
@after{contentHandler.endElement();}:
  DELIMITERS
  {contentHandler.content($text);};

// Donn�es de base

character:
  (lettre | chiffre);

chiffre:
  (CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 |
   CHIFFRE9);

lettre:
  ~(CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 |
    CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR);

// =========== D�finitions pour le lexer perso =========

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
