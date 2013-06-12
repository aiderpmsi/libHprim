// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-12 10:49:19

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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class HPRIMSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTENT", "CR", "DELIMITER1", "DELIMITER2", "DELIMITER3", "DELIMITERS", "LINE_AC", "LINE_ACT", "LINE_AP", "LINE_C", "LINE_FAC", "LINE_GENERIC", "LINE_H", "LINE_L", "LINE_OBR", "LINE_OBX", "LINE_P", "LINE_REG", "REPETITEUR"
    };

    public static final int EOF=-1;
    public static final int CONTENT=4;
    public static final int CR=5;
    public static final int DELIMITER1=6;
    public static final int DELIMITER2=7;
    public static final int DELIMITER3=8;
    public static final int DELIMITERS=9;
    public static final int LINE_AC=10;
    public static final int LINE_ACT=11;
    public static final int LINE_AP=12;
    public static final int LINE_C=13;
    public static final int LINE_FAC=14;
    public static final int LINE_GENERIC=15;
    public static final int LINE_H=16;
    public static final int LINE_L=17;
    public static final int LINE_OBR=18;
    public static final int LINE_OBX=19;
    public static final int LINE_P=20;
    public static final int LINE_REG=21;
    public static final int REPETITEUR=22;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public HPRIMSParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public HPRIMSParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return HPRIMSParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g"; }



      // ========== Elements de définition des documents ===========
      private final static List<String> ap_14 = Arrays.asList(new String[] {"^.{1,}$", "^.{1,}$", "^.{1,}$", "^.{1,}$", "^.{1,}$", "^.{1,}$"});
      private final static List<String> ap_22 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> ac_8 = Arrays.asList(new String[] {"^.{1,}$", "^(TM|TR|FR)$", "^(PF|SS|FR)$"});
      private final static List<String> ac_10 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> act_9 = Arrays.asList(new String[] {"^.{0,9}$", "^.{0,9}$", "^.{0,40}$"});
      private final static List<String> act_10 = Arrays.asList(new String[] {".*", ".*"});
      private final static List<String> fac_6 = Arrays.asList(new String[] {"^.{0,9}$", "^.{0,9}$", "^.{0,40}$"});
      private final static List<String> fac_7 = Arrays.asList(new String[] {"^.{0,9}$", "^.{0,9}$", "^.{0,40}$"});
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
      private final static List<String> obr_3 = Arrays.asList(new String[] {"^.{0,12}$", "^.{0,10}$"});
      private final static List<String> obr_4 = Arrays.asList(new String[] {".*", ".*"});
      private final static List<String> obr_5 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_8 = Arrays.asList(new String[] {"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", "^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$"});
      private final static List<String> obr_11 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_13 = Arrays.asList(new String[] {".*", ".*"});
      private final static List<String> obr_16 = Arrays.asList(new String[] {".*", ".*", ".*"});
      private final static List<String> obr_17 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_18 = Arrays.asList(new String[] {".*", ".*"});
      private final static List<String> obr_25 = Arrays.asList(new String[] {".*", ".*"});
      private final static List<String> obr_29 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_30 = Arrays.asList(new String[] {".*", ".*", ".*", ".*"});
      private final static List<String> obr_33 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_34 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_35 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_36 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obx_4 = Arrays.asList(new String[] {"^.{1,}$", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obx_6_std = Arrays.asList(new String[] {".*", ".*", ".*"});
      private final static List<String> obx_6_gc = Arrays.asList(new String[] {"^(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", "^(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$"}); // Recherche de nombre (+|-)xx.yy
      private final static List<String> obx_16 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> reg_4 = Arrays.asList(new String[] {"^.{1,}$", "^.{1,}$"});

      /**
       * Indicateur définissant s'il faut ou non enregistrer le parsing.
       * Il permet de faire des recherches en avant (prédicats syntaxiques)
       * sans pour autant envoyer d'éléments au gestionnaire de contenu
       * qui pourrait se voir envoyer des données qui sont ensuite invalidées
       * (essai / erreur)
       */
      boolean record = true;

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




    // $ANTLR start "hprim"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:1: hprim[int strictNess] : ( ( line_h2_2_adm )=> ( line_h2_2_adm ( body_p_adm )+ line_l ( CR )? EOF ) | ( line_h2_1_adm )=> ( line_h2_1_adm ( body_p_adm )+ line_l ( CR )? EOF ) | ( line_h2_0_adm )=> ( line_h2_0_adm ( body_p_adm )+ line_l ( CR )? EOF ) | ( line_h2_2_fac )=> ( line_h2_2_fac ( body_p_fac )+ line_l ( CR )? EOF ) | ( line_h2_1_fac )=> ( line_h2_1_fac ( body_p_fac )+ line_l ( CR )? EOF ) | ( line_h2_0_fac )=> ( line_h2_0_fac ( body_p_fac )+ line_l ( CR )? EOF ) | ( line_h2_2_ora )=> ( line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF ) | ( line_h2_1_ora )=> ( line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF ) | ( line_h2_0_ora )=> ( line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF ) | ( line_h2_2_orm )=> ( line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF ) | ( line_h2_1_orm )=> ( line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF ) | ( line_h2_0_orm )=> ( line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF ) | ( line_h2_2_oru )=> ( line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF ) | ( line_h2_1_oru )=> ( line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF ) | ( line_h2_0_oru )=> ( line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF ) | ( line_h2_2_reg )=> ( line_h2_2_reg ( body_p_reg )+ line_l ( CR )? EOF ) | ( line_h2_1_reg )=> ( line_h2_1_reg ( body_p_reg )+ line_l ( CR )? EOF ) | ( line_h2_0_reg )=> ( line_h2_0_reg ( body_p_reg )+ line_l ( CR )? EOF ) );
    public final void hprim(int strictNess) throws RecognitionException {
        this.strictNess = strictNess;startDocument();record = false;
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:276:38: ( ( line_h2_2_adm )=> ( line_h2_2_adm ( body_p_adm )+ line_l ( CR )? EOF ) | ( line_h2_1_adm )=> ( line_h2_1_adm ( body_p_adm )+ line_l ( CR )? EOF ) | ( line_h2_0_adm )=> ( line_h2_0_adm ( body_p_adm )+ line_l ( CR )? EOF ) | ( line_h2_2_fac )=> ( line_h2_2_fac ( body_p_fac )+ line_l ( CR )? EOF ) | ( line_h2_1_fac )=> ( line_h2_1_fac ( body_p_fac )+ line_l ( CR )? EOF ) | ( line_h2_0_fac )=> ( line_h2_0_fac ( body_p_fac )+ line_l ( CR )? EOF ) | ( line_h2_2_ora )=> ( line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF ) | ( line_h2_1_ora )=> ( line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF ) | ( line_h2_0_ora )=> ( line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF ) | ( line_h2_2_orm )=> ( line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF ) | ( line_h2_1_orm )=> ( line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF ) | ( line_h2_0_orm )=> ( line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF ) | ( line_h2_2_oru )=> ( line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF ) | ( line_h2_1_oru )=> ( line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF ) | ( line_h2_0_oru )=> ( line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF ) | ( line_h2_2_reg )=> ( line_h2_2_reg ( body_p_reg )+ line_l ( CR )? EOF ) | ( line_h2_1_reg )=> ( line_h2_1_reg ( body_p_reg )+ line_l ( CR )? EOF ) | ( line_h2_0_reg )=> ( line_h2_0_reg ( body_p_reg )+ line_l ( CR )? EOF ) )
            int alt37=18;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LINE_H) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred1_HPRIMS()) ) {
                    alt37=1;
                }
                else if ( (synpred2_HPRIMS()) ) {
                    alt37=2;
                }
                else if ( (synpred3_HPRIMS()) ) {
                    alt37=3;
                }
                else if ( (synpred4_HPRIMS()) ) {
                    alt37=4;
                }
                else if ( (synpred5_HPRIMS()) ) {
                    alt37=5;
                }
                else if ( (synpred6_HPRIMS()) ) {
                    alt37=6;
                }
                else if ( (synpred7_HPRIMS()) ) {
                    alt37=7;
                }
                else if ( (synpred8_HPRIMS()) ) {
                    alt37=8;
                }
                else if ( (synpred9_HPRIMS()) ) {
                    alt37=9;
                }
                else if ( (synpred10_HPRIMS()) ) {
                    alt37=10;
                }
                else if ( (synpred11_HPRIMS()) ) {
                    alt37=11;
                }
                else if ( (synpred12_HPRIMS()) ) {
                    alt37=12;
                }
                else if ( (synpred13_HPRIMS()) ) {
                    alt37=13;
                }
                else if ( (synpred14_HPRIMS()) ) {
                    alt37=14;
                }
                else if ( (synpred15_HPRIMS()) ) {
                    alt37=15;
                }
                else if ( (synpred16_HPRIMS()) ) {
                    alt37=16;
                }
                else if ( (synpred17_HPRIMS()) ) {
                    alt37=17;
                }
                else if ( (synpred18_HPRIMS()) ) {
                    alt37=18;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:3: ( line_h2_2_adm )=> ( line_h2_2_adm ( body_p_adm )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:5: ( line_h2_2_adm ( body_p_adm )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:6: line_h2_2_adm ( body_p_adm )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ADM.2_2");}

                    pushFollow(FOLLOW_line_h2_2_adm_in_hprim87);
                    line_h2_2_adm();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:67: ( body_p_adm )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==CR) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==LINE_P) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:67: body_p_adm
                    	    {
                    	    pushFollow(FOLLOW_body_p_adm_in_hprim89);
                    	    body_p_adm();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim92);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:86: ( CR )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==CR) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim94); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim97); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:3: ( line_h2_1_adm )=> ( line_h2_1_adm ( body_p_adm )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:5: ( line_h2_1_adm ( body_p_adm )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:6: line_h2_1_adm ( body_p_adm )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ADM.2_1");}

                    pushFollow(FOLLOW_line_h2_1_adm_in_hprim121);
                    line_h2_1_adm();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:67: ( body_p_adm )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==CR) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==LINE_P) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:67: body_p_adm
                    	    {
                    	    pushFollow(FOLLOW_body_p_adm_in_hprim123);
                    	    body_p_adm();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim126);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:86: ( CR )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==CR) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim128); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim131); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:3: ( line_h2_0_adm )=> ( line_h2_0_adm ( body_p_adm )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:5: ( line_h2_0_adm ( body_p_adm )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:6: line_h2_0_adm ( body_p_adm )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ADM.2_0");}

                    pushFollow(FOLLOW_line_h2_0_adm_in_hprim155);
                    line_h2_0_adm();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:67: ( body_p_adm )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==CR) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==LINE_P) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:67: body_p_adm
                    	    {
                    	    pushFollow(FOLLOW_body_p_adm_in_hprim157);
                    	    body_p_adm();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim160);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:86: ( CR )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==CR) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim162); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim165); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:3: ( line_h2_2_fac )=> ( line_h2_2_fac ( body_p_fac )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:5: ( line_h2_2_fac ( body_p_fac )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:6: line_h2_2_fac ( body_p_fac )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.FAC.2_2");}

                    pushFollow(FOLLOW_line_h2_2_fac_in_hprim189);
                    line_h2_2_fac();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:67: ( body_p_fac )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==CR) ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1==LINE_P) ) {
                                alt7=1;
                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:67: body_p_fac
                    	    {
                    	    pushFollow(FOLLOW_body_p_fac_in_hprim191);
                    	    body_p_fac();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim194);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:86: ( CR )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==CR) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim196); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim199); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:3: ( line_h2_1_fac )=> ( line_h2_1_fac ( body_p_fac )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:5: ( line_h2_1_fac ( body_p_fac )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:6: line_h2_1_fac ( body_p_fac )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.FAC.2_1");}

                    pushFollow(FOLLOW_line_h2_1_fac_in_hprim223);
                    line_h2_1_fac();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:67: ( body_p_fac )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==CR) ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==LINE_P) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:67: body_p_fac
                    	    {
                    	    pushFollow(FOLLOW_body_p_fac_in_hprim225);
                    	    body_p_fac();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim228);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:86: ( CR )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==CR) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim230); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim233); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:292:3: ( line_h2_0_fac )=> ( line_h2_0_fac ( body_p_fac )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:293:5: ( line_h2_0_fac ( body_p_fac )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:293:6: line_h2_0_fac ( body_p_fac )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.FAC.2_0");}

                    pushFollow(FOLLOW_line_h2_0_fac_in_hprim257);
                    line_h2_0_fac();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:293:67: ( body_p_fac )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==CR) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==LINE_P) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:293:67: body_p_fac
                    	    {
                    	    pushFollow(FOLLOW_body_p_fac_in_hprim259);
                    	    body_p_fac();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim262);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:293:86: ( CR )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==CR) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:293:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim264); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim267); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:295:3: ( line_h2_2_ora )=> ( line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:5: ( line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:6: line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORA.2_2");}

                    pushFollow(FOLLOW_line_h2_2_ora_in_hprim291);
                    line_h2_2_ora();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:67: ( body_p_ora )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==CR) ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1==LINE_P) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:67: body_p_ora
                    	    {
                    	    pushFollow(FOLLOW_body_p_ora_in_hprim293);
                    	    body_p_ora();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim296);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:86: ( CR )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==CR) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim298); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim301); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:298:3: ( line_h2_1_ora )=> ( line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:5: ( line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:6: line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORA.2_1");}

                    pushFollow(FOLLOW_line_h2_1_ora_in_hprim325);
                    line_h2_1_ora();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:67: ( body_p_ora )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==CR) ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1==LINE_P) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:67: body_p_ora
                    	    {
                    	    pushFollow(FOLLOW_body_p_ora_in_hprim327);
                    	    body_p_ora();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim330);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:86: ( CR )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==CR) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim332); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim335); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:3: ( line_h2_0_ora )=> ( line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:302:5: ( line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:302:6: line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORA.2_0");}

                    pushFollow(FOLLOW_line_h2_0_ora_in_hprim359);
                    line_h2_0_ora();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:302:67: ( body_p_ora )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==CR) ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1==LINE_P) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:302:67: body_p_ora
                    	    {
                    	    pushFollow(FOLLOW_body_p_ora_in_hprim361);
                    	    body_p_ora();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim364);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:302:86: ( CR )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==CR) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:302:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim366); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim369); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:304:3: ( line_h2_2_orm )=> ( line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:305:5: ( line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:305:6: line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORM.2_2");}

                    pushFollow(FOLLOW_line_h2_2_orm_in_hprim393);
                    line_h2_2_orm();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:305:67: ( body_p_orm )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==CR) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==LINE_P) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:305:67: body_p_orm
                    	    {
                    	    pushFollow(FOLLOW_body_p_orm_in_hprim395);
                    	    body_p_orm();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim398);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:305:86: ( CR )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==CR) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:305:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim400); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim403); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:307:3: ( line_h2_1_orm )=> ( line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:308:5: ( line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:308:6: line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORM.2_1");}

                    pushFollow(FOLLOW_line_h2_1_orm_in_hprim427);
                    line_h2_1_orm();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:308:67: ( body_p_orm )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==CR) ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1==LINE_P) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:308:67: body_p_orm
                    	    {
                    	    pushFollow(FOLLOW_body_p_orm_in_hprim429);
                    	    body_p_orm();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim432);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:308:86: ( CR )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==CR) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:308:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim434); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim437); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:310:3: ( line_h2_0_orm )=> ( line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:5: ( line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:6: line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORM.2_0");}

                    pushFollow(FOLLOW_line_h2_0_orm_in_hprim461);
                    line_h2_0_orm();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:67: ( body_p_orm )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==CR) ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==LINE_P) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:67: body_p_orm
                    	    {
                    	    pushFollow(FOLLOW_body_p_orm_in_hprim463);
                    	    body_p_orm();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim466);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:86: ( CR )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==CR) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim468); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim471); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:313:3: ( line_h2_2_oru )=> ( line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:5: ( line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:6: line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORU.2_2");}

                    pushFollow(FOLLOW_line_h2_2_oru_in_hprim495);
                    line_h2_2_oru();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:67: ( body_p_oru )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==CR) ) {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1==LINE_P) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:67: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim497);
                    	    body_p_oru();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim500);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:86: ( CR )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CR) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim502); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim505); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:3: ( line_h2_1_oru )=> ( line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:5: ( line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:6: line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORU.2_1");}

                    pushFollow(FOLLOW_line_h2_1_oru_in_hprim529);
                    line_h2_1_oru();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:67: ( body_p_oru )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==CR) ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==LINE_P) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:67: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim531);
                    	    body_p_oru();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim534);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:86: ( CR )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==CR) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim536); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim539); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:3: ( line_h2_0_oru )=> ( line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:5: ( line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:6: line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.ORU.2_0");}

                    pushFollow(FOLLOW_line_h2_0_oru_in_hprim563);
                    line_h2_0_oru();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:67: ( body_p_oru )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==CR) ) {
                            int LA29_1 = input.LA(2);

                            if ( (LA29_1==LINE_P) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:67: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim565);
                    	    body_p_oru();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim568);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:86: ( CR )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==CR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim570); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim573); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:3: ( line_h2_2_reg )=> ( line_h2_2_reg ( body_p_reg )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:5: ( line_h2_2_reg ( body_p_reg )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:6: line_h2_2_reg ( body_p_reg )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.REG.2_2");}

                    pushFollow(FOLLOW_line_h2_2_reg_in_hprim597);
                    line_h2_2_reg();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:67: ( body_p_reg )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==CR) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==LINE_P) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:67: body_p_reg
                    	    {
                    	    pushFollow(FOLLOW_body_p_reg_in_hprim599);
                    	    body_p_reg();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim602);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:86: ( CR )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==CR) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim604); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim607); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:325:3: ( line_h2_1_reg )=> ( line_h2_1_reg ( body_p_reg )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:5: ( line_h2_1_reg ( body_p_reg )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:6: line_h2_1_reg ( body_p_reg )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.REG.2_1");}

                    pushFollow(FOLLOW_line_h2_1_reg_in_hprim631);
                    line_h2_1_reg();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:67: ( body_p_reg )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==CR) ) {
                            int LA33_1 = input.LA(2);

                            if ( (LA33_1==LINE_P) ) {
                                alt33=1;
                            }


                        }


                        switch (alt33) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:67: body_p_reg
                    	    {
                    	    pushFollow(FOLLOW_body_p_reg_in_hprim633);
                    	    body_p_reg();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim636);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:86: ( CR )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==CR) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim638); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim641); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:328:3: ( line_h2_0_reg )=> ( line_h2_0_reg ( body_p_reg )+ line_l ( CR )? EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:329:5: ( line_h2_0_reg ( body_p_reg )+ line_l ( CR )? EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:329:6: line_h2_0_reg ( body_p_reg )+ line_l ( CR )? EOF
                    {
                    if ( state.backtracking==0 ) {record = true;startElement("HPRIM.REG.2_0");}

                    pushFollow(FOLLOW_line_h2_0_reg_in_hprim665);
                    line_h2_0_reg();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:329:67: ( body_p_reg )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==CR) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==LINE_P) ) {
                                alt35=1;
                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:329:67: body_p_reg
                    	    {
                    	    pushFollow(FOLLOW_body_p_reg_in_hprim667);
                    	    body_p_reg();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    pushFollow(FOLLOW_line_l_in_hprim670);
                    line_l();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:329:86: ( CR )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==CR) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:329:86: CR
                            {
                            match(input,CR,FOLLOW_CR_in_hprim672); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,EOF,FOLLOW_EOF_in_hprim675); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;

            }
            if ( state.backtracking==0 ) {record = true;endDocument();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim"



    // $ANTLR start "dirty_hprim"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:332:1: dirty_hprim : ( dirty_line[2] )* ( CR )? EOF ;
    public final void dirty_hprim() throws RecognitionException {
        startDocument();startElement("HPRIM.DIRTY");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:334:37: ( ( dirty_line[2] )* ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:3: ( dirty_line[2] )* ( CR )? EOF
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:3: ( dirty_line[2] )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==CR) ) {
                    int LA38_1 = input.LA(2);

                    if ( ((LA38_1 >= LINE_AC && LA38_1 <= LINE_GENERIC)||(LA38_1 >= LINE_L && LA38_1 <= LINE_REG)) ) {
                        alt38=1;
                    }


                }
                else if ( (LA38_0==LINE_H) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:3: dirty_line[2]
            	    {
            	    pushFollow(FOLLOW_dirty_line_in_dirty_hprim701);
            	    dirty_line(2);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:18: ( CR )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==CR) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:18: CR
                    {
                    match(input,CR,FOLLOW_CR_in_dirty_hprim705); if (state.failed) return ;

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_dirty_hprim708); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();endDocument();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_hprim"



    // $ANTLR start "body_p_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:338:1: body_p_adm : ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* ) ;
    public final void body_p_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:338:12: ( ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:4: line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_adm720);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:11: ( line_c )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==CR) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==LINE_C) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_adm723);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:4: ( line_ap ( line_c )* ( line_ac ( line_c )* )* )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==CR) ) {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==LINE_AP) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:5: line_ap ( line_c )* ( line_ac ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_ap_in_body_p_adm731);
            	    line_ap();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:13: ( line_c )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==CR) ) {
            	            int LA41_1 = input.LA(2);

            	            if ( (LA41_1==LINE_C) ) {
            	                alt41=1;
            	            }


            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:14: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_adm734);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:5: ( line_ac ( line_c )* )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==CR) ) {
            	            int LA43_1 = input.LA(2);

            	            if ( (LA43_1==LINE_AC) ) {
            	                alt43=1;
            	            }


            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:6: line_ac ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_ac_in_body_p_adm743);
            	    	    line_ac();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:14: ( line_c )*
            	    	    loop42:
            	    	    do {
            	    	        int alt42=2;
            	    	        int LA42_0 = input.LA(1);

            	    	        if ( (LA42_0==CR) ) {
            	    	            int LA42_1 = input.LA(2);

            	    	            if ( (LA42_1==LINE_C) ) {
            	    	                alt42=1;
            	    	            }


            	    	        }


            	    	        switch (alt42) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:15: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_adm746);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop42;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body_p_adm"



    // $ANTLR start "body_p_fac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:343:1: body_p_fac : ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ ) ;
    public final void body_p_fac() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:343:12: ( ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:4: line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_fac764);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:11: ( line_c )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==CR) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==LINE_C) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_fac767);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:345:4: ( line_ap ( line_c )* ( line_ac ( line_c )* )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==CR) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==LINE_AP) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:345:5: line_ap ( line_c )* ( line_ac ( line_c )* )*
                    {
                    pushFollow(FOLLOW_line_ap_in_body_p_fac775);
                    line_ap();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:345:13: ( line_c )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==CR) ) {
                            int LA46_1 = input.LA(2);

                            if ( (LA46_1==LINE_C) ) {
                                alt46=1;
                            }


                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:345:14: line_c
                    	    {
                    	    pushFollow(FOLLOW_line_c_in_body_p_fac778);
                    	    line_c();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:346:5: ( line_ac ( line_c )* )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==CR) ) {
                            int LA48_1 = input.LA(2);

                            if ( (LA48_1==LINE_AC) ) {
                                alt48=1;
                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:346:6: line_ac ( line_c )*
                    	    {
                    	    pushFollow(FOLLOW_line_ac_in_body_p_fac787);
                    	    line_ac();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:346:14: ( line_c )*
                    	    loop47:
                    	    do {
                    	        int alt47=2;
                    	        int LA47_0 = input.LA(1);

                    	        if ( (LA47_0==CR) ) {
                    	            int LA47_1 = input.LA(2);

                    	            if ( (LA47_1==LINE_C) ) {
                    	                alt47=1;
                    	            }


                    	        }


                    	        switch (alt47) {
                    	    	case 1 :
                    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:346:15: line_c
                    	    	    {
                    	    	    pushFollow(FOLLOW_line_c_in_body_p_fac790);
                    	    	    line_c();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop47;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:4: ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==CR) ) {
                    int LA55_1 = input.LA(2);

                    if ( (LA55_1==LINE_FAC) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:5: line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_fac_in_body_p_fac802);
            	    line_fac();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:14: ( line_c )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==CR) ) {
            	            int LA50_1 = input.LA(2);

            	            if ( (LA50_1==LINE_C) ) {
            	                alt50=1;
            	            }


            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_fac805);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:5: ( line_reg ( line_c )* )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==CR) ) {
            	            int LA52_1 = input.LA(2);

            	            if ( (LA52_1==LINE_REG) ) {
            	                alt52=1;
            	            }


            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:6: line_reg ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_reg_in_body_p_fac814);
            	    	    line_reg();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:15: ( line_c )*
            	    	    loop51:
            	    	    do {
            	    	        int alt51=2;
            	    	        int LA51_0 = input.LA(1);

            	    	        if ( (LA51_0==CR) ) {
            	    	            int LA51_1 = input.LA(2);

            	    	            if ( (LA51_1==LINE_C) ) {
            	    	                alt51=1;
            	    	            }


            	    	        }


            	    	        switch (alt51) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_fac817);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop51;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:5: ( line_act ( line_c )* )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==CR) ) {
            	            int LA54_1 = input.LA(2);

            	            if ( (LA54_1==LINE_ACT) ) {
            	                alt54=1;
            	            }


            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:6: line_act ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_act_in_body_p_fac828);
            	    	    line_act();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:15: ( line_c )*
            	    	    loop53:
            	    	    do {
            	    	        int alt53=2;
            	    	        int LA53_0 = input.LA(1);

            	    	        if ( (LA53_0==CR) ) {
            	    	            int LA53_1 = input.LA(2);

            	    	            if ( (LA53_1==LINE_C) ) {
            	    	                alt53=1;
            	    	            }


            	    	        }


            	    	        switch (alt53) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_fac831);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop53;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body_p_fac"



    // $ANTLR start "body_p_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:351:1: body_p_ora : ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ ) ;
    public final void body_p_ora() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:351:12: ( ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:352:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:352:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:352:4: line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_ora849);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:352:11: ( line_c )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==CR) ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1==LINE_C) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:352:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_ora852);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:353:4: ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==CR) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==LINE_AP) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:353:5: line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            	    {
            	    pushFollow(FOLLOW_line_ap_in_body_p_ora860);
            	    line_ap();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:353:13: ( line_c )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==CR) ) {
            	            int LA57_1 = input.LA(2);

            	            if ( (LA57_1==LINE_C) ) {
            	                alt57=1;
            	            }


            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:353:14: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_ora863);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:354:5: ( line_ac ( line_c )* )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==CR) ) {
            	            int LA59_1 = input.LA(2);

            	            if ( (LA59_1==LINE_AC) ) {
            	                alt59=1;
            	            }


            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:354:6: line_ac ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_ac_in_body_p_ora872);
            	    	    line_ac();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:354:14: ( line_c )*
            	    	    loop58:
            	    	    do {
            	    	        int alt58=2;
            	    	        int LA58_0 = input.LA(1);

            	    	        if ( (LA58_0==CR) ) {
            	    	            int LA58_1 = input.LA(2);

            	    	            if ( (LA58_1==LINE_C) ) {
            	    	                alt58=1;
            	    	            }


            	    	        }


            	    	        switch (alt58) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:354:15: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_ora875);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop58;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:5: ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            	    int cnt63=0;
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==CR) ) {
            	            int LA63_1 = input.LA(2);

            	            if ( (LA63_1==LINE_OBR) ) {
            	                alt63=1;
            	            }


            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:6: line_obr ( line_c )* ( line_obx ( line_c )* )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obr_in_body_p_ora886);
            	    	    line_obr();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:15: ( line_c )*
            	    	    loop60:
            	    	    do {
            	    	        int alt60=2;
            	    	        int LA60_0 = input.LA(1);

            	    	        if ( (LA60_0==CR) ) {
            	    	            int LA60_1 = input.LA(2);

            	    	            if ( (LA60_1==LINE_C) ) {
            	    	                alt60=1;
            	    	            }


            	    	        }


            	    	        switch (alt60) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_ora889);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop60;
            	    	        }
            	    	    } while (true);


            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:6: ( line_obx ( line_c )* )*
            	    	    loop62:
            	    	    do {
            	    	        int alt62=2;
            	    	        int LA62_0 = input.LA(1);

            	    	        if ( (LA62_0==CR) ) {
            	    	            int LA62_1 = input.LA(2);

            	    	            if ( (LA62_1==LINE_OBX) ) {
            	    	                alt62=1;
            	    	            }


            	    	        }


            	    	        switch (alt62) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:7: line_obx ( line_c )*
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_obx_in_body_p_ora899);
            	    	    	    line_obx();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:16: ( line_c )*
            	    	    	    loop61:
            	    	    	    do {
            	    	    	        int alt61=2;
            	    	    	        int LA61_0 = input.LA(1);

            	    	    	        if ( (LA61_0==CR) ) {
            	    	    	            int LA61_1 = input.LA(2);

            	    	    	            if ( (LA61_1==LINE_C) ) {
            	    	    	                alt61=1;
            	    	    	            }


            	    	    	        }


            	    	    	        switch (alt61) {
            	    	    	    	case 1 :
            	    	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:17: line_c
            	    	    	    	    {
            	    	    	    	    pushFollow(FOLLOW_line_c_in_body_p_ora902);
            	    	    	    	    line_c();

            	    	    	    	    state._fsp--;
            	    	    	    	    if (state.failed) return ;

            	    	    	    	    }
            	    	    	    	    break;

            	    	    	    	default :
            	    	    	    	    break loop61;
            	    	    	        }
            	    	    	    } while (true);


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop62;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt63 >= 1 ) break loop63;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(63, input);
            	                throw eee;
            	        }
            	        cnt63++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body_p_ora"



    // $ANTLR start "body_p_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:1: body_p_orm : ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ ) ;
    public final void body_p_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:12: ( ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:4: line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_orm927);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:11: ( line_c )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==CR) ) {
                    int LA65_1 = input.LA(2);

                    if ( (LA65_1==LINE_C) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_orm930);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:4: ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==CR) ) {
                    int LA69_1 = input.LA(2);

                    if ( (LA69_1==LINE_OBR) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:5: line_obr ( line_c )* ( line_obx ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_obr_in_body_p_orm938);
            	    line_obr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:14: ( line_c )*
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==CR) ) {
            	            int LA66_1 = input.LA(2);

            	            if ( (LA66_1==LINE_C) ) {
            	                alt66=1;
            	            }


            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_orm941);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop66;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:5: ( line_obx ( line_c )* )*
            	    loop68:
            	    do {
            	        int alt68=2;
            	        int LA68_0 = input.LA(1);

            	        if ( (LA68_0==CR) ) {
            	            int LA68_1 = input.LA(2);

            	            if ( (LA68_1==LINE_OBX) ) {
            	                alt68=1;
            	            }


            	        }


            	        switch (alt68) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:6: line_obx ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obx_in_body_p_orm950);
            	    	    line_obx();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:15: ( line_c )*
            	    	    loop67:
            	    	    do {
            	    	        int alt67=2;
            	    	        int LA67_0 = input.LA(1);

            	    	        if ( (LA67_0==CR) ) {
            	    	            int LA67_1 = input.LA(2);

            	    	            if ( (LA67_1==LINE_C) ) {
            	    	                alt67=1;
            	    	            }


            	    	        }


            	    	        switch (alt67) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_orm953);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop67;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop68;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body_p_orm"



    // $ANTLR start "body_p_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:1: body_p_oru : ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ ) ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:12: ( ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:4: line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru971);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:11: ( line_c )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==CR) ) {
                    int LA70_1 = input.LA(2);

                    if ( (LA70_1==LINE_C) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_oru974);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:4: ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==CR) ) {
                    int LA74_1 = input.LA(2);

                    if ( (LA74_1==LINE_OBR) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:5: line_obr ( line_c )* ( line_obx ( line_c )* )+
            	    {
            	    pushFollow(FOLLOW_line_obr_in_body_p_oru982);
            	    line_obr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:14: ( line_c )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==CR) ) {
            	            int LA71_1 = input.LA(2);

            	            if ( (LA71_1==LINE_C) ) {
            	                alt71=1;
            	            }


            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_oru985);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:367:5: ( line_obx ( line_c )* )+
            	    int cnt73=0;
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==CR) ) {
            	            int LA73_1 = input.LA(2);

            	            if ( (LA73_1==LINE_OBX) ) {
            	                alt73=1;
            	            }


            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:367:6: line_obx ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obx_in_body_p_oru994);
            	    	    line_obx();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:367:15: ( line_c )*
            	    	    loop72:
            	    	    do {
            	    	        int alt72=2;
            	    	        int LA72_0 = input.LA(1);

            	    	        if ( (LA72_0==CR) ) {
            	    	            int LA72_1 = input.LA(2);

            	    	            if ( (LA72_1==LINE_C) ) {
            	    	                alt72=1;
            	    	            }


            	    	        }


            	    	        switch (alt72) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:367:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_oru997);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop72;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt73 >= 1 ) break loop73;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(73, input);
            	                throw eee;
            	        }
            	        cnt73++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body_p_oru"



    // $ANTLR start "body_p_reg"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:369:1: body_p_reg : ( line_p ( line_c )* ( line_reg ( line_c )* )+ ) ;
    public final void body_p_reg() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:369:12: ( ( line_p ( line_c )* ( line_reg ( line_c )* )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:3: ( line_p ( line_c )* ( line_reg ( line_c )* )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:3: ( line_p ( line_c )* ( line_reg ( line_c )* )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:4: line_p ( line_c )* ( line_reg ( line_c )* )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_reg1015);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:11: ( line_c )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==CR) ) {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==LINE_C) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_reg1018);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:371:4: ( line_reg ( line_c )* )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==CR) ) {
                    int LA77_1 = input.LA(2);

                    if ( (LA77_1==LINE_REG) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:371:5: line_reg ( line_c )*
            	    {
            	    pushFollow(FOLLOW_line_reg_in_body_p_reg1026);
            	    line_reg();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:371:14: ( line_c )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==CR) ) {
            	            int LA76_1 = input.LA(2);

            	            if ( (LA76_1==LINE_C) ) {
            	                alt76=1;
            	            }


            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:371:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_reg1029);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop76;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "body_p_reg"



    // $ANTLR start "line_ap"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:376:1: line_ap : CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? ;
    public final void line_ap() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:378:23: ( CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:379:3: CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_ap1055); if (state.failed) return ;

            match(input,LINE_AP,FOLLOW_LINE_AP_in_line_ap1057); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.1");content("AP");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1063); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.2");}

            pushFollow(FOLLOW_spec_field_in_line_ap1067);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1074); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.3");}

            pushFollow(FOLLOW_spec_field_in_line_ap1078);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1085); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.4");}

            pushFollow(FOLLOW_spec_field_in_line_ap1089);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1096); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.5");}

            pushFollow(FOLLOW_spec_field_in_line_ap1100);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1107); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.6");}

            pushFollow(FOLLOW_spec_field_in_line_ap1111);
            spec_field("^[0-9]{1,15}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1118); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.7");}

            pushFollow(FOLLOW_spec_field_in_line_ap1122);
            spec_field("^.{1,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1129); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.8");}

            pushFollow(FOLLOW_spec_field_in_line_ap1133);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1140); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.9");}

            pushFollow(FOLLOW_spec_field_in_line_ap1144);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1151); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.10");}

            pushFollow(FOLLOW_spec_field_in_line_ap1155);
            spec_field("^[0-9]{1,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1162); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.11");}

            pushFollow(FOLLOW_spec_field_in_line_ap1166);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1173); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.12");}

            pushFollow(FOLLOW_spec_field_in_line_ap1177);
            spec_field("^.$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1184); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.13");}

            pushFollow(FOLLOW_spec_field_in_line_ap1188);
            spec_field("^.{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1195); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_ap1197);
            lvl1_fields("AP.14", ap_14, 6, "^.{1,48}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1202); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.15");}

            pushFollow(FOLLOW_spec_field_in_line_ap1206);
            spec_field("^.{0,24}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1213); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.16");}

            pushFollow(FOLLOW_spec_field_in_line_ap1217);
            spec_field("^[0-9]{1,6}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:3: ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==DELIMITER1) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:4: DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1225); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AP.17");}

                    pushFollow(FOLLOW_spec_field_in_line_ap1229);
                    spec_field("^[0-9]{0,9}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:396:4: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==DELIMITER1) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:396:5: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1238); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("AP.18");}

                            pushFollow(FOLLOW_spec_field_in_line_ap1242);
                            spec_field("^(O|N)?$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==DELIMITER1) ) {
                                alt83=1;
                            }
                            switch (alt83) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1252); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("AP.19");}

                                    pushFollow(FOLLOW_spec_field_in_line_ap1256);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    int alt82=2;
                                    int LA82_0 = input.LA(1);

                                    if ( (LA82_0==DELIMITER1) ) {
                                        alt82=1;
                                    }
                                    switch (alt82) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1267); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("AP.20");}

                                            pushFollow(FOLLOW_spec_field_in_line_ap1271);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:399:7: ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            int alt81=2;
                                            int LA81_0 = input.LA(1);

                                            if ( (LA81_0==DELIMITER1) ) {
                                                alt81=1;
                                            }
                                            switch (alt81) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:399:8: DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1283); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("AP.21");}

                                                    pushFollow(FOLLOW_spec_field_in_line_ap1288);
                                                    spec_field("^.{0,30}$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:400:8: ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    int alt80=2;
                                                    int LA80_0 = input.LA(1);

                                                    if ( (LA80_0==DELIMITER1) ) {
                                                        alt80=1;
                                                    }
                                                    switch (alt80) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:400:9: DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1301); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_in_line_ap1303);
                                                            lvl1_fields("AP.22", ap_22, 0, "^.{0,200}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:401:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            int alt79=2;
                                                            int LA79_0 = input.LA(1);

                                                            if ( (LA79_0==DELIMITER1) ) {
                                                                alt79=1;
                                                            }
                                                            switch (alt79) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:401:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1315); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("AP.23");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_ap1319);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:10: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    int alt78=2;
                                                                    int LA78_0 = input.LA(1);

                                                                    if ( (LA78_0==DELIMITER1) ) {
                                                                        alt78=1;
                                                                    }
                                                                    switch (alt78) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:11: DELIMITER1 spec_field[\"^$\", false, false]
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1334); if (state.failed) return ;

                                                                            pushFollow(FOLLOW_spec_field_in_line_ap1336);
                                                                            spec_field("^$", false, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_ap"



    // $ANTLR start "line_ac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:405:1: line_ac : CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_ac() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:407:23: ( CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:408:3: CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_ac1372); if (state.failed) return ;

            match(input,LINE_AC,FOLLOW_LINE_AC_in_line_ac1374); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.1");content("AC");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1380); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.2");}

            pushFollow(FOLLOW_spec_field_in_line_ac1384);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1391); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.3");}

            pushFollow(FOLLOW_spec_field_in_line_ac1395);
            spec_field("^.{1,9}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1402); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.4");}

            pushFollow(FOLLOW_spec_field_in_line_ac1406);
            spec_field("^.{1,15}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1413); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.5");}

            pushFollow(FOLLOW_spec_field_in_line_ac1417);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1424); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.6");}

            pushFollow(FOLLOW_spec_field_in_line_ac1428);
            spec_field("^[0-9]{6}(?:[0-9]{2})?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1435); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.7");}

            pushFollow(FOLLOW_spec_field_in_line_ac1439);
            spec_field("^.{0,28}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1446); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_ac1448);
            lvl1_fields("AC.8", ac_8, 3, "^.{10}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:416:3: ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==DELIMITER1) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:416:4: DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1454); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AC.9");}

                    pushFollow(FOLLOW_spec_field_in_line_ac1458);
                    spec_field("^.{0,40}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:417:4: ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==DELIMITER1) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:417:5: DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1467); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_ac1469);
                            lvl1_fields("AC.10", ac_10, 0, "^.{0,200}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==DELIMITER1) ) {
                                alt86=1;
                            }
                            switch (alt86) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:6: DELIMITER1 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1477); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_ac1479);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_ac"



    // $ANTLR start "line_act"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:421:1: line_act : CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? ;
    public final void line_act() throws RecognitionException {
        startElement("ACT");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:423:23: ( CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:424:3: CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )?
            {
            match(input,CR,FOLLOW_CR_in_line_act1505); if (state.failed) return ;

            match(input,LINE_ACT,FOLLOW_LINE_ACT_in_line_act1507); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.1");content("ACT");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1513); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.2");}

            pushFollow(FOLLOW_spec_field_in_line_act1517);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1524); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.3");}

            pushFollow(FOLLOW_spec_field_in_line_act1528);
            spec_field("^.{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1535); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.4");}

            pushFollow(FOLLOW_spec_field_in_line_act1539);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1546); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.5");}

            pushFollow(FOLLOW_spec_field_in_line_act1550);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1557); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.6");}

            pushFollow(FOLLOW_spec_field_in_line_act1561);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1568); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.7");}

            pushFollow(FOLLOW_spec_field_in_line_act1572);
            spec_field("^.{0,64000}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1579); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.8");}

            pushFollow(FOLLOW_spec_field_in_line_act1583);
            spec_field("^.{0,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1590); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_act1592);
            lvl1_fields("ACT.9", act_9, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1612); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_act1614);
            lvl1_fields("ACT.10", act_10, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:438:63: ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==REPETITEUR) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:438:64: REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_act1618); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_act1620);
            	    lvl1_fields("ACT.10", act_10, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1628); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.11");}

            pushFollow(FOLLOW_spec_field_in_line_act1632);
            spec_field("^(HR|RX|R)$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:440:3: ( DELIMITER1 spec_field[\"\", false, false] )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==DELIMITER1) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:440:4: DELIMITER1 spec_field[\"\", false, false]
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1640); if (state.failed) return ;

                    pushFollow(FOLLOW_spec_field_in_line_act1642);
                    spec_field("", false, false);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_act"



    // $ANTLR start "line_c"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:443:1: line_c : CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:22: ( CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:446:3: CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_c1663); if (state.failed) return ;

            match(input,LINE_C,FOLLOW_LINE_C_in_line_c1665); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.1");content("C");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1672); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.2");}

            pushFollow(FOLLOW_spec_field_in_line_c1676);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:448:3: ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==DELIMITER1) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:448:4: DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1684); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("C.3");}

                    pushFollow(FOLLOW_spec_field_in_line_c1688);
                    spec_field("^(P|L)?$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:449:4: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DELIMITER1) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:449:5: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1697); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("C.4");}

                            pushFollow(FOLLOW_spec_field_in_line_c1701);
                            spec_field("^.{0,64000}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:449:95: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==REPETITEUR) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:449:96: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c1707); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("C.4");}

                            	    pushFollow(FOLLOW_spec_field_in_line_c1711);
                            	    spec_field("^.{0,64000}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {endElement();}

                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==DELIMITER1) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:6: DELIMITER1 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1725); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_c1727);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_c"



    // $ANTLR start "line_fac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:453:1: line_fac : CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )? ;
    public final void line_fac() throws RecognitionException {
        startElement("FAC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:455:23: ( CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:456:3: CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_fac1753); if (state.failed) return ;

            match(input,LINE_FAC,FOLLOW_LINE_FAC_in_line_fac1755); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.1");content("FAC");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1761); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.2");}

            pushFollow(FOLLOW_spec_field_in_line_fac1765);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1772); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.3");}

            pushFollow(FOLLOW_spec_field_in_line_fac1776);
            spec_field("^.{1,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1783); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.4");}

            pushFollow(FOLLOW_spec_field_in_line_fac1787);
            spec_field("^.{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1794); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.5");}

            pushFollow(FOLLOW_spec_field_in_line_fac1798);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:461:3: ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==DELIMITER1) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:461:4: DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1806); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_fac1808);
                    lvl1_fields("FAC.6", fac_6, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:462:4: ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DELIMITER1) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:462:5: DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1815); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_fac1817);
                            lvl1_fields("FAC.7", fac_7, 0, "^.{0,60}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:463:5: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                            int alt96=2;
                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==DELIMITER1) ) {
                                alt96=1;
                            }
                            switch (alt96) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:463:6: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1825); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("FAC.8");}

                                    pushFollow(FOLLOW_spec_field_in_line_fac1829);
                                    spec_field("^(O|N)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:464:6: ( DELIMITER1 spec_field[\"\", false, false] )?
                                    int alt95=2;
                                    int LA95_0 = input.LA(1);

                                    if ( (LA95_0==DELIMITER1) ) {
                                        alt95=1;
                                    }
                                    switch (alt95) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:464:7: DELIMITER1 spec_field[\"\", false, false]
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1840); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_field_in_line_fac1842);
                                            spec_field("", false, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_fac"



    // $ANTLR start "start_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:1: start_line_h : LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,40}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:14: ( LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,40}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:470:3: LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,40}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"]
            {
            match(input,LINE_H,FOLLOW_LINE_H_in_start_line_h1864); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.1");content("H");endElement();}

            if ( state.backtracking==0 ) {startElement("H.2");}

            pushFollow(FOLLOW_delimiters_in_start_line_h1872);
            delimiters();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1878); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.3");}

            pushFollow(FOLLOW_spec_field_in_start_line_h1882);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1889); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.4");}

            pushFollow(FOLLOW_spec_field_in_start_line_h1893);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1900); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h1902);
            lvl1_fields("H.5", h_5, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1907); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h1909);
            lvl1_fields("H.6", h_6, 0, "^.{0,100}$");

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start_line_h"



    // $ANTLR start "midd_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:1: midd_line_h : DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:13: ( DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:479:3: DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1921); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_midd_line_h1923);
            lvl1_fields_repet("H.8", h_8, 0, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1928); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.9");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1932);
            spec_field("^.{0,40}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1939); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_midd_line_h1941);
            lvl1_fields("H.10", h_10, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1946); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.11");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1950);
            spec_field("^.{0,80}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1957); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.12");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1961);
            spec_field("^[P|D|T]$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "midd_line_h"



    // $ANTLR start "bloc_line_h_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:486:1: bloc_line_h_2_2 : DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:486:17: ( DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:5: DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_21977); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_21981);
            spec_field("^H2\\.2$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_21999); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_22003);
            spec_field("^[C|L|R]$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();endElement();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bloc_line_h_2_2"



    // $ANTLR start "bloc_line_h_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:1: bloc_line_h_2_1 : DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:17: ( DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:5: DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_12017); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_12021);
            spec_field("^H2\\.1$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_12039); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_12043);
            spec_field("^[C|L|R]$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();endElement();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bloc_line_h_2_1"



    // $ANTLR start "bloc_line_h_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:492:1: bloc_line_h_2_0 : DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_0() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:492:17: ( DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:5: DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_02057); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_02061);
            spec_field("^H2\\.0$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_02079); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_02083);
            spec_field("^[C|L|R]$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();endElement();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bloc_line_h_2_0"



    // $ANTLR start "end_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:1: end_line_h : DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? ;
    public final void end_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:12: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:3: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h2099); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.14");}

            pushFollow(FOLLOW_spec_field_in_end_line_h2103);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:3: ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==DELIMITER1) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:4: DELIMITER1 ( spec_field[\"\", false, false] )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h2111); if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:15: ( spec_field[\"\", false, false] )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==CONTENT) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:15: spec_field[\"\", false, false]
                            {
                            pushFollow(FOLLOW_spec_field_in_end_line_h2113);
                            spec_field("", false, false);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "end_line_h"



    // $ANTLR start "start_line_h_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:502:1: start_line_h_adm : start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h ;
    public final void start_line_h_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:502:18: ( start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:503:3: start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_adm2128);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_adm2132); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_adm2136);
            spec_field("^ADM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_adm2143);
            midd_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start_line_h_adm"



    // $ANTLR start "line_h2_2_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:507:1: line_h2_2_adm : start_line_h_adm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_adm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:509:23: ( start_line_h_adm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:510:3: start_line_h_adm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_2_adm2161);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm2165);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_adm2169);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_2_adm"



    // $ANTLR start "line_h2_1_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:514:1: line_h2_1_adm : start_line_h_adm bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_adm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:516:23: ( start_line_h_adm bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:517:3: start_line_h_adm bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_1_adm2187);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_adm2191);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_adm2195);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_1_adm"



    // $ANTLR start "line_h2_0_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:521:1: line_h2_0_adm : start_line_h_adm bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_adm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:23: ( start_line_h_adm bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:524:3: start_line_h_adm bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_0_adm2213);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_adm2217);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_adm2221);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_0_adm"



    // $ANTLR start "start_line_h_reg"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:529:1: start_line_h_reg : start_line_h DELIMITER1 spec_field[\"^REG$\", true, true] midd_line_h ;
    public final void start_line_h_reg() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:529:18: ( start_line_h DELIMITER1 spec_field[\"^REG$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:3: start_line_h DELIMITER1 spec_field[\"^REG$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_reg2232);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_reg2236); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_reg2240);
            spec_field("^REG$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_reg2247);
            midd_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start_line_h_reg"



    // $ANTLR start "line_h2_2_reg"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:534:1: line_h2_2_reg : start_line_h_reg bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_reg() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:536:23: ( start_line_h_reg bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:537:3: start_line_h_reg bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_reg_in_line_h2_2_reg2265);
            start_line_h_reg();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_reg2269);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_reg2273);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_2_reg"



    // $ANTLR start "line_h2_1_reg"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:541:1: line_h2_1_reg : start_line_h_reg bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_reg() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:23: ( start_line_h_reg bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:544:3: start_line_h_reg bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_reg_in_line_h2_1_reg2291);
            start_line_h_reg();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_reg2295);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_reg2299);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_1_reg"



    // $ANTLR start "line_h2_0_reg"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:548:1: line_h2_0_reg : start_line_h_reg bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_reg() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:550:23: ( start_line_h_reg bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:3: start_line_h_reg bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_reg_in_line_h2_0_reg2317);
            start_line_h_reg();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_reg2321);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_reg2325);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_0_reg"



    // $ANTLR start "start_line_h_fac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:556:1: start_line_h_fac : start_line_h DELIMITER1 spec_field[\"^FAC$\", true, true] midd_line_h ;
    public final void start_line_h_fac() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:556:18: ( start_line_h DELIMITER1 spec_field[\"^FAC$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:557:3: start_line_h DELIMITER1 spec_field[\"^FAC$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_fac2336);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_fac2340); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_fac2344);
            spec_field("^FAC$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_fac2351);
            midd_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start_line_h_fac"



    // $ANTLR start "line_h2_2_fac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:561:1: line_h2_2_fac : start_line_h_fac bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_fac() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:23: ( start_line_h_fac bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:564:3: start_line_h_fac bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_fac_in_line_h2_2_fac2369);
            start_line_h_fac();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_fac2373);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_fac2377);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_2_fac"



    // $ANTLR start "line_h2_1_fac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:568:1: line_h2_1_fac : start_line_h_fac bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_fac() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:570:23: ( start_line_h_fac bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:3: start_line_h_fac bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_fac_in_line_h2_1_fac2395);
            start_line_h_fac();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_fac2399);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_fac2403);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_1_fac"



    // $ANTLR start "line_h2_0_fac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:575:1: line_h2_0_fac : start_line_h_fac bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_fac() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:577:23: ( start_line_h_fac bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:3: start_line_h_fac bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_fac_in_line_h2_0_fac2421);
            start_line_h_fac();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_fac2425);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_fac2429);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_0_fac"



    // $ANTLR start "start_line_h_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:583:1: start_line_h_ora : start_line_h DELIMITER1 spec_field[\"^ORA$\", true, true] midd_line_h ;
    public final void start_line_h_ora() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:583:18: ( start_line_h DELIMITER1 spec_field[\"^ORA$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:584:3: start_line_h DELIMITER1 spec_field[\"^ORA$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_ora2440);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_ora2444); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_ora2448);
            spec_field("^ORA$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_ora2455);
            midd_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start_line_h_ora"



    // $ANTLR start "line_h2_2_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:588:1: line_h2_2_ora : start_line_h_ora bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_ora() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:590:23: ( start_line_h_ora bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:591:3: start_line_h_ora bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_ora_in_line_h2_2_ora2473);
            start_line_h_ora();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_ora2477);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_ora2481);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_2_ora"



    // $ANTLR start "line_h2_1_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:595:1: line_h2_1_ora : start_line_h_ora bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_ora() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:597:23: ( start_line_h_ora bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:598:3: start_line_h_ora bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_ora_in_line_h2_1_ora2499);
            start_line_h_ora();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_ora2503);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_ora2507);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_1_ora"



    // $ANTLR start "line_h2_0_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:602:1: line_h2_0_ora : start_line_h_ora bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_ora() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:604:23: ( start_line_h_ora bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:3: start_line_h_ora bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_ora_in_line_h2_0_ora2525);
            start_line_h_ora();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_ora2529);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_ora2533);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_0_ora"



    // $ANTLR start "start_line_h_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:610:1: start_line_h_orm : start_line_h DELIMITER1 spec_field[\"^ORM$\", true, true] midd_line_h ;
    public final void start_line_h_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:610:18: ( start_line_h DELIMITER1 spec_field[\"^ORM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:611:3: start_line_h DELIMITER1 spec_field[\"^ORM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_orm2544);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_orm2548); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_orm2552);
            spec_field("^ORM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_orm2559);
            midd_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start_line_h_orm"



    // $ANTLR start "line_h2_2_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:615:1: line_h2_2_orm : start_line_h_orm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:617:23: ( start_line_h_orm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:618:3: start_line_h_orm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_orm_in_line_h2_2_orm2577);
            start_line_h_orm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_orm2581);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_orm2585);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_2_orm"



    // $ANTLR start "line_h2_1_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:622:1: line_h2_1_orm : start_line_h_orm bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:624:23: ( start_line_h_orm bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:3: start_line_h_orm bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_orm_in_line_h2_1_orm2603);
            start_line_h_orm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_orm2607);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_orm2611);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_1_orm"



    // $ANTLR start "line_h2_0_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:629:1: line_h2_0_orm : start_line_h_orm bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:631:23: ( start_line_h_orm bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:632:3: start_line_h_orm bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_orm_in_line_h2_0_orm2629);
            start_line_h_orm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_orm2633);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_orm2637);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_0_orm"



    // $ANTLR start "start_line_h_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:637:1: start_line_h_oru : start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h ;
    public final void start_line_h_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:637:18: ( start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:638:3: start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_oru2648);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_oru2652); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_oru2656);
            spec_field("^ORU$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_oru2663);
            midd_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start_line_h_oru"



    // $ANTLR start "line_h2_2_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:642:1: line_h2_2_oru : start_line_h_oru bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:644:23: ( start_line_h_oru bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:645:3: start_line_h_oru bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_2_oru2681);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru2685);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_oru2689);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_2_oru"



    // $ANTLR start "line_h2_1_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:649:1: line_h2_1_oru : start_line_h_oru bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:651:23: ( start_line_h_oru bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:652:3: start_line_h_oru bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_1_oru2707);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru2711);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_oru2715);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_1_oru"



    // $ANTLR start "line_h2_0_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:656:1: line_h2_0_oru : start_line_h_oru bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:658:23: ( start_line_h_oru bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:659:3: start_line_h_oru bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_0_oru2733);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru2737);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_oru2741);
            end_line_h();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_h2_0_oru"



    // $ANTLR start "line_obr"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:665:1: line_obr : CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields_repet[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:23: ( CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields_repet[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:668:3: CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields_repet[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2763); if (state.failed) return ;

            match(input,LINE_OBR,FOLLOW_LINE_OBR_in_line_obr2765); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.1");content("OBR");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2771); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.2");}

            pushFollow(FOLLOW_spec_field_in_line_obr2775);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2782); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr2784);
            lvl1_fields("OBR.3", obr_3, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2789); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr2791);
            lvl1_fields("OBR.4", obr_4, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2796); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr2798);
            lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:61: ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==REPETITEUR) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:62: REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2802); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_obr2804);
            	    lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2814); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.6");}

            pushFollow(FOLLOW_spec_field_in_line_obr2818);
            spec_field("^.{0,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:91: ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==REPETITEUR) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:92: REPETITEUR spec_field[\"^.{0,2}$\", true, false]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2824); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {startElement("OBR.6");}

            	    pushFollow(FOLLOW_spec_field_in_line_obr2828);
            	    spec_field("^.{0,2}$", true, false);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {endElement();}

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2837); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.7");}

            pushFollow(FOLLOW_spec_field_in_line_obr2841);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2848); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_line_obr2850);
            lvl1_fields_repet("OBR.8", obr_8, 0, ".*");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2855); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.9");}

            pushFollow(FOLLOW_spec_field_in_line_obr2859);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2869); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.10");}

            pushFollow(FOLLOW_spec_field_in_line_obr2873);
            spec_field("^.{0,20}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2880); if (state.failed) return ;

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2882);
            spec_sized_cna("OBR.11", obr_11, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2890); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.12");}

            pushFollow(FOLLOW_spec_field_in_line_obr2894);
            spec_field("^.{0,1}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:684:3: ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==DELIMITER1) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:684:4: DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2905); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obr2907);
                    lvl1_fields("OBR.13", obr_13, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:4: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==DELIMITER1) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:5: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2914); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBR.14");}

                            pushFollow(FOLLOW_spec_field_in_line_obr2918);
                            spec_field("^.{0,300}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt128=2;
                            int LA128_0 = input.LA(1);

                            if ( (LA128_0==DELIMITER1) ) {
                                alt128=1;
                            }
                            switch (alt128) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2928); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBR.15");}

                                    pushFollow(FOLLOW_spec_field_in_line_obr2932);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:6: ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt127=2;
                                    int LA127_0 = input.LA(1);

                                    if ( (LA127_0==DELIMITER1) ) {
                                        alt127=1;
                                    }
                                    switch (alt127) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:7: DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2943); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_obr_16_in_line_obr2945);
                                            spec_obr_16("OBR.16", obr_16, 0, "^.{0,300}$");

                                            state._fsp--;
                                            if (state.failed) return ;

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:688:7: ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt126=2;
                                            int LA126_0 = input.LA(1);

                                            if ( (LA126_0==DELIMITER1) ) {
                                                alt126=1;
                                            }
                                            switch (alt126) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:688:8: DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2955); if (state.failed) return ;

                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr2957);
                                                    lvl1_fields("OBR.17", obr_17, 0, "^.{0,60}$");

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:689:8: ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt125=2;
                                                    int LA125_0 = input.LA(1);

                                                    if ( (LA125_0==DELIMITER1) ) {
                                                        alt125=1;
                                                    }
                                                    switch (alt125) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:689:9: DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2968); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_repet_in_line_obr2970);
                                                            lvl1_fields_repet("OBR.18", obr_18, 0, "^.{0,40}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:9: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt124=2;
                                                            int LA124_0 = input.LA(1);

                                                            if ( (LA124_0==DELIMITER1) ) {
                                                                alt124=1;
                                                            }
                                                            switch (alt124) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:10: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2982); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBR.19");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_obr2986);
                                                                    spec_field("^.{0,60}$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:10: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt123=2;
                                                                    int LA123_0 = input.LA(1);

                                                                    if ( (LA123_0==DELIMITER1) ) {
                                                                        alt123=1;
                                                                    }
                                                                    switch (alt123) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:11: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3001); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBR.20");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3005);
                                                                            spec_field("^.{0,60}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:692:11: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt122=2;
                                                                            int LA122_0 = input.LA(1);

                                                                            if ( (LA122_0==DELIMITER1) ) {
                                                                                alt122=1;
                                                                            }
                                                                            switch (alt122) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:692:12: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3021); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBR.21");}

                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3025);
                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:693:12: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt121=2;
                                                                                    int LA121_0 = input.LA(1);

                                                                                    if ( (LA121_0==DELIMITER1) ) {
                                                                                        alt121=1;
                                                                                    }
                                                                                    switch (alt121) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:693:13: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3042); if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {startElement("OBR.22");}

                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3046);
                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:13: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt120=2;
                                                                                            int LA120_0 = input.LA(1);

                                                                                            if ( (LA120_0==DELIMITER1) ) {
                                                                                                alt120=1;
                                                                                            }
                                                                                            switch (alt120) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:14: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3064); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.23");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3068);
                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:14: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt119=2;
                                                                                                    int LA119_0 = input.LA(1);

                                                                                                    if ( (LA119_0==DELIMITER1) ) {
                                                                                                        alt119=1;
                                                                                                    }
                                                                                                    switch (alt119) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:15: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3087); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.24");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3091);
                                                                                                            spec_field("^$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:15: ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt118=2;
                                                                                                            int LA118_0 = input.LA(1);

                                                                                                            if ( (LA118_0==DELIMITER1) ) {
                                                                                                                alt118=1;
                                                                                                            }
                                                                                                            switch (alt118) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:16: DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3111); if (state.failed) return ;

                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr3113);
                                                                                                                    lvl1_fields("OBR.25", obr_25, 0, "^.{0,10}$");

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:697:16: ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt117=2;
                                                                                                                    int LA117_0 = input.LA(1);

                                                                                                                    if ( (LA117_0==DELIMITER1) ) {
                                                                                                                        alt117=1;
                                                                                                                    }
                                                                                                                    switch (alt117) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:697:17: DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3132); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.26");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3136);
                                                                                                                            spec_field("^(F|P|M|I|R|C|O|D|X)?$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:698:17: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt116=2;
                                                                                                                            int LA116_0 = input.LA(1);

                                                                                                                            if ( (LA116_0==DELIMITER1) ) {
                                                                                                                                alt116=1;
                                                                                                                            }
                                                                                                                            switch (alt116) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:698:18: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3158); if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.27");}

                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3162);
                                                                                                                                    spec_field("^$", true, false);

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:699:18: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt115=2;
                                                                                                                                    int LA115_0 = input.LA(1);

                                                                                                                                    if ( (LA115_0==DELIMITER1) ) {
                                                                                                                                        alt115=1;
                                                                                                                                    }
                                                                                                                                    switch (alt115) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:699:19: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3185); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.28");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3189);
                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt114=2;
                                                                                                                                            int LA114_0 = input.LA(1);

                                                                                                                                            if ( (LA114_0==DELIMITER1) ) {
                                                                                                                                                alt114=1;
                                                                                                                                            }
                                                                                                                                            switch (alt114) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:20: DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3213); if (state.failed) return ;

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3215);
                                                                                                                                                    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:81: ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )*
                                                                                                                                                    loop103:
                                                                                                                                                    do {
                                                                                                                                                        int alt103=2;
                                                                                                                                                        int LA103_0 = input.LA(1);

                                                                                                                                                        if ( (LA103_0==REPETITEUR) ) {
                                                                                                                                                            alt103=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt103) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:82: REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr3219); if (state.failed) return ;

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3221);
                                                                                                                                                    	    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    	    state._fsp--;
                                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop103;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:701:20: ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt113=2;
                                                                                                                                                    int LA113_0 = input.LA(1);

                                                                                                                                                    if ( (LA113_0==DELIMITER1) ) {
                                                                                                                                                        alt113=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt113) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:701:21: DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3246); if (state.failed) return ;

                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_obr3248);
                                                                                                                                                            lvl1_fields("OBR.30", obr_30, 0, "^.{0,150}$");

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:702:21: ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt112=2;
                                                                                                                                                            int LA112_0 = input.LA(1);

                                                                                                                                                            if ( (LA112_0==DELIMITER1) ) {
                                                                                                                                                                alt112=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt112) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:702:22: DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3272); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.31");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3276);
                                                                                                                                                                    spec_field("^(PORT|CART|WHLC|WALK)?$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:704:22: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    int alt111=2;
                                                                                                                                                                    int LA111_0 = input.LA(1);

                                                                                                                                                                    if ( (LA111_0==DELIMITER1) ) {
                                                                                                                                                                        alt111=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt111) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:704:23: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3325); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3329);
                                                                                                                                                                            spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:704:114: ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )*
                                                                                                                                                                            loop104:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt104=2;
                                                                                                                                                                                int LA104_0 = input.LA(1);

                                                                                                                                                                                if ( (LA104_0==REPETITEUR) ) {
                                                                                                                                                                                    alt104=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt104) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:704:115: REPETITEUR spec_field[\"^.{0,300}$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr3335); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_obr3339);
                                                                                                                                                                            	    spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop104;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:705:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            int alt110=2;
                                                                                                                                                                            int LA110_0 = input.LA(1);

                                                                                                                                                                            if ( (LA110_0==DELIMITER1) ) {
                                                                                                                                                                                alt110=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt110) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:705:24: DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3369); if (state.failed) return ;

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3371);
                                                                                                                                                                                    spec_sized_cna("OBR.33", obr_33, 0, "^.{0,60}$");

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    int alt109=2;
                                                                                                                                                                                    int LA109_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA109_0==DELIMITER1) ) {
                                                                                                                                                                                        alt109=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt109) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:25: DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3398); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr3400);
                                                                                                                                                                                            spec_sized_cna("OBR.34", obr_34, 0, "^.{0,60}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:707:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            int alt108=2;
                                                                                                                                                                                            int LA108_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA108_0==DELIMITER1) ) {
                                                                                                                                                                                                alt108=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt108) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:707:26: DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3428); if (state.failed) return ;

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3430);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", obr_35, 0, "^.{0,60}$");

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:708:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    int alt107=2;
                                                                                                                                                                                                    int LA107_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA107_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt107=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt107) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:708:27: DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3459); if (state.failed) return ;

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr3461);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", obr_36, 0, "^.{0,60}$");

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:709:27: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            int alt106=2;
                                                                                                                                                                                                            int LA106_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA106_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt106=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt106) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:709:28: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3491); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.37");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3495);
                                                                                                                                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:710:28: ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    int alt105=2;
                                                                                                                                                                                                                    int LA105_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA105_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt105=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt105) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:710:29: DELIMITER1 spec_field[\"^$\", true, false]
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3528); if (state.failed) return ;

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3530);
                                                                                                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_obr"



    // $ANTLR start "line_obx"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:713:1: line_obx : CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) ;
    public final void line_obx() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:23: ( CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:3: CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx3602); if (state.failed) return ;

            match(input,LINE_OBX,FOLLOW_LINE_OBX_in_line_obx3604); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.1");content("OBX");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3610); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.2");}

            pushFollow(FOLLOW_spec_field_in_line_obx3614);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3621); if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:718:14: ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            int alt151=7;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==CONTENT) ) {
                int LA151_1 = input.LA(2);

                if ( (LA151_1==DELIMITER1) ) {
                    int LA151_2 = input.LA(3);

                    if ( (LA151_2==CONTENT) ) {
                        int LA151_3 = input.LA(4);

                        if ( (synpred19_HPRIMS()) ) {
                            alt151=1;
                        }
                        else if ( (synpred20_HPRIMS()) ) {
                            alt151=2;
                        }
                        else if ( (synpred21_HPRIMS()) ) {
                            alt151=3;
                        }
                        else if ( (synpred22_HPRIMS()) ) {
                            alt151=4;
                        }
                        else if ( (synpred23_HPRIMS()) ) {
                            alt151=5;
                        }
                        else if ( (synpred24_HPRIMS()) ) {
                            alt151=6;
                        }
                        else if ( (synpred25_HPRIMS()) ) {
                            alt151=7;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 151, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 151, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 151, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;

            }
            switch (alt151) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:719:5: ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:719:42: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:720:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3646);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3657); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3659);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:722:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==DELIMITER1) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:722:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3669); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3673);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:723:8: ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            int alt132=2;
                            int LA132_0 = input.LA(1);

                            if ( (LA132_0==DELIMITER1) ) {
                                alt132=1;
                            }
                            switch (alt132) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:723:9: DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3686); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx3690);
                                    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:724:25: ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )*
                                    loop131:
                                    do {
                                        int alt131=2;
                                        int LA131_0 = input.LA(1);

                                        if ( (LA131_0==REPETITEUR) ) {
                                            alt131=1;
                                        }


                                        switch (alt131) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:724:26: REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3704); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx3708);
                                    	    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop131;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx3723);
                                    end_line_obx();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:6: ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:729:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3765);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3776); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3778);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:731:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==DELIMITER1) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:731:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3788); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3792);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt135=2;
                            int LA135_0 = input.LA(1);

                            if ( (LA135_0==DELIMITER1) ) {
                                alt135=1;
                            }
                            switch (alt135) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3805); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3807);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop134:
                                    do {
                                        int alt134=2;
                                        int LA134_0 = input.LA(1);

                                        if ( (LA134_0==REPETITEUR) ) {
                                            alt134=1;
                                        }


                                        switch (alt134) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3811); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx3813);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop134;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx3826);
                                    end_line_obx();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:6: ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:44: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:737:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3868);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3879); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3881);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:739:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==DELIMITER1) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:739:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3891); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3895);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt138=2;
                            int LA138_0 = input.LA(1);

                            if ( (LA138_0==DELIMITER1) ) {
                                alt138=1;
                            }
                            switch (alt138) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3908); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3910);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop137:
                                    do {
                                        int alt137=2;
                                        int LA137_0 = input.LA(1);

                                        if ( (LA137_0==REPETITEUR) ) {
                                            alt137=1;
                                        }


                                        switch (alt137) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3914); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx3916);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop137;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx3929);
                                    end_line_obx();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:6: ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:745:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3971);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3982); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3984);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:747:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==DELIMITER1) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:747:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3994); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3998);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt141=2;
                            int LA141_0 = input.LA(1);

                            if ( (LA141_0==DELIMITER1) ) {
                                alt141=1;
                            }
                            switch (alt141) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4011); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx4015);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop140:
                                    do {
                                        int alt140=2;
                                        int LA140_0 = input.LA(1);

                                        if ( (LA140_0==REPETITEUR) ) {
                                            alt140=1;
                                        }


                                        switch (alt140) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx4021); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx4023);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop140;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4036);
                                    end_line_obx();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:6: ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:753:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx4078);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4089); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4091);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:755:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==DELIMITER1) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:755:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4101); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx4105);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt144=2;
                            int LA144_0 = input.LA(1);

                            if ( (LA144_0==DELIMITER1) ) {
                                alt144=1;
                            }
                            switch (alt144) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4118); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4120);
                                    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:70: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )*
                                    loop143:
                                    do {
                                        int alt143=2;
                                        int LA143_0 = input.LA(1);

                                        if ( (LA143_0==REPETITEUR) ) {
                                            alt143=1;
                                        }


                                        switch (alt143) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:71: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx4124); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx4126);
                                    	    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop143;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4139);
                                    end_line_obx();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:760:6: ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:760:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:761:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx4181);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4192); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4194);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:763:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==DELIMITER1) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:763:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4204); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx4208);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:764:8: ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            int alt146=2;
                            int LA146_0 = input.LA(1);

                            if ( (LA146_0==DELIMITER1) ) {
                                alt146=1;
                            }
                            switch (alt146) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:764:9: DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4221); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                                    pushFollow(FOLLOW_tx_field_in_line_obx4225);
                                    tx_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4238);
                                    end_line_obx();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:70: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:769:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx4280);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4291); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4293);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:771:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==DELIMITER1) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:771:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4303); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx4307);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:772:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt149=2;
                            int LA149_0 = input.LA(1);

                            if ( (LA149_0==DELIMITER1) ) {
                                alt149=1;
                            }
                            switch (alt149) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:772:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4320); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx4324);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:772:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop148:
                                    do {
                                        int alt148=2;
                                        int LA148_0 = input.LA(1);

                                        if ( (LA148_0==REPETITEUR) ) {
                                            alt148=1;
                                        }


                                        switch (alt148) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:772:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx4330); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx4334);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop148;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4349);
                                    end_line_obx();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_obx"



    // $ANTLR start "end_line_obx"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:777:1: end_line_obx : ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void end_line_obx() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:777:13: ( ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:778:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:778:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==DELIMITER1) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:778:4: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4376); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("OBX.7");}

                    pushFollow(FOLLOW_spec_field_in_end_line_obx4380);
                    spec_field("^.{0,20}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:4: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==DELIMITER1) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:5: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4389); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.8");}

                            pushFollow(FOLLOW_spec_field_in_end_line_obx4393);
                            spec_field("^.{0,60}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:94: ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )*
                            loop152:
                            do {
                                int alt152=2;
                                int LA152_0 = input.LA(1);

                                if ( (LA152_0==REPETITEUR) ) {
                                    alt152=1;
                                }


                                switch (alt152) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:95: REPETITEUR spec_field[\"^.{0,60}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4399); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("OBX.8");}

                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx4403);
                            	    spec_field("^.{0,60}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop152;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:780:5: ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            int alt165=2;
                            int LA165_0 = input.LA(1);

                            if ( (LA165_0==DELIMITER1) ) {
                                alt165=1;
                            }
                            switch (alt165) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:780:6: DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4413); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4417);
                                    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:780:137: ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )*
                                    loop153:
                                    do {
                                        int alt153=2;
                                        int LA153_0 = input.LA(1);

                                        if ( (LA153_0==REPETITEUR) ) {
                                            alt153=1;
                                        }


                                        switch (alt153) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:780:138: REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4423); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx4427);
                                    	    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop153;
                                        }
                                    } while (true);


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:781:6: ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    int alt164=2;
                                    int LA164_0 = input.LA(1);

                                    if ( (LA164_0==DELIMITER1) ) {
                                        alt164=1;
                                    }
                                    switch (alt164) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:781:7: DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4440); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("OBX.10");}

                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4444);
                                            spec_field("^(?!.{6,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:782:7: ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            int alt163=2;
                                            int LA163_0 = input.LA(1);

                                            if ( (LA163_0==DELIMITER1) ) {
                                                alt163=1;
                                            }
                                            switch (alt163) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:782:8: DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4456); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4460);
                                                    spec_field("^(A|S|R|N)?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:782:101: ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )*
                                                    loop154:
                                                    do {
                                                        int alt154=2;
                                                        int LA154_0 = input.LA(1);

                                                        if ( (LA154_0==REPETITEUR) ) {
                                                            alt154=1;
                                                        }


                                                        switch (alt154) {
                                                    	case 1 :
                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:782:102: REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false]
                                                    	    {
                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4466); if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx4470);
                                                    	    spec_field("^(A|S|R|N)?$", true, false);

                                                    	    state._fsp--;
                                                    	    if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {endElement();}

                                                    	    }
                                                    	    break;

                                                    	default :
                                                    	    break loop154;
                                                        }
                                                    } while (true);


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:783:8: ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    int alt162=2;
                                                    int LA162_0 = input.LA(1);

                                                    if ( (LA162_0==DELIMITER1) ) {
                                                        alt162=1;
                                                    }
                                                    switch (alt162) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:783:9: DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4485); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4489);
                                                            spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:783:110: ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )*
                                                            loop155:
                                                            do {
                                                                int alt155=2;
                                                                int LA155_0 = input.LA(1);

                                                                if ( (LA155_0==REPETITEUR) ) {
                                                                    alt155=1;
                                                                }


                                                                switch (alt155) {
                                                            	case 1 :
                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:783:111: REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false]
                                                            	    {
                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4495); if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx4499);
                                                            	    spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            	    state._fsp--;
                                                            	    if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                            	    }
                                                            	    break;

                                                            	default :
                                                            	    break loop155;
                                                                }
                                                            } while (true);


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:784:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            int alt161=2;
                                                            int LA161_0 = input.LA(1);

                                                            if ( (LA161_0==DELIMITER1) ) {
                                                                alt161=1;
                                                            }
                                                            switch (alt161) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:784:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4516); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBX.13");}

                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4520);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:785:10: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    int alt160=2;
                                                                    int LA160_0 = input.LA(1);

                                                                    if ( (LA160_0==DELIMITER1) ) {
                                                                        alt160=1;
                                                                    }
                                                                    switch (alt160) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:785:11: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4535); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4539);
                                                                            spec_field("^.{0,20}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:786:11: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            int alt159=2;
                                                                            int LA159_0 = input.LA(1);

                                                                            if ( (LA159_0==DELIMITER1) ) {
                                                                                alt159=1;
                                                                            }
                                                                            switch (alt159) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:786:12: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4555); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBX.15");}

                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4559);
                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:787:12: ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    int alt158=2;
                                                                                    int LA158_0 = input.LA(1);

                                                                                    if ( (LA158_0==DELIMITER1) ) {
                                                                                        alt158=1;
                                                                                    }
                                                                                    switch (alt158) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:787:13: DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4576); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_lvl1_fields_in_end_line_obx4578);
                                                                                            lvl1_fields("OBX.16", obx_16, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:788:13: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            int alt157=2;
                                                                                            int LA157_0 = input.LA(1);

                                                                                            if ( (LA157_0==DELIMITER1) ) {
                                                                                                alt157=1;
                                                                                            }
                                                                                            switch (alt157) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:788:14: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4594); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4598);
                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:789:14: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    int alt156=2;
                                                                                                    int LA156_0 = input.LA(1);

                                                                                                    if ( (LA156_0==DELIMITER1) ) {
                                                                                                        alt156=1;
                                                                                                    }
                                                                                                    switch (alt156) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:789:15: DELIMITER1 spec_field[\"^$\", false, false]
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4617); if (state.failed) return ;

                                                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4619);
                                                                                                            spec_field("^$", false, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "end_line_obx"



    // $ANTLR start "line_p"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:792:1: line_p : CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:794:23: ( CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:795:3: CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p4663); if (state.failed) return ;

            match(input,LINE_P,FOLLOW_LINE_P_in_line_p4665); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.1");content("P");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4672); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.2");}

            pushFollow(FOLLOW_spec_field_in_line_p4676);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4683); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_p4685);
            lvl1_fields("P.3", p_3, 1, "^.{1,36}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4690); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.4");}

            pushFollow(FOLLOW_spec_field_in_line_p4694);
            spec_field("^.{0,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:799:3: ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==DELIMITER1) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:799:4: DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4702); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("P.5");}

                    pushFollow(FOLLOW_spec_field_in_line_p4706);
                    spec_field("^.{0,16}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:800:4: ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt201=2;
                    int LA201_0 = input.LA(1);

                    if ( (LA201_0==DELIMITER1) ) {
                        alt201=1;
                    }
                    switch (alt201) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:800:5: DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4715); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_p4717);
                            lvl1_fields("P.6", p_6, 0, "^.{0,48}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:801:5: ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt200=2;
                            int LA200_0 = input.LA(1);

                            if ( (LA200_0==DELIMITER1) ) {
                                alt200=1;
                            }
                            switch (alt200) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:801:6: DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4725); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("P.7");}

                                    pushFollow(FOLLOW_spec_field_in_line_p4729);
                                    spec_field("^.{0,24}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:802:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt199=2;
                                    int LA199_0 = input.LA(1);

                                    if ( (LA199_0==DELIMITER1) ) {
                                        alt199=1;
                                    }
                                    switch (alt199) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:802:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4740); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("P.8");}

                                            pushFollow(FOLLOW_spec_field_in_line_p4744);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:803:7: ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt198=2;
                                            int LA198_0 = input.LA(1);

                                            if ( (LA198_0==DELIMITER1) ) {
                                                alt198=1;
                                            }
                                            switch (alt198) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:803:8: DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4756); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("P.9");}

                                                    pushFollow(FOLLOW_spec_field_in_line_p4760);
                                                    spec_field("^[M|F|U]?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:804:8: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt197=2;
                                                    int LA197_0 = input.LA(1);

                                                    if ( (LA197_0==DELIMITER1) ) {
                                                        alt197=1;
                                                    }
                                                    switch (alt197) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:804:9: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4773); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("P.10");}

                                                            pushFollow(FOLLOW_spec_field_in_line_p4777);
                                                            spec_field("^$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:805:9: ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt196=2;
                                                            int LA196_0 = input.LA(1);

                                                            if ( (LA196_0==DELIMITER1) ) {
                                                                alt196=1;
                                                            }
                                                            switch (alt196) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:805:10: DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4791); if (state.failed) return ;

                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p4793);
                                                                    lvl1_fields("P.11", p_11, 0, "^.{0,200}$");

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:806:10: ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt195=2;
                                                                    int LA195_0 = input.LA(1);

                                                                    if ( (LA195_0==DELIMITER1) ) {
                                                                        alt195=1;
                                                                    }
                                                                    switch (alt195) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:806:11: DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4806); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("P.12");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_p4810);
                                                                            spec_field("^.{0,120}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:807:11: ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt194=2;
                                                                            int LA194_0 = input.LA(1);

                                                                            if ( (LA194_0==DELIMITER1) ) {
                                                                                alt194=1;
                                                                            }
                                                                            switch (alt194) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:807:12: DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4826); if (state.failed) return ;

                                                                                    pushFollow(FOLLOW_lvl1_fields_repet_in_line_p4828);
                                                                                    lvl1_fields_repet("P.13", p_13, 0, "^.{0,40}$");

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:810:12: ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt193=2;
                                                                                    int LA193_0 = input.LA(1);

                                                                                    if ( (LA193_0==DELIMITER1) ) {
                                                                                        alt193=1;
                                                                                    }
                                                                                    switch (alt193) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:810:13: DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4867); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p4869);
                                                                                            spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:810:69: ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )*
                                                                                            loop168:
                                                                                            do {
                                                                                                int alt168=2;
                                                                                                int LA168_0 = input.LA(1);

                                                                                                if ( (LA168_0==REPETITEUR) ) {
                                                                                                    alt168=1;
                                                                                                }


                                                                                                switch (alt168) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:810:70: REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p4873); if (state.failed) return ;

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p4875);
                                                                                            	    spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            	    state._fsp--;
                                                                                            	    if (state.failed) return ;

                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop168;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:811:13: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt192=2;
                                                                                            int LA192_0 = input.LA(1);

                                                                                            if ( (LA192_0==DELIMITER1) ) {
                                                                                                alt192=1;
                                                                                            }
                                                                                            switch (alt192) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:811:14: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4893); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("P.15");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4897);
                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:812:14: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt191=2;
                                                                                                    int LA191_0 = input.LA(1);

                                                                                                    if ( (LA191_0==DELIMITER1) ) {
                                                                                                        alt191=1;
                                                                                                    }
                                                                                                    switch (alt191) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:812:15: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4916); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("P.16");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4920);
                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:814:15: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt190=2;
                                                                                                            int LA190_0 = input.LA(1);

                                                                                                            if ( (LA190_0==DELIMITER1) ) {
                                                                                                                alt190=1;
                                                                                                            }
                                                                                                            switch (alt190) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:814:16: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4955); if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {startElement("P.17");}

                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4959);
                                                                                                                    spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:816:16: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt189=2;
                                                                                                                    int LA189_0 = input.LA(1);

                                                                                                                    if ( (LA189_0==DELIMITER1) ) {
                                                                                                                        alt189=1;
                                                                                                                    }
                                                                                                                    switch (alt189) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:816:17: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4996); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("P.18");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5000);
                                                                                                                            spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:817:17: ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt188=2;
                                                                                                                            int LA188_0 = input.LA(1);

                                                                                                                            if ( (LA188_0==DELIMITER1) ) {
                                                                                                                                alt188=1;
                                                                                                                            }
                                                                                                                            switch (alt188) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:817:18: DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5022); if (state.failed) return ;

                                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p5024);
                                                                                                                                    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:817:72: ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )*
                                                                                                                                    loop169:
                                                                                                                                    do {
                                                                                                                                        int alt169=2;
                                                                                                                                        int LA169_0 = input.LA(1);

                                                                                                                                        if ( (LA169_0==REPETITEUR) ) {
                                                                                                                                            alt169=1;
                                                                                                                                        }


                                                                                                                                        switch (alt169) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:817:73: REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p5028); if (state.failed) return ;

                                                                                                                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_p5030);
                                                                                                                                    	    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    	    state._fsp--;
                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop169;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:18: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt187=2;
                                                                                                                                    int LA187_0 = input.LA(1);

                                                                                                                                    if ( (LA187_0==DELIMITER1) ) {
                                                                                                                                        alt187=1;
                                                                                                                                    }
                                                                                                                                    switch (alt187) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:19: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5053); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5057);
                                                                                                                                            spec_field("^.{0,200}$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:108: ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )*
                                                                                                                                            loop170:
                                                                                                                                            do {
                                                                                                                                                int alt170=2;
                                                                                                                                                int LA170_0 = input.LA(1);

                                                                                                                                                if ( (LA170_0==REPETITEUR) ) {
                                                                                                                                                    alt170=1;
                                                                                                                                                }


                                                                                                                                                switch (alt170) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:109: REPETITEUR spec_field[\"^.{0,200}$\", true, false]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p5063); if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p5067);
                                                                                                                                            	    spec_field("^.{0,200}$", true, false);

                                                                                                                                            	    state._fsp--;
                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop170;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:819:19: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt186=2;
                                                                                                                                            int LA186_0 = input.LA(1);

                                                                                                                                            if ( (LA186_0==DELIMITER1) ) {
                                                                                                                                                alt186=1;
                                                                                                                                            }
                                                                                                                                            switch (alt186) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:819:20: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5093); if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.21");}

                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5097);
                                                                                                                                                    spec_field("^.{0,200}$", true, false);

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:820:20: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt185=2;
                                                                                                                                                    int LA185_0 = input.LA(1);

                                                                                                                                                    if ( (LA185_0==DELIMITER1) ) {
                                                                                                                                                        alt185=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt185) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:820:21: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5122); if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.22");}

                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5126);
                                                                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:821:21: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt184=2;
                                                                                                                                                            int LA184_0 = input.LA(1);

                                                                                                                                                            if ( (LA184_0==DELIMITER1) ) {
                                                                                                                                                                alt184=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt184) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:821:22: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5152); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.23");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5156);
                                                                                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:822:22: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt183=2;
                                                                                                                                                                    int LA183_0 = input.LA(1);

                                                                                                                                                                    if ( (LA183_0==DELIMITER1) ) {
                                                                                                                                                                        alt183=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt183) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:822:23: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5183); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5187);
                                                                                                                                                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:822:156: ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )*
                                                                                                                                                                            loop171:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt171=2;
                                                                                                                                                                                int LA171_0 = input.LA(1);

                                                                                                                                                                                if ( (LA171_0==REPETITEUR) ) {
                                                                                                                                                                                    alt171=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt171) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:822:157: REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p5193); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p5197);
                                                                                                                                                                            	    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop171;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:823:23: ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt182=2;
                                                                                                                                                                            int LA182_0 = input.LA(1);

                                                                                                                                                                            if ( (LA182_0==DELIMITER1) ) {
                                                                                                                                                                                alt182=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt182) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:823:24: DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5227); if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.25");}

                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5231);
                                                                                                                                                                                    spec_field("^(OP|IP|ER|PA|MP)?^$", true, false);

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:824:24: ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt181=2;
                                                                                                                                                                                    int LA181_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA181_0==DELIMITER1) ) {
                                                                                                                                                                                        alt181=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt181) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:824:25: DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5260); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_p5262);
                                                                                                                                                                                            lvl1_fields("P.26", p_26, 0, "^.{0,100}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:826:25: ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt180=2;
                                                                                                                                                                                            int LA180_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA180_0==DELIMITER1) ) {
                                                                                                                                                                                                alt180=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt180) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:826:26: DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5315); if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.27");}

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5319);
                                                                                                                                                                                                    spec_field("^.{0,100}$", true, false);

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:827:26: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt179=2;
                                                                                                                                                                                                    int LA179_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA179_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt179=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt179) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:827:27: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5350); if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.28");}

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5354);
                                                                                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:829:27: ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt178=2;
                                                                                                                                                                                                            int LA178_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA178_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt178=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt178) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:829:28: DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5413); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.29");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5417);
                                                                                                                                                                                                                    spec_field("^.{0,2}$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:831:28: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt177=2;
                                                                                                                                                                                                                    int LA177_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA177_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt177=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt177) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:831:29: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5478); if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.30");}

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5482);
                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:832:29: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                                                                                                                                                                            int alt176=2;
                                                                                                                                                                                                                            int LA176_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA176_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt176=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt176) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:832:30: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5516); if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.31");}

                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5520);
                                                                                                                                                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:834:30: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                                                                                                                                                                                    int alt175=2;
                                                                                                                                                                                                                                    int LA175_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA175_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt175=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt175) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:834:31: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5585); if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.32");}

                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5589);
                                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:835:31: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                                                                                                                                                                            int alt174=2;
                                                                                                                                                                                                                                            int LA174_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA174_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt174=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt174) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:835:32: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5625); if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.33");}

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5629);
                                                                                                                                                                                                                                                    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:836:32: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                                                                                                                                                                                    int alt173=2;
                                                                                                                                                                                                                                                    int LA173_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA173_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt173=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt173) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:836:33: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5666); if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.34");}

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5670);
                                                                                                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:837:33: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                                                                                                                                                                            int alt172=2;
                                                                                                                                                                                                                                                            int LA172_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA172_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt172=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt172) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:837:34: DELIMITER1 spec_field[\"^$\", false, false]
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5708); if (state.failed) return ;

                                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5710);
                                                                                                                                                                                                                                                                    spec_field("^$", false, false);

                                                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_p"



    // $ANTLR start "line_reg"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:840:1: line_reg : CR LINE_REG DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 lvl1_fields[\"REG.4\", reg_4, 2, \"^.{0,11}$\"] DELIMITER1 spec_field[\"^(?:\\\\+|-)$\", true, false] DELIMITER1 spec_field[\"^.{1,26}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? ;
    public final void line_reg() throws RecognitionException {
        startElement("REG");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:842:23: ( CR LINE_REG DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 lvl1_fields[\"REG.4\", reg_4, 2, \"^.{0,11}$\"] DELIMITER1 spec_field[\"^(?:\\\\+|-)$\", true, false] DELIMITER1 spec_field[\"^.{1,26}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:843:3: CR LINE_REG DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 lvl1_fields[\"REG.4\", reg_4, 2, \"^.{0,11}$\"] DELIMITER1 spec_field[\"^(?:\\\\+|-)$\", true, false] DELIMITER1 spec_field[\"^.{1,26}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_reg5792); if (state.failed) return ;

            match(input,LINE_REG,FOLLOW_LINE_REG_in_line_reg5794); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.1");content("REG");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5800); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.2");}

            pushFollow(FOLLOW_spec_field_in_line_reg5804);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5811); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.3");}

            pushFollow(FOLLOW_spec_field_in_line_reg5815);
            spec_field("^.{1,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5822); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_reg5824);
            lvl1_fields("REG.4", reg_4, 2, "^.{0,11}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5829); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.5");}

            pushFollow(FOLLOW_spec_field_in_line_reg5833);
            spec_field("^(?:\\+|-)$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5840); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.6");}

            pushFollow(FOLLOW_spec_field_in_line_reg5844);
            spec_field("^.{1,26}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:850:3: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==DELIMITER1) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:850:4: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5855); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("REG.7");}

                    pushFollow(FOLLOW_spec_field_in_line_reg5859);
                    spec_field("^.{0,60}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:851:4: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                    int alt204=2;
                    int LA204_0 = input.LA(1);

                    if ( (LA204_0==DELIMITER1) ) {
                        alt204=1;
                    }
                    switch (alt204) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:851:5: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5868); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("REG.8");}

                            pushFollow(FOLLOW_spec_field_in_line_reg5872);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:852:5: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                            int alt203=2;
                            int LA203_0 = input.LA(1);

                            if ( (LA203_0==DELIMITER1) ) {
                                alt203=1;
                            }
                            switch (alt203) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:852:6: DELIMITER1 spec_field[\"^$\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5882); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_reg5884);
                                    spec_field("^$", false, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_reg"



    // $ANTLR start "line_l"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:854:1: line_l : CR LINE_L ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? ;
    public final void line_l() throws RecognitionException {
        startElement("L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:856:22: ( CR LINE_L ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:857:3: CR LINE_L ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l5908); if (state.failed) return ;

            match(input,LINE_L,FOLLOW_LINE_L_in_line_l5910); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("L.1");content("L");endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:858:3: ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
            int alt211=2;
            int LA211_0 = input.LA(1);

            if ( (LA211_0==DELIMITER1) ) {
                alt211=1;
            }
            switch (alt211) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:858:4: DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5917); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("L.2");}

                    pushFollow(FOLLOW_spec_field_in_line_l5921);
                    spec_field("^[0-9]{0,1}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:859:4: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                    int alt210=2;
                    int LA210_0 = input.LA(1);

                    if ( (LA210_0==DELIMITER1) ) {
                        alt210=1;
                    }
                    switch (alt210) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:859:5: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5930); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("L.3");}

                            pushFollow(FOLLOW_spec_field_in_line_l5934);
                            spec_field("^$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:860:5: ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                            int alt209=2;
                            int LA209_0 = input.LA(1);

                            if ( (LA209_0==DELIMITER1) ) {
                                alt209=1;
                            }
                            switch (alt209) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:860:6: DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5944); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("L.4");}

                                    pushFollow(FOLLOW_spec_field_in_line_l5948);
                                    spec_field("^[0-9]{0,4}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:861:6: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                    int alt208=2;
                                    int LA208_0 = input.LA(1);

                                    if ( (LA208_0==DELIMITER1) ) {
                                        alt208=1;
                                    }
                                    switch (alt208) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:861:7: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5959); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("L.5");}

                                            pushFollow(FOLLOW_spec_field_in_line_l5963);
                                            spec_field("^[0-9]{0,10}$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:862:7: ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                            int alt207=2;
                                            int LA207_0 = input.LA(1);

                                            if ( (LA207_0==DELIMITER1) ) {
                                                alt207=1;
                                            }
                                            switch (alt207) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:862:8: DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5975); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("L.6");}

                                                    pushFollow(FOLLOW_spec_field_in_line_l5979);
                                                    spec_field("^.{0,12}$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:863:8: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                    int alt206=2;
                                                    int LA206_0 = input.LA(1);

                                                    if ( (LA206_0==DELIMITER1) ) {
                                                        alt206=1;
                                                    }
                                                    switch (alt206) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:863:9: DELIMITER1 spec_field[\"^$\", false, false]
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5992); if (state.failed) return ;

                                                            pushFollow(FOLLOW_spec_field_in_line_l5994);
                                                            spec_field("^$", false, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_l"



    // $ANTLR start "dirty_line"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:865:1: dirty_line[int start_count] : ( ( CR g= ( LINE_AP | LINE_AC | LINE_ACT | LINE_C | LINE_FAC | LINE_GENERIC | LINE_L | LINE_OBR | LINE_OBX | LINE_P | LINE_REG ) ) | (g= LINE_H delimiters ) ) ( DELIMITER1 dirty_repet[$g.text + \".\" + $start_count] )* ;
    public final void dirty_line(int start_count) throws RecognitionException {
        Token g=null;

        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:865:29: ( ( ( CR g= ( LINE_AP | LINE_AC | LINE_ACT | LINE_C | LINE_FAC | LINE_GENERIC | LINE_L | LINE_OBR | LINE_OBX | LINE_P | LINE_REG ) ) | (g= LINE_H delimiters ) ) ( DELIMITER1 dirty_repet[$g.text + \".\" + $start_count] )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:866:3: ( ( CR g= ( LINE_AP | LINE_AC | LINE_ACT | LINE_C | LINE_FAC | LINE_GENERIC | LINE_L | LINE_OBR | LINE_OBX | LINE_P | LINE_REG ) ) | (g= LINE_H delimiters ) ) ( DELIMITER1 dirty_repet[$g.text + \".\" + $start_count] )*
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:866:3: ( ( CR g= ( LINE_AP | LINE_AC | LINE_ACT | LINE_C | LINE_FAC | LINE_GENERIC | LINE_L | LINE_OBR | LINE_OBX | LINE_P | LINE_REG ) ) | (g= LINE_H delimiters ) )
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==CR) ) {
                alt212=1;
            }
            else if ( (LA212_0==LINE_H) ) {
                alt212=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 212, 0, input);

                throw nvae;

            }
            switch (alt212) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:867:5: ( CR g= ( LINE_AP | LINE_AC | LINE_ACT | LINE_C | LINE_FAC | LINE_GENERIC | LINE_L | LINE_OBR | LINE_OBX | LINE_P | LINE_REG ) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:867:5: ( CR g= ( LINE_AP | LINE_AC | LINE_ACT | LINE_C | LINE_FAC | LINE_GENERIC | LINE_L | LINE_OBR | LINE_OBX | LINE_P | LINE_REG ) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:867:6: CR g= ( LINE_AP | LINE_AC | LINE_ACT | LINE_C | LINE_FAC | LINE_GENERIC | LINE_L | LINE_OBR | LINE_OBX | LINE_P | LINE_REG )
                    {
                    match(input,CR,FOLLOW_CR_in_dirty_line6025); if (state.failed) return ;

                    g=(Token)input.LT(1);

                    if ( (input.LA(1) >= LINE_AC && input.LA(1) <= LINE_GENERIC)||(input.LA(1) >= LINE_L && input.LA(1) <= LINE_REG) ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if ( state.backtracking==0 ) {startElement((g!=null?g.getText():null));startElement((g!=null?g.getText():null) + ".1");content((g!=null?g.getText():null));endElement();}

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:870:5: (g= LINE_H delimiters )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:870:5: (g= LINE_H delimiters )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:870:6: g= LINE_H delimiters
                    {
                    g=(Token)match(input,LINE_H,FOLLOW_LINE_H_in_dirty_line6094); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement((g!=null?g.getText():null));startElement((g!=null?g.getText():null) + ".1");content((g!=null?g.getText():null));endElement();startElement("H.2");}

                    pushFollow(FOLLOW_delimiters_in_dirty_line6098);
                    delimiters();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();start_count++;}

                    }


                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:872:3: ( DELIMITER1 dirty_repet[$g.text + \".\" + $start_count] )*
            loop213:
            do {
                int alt213=2;
                int LA213_0 = input.LA(1);

                if ( (LA213_0==DELIMITER1) ) {
                    alt213=1;
                }


                switch (alt213) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:872:4: DELIMITER1 dirty_repet[$g.text + \".\" + $start_count]
            	    {
            	    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_dirty_line6110); if (state.failed) return ;

            	    pushFollow(FOLLOW_dirty_repet_in_dirty_line6112);
            	    dirty_repet((g!=null?g.getText():null) + "." + start_count);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {start_count++;}

            	    }
            	    break;

            	default :
            	    break loop213;
                }
            } while (true);


            if ( state.backtracking==0 ) {endElement();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_line"



    // $ANTLR start "spec_sized_cna"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:877:1: spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] :h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_sized_cna(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        HPRIMSParser.field_return h =null;

        String i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:879:22: (h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:880:3: h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            if ( state.backtracking==0 ) {startElement(nameElement + ".1");}

            pushFollow(FOLLOW_field_in_spec_sized_cna6145);
            h=field(true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:881:4: ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==DELIMITER2) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:881:5: DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna6154); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl2_fields_in_spec_sized_cna6158);
                    i=lvl2_fields(nameElement + ".2", patterns, nbMandatory, ".*");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:882:5: ( DELIMITER2 j= field[true] )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==DELIMITER2) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:882:6: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna6166); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_sized_cna6172);
                            j=field(true);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( !((matchRegex(((h!=null?input.toString(h.start,h.stop):null) == null ? "" : (h!=null?input.toString(h.start,h.stop):null)) + (i == null ? "" : i) + ((j!=null?input.toString(j.start,j.stop):null) == null ? "" : (j!=null?input.toString(j.start,j.stop):null)), completeFieldPattern, false))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "spec_sized_cna", "matchRegex(($h.text == null ? \"\" : $h.text) + ($i.contentText == null ? \"\" : $i.contentText) + ($j.text == null ? \"\" : $j.text), $completeFieldPattern, false)");
            }

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "spec_sized_cna"



    // $ANTLR start "spec_obr_16"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:885:1: spec_obr_16[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_obr_16(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String h =null;

        HPRIMSParser.field_return i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:887:22: (h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:888:3: h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            pushFollow(FOLLOW_lvl2_fields_in_spec_obr_166203);
            h=lvl2_fields(nameElement + ".1", patterns, nbMandatory, ".*");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:889:3: ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==DELIMITER2) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:889:4: DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_166209); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement(nameElement + ".2");}

                    pushFollow(FOLLOW_field_in_spec_obr_166215);
                    i=field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:890:4: ( DELIMITER2 j= field[true] )?
                    int alt216=2;
                    int LA216_0 = input.LA(1);

                    if ( (LA216_0==DELIMITER2) ) {
                        alt216=1;
                    }
                    switch (alt216) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:890:5: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_166224); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_obr_166230);
                            j=field(true);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( !((matchRegex((h == null ? "" : h) + ((i!=null?input.toString(i.start,i.stop):null) == null ? "" : (i!=null?input.toString(i.start,i.stop):null)) + ((j!=null?input.toString(j.start,j.stop):null) == null ? "" : (j!=null?input.toString(j.start,j.stop):null)), completeFieldPattern, false))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "spec_obr_16", "matchRegex(($h.contentText == null ? \"\" : $h.contentText) + ($i.text == null ? \"\" : $i.text) + ($j.text == null ? \"\" : $j.text), $completeFieldPattern, false)");
            }

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "spec_obr_16"



    // $ANTLR start "dirty_repet"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:893:1: dirty_repet[String nameElement] : dirty_champ[$nameElement] ( REPETITEUR dirty_repet[$nameElement] )? ;
    public final void dirty_repet(String nameElement) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:893:33: ( dirty_champ[$nameElement] ( REPETITEUR dirty_repet[$nameElement] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:894:3: dirty_champ[$nameElement] ( REPETITEUR dirty_repet[$nameElement] )?
            {
            pushFollow(FOLLOW_dirty_champ_in_dirty_repet6252);
            dirty_champ(nameElement);

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:894:29: ( REPETITEUR dirty_repet[$nameElement] )?
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==REPETITEUR) ) {
                alt218=1;
            }
            switch (alt218) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:894:30: REPETITEUR dirty_repet[$nameElement]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_dirty_repet6256); if (state.failed) return ;

                    pushFollow(FOLLOW_dirty_repet_in_dirty_repet6258);
                    dirty_repet(nameElement);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_repet"



    // $ANTLR start "dirty_champ"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:896:1: dirty_champ[String nameElement] : ( field[true] | ( dirty_sous_champ[$nameElement + \".1\"] dirty_champ_ordered[$nameElement, 2] ) )? ;
    public final void dirty_champ(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:898:22: ( ( field[true] | ( dirty_sous_champ[$nameElement + \".1\"] dirty_champ_ordered[$nameElement, 2] ) )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:899:3: ( field[true] | ( dirty_sous_champ[$nameElement + \".1\"] dirty_champ_ordered[$nameElement, 2] ) )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:899:3: ( field[true] | ( dirty_sous_champ[$nameElement + \".1\"] dirty_champ_ordered[$nameElement, 2] ) )?
            int alt219=3;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==CONTENT) ) {
                int LA219_1 = input.LA(2);

                if ( (LA219_1==EOF||(LA219_1 >= CR && LA219_1 <= DELIMITER1)||LA219_1==LINE_H||LA219_1==REPETITEUR) ) {
                    alt219=1;
                }
                else if ( ((LA219_1 >= DELIMITER2 && LA219_1 <= DELIMITER3)) ) {
                    alt219=2;
                }
            }
            else if ( (LA219_0==DELIMITER2) ) {
                alt219=2;
            }
            switch (alt219) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:899:4: field[true]
                    {
                    pushFollow(FOLLOW_field_in_dirty_champ6280);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:900:4: ( dirty_sous_champ[$nameElement + \".1\"] dirty_champ_ordered[$nameElement, 2] )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:900:4: ( dirty_sous_champ[$nameElement + \".1\"] dirty_champ_ordered[$nameElement, 2] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:900:5: dirty_sous_champ[$nameElement + \".1\"] dirty_champ_ordered[$nameElement, 2]
                    {
                    pushFollow(FOLLOW_dirty_sous_champ_in_dirty_champ6289);
                    dirty_sous_champ(nameElement + ".1");

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_dirty_champ_ordered_in_dirty_champ6296);
                    dirty_champ_ordered(nameElement, 2);

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_champ"



    // $ANTLR start "dirty_champ_ordered"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:904:1: dirty_champ_ordered[String nameElement, int order] : DELIMITER2 dirty_sous_champ[$nameElement + \".\" + $order] ( dirty_champ_ordered[$nameElement, $order + 1] )? ;
    public final void dirty_champ_ordered(String nameElement, int order) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:904:52: ( DELIMITER2 dirty_sous_champ[$nameElement + \".\" + $order] ( dirty_champ_ordered[$nameElement, $order + 1] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:905:3: DELIMITER2 dirty_sous_champ[$nameElement + \".\" + $order] ( dirty_champ_ordered[$nameElement, $order + 1] )?
            {
            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_dirty_champ_ordered6314); if (state.failed) return ;

            pushFollow(FOLLOW_dirty_sous_champ_in_dirty_champ_ordered6316);
            dirty_sous_champ(nameElement + "." + order);

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:906:3: ( dirty_champ_ordered[$nameElement, $order + 1] )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==DELIMITER2) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:906:3: dirty_champ_ordered[$nameElement, $order + 1]
                    {
                    pushFollow(FOLLOW_dirty_champ_ordered_in_dirty_champ_ordered6321);
                    dirty_champ_ordered(nameElement, order + 1);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_champ_ordered"



    // $ANTLR start "dirty_sous_champ"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:908:1: dirty_sous_champ[String nameElement] : ( field[true] | ( dirty_sous_sous_champ[$nameElement + \".1\"] dirty_sous_champ_ordered[$nameElement, 2] ) )? ;
    public final void dirty_sous_champ(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:910:22: ( ( field[true] | ( dirty_sous_sous_champ[$nameElement + \".1\"] dirty_sous_champ_ordered[$nameElement, 2] ) )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:911:3: ( field[true] | ( dirty_sous_sous_champ[$nameElement + \".1\"] dirty_sous_champ_ordered[$nameElement, 2] ) )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:911:3: ( field[true] | ( dirty_sous_sous_champ[$nameElement + \".1\"] dirty_sous_champ_ordered[$nameElement, 2] ) )?
            int alt221=3;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==CONTENT) ) {
                int LA221_1 = input.LA(2);

                if ( (LA221_1==EOF||(LA221_1 >= CR && LA221_1 <= DELIMITER2)||LA221_1==LINE_H||LA221_1==REPETITEUR) ) {
                    alt221=1;
                }
                else if ( (LA221_1==DELIMITER3) ) {
                    alt221=2;
                }
            }
            switch (alt221) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:911:4: field[true]
                    {
                    pushFollow(FOLLOW_field_in_dirty_sous_champ6344);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:912:4: ( dirty_sous_sous_champ[$nameElement + \".1\"] dirty_sous_champ_ordered[$nameElement, 2] )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:912:4: ( dirty_sous_sous_champ[$nameElement + \".1\"] dirty_sous_champ_ordered[$nameElement, 2] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:912:5: dirty_sous_sous_champ[$nameElement + \".1\"] dirty_sous_champ_ordered[$nameElement, 2]
                    {
                    pushFollow(FOLLOW_dirty_sous_sous_champ_in_dirty_sous_champ6353);
                    dirty_sous_sous_champ(nameElement + ".1");

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_dirty_sous_champ_ordered_in_dirty_sous_champ6359);
                    dirty_sous_champ_ordered(nameElement, 2);

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_sous_champ"



    // $ANTLR start "dirty_sous_champ_ordered"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:916:1: dirty_sous_champ_ordered[String nameElement, int order] : DELIMITER3 dirty_sous_sous_champ[$nameElement + \".\" + $order] ( dirty_sous_champ_ordered[$nameElement, $order + 1] )? ;
    public final void dirty_sous_champ_ordered(String nameElement, int order) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:916:57: ( DELIMITER3 dirty_sous_sous_champ[$nameElement + \".\" + $order] ( dirty_sous_champ_ordered[$nameElement, $order + 1] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:917:3: DELIMITER3 dirty_sous_sous_champ[$nameElement + \".\" + $order] ( dirty_sous_champ_ordered[$nameElement, $order + 1] )?
            {
            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_dirty_sous_champ_ordered6377); if (state.failed) return ;

            pushFollow(FOLLOW_dirty_sous_sous_champ_in_dirty_sous_champ_ordered6379);
            dirty_sous_sous_champ(nameElement + "." + order);

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:918:5: ( dirty_sous_champ_ordered[$nameElement, $order + 1] )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==DELIMITER3) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:918:5: dirty_sous_champ_ordered[$nameElement, $order + 1]
                    {
                    pushFollow(FOLLOW_dirty_sous_champ_ordered_in_dirty_sous_champ_ordered6386);
                    dirty_sous_champ_ordered(nameElement, order + 1);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_sous_champ_ordered"



    // $ANTLR start "dirty_sous_sous_champ"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:920:1: dirty_sous_sous_champ[String nameElement] : field[true] ;
    public final void dirty_sous_sous_champ(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:922:22: ( field[true] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:923:3: field[true]
            {
            pushFollow(FOLLOW_field_in_dirty_sous_sous_champ6406);
            field(true);

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dirty_sous_sous_champ"



    // $ANTLR start "lvl1_fields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:927:1: lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl1_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:929:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:930:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_fields6434);
            r=lvl1_subfields(nameElement, patterns, nbMandatory, 1, new StringBuilder(), completeFieldPattern);

            state._fsp--;
            if (state.failed) return contentText;

            if ( state.backtracking==0 ) {contentText = r;}

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return contentText;
    }
    // $ANTLR end "lvl1_fields"



    // $ANTLR start "lvl1_subfields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:932:1: lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:932:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt225=3;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==CONTENT) ) {
                int LA225_1 = input.LA(2);

                if ( (LA225_1==DELIMITER2) && ((size < nbMandatory))) {
                    alt225=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt225=1;
                }
                else if ( (true) ) {
                    alt225=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 225, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 225, 0, input);

                throw nvae;

            }
            switch (alt225) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:933:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:933:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:933:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields6462);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:934:38: ({...}? DELIMITER2 spec_field[\"\", false, false] )?
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==DELIMITER2) ) {
                        alt223=1;
                    }
                    switch (alt223) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:934:39: {...}? DELIMITER2 spec_field[\"\", false, false]
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "strictNess <= 2");
                            }

                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields6507); if (state.failed) return contentText;

                            pushFollow(FOLLOW_spec_field_in_lvl1_subfields6509);
                            spec_field("", false, false);

                            state._fsp--;
                            if (state.failed) return contentText;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {contentText = recorded.toString();}

                    if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                    }

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:937:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:937:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:937:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields6569);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields6606); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields6610);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:941:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:941:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:941:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields6659);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:942:6: ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt224=2;
                    int LA224_0 = input.LA(1);

                    if ( (LA224_0==DELIMITER2) ) {
                        alt224=1;
                    }
                    else if ( ((LA224_0 >= CR && LA224_0 <= DELIMITER1)||LA224_0==REPETITEUR) ) {
                        alt224=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 224, 0, input);

                        throw nvae;

                    }
                    switch (alt224) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:942:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:942:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:942:8: DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields6671); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields6675);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:943:8: {...}?
                            {
                            if ( state.backtracking==0 ) {contentText = recorded.toString();}

                            if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return contentText;
    }
    // $ANTLR end "lvl1_subfields"



    // $ANTLR start "lvl1_fields_repet"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:946:1: lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final void lvl1_fields_repet(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:948:23: (r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:949:3: r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet6718);
            r=lvl1_subfields_repet(nameElement, patterns, nbMandatory, 1, new StringBuilder(), completeFieldPattern);

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lvl1_fields_repet"



    // $ANTLR start "lvl1_subfields_repet"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:951:1: lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields_repet(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:951:173: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt229=3;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==CONTENT) ) {
                int LA229_1 = input.LA(2);

                if ( (LA229_1==REPETITEUR) && ((size < nbMandatory))) {
                    alt229=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt229=1;
                }
                else if ( (true) ) {
                    alt229=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 229, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 0, input);

                throw nvae;

            }
            switch (alt229) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:952:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:952:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:952:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6742);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:953:38: ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |)
                    int alt227=2;
                    switch ( input.LA(1) ) {
                    case REPETITEUR:
                        {
                        alt227=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA227_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt227=1;
                        }
                        else if ( (true) ) {
                            alt227=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 227, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA227_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt227=1;
                        }
                        else if ( (true) ) {
                            alt227=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 227, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 227, 0, input);

                        throw nvae;

                    }

                    switch (alt227) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:953:39: {...}? ( REPETITEUR spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:953:58: ( REPETITEUR spec_field[\"\", false, false] )?
                            int alt226=2;
                            int LA226_0 = input.LA(1);

                            if ( (LA226_0==REPETITEUR) ) {
                                alt226=1;
                            }
                            switch (alt226) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:953:59: REPETITEUR spec_field[\"\", false, false]
                                    {
                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet6788); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6790);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:953:103: 
                            {
                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {contentText = recorded.toString();}

                    if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                    }

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:956:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:956:30: (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:956:31: g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6854);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet6891); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6895);
                    h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:960:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:960:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:960:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6944);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:961:6: ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt228=2;
                    int LA228_0 = input.LA(1);

                    if ( (LA228_0==REPETITEUR) ) {
                        alt228=1;
                    }
                    else if ( ((LA228_0 >= CR && LA228_0 <= DELIMITER1)) ) {
                        alt228=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 228, 0, input);

                        throw nvae;

                    }
                    switch (alt228) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:961:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:961:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:961:8: REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet6956); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6960);
                            h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:962:8: {...}?
                            {
                            if ( state.backtracking==0 ) {contentText = recorded.toString();}

                            if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return contentText;
    }
    // $ANTLR end "lvl1_subfields_repet"



    // $ANTLR start "lvl2_fields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:966:1: lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl2_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:968:23: (r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:969:3: r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_fields7008);
            r=lvl2_subfields(nameElement, patterns, nbMandatory, 1, new StringBuilder(), completeFieldPattern);

            state._fsp--;
            if (state.failed) return contentText;

            if ( state.backtracking==0 ) {contentText = r;}

            }

            if ( state.backtracking==0 ) {endElement();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return contentText;
    }
    // $ANTLR end "lvl2_fields"



    // $ANTLR start "lvl2_subfields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:971:1: lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl2_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:971:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt233=3;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==CONTENT) ) {
                int LA233_1 = input.LA(2);

                if ( (LA233_1==DELIMITER3) && ((size < nbMandatory))) {
                    alt233=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt233=1;
                }
                else if ( (true) ) {
                    alt233=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 233, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 233, 0, input);

                throw nvae;

            }
            switch (alt233) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:972:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:972:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:972:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields7034);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:973:38: ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |)
                    int alt231=2;
                    switch ( input.LA(1) ) {
                    case DELIMITER3:
                        {
                        alt231=1;
                        }
                        break;
                    case DELIMITER2:
                        {
                        int LA231_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt231=1;
                        }
                        else if ( (true) ) {
                            alt231=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 231, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA231_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt231=1;
                        }
                        else if ( (true) ) {
                            alt231=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 231, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case REPETITEUR:
                        {
                        int LA231_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt231=1;
                        }
                        else if ( (true) ) {
                            alt231=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 231, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA231_5 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt231=1;
                        }
                        else if ( (true) ) {
                            alt231=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 231, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 231, 0, input);

                        throw nvae;

                    }

                    switch (alt231) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:973:39: {...}? ( DELIMITER3 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:973:58: ( DELIMITER3 spec_field[\"\", false, false] )?
                            int alt230=2;
                            int LA230_0 = input.LA(1);

                            if ( (LA230_0==DELIMITER3) ) {
                                alt230=1;
                            }
                            switch (alt230) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:973:59: DELIMITER3 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields7080); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields7082);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:973:103: 
                            {
                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {contentText = recorded.toString();}

                    if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                    }

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:976:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:976:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:976:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields7146);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields7183); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields7187);
                    h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:980:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:980:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:980:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields7236);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:981:6: ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt232=2;
                    int LA232_0 = input.LA(1);

                    if ( (LA232_0==DELIMITER3) ) {
                        alt232=1;
                    }
                    else if ( ((LA232_0 >= CR && LA232_0 <= DELIMITER2)||LA232_0==REPETITEUR) ) {
                        alt232=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 232, 0, input);

                        throw nvae;

                    }
                    switch (alt232) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:981:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:981:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:981:8: DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields7248); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields7252);
                            h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:982:8: {...}?
                            {
                            if ( state.backtracking==0 ) {contentText = recorded.toString();}

                            if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return contentText;
    }
    // $ANTLR end "lvl2_subfields"


    public static class spec_field_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_field"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:986:1: spec_field[String fieldPattern, boolean record, boolean forceRegex] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:986:69: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:987:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern, forceRegex))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field7290); if (state.failed) return retval;

            if ( state.backtracking==0 ) {if (record) content(input.toString(retval.start,input.LT(-1)));}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spec_field"


    public static class field_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "field"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:992:1: field[boolean record] : CONTENT ;
    public final HPRIMSParser.field_return field(boolean record) throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:992:23: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:993:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field7306); if (state.failed) return retval;

            if ( state.backtracking==0 ) {if (record) content(input.toString(retval.start,input.LT(-1)));}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field"



    // $ANTLR start "tx_field"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:997:1: tx_field[String fieldPattern, boolean record, boolean forceRegex] : tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] ;
    public final void tx_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:997:67: ( tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:998:3: tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex]
            {
            pushFollow(FOLLOW_tx_field_internal_in_tx_field7322);
            tx_field_internal(fieldPattern, new StringBuilder(), record, forceRegex);

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tx_field"



    // $ANTLR start "tx_field_internal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1000:1: tx_field_internal[String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex] : (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) ;
    public final void tx_field_internal(String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex) throws RecognitionException {
        Token h=null;

        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1000:100: ( (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1001:3: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1001:4: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )?
            int alt234=2;
            int LA234_0 = input.LA(1);

            if ( (LA234_0==CONTENT||(LA234_0 >= DELIMITER2 && LA234_0 <= DELIMITER3)) ) {
                alt234=1;
            }
            switch (alt234) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1001:4: h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1001:5: ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1001:6: ( CONTENT | DELIMITER2 | DELIMITER3 )
                    {
                    if ( input.LA(1)==CONTENT||(input.LA(1) >= DELIMITER2 && input.LA(1) <= DELIMITER3) ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if ( state.backtracking==0 ) {recorded.append((h!=null?h.getText():null));}

                    }


                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1002:5: ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==REPETITEUR) ) {
                alt235=1;
            }
            else if ( ((LA235_0 >= CR && LA235_0 <= DELIMITER1)) ) {
                alt235=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 235, 0, input);

                throw nvae;

            }
            switch (alt235) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1002:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1002:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1002:7: REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_tx_field_internal7359); if (state.failed) return ;

                    pushFollow(FOLLOW_tx_field_internal_in_tx_field_internal7361);
                    tx_field_internal(fieldPattern, recorded.append('\n'), record, forceRegex);

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1003:6: {...}?
                    {
                    if ( !((matchRegex(recorded.toString(), fieldPattern, forceRegex))) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "tx_field_internal", "matchRegex($recorded.toString(), $fieldPattern, $forceRegex)");
                    }

                    if ( state.backtracking==0 ) {if (record) content(recorded.toString());}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tx_field_internal"


    public static class delimiters_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "delimiters"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1006:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1006:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1007:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters7387); if (state.failed) return retval;

            if ( state.backtracking==0 ) {content(input.toString(retval.start,input.LT(-1)));}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delimiters"

    // $ANTLR start synpred1_HPRIMS
    public final void synpred1_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:3: ( line_h2_2_adm )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:4: line_h2_2_adm
        {
        pushFollow(FOLLOW_line_h2_2_adm_in_synpred1_HPRIMS75);
        line_h2_2_adm();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_HPRIMS

    // $ANTLR start synpred2_HPRIMS
    public final void synpred2_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:3: ( line_h2_1_adm )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:4: line_h2_1_adm
        {
        pushFollow(FOLLOW_line_h2_1_adm_in_synpred2_HPRIMS109);
        line_h2_1_adm();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_HPRIMS

    // $ANTLR start synpred3_HPRIMS
    public final void synpred3_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:3: ( line_h2_0_adm )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:4: line_h2_0_adm
        {
        pushFollow(FOLLOW_line_h2_0_adm_in_synpred3_HPRIMS143);
        line_h2_0_adm();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_HPRIMS

    // $ANTLR start synpred4_HPRIMS
    public final void synpred4_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:3: ( line_h2_2_fac )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:4: line_h2_2_fac
        {
        pushFollow(FOLLOW_line_h2_2_fac_in_synpred4_HPRIMS177);
        line_h2_2_fac();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_HPRIMS

    // $ANTLR start synpred5_HPRIMS
    public final void synpred5_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:3: ( line_h2_1_fac )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:4: line_h2_1_fac
        {
        pushFollow(FOLLOW_line_h2_1_fac_in_synpred5_HPRIMS211);
        line_h2_1_fac();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_HPRIMS

    // $ANTLR start synpred6_HPRIMS
    public final void synpred6_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:292:3: ( line_h2_0_fac )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:292:4: line_h2_0_fac
        {
        pushFollow(FOLLOW_line_h2_0_fac_in_synpred6_HPRIMS245);
        line_h2_0_fac();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_HPRIMS

    // $ANTLR start synpred7_HPRIMS
    public final void synpred7_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:295:3: ( line_h2_2_ora )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:295:4: line_h2_2_ora
        {
        pushFollow(FOLLOW_line_h2_2_ora_in_synpred7_HPRIMS279);
        line_h2_2_ora();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_HPRIMS

    // $ANTLR start synpred8_HPRIMS
    public final void synpred8_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:298:3: ( line_h2_1_ora )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:298:4: line_h2_1_ora
        {
        pushFollow(FOLLOW_line_h2_1_ora_in_synpred8_HPRIMS313);
        line_h2_1_ora();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_HPRIMS

    // $ANTLR start synpred9_HPRIMS
    public final void synpred9_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:3: ( line_h2_0_ora )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:4: line_h2_0_ora
        {
        pushFollow(FOLLOW_line_h2_0_ora_in_synpred9_HPRIMS347);
        line_h2_0_ora();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_HPRIMS

    // $ANTLR start synpred10_HPRIMS
    public final void synpred10_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:304:3: ( line_h2_2_orm )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:304:4: line_h2_2_orm
        {
        pushFollow(FOLLOW_line_h2_2_orm_in_synpred10_HPRIMS381);
        line_h2_2_orm();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_HPRIMS

    // $ANTLR start synpred11_HPRIMS
    public final void synpred11_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:307:3: ( line_h2_1_orm )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:307:4: line_h2_1_orm
        {
        pushFollow(FOLLOW_line_h2_1_orm_in_synpred11_HPRIMS415);
        line_h2_1_orm();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_HPRIMS

    // $ANTLR start synpred12_HPRIMS
    public final void synpred12_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:310:3: ( line_h2_0_orm )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:310:4: line_h2_0_orm
        {
        pushFollow(FOLLOW_line_h2_0_orm_in_synpred12_HPRIMS449);
        line_h2_0_orm();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_HPRIMS

    // $ANTLR start synpred13_HPRIMS
    public final void synpred13_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:313:3: ( line_h2_2_oru )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:313:4: line_h2_2_oru
        {
        pushFollow(FOLLOW_line_h2_2_oru_in_synpred13_HPRIMS483);
        line_h2_2_oru();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_HPRIMS

    // $ANTLR start synpred14_HPRIMS
    public final void synpred14_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:3: ( line_h2_1_oru )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:4: line_h2_1_oru
        {
        pushFollow(FOLLOW_line_h2_1_oru_in_synpred14_HPRIMS517);
        line_h2_1_oru();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_HPRIMS

    // $ANTLR start synpred15_HPRIMS
    public final void synpred15_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:3: ( line_h2_0_oru )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:4: line_h2_0_oru
        {
        pushFollow(FOLLOW_line_h2_0_oru_in_synpred15_HPRIMS551);
        line_h2_0_oru();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_HPRIMS

    // $ANTLR start synpred16_HPRIMS
    public final void synpred16_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:3: ( line_h2_2_reg )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:4: line_h2_2_reg
        {
        pushFollow(FOLLOW_line_h2_2_reg_in_synpred16_HPRIMS585);
        line_h2_2_reg();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_HPRIMS

    // $ANTLR start synpred17_HPRIMS
    public final void synpred17_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:325:3: ( line_h2_1_reg )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:325:4: line_h2_1_reg
        {
        pushFollow(FOLLOW_line_h2_1_reg_in_synpred17_HPRIMS619);
        line_h2_1_reg();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_HPRIMS

    // $ANTLR start synpred18_HPRIMS
    public final void synpred18_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:328:3: ( line_h2_0_reg )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:328:4: line_h2_0_reg
        {
        pushFollow(FOLLOW_line_h2_0_reg_in_synpred18_HPRIMS653);
        line_h2_0_reg();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_HPRIMS

    // $ANTLR start synpred19_HPRIMS
    public final void synpred19_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:719:5: ( spec_field[\"^NM$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:719:6: spec_field[\"^NM$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred19_HPRIMS3630);
        spec_field("^NM$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_HPRIMS

    // $ANTLR start synpred20_HPRIMS
    public final void synpred20_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:6: ( spec_field[\"^CE$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:7: spec_field[\"^CE$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred20_HPRIMS3749);
        spec_field("^CE$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_HPRIMS

    // $ANTLR start synpred21_HPRIMS
    public final void synpred21_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:6: ( spec_field[\"^FIC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:7: spec_field[\"^FIC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred21_HPRIMS3852);
        spec_field("^FIC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_HPRIMS

    // $ANTLR start synpred22_HPRIMS
    public final void synpred22_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:6: ( spec_field[\"^ST$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:7: spec_field[\"^ST$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred22_HPRIMS3955);
        spec_field("^ST$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_HPRIMS

    // $ANTLR start synpred23_HPRIMS
    public final void synpred23_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:6: ( spec_field[\"^GC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:7: spec_field[\"^GC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred23_HPRIMS4062);
        spec_field("^GC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_HPRIMS

    // $ANTLR start synpred24_HPRIMS
    public final void synpred24_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:760:6: ( spec_field[\"^TX$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:760:7: spec_field[\"^TX$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred24_HPRIMS4165);
        spec_field("^TX$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_HPRIMS

    // $ANTLR start synpred25_HPRIMS
    public final void synpred25_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:7: spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred25_HPRIMS4264);
        spec_field("^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_HPRIMS

    // Delegated rules

    public final boolean synpred16_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_HPRIMS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_HPRIMS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_line_h2_2_adm_in_hprim87 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_adm_in_hprim89 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim92 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim94 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_adm_in_hprim121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_adm_in_hprim123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_adm_in_hprim155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_adm_in_hprim157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_fac_in_hprim189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_fac_in_hprim191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_fac_in_hprim223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_fac_in_hprim225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim228 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_fac_in_hprim257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_fac_in_hprim259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_ora_in_hprim291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_ora_in_hprim293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_ora_in_hprim325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_ora_in_hprim327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_ora_in_hprim359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_ora_in_hprim361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_orm_in_hprim393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_orm_in_hprim427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_orm_in_hprim461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_hprim495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_hprim529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_hprim563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_reg_in_hprim597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_reg_in_hprim599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_reg_in_hprim631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_reg_in_hprim633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_reg_in_hprim665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_reg_in_hprim667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_l_in_hprim670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CR_in_hprim672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirty_line_in_dirty_hprim701 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_CR_in_dirty_hprim705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_dirty_hprim708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_adm720 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_adm723 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_ap_in_body_p_adm731 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_adm734 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_ac_in_body_p_adm743 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_adm746 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_fac764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ap_in_body_p_fac775 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ac_in_body_p_fac787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_fac_in_body_p_fac802 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac805 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_reg_in_body_p_fac814 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac817 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_act_in_body_p_fac828 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac831 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_ora849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ap_in_body_p_ora860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ac_in_body_p_ora872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obr_in_body_p_ora886 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora889 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_obx_in_body_p_ora899 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora902 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_orm927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obr_in_body_p_orm938 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm941 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_obx_in_body_p_orm950 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm953 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_oru971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obr_in_body_p_oru982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obx_in_body_p_oru994 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru997 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_reg1015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_reg1018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_reg_in_body_p_reg1026 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_reg1029 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CR_in_line_ap1055 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LINE_AP_in_line_ap1057 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1067 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1078 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1089 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1111 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1133 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1177 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1188 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ap1197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1206 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1217 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1229 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1242 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1256 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1271 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1288 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ap1303 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1319 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_ac1372 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LINE_AC_in_line_ac1374 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1406 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1417 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ac1448 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1458 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ac1469 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_act1505 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LINE_ACT_in_line_act1507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1517 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1539 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1561 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act1592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act1614 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_act1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act1620 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1632 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c1663 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LINE_C_in_line_c1665 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1676 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1688 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1701 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c1707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1711 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_fac1753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LINE_FAC_in_line_fac1755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1776 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1787 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1798 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_fac1808 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_fac1817 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1829 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_H_in_start_line_h1864 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h1872 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h1882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h1893 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h1902 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_midd_line_h1923 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_midd_line_h1941 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_21977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_21981 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_21999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_22003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_12017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_12021 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_12039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_02057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_02061 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_02079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_02083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h2099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h2103 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h2111 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_adm2128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_adm2132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_adm2136 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_adm2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_2_adm2161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm2165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_adm2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_1_adm2187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_adm2191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_adm2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_0_adm2213 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_adm2217 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_adm2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_reg2232 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_reg2236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_reg2240 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_reg2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_reg_in_line_h2_2_reg2265 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_reg2269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_reg2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_reg_in_line_h2_1_reg2291 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_reg2295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_reg2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_reg_in_line_h2_0_reg2317 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_reg2321 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_reg2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_fac2336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_fac2340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_fac2344 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_fac2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_fac_in_line_h2_2_fac2369 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_fac2373 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_fac2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_fac_in_line_h2_1_fac2395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_fac2399 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_fac2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_fac_in_line_h2_0_fac2421 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_fac2425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_fac2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_ora2440 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_ora2444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_ora2448 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_ora2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_ora_in_line_h2_2_ora2473 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_ora2477 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_ora2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_ora_in_line_h2_1_ora2499 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_ora2503 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_ora2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_ora_in_line_h2_0_ora2525 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_ora2529 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_ora2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_orm2544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_orm2548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_orm2552 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_orm2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_orm_in_line_h2_2_orm2577 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_orm2581 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_orm2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_orm_in_line_h2_1_orm2603 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_orm2607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_orm2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_orm_in_line_h2_0_orm2629 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_orm2633 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_orm2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_oru2648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_oru2652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_oru2656 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_oru2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_2_oru2681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru2685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_oru2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_1_oru2707 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru2711 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_oru2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_0_oru2733 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru2737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_oru2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2763 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LINE_OBR_in_line_obr2765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2791 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2798 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2804 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2818 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2828 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2841 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_obr2850 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2859 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2894 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2907 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2918 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2932 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_obr_16_in_line_obr2945 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2957 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_obr2970 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2986 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3005 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3025 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3046 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3068 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3091 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr3113 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3136 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3162 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3189 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3215 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr3219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3221 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr3248 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3276 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3329 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr3335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3339 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3371 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3400 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3430 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3461 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3495 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx3602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LINE_OBX_in_line_obx3604 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3614 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_line_obx3646 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3659 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3673 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3690 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3708 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx3765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3778 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3792 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3807 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3813 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx3868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3881 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3895 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3910 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3916 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx3971 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3984 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3998 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4015 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx4021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4023 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx4078 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4091 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4105 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4120 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx4124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4126 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx4181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4194 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4208 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4221 = new BitSet(new long[]{0x0000000000400190L});
    public static final BitSet FOLLOW_tx_field_in_line_obx4225 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx4280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4293 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4307 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4324 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx4330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4334 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4380 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4393 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4403 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4417 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4427 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4444 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4460 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4470 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4489 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4499 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4520 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4539 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4559 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_end_line_obx4578 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4598 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p4663 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LINE_P_in_line_p4665 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p4685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4694 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4706 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p4717 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4729 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4744 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4760 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4777 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p4793 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4810 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_p4828 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p4869 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p4873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p4875 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4897 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4920 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4959 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5000 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p5024 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p5028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p5030 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5057 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p5063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5067 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5097 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5126 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5156 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5187 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p5193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5197 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5231 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p5262 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5319 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5354 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5417 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5482 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5520 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5589 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5629 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5670 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_reg5792 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LINE_REG_in_line_reg5794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5815 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_reg5824 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5833 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5844 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5859 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5872 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l5908 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LINE_L_in_line_l5910 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5921 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5934 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5948 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5963 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5979 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_dirty_line6025 = new BitSet(new long[]{0x00000000003EFC00L});
    public static final BitSet FOLLOW_set_in_dirty_line6029 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_LINE_H_in_dirty_line6094 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_delimiters_in_dirty_line6098 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_dirty_line6110 = new BitSet(new long[]{0x0000000000400090L});
    public static final BitSet FOLLOW_dirty_repet_in_dirty_line6112 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna6145 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna6154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_sized_cna6158 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna6166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_obr_166203 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_166209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_166215 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_166224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_166230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirty_champ_in_dirty_repet6252 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_REPETITEUR_in_dirty_repet6256 = new BitSet(new long[]{0x0000000000400090L});
    public static final BitSet FOLLOW_dirty_repet_in_dirty_repet6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_dirty_champ6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirty_sous_champ_in_dirty_champ6289 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_dirty_champ_ordered_in_dirty_champ6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_dirty_champ_ordered6314 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_dirty_sous_champ_in_dirty_champ_ordered6316 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_dirty_champ_ordered_in_dirty_champ_ordered6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_dirty_sous_champ6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirty_sous_sous_champ_in_dirty_sous_champ6353 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_dirty_sous_champ_ordered_in_dirty_sous_champ6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_dirty_sous_champ_ordered6377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_dirty_sous_sous_champ_in_dirty_sous_champ_ordered6379 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_dirty_sous_champ_ordered_in_dirty_sous_champ_ordered6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_dirty_sous_sous_champ6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_fields6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6462 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields6507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6569 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields6606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6659 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields6671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6742 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet6788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6854 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet6891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6944 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet6956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_fields7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields7034 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields7080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields7146 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields7183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields7236 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields7248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tx_field_internal7337 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_REPETITEUR_in_tx_field_internal7359 = new BitSet(new long[]{0x0000000000400190L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field_internal7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_synpred1_HPRIMS75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_adm_in_synpred2_HPRIMS109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_adm_in_synpred3_HPRIMS143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_fac_in_synpred4_HPRIMS177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_fac_in_synpred5_HPRIMS211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_fac_in_synpred6_HPRIMS245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_ora_in_synpred7_HPRIMS279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_ora_in_synpred8_HPRIMS313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_ora_in_synpred9_HPRIMS347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_orm_in_synpred10_HPRIMS381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_orm_in_synpred11_HPRIMS415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_orm_in_synpred12_HPRIMS449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_synpred13_HPRIMS483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_synpred14_HPRIMS517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_synpred15_HPRIMS551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_reg_in_synpred16_HPRIMS585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_reg_in_synpred17_HPRIMS619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_reg_in_synpred18_HPRIMS653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred19_HPRIMS3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred20_HPRIMS3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred21_HPRIMS3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred22_HPRIMS3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred23_HPRIMS4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred24_HPRIMS4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred25_HPRIMS4264 = new BitSet(new long[]{0x0000000000000002L});

}