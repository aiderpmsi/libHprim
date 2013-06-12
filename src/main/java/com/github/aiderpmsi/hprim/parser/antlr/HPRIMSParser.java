// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-12 10:06:34

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



    // $ANTLR start "body_p_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:333:1: body_p_adm : ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* ) ;
    public final void body_p_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:333:12: ( ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:334:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:334:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:334:4: line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_adm695);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:334:11: ( line_c )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==CR) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==LINE_C) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:334:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_adm698);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:4: ( line_ap ( line_c )* ( line_ac ( line_c )* )* )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==CR) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==LINE_AP) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:5: line_ap ( line_c )* ( line_ac ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_ap_in_body_p_adm706);
            	    line_ap();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:13: ( line_c )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==CR) ) {
            	            int LA39_1 = input.LA(2);

            	            if ( (LA39_1==LINE_C) ) {
            	                alt39=1;
            	            }


            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:14: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_adm709);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:336:5: ( line_ac ( line_c )* )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==CR) ) {
            	            int LA41_1 = input.LA(2);

            	            if ( (LA41_1==LINE_AC) ) {
            	                alt41=1;
            	            }


            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:336:6: line_ac ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_ac_in_body_p_adm718);
            	    	    line_ac();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:336:14: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:336:15: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_adm721);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop40;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:338:1: body_p_fac : ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ ) ;
    public final void body_p_fac() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:338:12: ( ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:4: line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* )? ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_fac739);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:11: ( line_c )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==CR) ) {
                    int LA43_1 = input.LA(2);

                    if ( (LA43_1==LINE_C) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_fac742);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:4: ( line_ap ( line_c )* ( line_ac ( line_c )* )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==CR) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==LINE_AP) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:5: line_ap ( line_c )* ( line_ac ( line_c )* )*
                    {
                    pushFollow(FOLLOW_line_ap_in_body_p_fac750);
                    line_ap();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:13: ( line_c )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==CR) ) {
                            int LA44_1 = input.LA(2);

                            if ( (LA44_1==LINE_C) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:14: line_c
                    	    {
                    	    pushFollow(FOLLOW_line_c_in_body_p_fac753);
                    	    line_c();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:5: ( line_ac ( line_c )* )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==CR) ) {
                            int LA46_1 = input.LA(2);

                            if ( (LA46_1==LINE_AC) ) {
                                alt46=1;
                            }


                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:6: line_ac ( line_c )*
                    	    {
                    	    pushFollow(FOLLOW_line_ac_in_body_p_fac762);
                    	    line_ac();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:14: ( line_c )*
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
                    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:15: line_c
                    	    	    {
                    	    	    pushFollow(FOLLOW_line_c_in_body_p_fac765);
                    	    	    line_c();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop45;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:342:4: ( line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )* )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==CR) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==LINE_FAC) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:342:5: line_fac ( line_c )* ( line_reg ( line_c )* )* ( line_act ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_fac_in_body_p_fac777);
            	    line_fac();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:342:14: ( line_c )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==CR) ) {
            	            int LA48_1 = input.LA(2);

            	            if ( (LA48_1==LINE_C) ) {
            	                alt48=1;
            	            }


            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:342:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_fac780);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:343:5: ( line_reg ( line_c )* )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==CR) ) {
            	            int LA50_1 = input.LA(2);

            	            if ( (LA50_1==LINE_REG) ) {
            	                alt50=1;
            	            }


            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:343:6: line_reg ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_reg_in_body_p_fac789);
            	    	    line_reg();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:343:15: ( line_c )*
            	    	    loop49:
            	    	    do {
            	    	        int alt49=2;
            	    	        int LA49_0 = input.LA(1);

            	    	        if ( (LA49_0==CR) ) {
            	    	            int LA49_1 = input.LA(2);

            	    	            if ( (LA49_1==LINE_C) ) {
            	    	                alt49=1;
            	    	            }


            	    	        }


            	    	        switch (alt49) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:343:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_fac792);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop49;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:5: ( line_act ( line_c )* )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==CR) ) {
            	            int LA52_1 = input.LA(2);

            	            if ( (LA52_1==LINE_ACT) ) {
            	                alt52=1;
            	            }


            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:6: line_act ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_act_in_body_p_fac803);
            	    	    line_act();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:15: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_fac806);
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


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:346:1: body_p_ora : ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ ) ;
    public final void body_p_ora() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:346:12: ( ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:3: ( line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:4: line_p ( line_c )* ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_ora824);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:11: ( line_c )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==CR) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==LINE_C) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:347:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_ora827);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:4: ( line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==CR) ) {
                    int LA62_1 = input.LA(2);

                    if ( (LA62_1==LINE_AP) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:5: line_ap ( line_c )* ( line_ac ( line_c )* )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            	    {
            	    pushFollow(FOLLOW_line_ap_in_body_p_ora835);
            	    line_ap();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:13: ( line_c )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( (LA55_0==CR) ) {
            	            int LA55_1 = input.LA(2);

            	            if ( (LA55_1==LINE_C) ) {
            	                alt55=1;
            	            }


            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:348:14: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_ora838);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop55;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:5: ( line_ac ( line_c )* )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==CR) ) {
            	            int LA57_1 = input.LA(2);

            	            if ( (LA57_1==LINE_AC) ) {
            	                alt57=1;
            	            }


            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:6: line_ac ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_ac_in_body_p_ora847);
            	    	    line_ac();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:14: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:15: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_ora850);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop56;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:350:5: ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            	    int cnt61=0;
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==CR) ) {
            	            int LA61_1 = input.LA(2);

            	            if ( (LA61_1==LINE_OBR) ) {
            	                alt61=1;
            	            }


            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:350:6: line_obr ( line_c )* ( line_obx ( line_c )* )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obr_in_body_p_ora861);
            	    	    line_obr();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:350:15: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:350:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_ora864);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop58;
            	    	        }
            	    	    } while (true);


            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:351:6: ( line_obx ( line_c )* )*
            	    	    loop60:
            	    	    do {
            	    	        int alt60=2;
            	    	        int LA60_0 = input.LA(1);

            	    	        if ( (LA60_0==CR) ) {
            	    	            int LA60_1 = input.LA(2);

            	    	            if ( (LA60_1==LINE_OBX) ) {
            	    	                alt60=1;
            	    	            }


            	    	        }


            	    	        switch (alt60) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:351:7: line_obx ( line_c )*
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_obx_in_body_p_ora874);
            	    	    	    line_obx();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:351:16: ( line_c )*
            	    	    	    loop59:
            	    	    	    do {
            	    	    	        int alt59=2;
            	    	    	        int LA59_0 = input.LA(1);

            	    	    	        if ( (LA59_0==CR) ) {
            	    	    	            int LA59_1 = input.LA(2);

            	    	    	            if ( (LA59_1==LINE_C) ) {
            	    	    	                alt59=1;
            	    	    	            }


            	    	    	        }


            	    	    	        switch (alt59) {
            	    	    	    	case 1 :
            	    	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:351:17: line_c
            	    	    	    	    {
            	    	    	    	    pushFollow(FOLLOW_line_c_in_body_p_ora877);
            	    	    	    	    line_c();

            	    	    	    	    state._fsp--;
            	    	    	    	    if (state.failed) return ;

            	    	    	    	    }
            	    	    	    	    break;

            	    	    	    	default :
            	    	    	    	    break loop59;
            	    	    	        }
            	    	    	    } while (true);


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop60;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt61 >= 1 ) break loop61;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(61, input);
            	                throw eee;
            	        }
            	        cnt61++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:354:1: body_p_orm : ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ ) ;
    public final void body_p_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:354:12: ( ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:4: line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_orm902);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:11: ( line_c )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==CR) ) {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==LINE_C) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_orm905);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:4: ( line_obr ( line_c )* ( line_obx ( line_c )* )* )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==CR) ) {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==LINE_OBR) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:5: line_obr ( line_c )* ( line_obx ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_obr_in_body_p_orm913);
            	    line_obr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:14: ( line_c )*
            	    loop64:
            	    do {
            	        int alt64=2;
            	        int LA64_0 = input.LA(1);

            	        if ( (LA64_0==CR) ) {
            	            int LA64_1 = input.LA(2);

            	            if ( (LA64_1==LINE_C) ) {
            	                alt64=1;
            	            }


            	        }


            	        switch (alt64) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_orm916);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop64;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:357:5: ( line_obx ( line_c )* )*
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==CR) ) {
            	            int LA66_1 = input.LA(2);

            	            if ( (LA66_1==LINE_OBX) ) {
            	                alt66=1;
            	            }


            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:357:6: line_obx ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obx_in_body_p_orm925);
            	    	    line_obx();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:357:15: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:357:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_orm928);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop65;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop66;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:1: body_p_oru : ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ ) ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:12: ( ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:4: line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru946);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:11: ( line_c )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==CR) ) {
                    int LA68_1 = input.LA(2);

                    if ( (LA68_1==LINE_C) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_oru949);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:4: ( line_obr ( line_c )* ( line_obx ( line_c )* )+ )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==CR) ) {
                    int LA72_1 = input.LA(2);

                    if ( (LA72_1==LINE_OBR) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:5: line_obr ( line_c )* ( line_obx ( line_c )* )+
            	    {
            	    pushFollow(FOLLOW_line_obr_in_body_p_oru957);
            	    line_obr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:14: ( line_c )*
            	    loop69:
            	    do {
            	        int alt69=2;
            	        int LA69_0 = input.LA(1);

            	        if ( (LA69_0==CR) ) {
            	            int LA69_1 = input.LA(2);

            	            if ( (LA69_1==LINE_C) ) {
            	                alt69=1;
            	            }


            	        }


            	        switch (alt69) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_oru960);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop69;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:5: ( line_obx ( line_c )* )+
            	    int cnt71=0;
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==CR) ) {
            	            int LA71_1 = input.LA(2);

            	            if ( (LA71_1==LINE_OBX) ) {
            	                alt71=1;
            	            }


            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:6: line_obx ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obx_in_body_p_oru969);
            	    	    line_obx();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:15: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_oru972);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop70;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt71 >= 1 ) break loop71;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(71, input);
            	                throw eee;
            	        }
            	        cnt71++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:1: body_p_reg : ( line_p ( line_c )* ( line_reg ( line_c )* )+ ) ;
    public final void body_p_reg() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:12: ( ( line_p ( line_c )* ( line_reg ( line_c )* )+ ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:3: ( line_p ( line_c )* ( line_reg ( line_c )* )+ )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:3: ( line_p ( line_c )* ( line_reg ( line_c )* )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:4: line_p ( line_c )* ( line_reg ( line_c )* )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_reg990);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:11: ( line_c )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==CR) ) {
                    int LA73_1 = input.LA(2);

                    if ( (LA73_1==LINE_C) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_reg993);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:4: ( line_reg ( line_c )* )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==CR) ) {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==LINE_REG) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:5: line_reg ( line_c )*
            	    {
            	    pushFollow(FOLLOW_line_reg_in_body_p_reg1001);
            	    line_reg();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:14: ( line_c )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==CR) ) {
            	            int LA74_1 = input.LA(2);

            	            if ( (LA74_1==LINE_C) ) {
            	                alt74=1;
            	            }


            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_reg1004);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop74;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:372:1: line_ap : CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? ;
    public final void line_ap() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:374:23: ( CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:375:3: CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_ap1035); if (state.failed) return ;

            match(input,LINE_AP,FOLLOW_LINE_AP_in_line_ap1037); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.1");content("AP");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1043); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.2");}

            pushFollow(FOLLOW_spec_field_in_line_ap1047);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1054); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.3");}

            pushFollow(FOLLOW_spec_field_in_line_ap1058);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1065); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.4");}

            pushFollow(FOLLOW_spec_field_in_line_ap1069);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1076); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.5");}

            pushFollow(FOLLOW_spec_field_in_line_ap1080);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1087); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.6");}

            pushFollow(FOLLOW_spec_field_in_line_ap1091);
            spec_field("^[0-9]{1,15}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1098); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.7");}

            pushFollow(FOLLOW_spec_field_in_line_ap1102);
            spec_field("^.{1,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1109); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.8");}

            pushFollow(FOLLOW_spec_field_in_line_ap1113);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1120); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.9");}

            pushFollow(FOLLOW_spec_field_in_line_ap1124);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1131); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.10");}

            pushFollow(FOLLOW_spec_field_in_line_ap1135);
            spec_field("^[0-9]{1,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1142); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.11");}

            pushFollow(FOLLOW_spec_field_in_line_ap1146);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1153); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.12");}

            pushFollow(FOLLOW_spec_field_in_line_ap1157);
            spec_field("^.$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1164); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.13");}

            pushFollow(FOLLOW_spec_field_in_line_ap1168);
            spec_field("^.{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1175); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_ap1177);
            lvl1_fields("AP.14", ap_14, 6, "^.{1,48}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1182); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.15");}

            pushFollow(FOLLOW_spec_field_in_line_ap1186);
            spec_field("^.{0,24}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1193); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.16");}

            pushFollow(FOLLOW_spec_field_in_line_ap1197);
            spec_field("^[0-9]{1,6}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:391:3: ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==DELIMITER1) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:391:4: DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1205); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AP.17");}

                    pushFollow(FOLLOW_spec_field_in_line_ap1209);
                    spec_field("^[0-9]{0,9}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:392:4: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==DELIMITER1) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:392:5: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1218); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("AP.18");}

                            pushFollow(FOLLOW_spec_field_in_line_ap1222);
                            spec_field("^(O|N)?$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:393:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==DELIMITER1) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:393:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1232); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("AP.19");}

                                    pushFollow(FOLLOW_spec_field_in_line_ap1236);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    int alt80=2;
                                    int LA80_0 = input.LA(1);

                                    if ( (LA80_0==DELIMITER1) ) {
                                        alt80=1;
                                    }
                                    switch (alt80) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1247); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("AP.20");}

                                            pushFollow(FOLLOW_spec_field_in_line_ap1251);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:7: ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            int alt79=2;
                                            int LA79_0 = input.LA(1);

                                            if ( (LA79_0==DELIMITER1) ) {
                                                alt79=1;
                                            }
                                            switch (alt79) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:8: DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1263); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("AP.21");}

                                                    pushFollow(FOLLOW_spec_field_in_line_ap1268);
                                                    spec_field("^.{0,30}$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:396:8: ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    int alt78=2;
                                                    int LA78_0 = input.LA(1);

                                                    if ( (LA78_0==DELIMITER1) ) {
                                                        alt78=1;
                                                    }
                                                    switch (alt78) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:396:9: DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1281); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_in_line_ap1283);
                                                            lvl1_fields("AP.22", ap_22, 0, "^.{0,200}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            int alt77=2;
                                                            int LA77_0 = input.LA(1);

                                                            if ( (LA77_0==DELIMITER1) ) {
                                                                alt77=1;
                                                            }
                                                            switch (alt77) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1295); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("AP.23");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_ap1299);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:10: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    int alt76=2;
                                                                    int LA76_0 = input.LA(1);

                                                                    if ( (LA76_0==DELIMITER1) ) {
                                                                        alt76=1;
                                                                    }
                                                                    switch (alt76) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:11: DELIMITER1 spec_field[\"^$\", false, false]
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1314); if (state.failed) return ;

                                                                            pushFollow(FOLLOW_spec_field_in_line_ap1316);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:401:1: line_ac : CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_ac() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:403:23: ( CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:404:3: CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_ac1352); if (state.failed) return ;

            match(input,LINE_AC,FOLLOW_LINE_AC_in_line_ac1354); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.1");content("AC");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1360); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.2");}

            pushFollow(FOLLOW_spec_field_in_line_ac1364);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1371); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.3");}

            pushFollow(FOLLOW_spec_field_in_line_ac1375);
            spec_field("^.{1,9}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1382); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.4");}

            pushFollow(FOLLOW_spec_field_in_line_ac1386);
            spec_field("^.{1,15}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1393); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.5");}

            pushFollow(FOLLOW_spec_field_in_line_ac1397);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1404); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.6");}

            pushFollow(FOLLOW_spec_field_in_line_ac1408);
            spec_field("^[0-9]{6}(?:[0-9]{2})?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1415); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.7");}

            pushFollow(FOLLOW_spec_field_in_line_ac1419);
            spec_field("^.{0,28}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1426); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_ac1428);
            lvl1_fields("AC.8", ac_8, 3, "^.{10}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:412:3: ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==DELIMITER1) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:412:4: DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1434); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AC.9");}

                    pushFollow(FOLLOW_spec_field_in_line_ac1438);
                    spec_field("^.{0,40}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:4: ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==DELIMITER1) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:5: DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1447); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_ac1449);
                            lvl1_fields("AC.10", ac_10, 0, "^.{0,200}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==DELIMITER1) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:6: DELIMITER1 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1457); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_ac1459);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:417:1: line_act : CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? ;
    public final void line_act() throws RecognitionException {
        startElement("ACT");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:419:23: ( CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:420:3: CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )?
            {
            match(input,CR,FOLLOW_CR_in_line_act1485); if (state.failed) return ;

            match(input,LINE_ACT,FOLLOW_LINE_ACT_in_line_act1487); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.1");content("ACT");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1493); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.2");}

            pushFollow(FOLLOW_spec_field_in_line_act1497);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1504); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.3");}

            pushFollow(FOLLOW_spec_field_in_line_act1508);
            spec_field("^.{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1515); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.4");}

            pushFollow(FOLLOW_spec_field_in_line_act1519);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1526); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.5");}

            pushFollow(FOLLOW_spec_field_in_line_act1530);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1537); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.6");}

            pushFollow(FOLLOW_spec_field_in_line_act1541);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1548); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.7");}

            pushFollow(FOLLOW_spec_field_in_line_act1552);
            spec_field("^.{0,64000}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1559); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.8");}

            pushFollow(FOLLOW_spec_field_in_line_act1563);
            spec_field("^.{0,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1570); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_act1572);
            lvl1_fields("ACT.9", act_9, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1592); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_act1594);
            lvl1_fields("ACT.10", act_10, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:63: ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==REPETITEUR) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:64: REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_act1598); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_act1600);
            	    lvl1_fields("ACT.10", act_10, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1608); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.11");}

            pushFollow(FOLLOW_spec_field_in_line_act1612);
            spec_field("^(HR|RX|R)$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:436:3: ( DELIMITER1 spec_field[\"\", false, false] )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==DELIMITER1) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:436:4: DELIMITER1 spec_field[\"\", false, false]
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act1620); if (state.failed) return ;

                    pushFollow(FOLLOW_spec_field_in_line_act1622);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:1: line_c : CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:441:22: ( CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:442:3: CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_c1643); if (state.failed) return ;

            match(input,LINE_C,FOLLOW_LINE_C_in_line_c1645); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.1");content("C");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1652); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.2");}

            pushFollow(FOLLOW_spec_field_in_line_c1656);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:444:3: ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==DELIMITER1) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:444:4: DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1664); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("C.3");}

                    pushFollow(FOLLOW_spec_field_in_line_c1668);
                    spec_field("^(P|L)?$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:4: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==DELIMITER1) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:5: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1677); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("C.4");}

                            pushFollow(FOLLOW_spec_field_in_line_c1681);
                            spec_field("^.{0,64000}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:95: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==REPETITEUR) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:96: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c1687); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("C.4");}

                            	    pushFollow(FOLLOW_spec_field_in_line_c1691);
                            	    spec_field("^.{0,64000}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {endElement();}

                            	    }
                            	    break;

                            	default :
                            	    break loop89;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:446:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==DELIMITER1) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:446:6: DELIMITER1 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c1705); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_c1707);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:449:1: line_fac : CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )? ;
    public final void line_fac() throws RecognitionException {
        startElement("FAC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:23: ( CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:452:3: CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_fac1733); if (state.failed) return ;

            match(input,LINE_FAC,FOLLOW_LINE_FAC_in_line_fac1735); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.1");content("FAC");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1741); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.2");}

            pushFollow(FOLLOW_spec_field_in_line_fac1745);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1752); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.3");}

            pushFollow(FOLLOW_spec_field_in_line_fac1756);
            spec_field("^.{1,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1763); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.4");}

            pushFollow(FOLLOW_spec_field_in_line_fac1767);
            spec_field("^.{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1774); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.5");}

            pushFollow(FOLLOW_spec_field_in_line_fac1778);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:457:3: ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==DELIMITER1) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:457:4: DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1786); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_fac1788);
                    lvl1_fields("FAC.6", fac_6, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:458:4: ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==DELIMITER1) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:458:5: DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1795); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_fac1797);
                            lvl1_fields("FAC.7", fac_7, 0, "^.{0,60}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:459:5: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==DELIMITER1) ) {
                                alt94=1;
                            }
                            switch (alt94) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:459:6: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1805); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("FAC.8");}

                                    pushFollow(FOLLOW_spec_field_in_line_fac1809);
                                    spec_field("^(O|N)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:6: ( DELIMITER1 spec_field[\"\", false, false] )?
                                    int alt93=2;
                                    int LA93_0 = input.LA(1);

                                    if ( (LA93_0==DELIMITER1) ) {
                                        alt93=1;
                                    }
                                    switch (alt93) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:7: DELIMITER1 spec_field[\"\", false, false]
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1820); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_field_in_line_fac1822);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:465:1: start_line_h : LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,40}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:465:14: ( LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,40}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:466:3: LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,40}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"]
            {
            match(input,LINE_H,FOLLOW_LINE_H_in_start_line_h1844); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.1");content("H");endElement();}

            if ( state.backtracking==0 ) {startElement("H.2");}

            pushFollow(FOLLOW_delimiters_in_start_line_h1852);
            delimiters();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1858); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.3");}

            pushFollow(FOLLOW_spec_field_in_start_line_h1862);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1869); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.4");}

            pushFollow(FOLLOW_spec_field_in_start_line_h1873);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1880); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h1882);
            lvl1_fields("H.5", h_5, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1887); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h1889);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:474:1: midd_line_h : DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:474:13: ( DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:475:3: DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1901); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_midd_line_h1903);
            lvl1_fields_repet("H.8", h_8, 0, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1908); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.9");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1912);
            spec_field("^.{0,40}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1919); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_midd_line_h1921);
            lvl1_fields("H.10", h_10, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1926); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.11");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1930);
            spec_field("^.{0,80}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1937); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.12");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1941);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:482:1: bloc_line_h_2_2 : DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:482:17: ( DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:483:5: DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_21957); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_21961);
            spec_field("^H2\\.2$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_21979); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_21983);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:1: bloc_line_h_2_1 : DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:17: ( DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:486:5: DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_11997); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_12001);
            spec_field("^H2\\.1$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_12019); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_12023);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:1: bloc_line_h_2_0 : DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_0() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:17: ( DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:5: DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_02037); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_02041);
            spec_field("^H2\\.0$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_02059); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_02063);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:1: end_line_h : DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? ;
    public final void end_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:12: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:494:3: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h2079); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.14");}

            pushFollow(FOLLOW_spec_field_in_end_line_h2083);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:495:3: ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==DELIMITER1) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:495:4: DELIMITER1 ( spec_field[\"\", false, false] )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h2091); if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:495:15: ( spec_field[\"\", false, false] )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==CONTENT) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:495:15: spec_field[\"\", false, false]
                            {
                            pushFollow(FOLLOW_spec_field_in_end_line_h2093);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:1: start_line_h_adm : start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h ;
    public final void start_line_h_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:18: ( start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:3: start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_adm2108);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_adm2112); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_adm2116);
            spec_field("^ADM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_adm2123);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:503:1: line_h2_2_adm : start_line_h_adm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_adm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:23: ( start_line_h_adm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:506:3: start_line_h_adm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_2_adm2141);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm2145);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_adm2149);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:510:1: line_h2_1_adm : start_line_h_adm bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_adm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:512:23: ( start_line_h_adm bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:513:3: start_line_h_adm bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_1_adm2167);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_adm2171);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_adm2175);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:517:1: line_h2_0_adm : start_line_h_adm bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_adm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:23: ( start_line_h_adm bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:520:3: start_line_h_adm bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_0_adm2193);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_adm2197);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_adm2201);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:525:1: start_line_h_reg : start_line_h DELIMITER1 spec_field[\"^REG$\", true, true] midd_line_h ;
    public final void start_line_h_reg() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:525:18: ( start_line_h DELIMITER1 spec_field[\"^REG$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:526:3: start_line_h DELIMITER1 spec_field[\"^REG$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_reg2212);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_reg2216); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_reg2220);
            spec_field("^REG$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_reg2227);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:1: line_h2_2_reg : start_line_h_reg bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_reg() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:532:23: ( start_line_h_reg bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:533:3: start_line_h_reg bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_reg_in_line_h2_2_reg2245);
            start_line_h_reg();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_reg2249);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_reg2253);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:537:1: line_h2_1_reg : start_line_h_reg bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_reg() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:23: ( start_line_h_reg bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:540:3: start_line_h_reg bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_reg_in_line_h2_1_reg2271);
            start_line_h_reg();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_reg2275);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_reg2279);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:544:1: line_h2_0_reg : start_line_h_reg bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_reg() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:546:23: ( start_line_h_reg bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:3: start_line_h_reg bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_reg_in_line_h2_0_reg2297);
            start_line_h_reg();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_reg2301);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_reg2305);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:552:1: start_line_h_fac : start_line_h DELIMITER1 spec_field[\"^FAC$\", true, true] midd_line_h ;
    public final void start_line_h_fac() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:552:18: ( start_line_h DELIMITER1 spec_field[\"^FAC$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:553:3: start_line_h DELIMITER1 spec_field[\"^FAC$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_fac2316);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_fac2320); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_fac2324);
            spec_field("^FAC$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_fac2331);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:557:1: line_h2_2_fac : start_line_h_fac bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_fac() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:23: ( start_line_h_fac bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:560:3: start_line_h_fac bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_fac_in_line_h2_2_fac2349);
            start_line_h_fac();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_fac2353);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_fac2357);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:564:1: line_h2_1_fac : start_line_h_fac bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_fac() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:566:23: ( start_line_h_fac bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:3: start_line_h_fac bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_fac_in_line_h2_1_fac2375);
            start_line_h_fac();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_fac2379);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_fac2383);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:1: line_h2_0_fac : start_line_h_fac bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_fac() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:573:23: ( start_line_h_fac bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:574:3: start_line_h_fac bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_fac_in_line_h2_0_fac2401);
            start_line_h_fac();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_fac2405);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_fac2409);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:579:1: start_line_h_ora : start_line_h DELIMITER1 spec_field[\"^ORA$\", true, true] midd_line_h ;
    public final void start_line_h_ora() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:579:18: ( start_line_h DELIMITER1 spec_field[\"^ORA$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:580:3: start_line_h DELIMITER1 spec_field[\"^ORA$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_ora2420);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_ora2424); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_ora2428);
            spec_field("^ORA$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_ora2435);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:584:1: line_h2_2_ora : start_line_h_ora bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_ora() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:586:23: ( start_line_h_ora bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:587:3: start_line_h_ora bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_ora_in_line_h2_2_ora2453);
            start_line_h_ora();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_ora2457);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_ora2461);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:591:1: line_h2_1_ora : start_line_h_ora bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_ora() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:23: ( start_line_h_ora bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:594:3: start_line_h_ora bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_ora_in_line_h2_1_ora2479);
            start_line_h_ora();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_ora2483);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_ora2487);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:598:1: line_h2_0_ora : start_line_h_ora bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_ora() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:600:23: ( start_line_h_ora bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:3: start_line_h_ora bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_ora_in_line_h2_0_ora2505);
            start_line_h_ora();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_ora2509);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_ora2513);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:1: start_line_h_orm : start_line_h DELIMITER1 spec_field[\"^ORM$\", true, true] midd_line_h ;
    public final void start_line_h_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:18: ( start_line_h DELIMITER1 spec_field[\"^ORM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:607:3: start_line_h DELIMITER1 spec_field[\"^ORM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_orm2524);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_orm2528); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_orm2532);
            spec_field("^ORM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_orm2539);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:611:1: line_h2_2_orm : start_line_h_orm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:613:23: ( start_line_h_orm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:614:3: start_line_h_orm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_orm_in_line_h2_2_orm2557);
            start_line_h_orm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_orm2561);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_orm2565);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:618:1: line_h2_1_orm : start_line_h_orm bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:620:23: ( start_line_h_orm bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:621:3: start_line_h_orm bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_orm_in_line_h2_1_orm2583);
            start_line_h_orm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_orm2587);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_orm2591);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:1: line_h2_0_orm : start_line_h_orm bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:627:23: ( start_line_h_orm bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:3: start_line_h_orm bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_orm_in_line_h2_0_orm2609);
            start_line_h_orm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_orm2613);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_orm2617);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:1: start_line_h_oru : start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h ;
    public final void start_line_h_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:18: ( start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:634:3: start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_oru2628);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_oru2632); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_oru2636);
            spec_field("^ORU$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_oru2643);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:638:1: line_h2_2_oru : start_line_h_oru bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:640:23: ( start_line_h_oru bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:641:3: start_line_h_oru bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_2_oru2661);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru2665);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_oru2669);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:645:1: line_h2_1_oru : start_line_h_oru bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:647:23: ( start_line_h_oru bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:648:3: start_line_h_oru bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_1_oru2687);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru2691);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_oru2695);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:652:1: line_h2_0_oru : start_line_h_oru bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:654:23: ( start_line_h_oru bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:655:3: start_line_h_oru bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_0_oru2713);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru2717);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_oru2721);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:661:1: line_obr : CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields_repet[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:663:23: ( CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields_repet[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:664:3: CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields_repet[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2743); if (state.failed) return ;

            match(input,LINE_OBR,FOLLOW_LINE_OBR_in_line_obr2745); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.1");content("OBR");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2751); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.2");}

            pushFollow(FOLLOW_spec_field_in_line_obr2755);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2762); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr2764);
            lvl1_fields("OBR.3", obr_3, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2769); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr2771);
            lvl1_fields("OBR.4", obr_4, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2776); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr2778);
            lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:668:61: ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==REPETITEUR) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:668:62: REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2782); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_obr2784);
            	    lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2794); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.6");}

            pushFollow(FOLLOW_spec_field_in_line_obr2798);
            spec_field("^.{0,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:670:91: ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==REPETITEUR) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:670:92: REPETITEUR spec_field[\"^.{0,2}$\", true, false]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2804); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {startElement("OBR.6");}

            	    pushFollow(FOLLOW_spec_field_in_line_obr2808);
            	    spec_field("^.{0,2}$", true, false);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {endElement();}

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2817); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.7");}

            pushFollow(FOLLOW_spec_field_in_line_obr2821);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2828); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_line_obr2830);
            lvl1_fields_repet("OBR.8", obr_8, 0, ".*");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2835); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.9");}

            pushFollow(FOLLOW_spec_field_in_line_obr2839);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2849); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.10");}

            pushFollow(FOLLOW_spec_field_in_line_obr2853);
            spec_field("^.{0,20}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2860); if (state.failed) return ;

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2862);
            spec_sized_cna("OBR.11", obr_11, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2870); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.12");}

            pushFollow(FOLLOW_spec_field_in_line_obr2874);
            spec_field("^.{0,1}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:680:3: ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==DELIMITER1) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:680:4: DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2885); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obr2887);
                    lvl1_fields("OBR.13", obr_13, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:681:4: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==DELIMITER1) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:681:5: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2894); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBR.14");}

                            pushFollow(FOLLOW_spec_field_in_line_obr2898);
                            spec_field("^.{0,300}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:682:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt126=2;
                            int LA126_0 = input.LA(1);

                            if ( (LA126_0==DELIMITER1) ) {
                                alt126=1;
                            }
                            switch (alt126) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:682:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2908); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBR.15");}

                                    pushFollow(FOLLOW_spec_field_in_line_obr2912);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:6: ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt125=2;
                                    int LA125_0 = input.LA(1);

                                    if ( (LA125_0==DELIMITER1) ) {
                                        alt125=1;
                                    }
                                    switch (alt125) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:7: DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2923); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_obr_16_in_line_obr2925);
                                            spec_obr_16("OBR.16", obr_16, 0, "^.{0,300}$");

                                            state._fsp--;
                                            if (state.failed) return ;

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:684:7: ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt124=2;
                                            int LA124_0 = input.LA(1);

                                            if ( (LA124_0==DELIMITER1) ) {
                                                alt124=1;
                                            }
                                            switch (alt124) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:684:8: DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2935); if (state.failed) return ;

                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr2937);
                                                    lvl1_fields("OBR.17", obr_17, 0, "^.{0,60}$");

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:8: ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt123=2;
                                                    int LA123_0 = input.LA(1);

                                                    if ( (LA123_0==DELIMITER1) ) {
                                                        alt123=1;
                                                    }
                                                    switch (alt123) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:9: DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2948); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_repet_in_line_obr2950);
                                                            lvl1_fields_repet("OBR.18", obr_18, 0, "^.{0,40}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:9: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt122=2;
                                                            int LA122_0 = input.LA(1);

                                                            if ( (LA122_0==DELIMITER1) ) {
                                                                alt122=1;
                                                            }
                                                            switch (alt122) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:10: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2962); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBR.19");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_obr2966);
                                                                    spec_field("^.{0,60}$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:10: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt121=2;
                                                                    int LA121_0 = input.LA(1);

                                                                    if ( (LA121_0==DELIMITER1) ) {
                                                                        alt121=1;
                                                                    }
                                                                    switch (alt121) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:11: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2981); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBR.20");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_obr2985);
                                                                            spec_field("^.{0,60}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:688:11: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt120=2;
                                                                            int LA120_0 = input.LA(1);

                                                                            if ( (LA120_0==DELIMITER1) ) {
                                                                                alt120=1;
                                                                            }
                                                                            switch (alt120) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:688:12: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3001); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBR.21");}

                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3005);
                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:689:12: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt119=2;
                                                                                    int LA119_0 = input.LA(1);

                                                                                    if ( (LA119_0==DELIMITER1) ) {
                                                                                        alt119=1;
                                                                                    }
                                                                                    switch (alt119) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:689:13: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3022); if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {startElement("OBR.22");}

                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3026);
                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:13: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt118=2;
                                                                                            int LA118_0 = input.LA(1);

                                                                                            if ( (LA118_0==DELIMITER1) ) {
                                                                                                alt118=1;
                                                                                            }
                                                                                            switch (alt118) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:14: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3044); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.23");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3048);
                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:14: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt117=2;
                                                                                                    int LA117_0 = input.LA(1);

                                                                                                    if ( (LA117_0==DELIMITER1) ) {
                                                                                                        alt117=1;
                                                                                                    }
                                                                                                    switch (alt117) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:15: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3067); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.24");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3071);
                                                                                                            spec_field("^$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:692:15: ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt116=2;
                                                                                                            int LA116_0 = input.LA(1);

                                                                                                            if ( (LA116_0==DELIMITER1) ) {
                                                                                                                alt116=1;
                                                                                                            }
                                                                                                            switch (alt116) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:692:16: DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3091); if (state.failed) return ;

                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr3093);
                                                                                                                    lvl1_fields("OBR.25", obr_25, 0, "^.{0,10}$");

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:693:16: ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt115=2;
                                                                                                                    int LA115_0 = input.LA(1);

                                                                                                                    if ( (LA115_0==DELIMITER1) ) {
                                                                                                                        alt115=1;
                                                                                                                    }
                                                                                                                    switch (alt115) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:693:17: DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3112); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.26");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3116);
                                                                                                                            spec_field("^(F|P|M|I|R|C|O|D|X)?$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:17: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt114=2;
                                                                                                                            int LA114_0 = input.LA(1);

                                                                                                                            if ( (LA114_0==DELIMITER1) ) {
                                                                                                                                alt114=1;
                                                                                                                            }
                                                                                                                            switch (alt114) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:18: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3138); if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.27");}

                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3142);
                                                                                                                                    spec_field("^$", true, false);

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:18: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt113=2;
                                                                                                                                    int LA113_0 = input.LA(1);

                                                                                                                                    if ( (LA113_0==DELIMITER1) ) {
                                                                                                                                        alt113=1;
                                                                                                                                    }
                                                                                                                                    switch (alt113) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:19: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3165); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.28");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3169);
                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt112=2;
                                                                                                                                            int LA112_0 = input.LA(1);

                                                                                                                                            if ( (LA112_0==DELIMITER1) ) {
                                                                                                                                                alt112=1;
                                                                                                                                            }
                                                                                                                                            switch (alt112) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:20: DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3193); if (state.failed) return ;

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3195);
                                                                                                                                                    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:81: ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )*
                                                                                                                                                    loop101:
                                                                                                                                                    do {
                                                                                                                                                        int alt101=2;
                                                                                                                                                        int LA101_0 = input.LA(1);

                                                                                                                                                        if ( (LA101_0==REPETITEUR) ) {
                                                                                                                                                            alt101=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt101) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:82: REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr3199); if (state.failed) return ;

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3201);
                                                                                                                                                    	    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    	    state._fsp--;
                                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop101;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:697:20: ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt111=2;
                                                                                                                                                    int LA111_0 = input.LA(1);

                                                                                                                                                    if ( (LA111_0==DELIMITER1) ) {
                                                                                                                                                        alt111=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt111) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:697:21: DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3226); if (state.failed) return ;

                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_obr3228);
                                                                                                                                                            lvl1_fields("OBR.30", obr_30, 0, "^.{0,150}$");

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:698:21: ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt110=2;
                                                                                                                                                            int LA110_0 = input.LA(1);

                                                                                                                                                            if ( (LA110_0==DELIMITER1) ) {
                                                                                                                                                                alt110=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt110) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:698:22: DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3252); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.31");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3256);
                                                                                                                                                                    spec_field("^(PORT|CART|WHLC|WALK)?$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:22: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    int alt109=2;
                                                                                                                                                                    int LA109_0 = input.LA(1);

                                                                                                                                                                    if ( (LA109_0==DELIMITER1) ) {
                                                                                                                                                                        alt109=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt109) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:23: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3305); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3309);
                                                                                                                                                                            spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:114: ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )*
                                                                                                                                                                            loop102:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt102=2;
                                                                                                                                                                                int LA102_0 = input.LA(1);

                                                                                                                                                                                if ( (LA102_0==REPETITEUR) ) {
                                                                                                                                                                                    alt102=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt102) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:115: REPETITEUR spec_field[\"^.{0,300}$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr3315); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_obr3319);
                                                                                                                                                                            	    spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop102;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:701:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            int alt108=2;
                                                                                                                                                                            int LA108_0 = input.LA(1);

                                                                                                                                                                            if ( (LA108_0==DELIMITER1) ) {
                                                                                                                                                                                alt108=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt108) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:701:24: DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3349); if (state.failed) return ;

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3351);
                                                                                                                                                                                    spec_sized_cna("OBR.33", obr_33, 0, "^.{0,60}$");

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:702:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    int alt107=2;
                                                                                                                                                                                    int LA107_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA107_0==DELIMITER1) ) {
                                                                                                                                                                                        alt107=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt107) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:702:25: DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3378); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr3380);
                                                                                                                                                                                            spec_sized_cna("OBR.34", obr_34, 0, "^.{0,60}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:703:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            int alt106=2;
                                                                                                                                                                                            int LA106_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA106_0==DELIMITER1) ) {
                                                                                                                                                                                                alt106=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt106) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:703:26: DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3408); if (state.failed) return ;

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3410);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", obr_35, 0, "^.{0,60}$");

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:704:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    int alt105=2;
                                                                                                                                                                                                    int LA105_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA105_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt105=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt105) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:704:27: DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3439); if (state.failed) return ;

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr3441);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", obr_36, 0, "^.{0,60}$");

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:705:27: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            int alt104=2;
                                                                                                                                                                                                            int LA104_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA104_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt104=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt104) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:705:28: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3471); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.37");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr3475);
                                                                                                                                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:28: ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    int alt103=2;
                                                                                                                                                                                                                    int LA103_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA103_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt103=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt103) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:29: DELIMITER1 spec_field[\"^$\", true, false]
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3508); if (state.failed) return ;

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr3510);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:709:1: line_obx : CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) ;
    public final void line_obx() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:711:23: ( CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:712:3: CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx3582); if (state.failed) return ;

            match(input,LINE_OBX,FOLLOW_LINE_OBX_in_line_obx3584); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.1");content("OBX");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3590); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.2");}

            pushFollow(FOLLOW_spec_field_in_line_obx3594);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3601); if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:714:14: ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            int alt149=7;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==CONTENT) ) {
                int LA149_1 = input.LA(2);

                if ( (LA149_1==DELIMITER1) ) {
                    int LA149_2 = input.LA(3);

                    if ( (LA149_2==CONTENT) ) {
                        int LA149_3 = input.LA(4);

                        if ( (synpred19_HPRIMS()) ) {
                            alt149=1;
                        }
                        else if ( (synpred20_HPRIMS()) ) {
                            alt149=2;
                        }
                        else if ( (synpred21_HPRIMS()) ) {
                            alt149=3;
                        }
                        else if ( (synpred22_HPRIMS()) ) {
                            alt149=4;
                        }
                        else if ( (synpred23_HPRIMS()) ) {
                            alt149=5;
                        }
                        else if ( (synpred24_HPRIMS()) ) {
                            alt149=6;
                        }
                        else if ( (synpred25_HPRIMS()) ) {
                            alt149=7;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 149, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 149, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 149, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;

            }
            switch (alt149) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:5: ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:42: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3626);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3637); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3639);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:718:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==DELIMITER1) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:718:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3649); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3653);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:719:8: ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            int alt130=2;
                            int LA130_0 = input.LA(1);

                            if ( (LA130_0==DELIMITER1) ) {
                                alt130=1;
                            }
                            switch (alt130) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:719:9: DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3666); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx3670);
                                    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:720:25: ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )*
                                    loop129:
                                    do {
                                        int alt129=2;
                                        int LA129_0 = input.LA(1);

                                        if ( (LA129_0==REPETITEUR) ) {
                                            alt129=1;
                                        }


                                        switch (alt129) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:720:26: REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3684); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx3688);
                                    	    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop129;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx3703);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:724:6: ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:724:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:725:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3745);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3756); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3758);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:727:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==DELIMITER1) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:727:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3768); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3772);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt133=2;
                            int LA133_0 = input.LA(1);

                            if ( (LA133_0==DELIMITER1) ) {
                                alt133=1;
                            }
                            switch (alt133) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3785); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3787);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop132:
                                    do {
                                        int alt132=2;
                                        int LA132_0 = input.LA(1);

                                        if ( (LA132_0==REPETITEUR) ) {
                                            alt132=1;
                                        }


                                        switch (alt132) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3791); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx3793);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop132;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx3806);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:6: ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:44: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:733:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3848);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3859); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3861);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:735:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==DELIMITER1) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:735:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3871); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3875);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt136=2;
                            int LA136_0 = input.LA(1);

                            if ( (LA136_0==DELIMITER1) ) {
                                alt136=1;
                            }
                            switch (alt136) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3888); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3890);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop135:
                                    do {
                                        int alt135=2;
                                        int LA135_0 = input.LA(1);

                                        if ( (LA135_0==REPETITEUR) ) {
                                            alt135=1;
                                        }


                                        switch (alt135) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3894); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx3896);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop135;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx3909);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:6: ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:741:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3951);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3962); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3964);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:743:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==DELIMITER1) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:743:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3974); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3978);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt139=2;
                            int LA139_0 = input.LA(1);

                            if ( (LA139_0==DELIMITER1) ) {
                                alt139=1;
                            }
                            switch (alt139) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3991); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx3995);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop138:
                                    do {
                                        int alt138=2;
                                        int LA138_0 = input.LA(1);

                                        if ( (LA138_0==REPETITEUR) ) {
                                            alt138=1;
                                        }


                                        switch (alt138) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:744:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx4001); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx4003);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop138;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4016);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:6: ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:749:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx4058);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4069); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4071);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:751:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==DELIMITER1) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:751:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4081); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx4085);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt142=2;
                            int LA142_0 = input.LA(1);

                            if ( (LA142_0==DELIMITER1) ) {
                                alt142=1;
                            }
                            switch (alt142) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4098); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4100);
                                    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:70: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )*
                                    loop141:
                                    do {
                                        int alt141=2;
                                        int LA141_0 = input.LA(1);

                                        if ( (LA141_0==REPETITEUR) ) {
                                            alt141=1;
                                        }


                                        switch (alt141) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:752:71: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx4104); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx4106);
                                    	    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop141;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4119);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:6: ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:757:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx4161);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4172); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4174);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:759:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==DELIMITER1) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:759:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4184); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx4188);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:760:8: ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            int alt144=2;
                            int LA144_0 = input.LA(1);

                            if ( (LA144_0==DELIMITER1) ) {
                                alt144=1;
                            }
                            switch (alt144) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:760:9: DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4201); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                                    pushFollow(FOLLOW_tx_field_in_line_obx4205);
                                    tx_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4218);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:764:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:764:70: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:765:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx4260);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4271); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx4273);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:767:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==DELIMITER1) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:767:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4283); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx4287);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt147=2;
                            int LA147_0 = input.LA(1);

                            if ( (LA147_0==DELIMITER1) ) {
                                alt147=1;
                            }
                            switch (alt147) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx4300); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx4304);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop146:
                                    do {
                                        int alt146=2;
                                        int LA146_0 = input.LA(1);

                                        if ( (LA146_0==REPETITEUR) ) {
                                            alt146=1;
                                        }


                                        switch (alt146) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:768:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx4310); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx4314);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop146;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx4329);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:773:1: end_line_obx : ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void end_line_obx() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:773:13: ( ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:774:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:774:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==DELIMITER1) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:774:4: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4356); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("OBX.7");}

                    pushFollow(FOLLOW_spec_field_in_end_line_obx4360);
                    spec_field("^.{0,20}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:775:4: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==DELIMITER1) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:775:5: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4369); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.8");}

                            pushFollow(FOLLOW_spec_field_in_end_line_obx4373);
                            spec_field("^.{0,60}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:775:94: ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )*
                            loop150:
                            do {
                                int alt150=2;
                                int LA150_0 = input.LA(1);

                                if ( (LA150_0==REPETITEUR) ) {
                                    alt150=1;
                                }


                                switch (alt150) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:775:95: REPETITEUR spec_field[\"^.{0,60}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4379); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("OBX.8");}

                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx4383);
                            	    spec_field("^.{0,60}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop150;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:776:5: ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            int alt163=2;
                            int LA163_0 = input.LA(1);

                            if ( (LA163_0==DELIMITER1) ) {
                                alt163=1;
                            }
                            switch (alt163) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:776:6: DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4393); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4397);
                                    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:776:137: ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )*
                                    loop151:
                                    do {
                                        int alt151=2;
                                        int LA151_0 = input.LA(1);

                                        if ( (LA151_0==REPETITEUR) ) {
                                            alt151=1;
                                        }


                                        switch (alt151) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:776:138: REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4403); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx4407);
                                    	    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop151;
                                        }
                                    } while (true);


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:777:6: ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    int alt162=2;
                                    int LA162_0 = input.LA(1);

                                    if ( (LA162_0==DELIMITER1) ) {
                                        alt162=1;
                                    }
                                    switch (alt162) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:777:7: DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4420); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("OBX.10");}

                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4424);
                                            spec_field("^(?!.{6,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:778:7: ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            int alt161=2;
                                            int LA161_0 = input.LA(1);

                                            if ( (LA161_0==DELIMITER1) ) {
                                                alt161=1;
                                            }
                                            switch (alt161) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:778:8: DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4436); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4440);
                                                    spec_field("^(A|S|R|N)?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:778:101: ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )*
                                                    loop152:
                                                    do {
                                                        int alt152=2;
                                                        int LA152_0 = input.LA(1);

                                                        if ( (LA152_0==REPETITEUR) ) {
                                                            alt152=1;
                                                        }


                                                        switch (alt152) {
                                                    	case 1 :
                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:778:102: REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false]
                                                    	    {
                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4446); if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx4450);
                                                    	    spec_field("^(A|S|R|N)?$", true, false);

                                                    	    state._fsp--;
                                                    	    if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {endElement();}

                                                    	    }
                                                    	    break;

                                                    	default :
                                                    	    break loop152;
                                                        }
                                                    } while (true);


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:8: ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    int alt160=2;
                                                    int LA160_0 = input.LA(1);

                                                    if ( (LA160_0==DELIMITER1) ) {
                                                        alt160=1;
                                                    }
                                                    switch (alt160) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:9: DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4465); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4469);
                                                            spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:110: ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )*
                                                            loop153:
                                                            do {
                                                                int alt153=2;
                                                                int LA153_0 = input.LA(1);

                                                                if ( (LA153_0==REPETITEUR) ) {
                                                                    alt153=1;
                                                                }


                                                                switch (alt153) {
                                                            	case 1 :
                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:779:111: REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false]
                                                            	    {
                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx4475); if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx4479);
                                                            	    spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            	    state._fsp--;
                                                            	    if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                            	    }
                                                            	    break;

                                                            	default :
                                                            	    break loop153;
                                                                }
                                                            } while (true);


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:780:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            int alt159=2;
                                                            int LA159_0 = input.LA(1);

                                                            if ( (LA159_0==DELIMITER1) ) {
                                                                alt159=1;
                                                            }
                                                            switch (alt159) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:780:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4496); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBX.13");}

                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4500);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:781:10: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    int alt158=2;
                                                                    int LA158_0 = input.LA(1);

                                                                    if ( (LA158_0==DELIMITER1) ) {
                                                                        alt158=1;
                                                                    }
                                                                    switch (alt158) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:781:11: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4515); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4519);
                                                                            spec_field("^.{0,20}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:782:11: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            int alt157=2;
                                                                            int LA157_0 = input.LA(1);

                                                                            if ( (LA157_0==DELIMITER1) ) {
                                                                                alt157=1;
                                                                            }
                                                                            switch (alt157) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:782:12: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4535); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBX.15");}

                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4539);
                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:783:12: ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    int alt156=2;
                                                                                    int LA156_0 = input.LA(1);

                                                                                    if ( (LA156_0==DELIMITER1) ) {
                                                                                        alt156=1;
                                                                                    }
                                                                                    switch (alt156) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:783:13: DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4556); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_lvl1_fields_in_end_line_obx4558);
                                                                                            lvl1_fields("OBX.16", obx_16, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:784:13: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            int alt155=2;
                                                                                            int LA155_0 = input.LA(1);

                                                                                            if ( (LA155_0==DELIMITER1) ) {
                                                                                                alt155=1;
                                                                                            }
                                                                                            switch (alt155) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:784:14: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4574); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx4578);
                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:785:14: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    int alt154=2;
                                                                                                    int LA154_0 = input.LA(1);

                                                                                                    if ( (LA154_0==DELIMITER1) ) {
                                                                                                        alt154=1;
                                                                                                    }
                                                                                                    switch (alt154) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:785:15: DELIMITER1 spec_field[\"^$\", false, false]
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx4597); if (state.failed) return ;

                                                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx4599);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:788:1: line_p : CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:790:23: ( CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:791:3: CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p4643); if (state.failed) return ;

            match(input,LINE_P,FOLLOW_LINE_P_in_line_p4645); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.1");content("P");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4652); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.2");}

            pushFollow(FOLLOW_spec_field_in_line_p4656);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4663); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_p4665);
            lvl1_fields("P.3", p_3, 1, "^.{1,36}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4670); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.4");}

            pushFollow(FOLLOW_spec_field_in_line_p4674);
            spec_field("^.{0,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:795:3: ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==DELIMITER1) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:795:4: DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4682); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("P.5");}

                    pushFollow(FOLLOW_spec_field_in_line_p4686);
                    spec_field("^.{0,16}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:796:4: ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==DELIMITER1) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:796:5: DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4695); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_p4697);
                            lvl1_fields("P.6", p_6, 0, "^.{0,48}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:797:5: ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt198=2;
                            int LA198_0 = input.LA(1);

                            if ( (LA198_0==DELIMITER1) ) {
                                alt198=1;
                            }
                            switch (alt198) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:797:6: DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4705); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("P.7");}

                                    pushFollow(FOLLOW_spec_field_in_line_p4709);
                                    spec_field("^.{0,24}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:798:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt197=2;
                                    int LA197_0 = input.LA(1);

                                    if ( (LA197_0==DELIMITER1) ) {
                                        alt197=1;
                                    }
                                    switch (alt197) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:798:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4720); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("P.8");}

                                            pushFollow(FOLLOW_spec_field_in_line_p4724);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:799:7: ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt196=2;
                                            int LA196_0 = input.LA(1);

                                            if ( (LA196_0==DELIMITER1) ) {
                                                alt196=1;
                                            }
                                            switch (alt196) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:799:8: DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4736); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("P.9");}

                                                    pushFollow(FOLLOW_spec_field_in_line_p4740);
                                                    spec_field("^[M|F|U]?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:800:8: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt195=2;
                                                    int LA195_0 = input.LA(1);

                                                    if ( (LA195_0==DELIMITER1) ) {
                                                        alt195=1;
                                                    }
                                                    switch (alt195) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:800:9: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4753); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("P.10");}

                                                            pushFollow(FOLLOW_spec_field_in_line_p4757);
                                                            spec_field("^$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:801:9: ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt194=2;
                                                            int LA194_0 = input.LA(1);

                                                            if ( (LA194_0==DELIMITER1) ) {
                                                                alt194=1;
                                                            }
                                                            switch (alt194) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:801:10: DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4771); if (state.failed) return ;

                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p4773);
                                                                    lvl1_fields("P.11", p_11, 0, "^.{0,200}$");

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:802:10: ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt193=2;
                                                                    int LA193_0 = input.LA(1);

                                                                    if ( (LA193_0==DELIMITER1) ) {
                                                                        alt193=1;
                                                                    }
                                                                    switch (alt193) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:802:11: DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4786); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("P.12");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_p4790);
                                                                            spec_field("^.{0,120}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:803:11: ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt192=2;
                                                                            int LA192_0 = input.LA(1);

                                                                            if ( (LA192_0==DELIMITER1) ) {
                                                                                alt192=1;
                                                                            }
                                                                            switch (alt192) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:803:12: DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4806); if (state.failed) return ;

                                                                                    pushFollow(FOLLOW_lvl1_fields_repet_in_line_p4808);
                                                                                    lvl1_fields_repet("P.13", p_13, 0, "^.{0,40}$");

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:806:12: ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt191=2;
                                                                                    int LA191_0 = input.LA(1);

                                                                                    if ( (LA191_0==DELIMITER1) ) {
                                                                                        alt191=1;
                                                                                    }
                                                                                    switch (alt191) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:806:13: DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4847); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p4849);
                                                                                            spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:806:69: ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )*
                                                                                            loop166:
                                                                                            do {
                                                                                                int alt166=2;
                                                                                                int LA166_0 = input.LA(1);

                                                                                                if ( (LA166_0==REPETITEUR) ) {
                                                                                                    alt166=1;
                                                                                                }


                                                                                                switch (alt166) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:806:70: REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p4853); if (state.failed) return ;

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p4855);
                                                                                            	    spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            	    state._fsp--;
                                                                                            	    if (state.failed) return ;

                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop166;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:807:13: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt190=2;
                                                                                            int LA190_0 = input.LA(1);

                                                                                            if ( (LA190_0==DELIMITER1) ) {
                                                                                                alt190=1;
                                                                                            }
                                                                                            switch (alt190) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:807:14: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4873); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("P.15");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4877);
                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:808:14: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt189=2;
                                                                                                    int LA189_0 = input.LA(1);

                                                                                                    if ( (LA189_0==DELIMITER1) ) {
                                                                                                        alt189=1;
                                                                                                    }
                                                                                                    switch (alt189) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:808:15: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4896); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("P.16");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4900);
                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:810:15: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt188=2;
                                                                                                            int LA188_0 = input.LA(1);

                                                                                                            if ( (LA188_0==DELIMITER1) ) {
                                                                                                                alt188=1;
                                                                                                            }
                                                                                                            switch (alt188) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:810:16: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4935); if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {startElement("P.17");}

                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4939);
                                                                                                                    spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:812:16: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt187=2;
                                                                                                                    int LA187_0 = input.LA(1);

                                                                                                                    if ( (LA187_0==DELIMITER1) ) {
                                                                                                                        alt187=1;
                                                                                                                    }
                                                                                                                    switch (alt187) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:812:17: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4976); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("P.18");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4980);
                                                                                                                            spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:813:17: ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt186=2;
                                                                                                                            int LA186_0 = input.LA(1);

                                                                                                                            if ( (LA186_0==DELIMITER1) ) {
                                                                                                                                alt186=1;
                                                                                                                            }
                                                                                                                            switch (alt186) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:813:18: DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5002); if (state.failed) return ;

                                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p5004);
                                                                                                                                    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:813:72: ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )*
                                                                                                                                    loop167:
                                                                                                                                    do {
                                                                                                                                        int alt167=2;
                                                                                                                                        int LA167_0 = input.LA(1);

                                                                                                                                        if ( (LA167_0==REPETITEUR) ) {
                                                                                                                                            alt167=1;
                                                                                                                                        }


                                                                                                                                        switch (alt167) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:813:73: REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p5008); if (state.failed) return ;

                                                                                                                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_p5010);
                                                                                                                                    	    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    	    state._fsp--;
                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop167;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:814:18: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt185=2;
                                                                                                                                    int LA185_0 = input.LA(1);

                                                                                                                                    if ( (LA185_0==DELIMITER1) ) {
                                                                                                                                        alt185=1;
                                                                                                                                    }
                                                                                                                                    switch (alt185) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:814:19: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5033); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5037);
                                                                                                                                            spec_field("^.{0,200}$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:814:108: ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )*
                                                                                                                                            loop168:
                                                                                                                                            do {
                                                                                                                                                int alt168=2;
                                                                                                                                                int LA168_0 = input.LA(1);

                                                                                                                                                if ( (LA168_0==REPETITEUR) ) {
                                                                                                                                                    alt168=1;
                                                                                                                                                }


                                                                                                                                                switch (alt168) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:814:109: REPETITEUR spec_field[\"^.{0,200}$\", true, false]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p5043); if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p5047);
                                                                                                                                            	    spec_field("^.{0,200}$", true, false);

                                                                                                                                            	    state._fsp--;
                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop168;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:815:19: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt184=2;
                                                                                                                                            int LA184_0 = input.LA(1);

                                                                                                                                            if ( (LA184_0==DELIMITER1) ) {
                                                                                                                                                alt184=1;
                                                                                                                                            }
                                                                                                                                            switch (alt184) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:815:20: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5073); if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.21");}

                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5077);
                                                                                                                                                    spec_field("^.{0,200}$", true, false);

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:816:20: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt183=2;
                                                                                                                                                    int LA183_0 = input.LA(1);

                                                                                                                                                    if ( (LA183_0==DELIMITER1) ) {
                                                                                                                                                        alt183=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt183) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:816:21: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5102); if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.22");}

                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5106);
                                                                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:817:21: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt182=2;
                                                                                                                                                            int LA182_0 = input.LA(1);

                                                                                                                                                            if ( (LA182_0==DELIMITER1) ) {
                                                                                                                                                                alt182=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt182) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:817:22: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5132); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.23");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5136);
                                                                                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:22: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt181=2;
                                                                                                                                                                    int LA181_0 = input.LA(1);

                                                                                                                                                                    if ( (LA181_0==DELIMITER1) ) {
                                                                                                                                                                        alt181=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt181) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:23: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5163); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5167);
                                                                                                                                                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:156: ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )*
                                                                                                                                                                            loop169:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt169=2;
                                                                                                                                                                                int LA169_0 = input.LA(1);

                                                                                                                                                                                if ( (LA169_0==REPETITEUR) ) {
                                                                                                                                                                                    alt169=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt169) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:818:157: REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p5173); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p5177);
                                                                                                                                                                            	    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop169;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:819:23: ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt180=2;
                                                                                                                                                                            int LA180_0 = input.LA(1);

                                                                                                                                                                            if ( (LA180_0==DELIMITER1) ) {
                                                                                                                                                                                alt180=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt180) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:819:24: DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5207); if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.25");}

                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5211);
                                                                                                                                                                                    spec_field("^(OP|IP|ER|PA|MP)?^$", true, false);

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:820:24: ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt179=2;
                                                                                                                                                                                    int LA179_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA179_0==DELIMITER1) ) {
                                                                                                                                                                                        alt179=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt179) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:820:25: DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5240); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_p5242);
                                                                                                                                                                                            lvl1_fields("P.26", p_26, 0, "^.{0,100}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:822:25: ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt178=2;
                                                                                                                                                                                            int LA178_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA178_0==DELIMITER1) ) {
                                                                                                                                                                                                alt178=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt178) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:822:26: DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5295); if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.27");}

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5299);
                                                                                                                                                                                                    spec_field("^.{0,100}$", true, false);

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:823:26: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt177=2;
                                                                                                                                                                                                    int LA177_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA177_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt177=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt177) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:823:27: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5330); if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.28");}

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5334);
                                                                                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:825:27: ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt176=2;
                                                                                                                                                                                                            int LA176_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA176_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt176=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt176) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:825:28: DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5393); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.29");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5397);
                                                                                                                                                                                                                    spec_field("^.{0,2}$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:827:28: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt175=2;
                                                                                                                                                                                                                    int LA175_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA175_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt175=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt175) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:827:29: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5458); if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.30");}

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5462);
                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:828:29: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                                                                                                                                                                            int alt174=2;
                                                                                                                                                                                                                            int LA174_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA174_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt174=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt174) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:828:30: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5496); if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.31");}

                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5500);
                                                                                                                                                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:830:30: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                                                                                                                                                                                    int alt173=2;
                                                                                                                                                                                                                                    int LA173_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA173_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt173=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt173) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:830:31: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5565); if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.32");}

                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5569);
                                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:831:31: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                                                                                                                                                                            int alt172=2;
                                                                                                                                                                                                                                            int LA172_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA172_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt172=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt172) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:831:32: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5605); if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.33");}

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5609);
                                                                                                                                                                                                                                                    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:832:32: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                                                                                                                                                                                    int alt171=2;
                                                                                                                                                                                                                                                    int LA171_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA171_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt171=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt171) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:832:33: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5646); if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.34");}

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p5650);
                                                                                                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:833:33: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                                                                                                                                                                            int alt170=2;
                                                                                                                                                                                                                                                            int LA170_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA170_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt170=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt170) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:833:34: DELIMITER1 spec_field[\"^$\", false, false]
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p5688); if (state.failed) return ;

                                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p5690);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:836:1: line_reg : CR LINE_REG DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 lvl1_fields[\"REG.4\", reg_4, 2, \"^.{0,11}$\"] DELIMITER1 spec_field[\"^(?:\\\\+|-)$\", true, false] DELIMITER1 spec_field[\"^.{1,26}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? ;
    public final void line_reg() throws RecognitionException {
        startElement("REG");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:838:23: ( CR LINE_REG DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 lvl1_fields[\"REG.4\", reg_4, 2, \"^.{0,11}$\"] DELIMITER1 spec_field[\"^(?:\\\\+|-)$\", true, false] DELIMITER1 spec_field[\"^.{1,26}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:839:3: CR LINE_REG DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 lvl1_fields[\"REG.4\", reg_4, 2, \"^.{0,11}$\"] DELIMITER1 spec_field[\"^(?:\\\\+|-)$\", true, false] DELIMITER1 spec_field[\"^.{1,26}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_reg5772); if (state.failed) return ;

            match(input,LINE_REG,FOLLOW_LINE_REG_in_line_reg5774); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.1");content("REG");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5780); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.2");}

            pushFollow(FOLLOW_spec_field_in_line_reg5784);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5791); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.3");}

            pushFollow(FOLLOW_spec_field_in_line_reg5795);
            spec_field("^.{1,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5802); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_reg5804);
            lvl1_fields("REG.4", reg_4, 2, "^.{0,11}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5809); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.5");}

            pushFollow(FOLLOW_spec_field_in_line_reg5813);
            spec_field("^(?:\\+|-)$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5820); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("REG.6");}

            pushFollow(FOLLOW_spec_field_in_line_reg5824);
            spec_field("^.{1,26}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:846:3: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==DELIMITER1) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:846:4: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5835); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("REG.7");}

                    pushFollow(FOLLOW_spec_field_in_line_reg5839);
                    spec_field("^.{0,60}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:847:4: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                    int alt202=2;
                    int LA202_0 = input.LA(1);

                    if ( (LA202_0==DELIMITER1) ) {
                        alt202=1;
                    }
                    switch (alt202) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:847:5: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5848); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("REG.8");}

                            pushFollow(FOLLOW_spec_field_in_line_reg5852);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:848:5: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                            int alt201=2;
                            int LA201_0 = input.LA(1);

                            if ( (LA201_0==DELIMITER1) ) {
                                alt201=1;
                            }
                            switch (alt201) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:848:6: DELIMITER1 spec_field[\"^$\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_reg5862); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_reg5864);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:850:1: line_l : CR LINE_L ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? ;
    public final void line_l() throws RecognitionException {
        startElement("L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:852:22: ( CR LINE_L ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:853:3: CR LINE_L ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l5888); if (state.failed) return ;

            match(input,LINE_L,FOLLOW_LINE_L_in_line_l5890); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("L.1");content("L");endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:854:3: ( DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==DELIMITER1) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:854:4: DELIMITER1 spec_field[\"^[0-9]{0,1}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5897); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("L.2");}

                    pushFollow(FOLLOW_spec_field_in_line_l5901);
                    spec_field("^[0-9]{0,1}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:855:4: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                    int alt208=2;
                    int LA208_0 = input.LA(1);

                    if ( (LA208_0==DELIMITER1) ) {
                        alt208=1;
                    }
                    switch (alt208) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:855:5: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5910); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("L.3");}

                            pushFollow(FOLLOW_spec_field_in_line_l5914);
                            spec_field("^$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:856:5: ( DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                            int alt207=2;
                            int LA207_0 = input.LA(1);

                            if ( (LA207_0==DELIMITER1) ) {
                                alt207=1;
                            }
                            switch (alt207) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:856:6: DELIMITER1 spec_field[\"^[0-9]{0,4}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5924); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("L.4");}

                                    pushFollow(FOLLOW_spec_field_in_line_l5928);
                                    spec_field("^[0-9]{0,4}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:857:6: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                    int alt206=2;
                                    int LA206_0 = input.LA(1);

                                    if ( (LA206_0==DELIMITER1) ) {
                                        alt206=1;
                                    }
                                    switch (alt206) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:857:7: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5939); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("L.5");}

                                            pushFollow(FOLLOW_spec_field_in_line_l5943);
                                            spec_field("^[0-9]{0,10}$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:858:7: ( DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                            int alt205=2;
                                            int LA205_0 = input.LA(1);

                                            if ( (LA205_0==DELIMITER1) ) {
                                                alt205=1;
                                            }
                                            switch (alt205) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:858:8: DELIMITER1 spec_field[\"^.{0,12}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5955); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("L.6");}

                                                    pushFollow(FOLLOW_spec_field_in_line_l5959);
                                                    spec_field("^.{0,12}$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:859:8: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                    int alt204=2;
                                                    int LA204_0 = input.LA(1);

                                                    if ( (LA204_0==DELIMITER1) ) {
                                                        alt204=1;
                                                    }
                                                    switch (alt204) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:859:9: DELIMITER1 spec_field[\"^$\", false, false]
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l5972); if (state.failed) return ;

                                                            pushFollow(FOLLOW_spec_field_in_line_l5974);
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



    // $ANTLR start "spec_sized_cna"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:862:1: spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] :h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_sized_cna(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        HPRIMSParser.field_return h =null;

        String i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:864:22: (h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:865:3: h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            if ( state.backtracking==0 ) {startElement(nameElement + ".1");}

            pushFollow(FOLLOW_field_in_spec_sized_cna6010);
            h=field(true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:866:4: ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )?
            int alt211=2;
            int LA211_0 = input.LA(1);

            if ( (LA211_0==DELIMITER2) ) {
                alt211=1;
            }
            switch (alt211) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:866:5: DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna6019); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl2_fields_in_spec_sized_cna6023);
                    i=lvl2_fields(nameElement + ".2", patterns, nbMandatory, ".*");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:867:5: ( DELIMITER2 j= field[true] )?
                    int alt210=2;
                    int LA210_0 = input.LA(1);

                    if ( (LA210_0==DELIMITER2) ) {
                        alt210=1;
                    }
                    switch (alt210) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:867:6: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna6031); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_sized_cna6037);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:870:1: spec_obr_16[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_obr_16(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String h =null;

        HPRIMSParser.field_return i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:872:22: (h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:873:3: h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            pushFollow(FOLLOW_lvl2_fields_in_spec_obr_166068);
            h=lvl2_fields(nameElement + ".1", patterns, nbMandatory, ".*");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:874:3: ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )?
            int alt213=2;
            int LA213_0 = input.LA(1);

            if ( (LA213_0==DELIMITER2) ) {
                alt213=1;
            }
            switch (alt213) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:874:4: DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_166074); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement(nameElement + ".2");}

                    pushFollow(FOLLOW_field_in_spec_obr_166080);
                    i=field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:875:4: ( DELIMITER2 j= field[true] )?
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==DELIMITER2) ) {
                        alt212=1;
                    }
                    switch (alt212) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:875:5: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_166089); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_obr_166095);
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



    // $ANTLR start "lvl1_fields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:880:1: lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl1_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:882:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:883:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_fields6133);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:885:1: lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:885:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt216=3;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==CONTENT) ) {
                int LA216_1 = input.LA(2);

                if ( (LA216_1==DELIMITER2) && ((size < nbMandatory))) {
                    alt216=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt216=1;
                }
                else if ( (true) ) {
                    alt216=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 216, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 216, 0, input);

                throw nvae;

            }
            switch (alt216) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:886:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:886:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:886:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields6161);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:887:38: ({...}? DELIMITER2 spec_field[\"\", false, false] )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==DELIMITER2) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:887:39: {...}? DELIMITER2 spec_field[\"\", false, false]
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "strictNess <= 2");
                            }

                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields6206); if (state.failed) return contentText;

                            pushFollow(FOLLOW_spec_field_in_lvl1_subfields6208);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:890:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:890:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:890:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields6268);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields6305); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields6309);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:894:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:894:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:894:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields6358);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:895:6: ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt215=2;
                    int LA215_0 = input.LA(1);

                    if ( (LA215_0==DELIMITER2) ) {
                        alt215=1;
                    }
                    else if ( ((LA215_0 >= CR && LA215_0 <= DELIMITER1)||LA215_0==REPETITEUR) ) {
                        alt215=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 215, 0, input);

                        throw nvae;

                    }
                    switch (alt215) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:895:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:895:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:895:8: DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields6370); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields6374);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:896:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:899:1: lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final void lvl1_fields_repet(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:901:23: (r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:902:3: r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet6417);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:904:1: lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields_repet(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:904:173: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt220=3;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==CONTENT) ) {
                int LA220_1 = input.LA(2);

                if ( (LA220_1==REPETITEUR) && ((size < nbMandatory))) {
                    alt220=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt220=1;
                }
                else if ( (true) ) {
                    alt220=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 220, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 220, 0, input);

                throw nvae;

            }
            switch (alt220) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:905:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:905:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:905:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6441);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:906:38: ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |)
                    int alt218=2;
                    switch ( input.LA(1) ) {
                    case REPETITEUR:
                        {
                        alt218=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA218_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt218=1;
                        }
                        else if ( (true) ) {
                            alt218=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 218, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA218_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt218=1;
                        }
                        else if ( (true) ) {
                            alt218=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 218, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 218, 0, input);

                        throw nvae;

                    }

                    switch (alt218) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:906:39: {...}? ( REPETITEUR spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:906:58: ( REPETITEUR spec_field[\"\", false, false] )?
                            int alt217=2;
                            int LA217_0 = input.LA(1);

                            if ( (LA217_0==REPETITEUR) ) {
                                alt217=1;
                            }
                            switch (alt217) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:906:59: REPETITEUR spec_field[\"\", false, false]
                                    {
                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet6487); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6489);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:906:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:909:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:909:30: (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:909:31: g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6553);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet6590); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6594);
                    h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:913:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:913:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:913:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet6643);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:914:6: ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt219=2;
                    int LA219_0 = input.LA(1);

                    if ( (LA219_0==REPETITEUR) ) {
                        alt219=1;
                    }
                    else if ( ((LA219_0 >= CR && LA219_0 <= DELIMITER1)) ) {
                        alt219=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 219, 0, input);

                        throw nvae;

                    }
                    switch (alt219) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:914:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:914:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:914:8: REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet6655); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6659);
                            h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:915:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:919:1: lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl2_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:921:23: (r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:922:3: r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_fields6707);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:924:1: lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl2_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:924:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt224=3;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==CONTENT) ) {
                int LA224_1 = input.LA(2);

                if ( (LA224_1==DELIMITER3) && ((size < nbMandatory))) {
                    alt224=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt224=1;
                }
                else if ( (true) ) {
                    alt224=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 224, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 224, 0, input);

                throw nvae;

            }
            switch (alt224) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:925:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:925:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:925:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields6733);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:926:38: ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |)
                    int alt222=2;
                    switch ( input.LA(1) ) {
                    case DELIMITER3:
                        {
                        alt222=1;
                        }
                        break;
                    case DELIMITER2:
                        {
                        int LA222_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt222=1;
                        }
                        else if ( (true) ) {
                            alt222=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 222, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA222_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt222=1;
                        }
                        else if ( (true) ) {
                            alt222=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 222, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case REPETITEUR:
                        {
                        int LA222_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt222=1;
                        }
                        else if ( (true) ) {
                            alt222=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 222, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA222_5 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt222=1;
                        }
                        else if ( (true) ) {
                            alt222=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 222, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 222, 0, input);

                        throw nvae;

                    }

                    switch (alt222) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:926:39: {...}? ( DELIMITER3 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:926:58: ( DELIMITER3 spec_field[\"\", false, false] )?
                            int alt221=2;
                            int LA221_0 = input.LA(1);

                            if ( (LA221_0==DELIMITER3) ) {
                                alt221=1;
                            }
                            switch (alt221) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:926:59: DELIMITER3 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields6779); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields6781);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:926:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:929:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:929:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:929:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields6845);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields6882); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields6886);
                    h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:933:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:933:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:933:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields6935);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:934:6: ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==DELIMITER3) ) {
                        alt223=1;
                    }
                    else if ( ((LA223_0 >= CR && LA223_0 <= DELIMITER2)||LA223_0==REPETITEUR) ) {
                        alt223=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 223, 0, input);

                        throw nvae;

                    }
                    switch (alt223) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:934:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:934:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:934:8: DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields6947); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields6951);
                            h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:935:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:939:1: spec_field[String fieldPattern, boolean record, boolean forceRegex] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:939:69: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:940:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern, forceRegex))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field6989); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:945:1: field[boolean record] : CONTENT ;
    public final HPRIMSParser.field_return field(boolean record) throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:945:23: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:946:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field7005); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:950:1: tx_field[String fieldPattern, boolean record, boolean forceRegex] : tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] ;
    public final void tx_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:950:67: ( tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:951:3: tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex]
            {
            pushFollow(FOLLOW_tx_field_internal_in_tx_field7021);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:953:1: tx_field_internal[String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex] : (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) ;
    public final void tx_field_internal(String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex) throws RecognitionException {
        Token h=null;

        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:953:100: ( (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:954:3: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:954:4: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )?
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==CONTENT||(LA225_0 >= DELIMITER2 && LA225_0 <= DELIMITER3)) ) {
                alt225=1;
            }
            switch (alt225) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:954:4: h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:954:5: ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:954:6: ( CONTENT | DELIMITER2 | DELIMITER3 )
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:955:5: ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==REPETITEUR) ) {
                alt226=1;
            }
            else if ( ((LA226_0 >= CR && LA226_0 <= DELIMITER1)) ) {
                alt226=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 0, input);

                throw nvae;

            }
            switch (alt226) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:955:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:955:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:955:7: REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_tx_field_internal7058); if (state.failed) return ;

                    pushFollow(FOLLOW_tx_field_internal_in_tx_field_internal7060);
                    tx_field_internal(fieldPattern, recorded.append('\n'), record, forceRegex);

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:956:6: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:959:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:959:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:960:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters7086); if (state.failed) return retval;

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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:5: ( spec_field[\"^NM$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:6: spec_field[\"^NM$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred19_HPRIMS3610);
        spec_field("^NM$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_HPRIMS

    // $ANTLR start synpred20_HPRIMS
    public final void synpred20_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:724:6: ( spec_field[\"^CE$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:724:7: spec_field[\"^CE$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred20_HPRIMS3729);
        spec_field("^CE$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_HPRIMS

    // $ANTLR start synpred21_HPRIMS
    public final void synpred21_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:6: ( spec_field[\"^FIC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:7: spec_field[\"^FIC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred21_HPRIMS3832);
        spec_field("^FIC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_HPRIMS

    // $ANTLR start synpred22_HPRIMS
    public final void synpred22_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:6: ( spec_field[\"^ST$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:740:7: spec_field[\"^ST$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred22_HPRIMS3935);
        spec_field("^ST$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_HPRIMS

    // $ANTLR start synpred23_HPRIMS
    public final void synpred23_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:6: ( spec_field[\"^GC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:748:7: spec_field[\"^GC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred23_HPRIMS4042);
        spec_field("^GC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_HPRIMS

    // $ANTLR start synpred24_HPRIMS
    public final void synpred24_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:6: ( spec_field[\"^TX$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:756:7: spec_field[\"^TX$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred24_HPRIMS4145);
        spec_field("^TX$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_HPRIMS

    // $ANTLR start synpred25_HPRIMS
    public final void synpred25_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:764:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:764:7: spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred25_HPRIMS4244);
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
    public static final BitSet FOLLOW_line_p_in_body_p_adm695 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_adm698 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_ap_in_body_p_adm706 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_adm709 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_ac_in_body_p_adm718 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_adm721 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_fac739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ap_in_body_p_fac750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ac_in_body_p_fac762 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_fac_in_body_p_fac777 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac780 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_reg_in_body_p_fac789 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac792 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_act_in_body_p_fac803 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_fac806 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_ora824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ap_in_body_p_ora835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_ac_in_body_p_ora847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obr_in_body_p_ora861 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora864 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_obx_in_body_p_ora874 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora877 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_orm902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obr_in_body_p_orm913 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm916 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_obx_in_body_p_orm925 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm928 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_oru946 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obr_in_body_p_oru957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_obx_in_body_p_oru969 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru972 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_p_in_body_p_reg990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_c_in_body_p_reg993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_reg_in_body_p_reg1001 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_reg1004 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CR_in_line_ap1035 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LINE_AP_in_line_ap1037 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1047 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1058 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1069 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1080 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1091 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1113 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1157 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1168 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ap1177 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1186 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1197 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1209 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1222 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1236 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1251 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1268 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ap1283 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1299 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_ac1352 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LINE_AC_in_line_ac1354 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1364 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1375 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1386 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1408 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ac1428 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1438 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ac1449 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_act1485 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LINE_ACT_in_line_act1487 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1497 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1530 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1541 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1552 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act1572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act1594 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_act1598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act1600 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1612 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c1643 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LINE_C_in_line_c1645 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1656 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1668 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1681 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c1687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1691 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c1705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_fac1733 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LINE_FAC_in_line_fac1735 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1767 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1778 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_fac1788 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_fac1797 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1809 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_H_in_start_line_h1844 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h1852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h1862 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h1873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h1882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_midd_line_h1903 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_midd_line_h1921 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1930 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_21957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_21961 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_21979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_21983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_11997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_12001 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_12019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_02037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_02041 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_02059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_02063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h2079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h2083 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h2091 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_adm2108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_adm2112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_adm2116 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_adm2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_2_adm2141 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm2145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_adm2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_1_adm2167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_adm2171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_adm2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_0_adm2193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_adm2197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_adm2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_reg2212 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_reg2216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_reg2220 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_reg2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_reg_in_line_h2_2_reg2245 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_reg2249 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_reg2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_reg_in_line_h2_1_reg2271 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_reg2275 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_reg2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_reg_in_line_h2_0_reg2297 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_reg2301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_reg2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_fac2316 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_fac2320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_fac2324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_fac2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_fac_in_line_h2_2_fac2349 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_fac2353 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_fac2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_fac_in_line_h2_1_fac2375 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_fac2379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_fac2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_fac_in_line_h2_0_fac2401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_fac2405 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_fac2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_ora2420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_ora2424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_ora2428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_ora2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_ora_in_line_h2_2_ora2453 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_ora2457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_ora2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_ora_in_line_h2_1_ora2479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_ora2483 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_ora2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_ora_in_line_h2_0_ora2505 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_ora2509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_ora2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_orm2524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_orm2528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_orm2532 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_orm2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_orm_in_line_h2_2_orm2557 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_orm2561 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_orm2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_orm_in_line_h2_1_orm2583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_orm2587 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_orm2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_orm_in_line_h2_0_orm2609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_orm2613 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_orm2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_oru2628 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_oru2632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_oru2636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_oru2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_2_oru2661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru2665 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_oru2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_1_oru2687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru2691 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_oru2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_0_oru2713 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru2717 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_oru2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2743 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LINE_OBR_in_line_obr2745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2771 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2778 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2784 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2798 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2808 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2821 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_obr2830 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2839 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2862 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2874 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2887 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2898 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2912 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_obr_16_in_line_obr2925 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr2937 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_obr2950 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2966 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2985 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3005 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3026 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3048 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3071 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr3093 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3116 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3142 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3169 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3195 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr3199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3201 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr3228 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3256 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3309 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr3315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3319 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3351 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3380 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3410 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3441 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3475 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx3582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LINE_OBX_in_line_obx3584 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3594 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_line_obx3626 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3639 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3653 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3670 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3688 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx3745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3758 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3772 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3787 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3793 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx3848 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3861 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3875 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3890 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3896 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx3951 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3964 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3978 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3995 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx4001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4003 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx4058 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4071 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4085 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4100 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx4104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4106 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx4161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4174 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4188 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4201 = new BitSet(new long[]{0x0000000000400190L});
    public static final BitSet FOLLOW_tx_field_in_line_obx4205 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx4260 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx4273 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4287 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx4300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4304 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx4310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx4314 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4360 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4373 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4383 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4397 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4407 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4424 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4440 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4450 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4469 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx4475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4479 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4500 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4519 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4539 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_end_line_obx4558 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4578 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx4597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p4643 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LINE_P_in_line_p4645 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4656 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p4665 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4674 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4686 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p4697 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4709 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4724 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4740 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4757 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p4773 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4790 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_p4808 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p4849 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p4853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p4855 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4877 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4900 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4939 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4980 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p5004 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p5008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p5010 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5037 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p5043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5047 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5077 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5106 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5136 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5167 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p5173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5177 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5211 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p5242 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5299 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5334 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5397 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5462 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5500 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5569 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5609 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5650 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p5688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_reg5772 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LINE_REG_in_line_reg5774 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_reg5804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5813 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5824 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5839 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5852 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_reg5862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_reg5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l5888 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LINE_L_in_line_l5890 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5901 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5914 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5928 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5943 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5959 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l5972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_l5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna6010 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna6019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_sized_cna6023 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna6031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_obr_166068 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_166074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_166080 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_166089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_166095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_fields6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6161 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields6206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6268 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields6305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields6358 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields6370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6441 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet6487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6553 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet6590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet6643 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet6655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_fields6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields6733 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields6779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields6845 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields6882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields6935 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields6947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tx_field_internal7036 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_REPETITEUR_in_tx_field_internal7058 = new BitSet(new long[]{0x0000000000400190L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field_internal7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters7086 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_spec_field_in_synpred19_HPRIMS3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred20_HPRIMS3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred21_HPRIMS3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred22_HPRIMS3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred23_HPRIMS4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred24_HPRIMS4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred25_HPRIMS4244 = new BitSet(new long[]{0x0000000000000002L});

}