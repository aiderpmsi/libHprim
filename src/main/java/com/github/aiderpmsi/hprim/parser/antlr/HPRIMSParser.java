// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-06 00:28:46

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTENT", "CR", "DELIMITER1", "DELIMITER2", "DELIMITER3", "DELIMITERS", "LINE_AC", "LINE_ACT", "LINE_AP", "LINE_C", "LINE_FAC", "LINE_GENERIC", "LINE_H", "LINE_OBR", "LINE_OBX", "LINE_P", "REPETITEUR"
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
    public static final int LINE_OBR=17;
    public static final int LINE_OBX=18;
    public static final int LINE_P=19;
    public static final int REPETITEUR=20;

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

      /**
       * Indicateur définissant s'il faut ou non enregistrer le parsing.
       * Il permet de faire des recherches en avant (prédicats syntaxiques)
       * sans pour autant envoyer d'éléments au gestionnaire de contenu
       * qui pourrait se voir envoyer des données qui sont ensuite invalidées
       * (essai / erreur)
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




    // $ANTLR start "hprim"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:273:1: hprim[int strictNess] : ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) );
    public final void hprim(int strictNess) throws RecognitionException {
        this.strictNess = strictNess;startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:275:24: ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LINE_H) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred1_HPRIMS()) ) {
                    alt5=1;
                }
                else if ( (synpred2_HPRIMS()) ) {
                    alt5=2;
                }
                else if ( (synpred3_HPRIMS()) ) {
                    alt5=3;
                }
                else if ( (synpred4_HPRIMS()) ) {
                    alt5=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:276:3: ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:5: ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:6: line_h2_2_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_2");}

                    pushFollow(FOLLOW_line_h2_2_oru_in_hprim88);
                    line_h2_2_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:59: ( body_p_oru )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==CR) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:59: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim91);
                    	    body_p_oru();

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


                    match(input,EOF,FOLLOW_EOF_in_hprim94); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:279:3: ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:5: ( line_h2_1_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:6: line_h2_1_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_1");}

                    pushFollow(FOLLOW_line_h2_1_oru_in_hprim119);
                    line_h2_1_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:59: ( body_p_oru )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==CR) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:59: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim122);
                    	    body_p_oru();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_hprim125); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:282:3: ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:5: ( line_h2_0_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:6: line_h2_0_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_0");}

                    pushFollow(FOLLOW_line_h2_0_oru_in_hprim150);
                    line_h2_0_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:59: ( body_p_oru )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==CR) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:59: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim153);
                    	    body_p_oru();

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


                    match(input,EOF,FOLLOW_EOF_in_hprim156); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:285:3: ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:5: ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:6: line_h2_2_adm[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ADM.2_2");}

                    pushFollow(FOLLOW_line_h2_2_adm_in_hprim181);
                    line_h2_2_adm(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:59: ( body_p_oru )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==CR) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:59: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim184);
                    	    body_p_oru();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_hprim187); if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    }


                    }
                    break;

            }
            if ( state.backtracking==0 ) {endDocument();}
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



    // $ANTLR start "body_p_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:1: body_p_oru : ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* ) ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:12: ( ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:4: line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru204);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:11: ( line_c )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CR) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==LINE_C) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_oru207);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:291:4: ( line_obr ( line_c )* ( line_obx ( line_c )* )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==CR) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==LINE_OBR) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:291:5: line_obr ( line_c )* ( line_obx ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_obr_in_body_p_oru215);
            	    line_obr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:291:14: ( line_c )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==CR) ) {
            	            int LA7_1 = input.LA(2);

            	            if ( (LA7_1==LINE_C) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:291:15: line_c
            	    	    {
            	    	    pushFollow(FOLLOW_line_c_in_body_p_oru218);
            	    	    line_c();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:292:5: ( line_obx ( line_c )* )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==CR) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( (LA9_2==LINE_OBX) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:292:6: line_obx ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obx_in_body_p_oru227);
            	    	    line_obx();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:292:15: ( line_c )*
            	    	    loop8:
            	    	    do {
            	    	        int alt8=2;
            	    	        int LA8_0 = input.LA(1);

            	    	        if ( (LA8_0==CR) ) {
            	    	            int LA8_2 = input.LA(2);

            	    	            if ( (LA8_2==LINE_C) ) {
            	    	                alt8=1;
            	    	            }


            	    	        }


            	    	        switch (alt8) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:292:16: line_c
            	    	    	    {
            	    	    	    pushFollow(FOLLOW_line_c_in_body_p_oru230);
            	    	    	    line_c();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return ;

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop8;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "body_p_oru"



    // $ANTLR start "line_ap"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:297:1: line_ap : CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? ;
    public final void line_ap() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:23: ( CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:300:3: CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_ap258); if (state.failed) return ;

            match(input,LINE_AP,FOLLOW_LINE_AP_in_line_ap260); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.1");content("AP");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap266); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.2");}

            pushFollow(FOLLOW_spec_field_in_line_ap270);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap277); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.3");}

            pushFollow(FOLLOW_spec_field_in_line_ap281);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap288); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.4");}

            pushFollow(FOLLOW_spec_field_in_line_ap292);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap299); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.5");}

            pushFollow(FOLLOW_spec_field_in_line_ap303);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap310); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.6");}

            pushFollow(FOLLOW_spec_field_in_line_ap314);
            spec_field("^[0-9]{1,15}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap321); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.7");}

            pushFollow(FOLLOW_spec_field_in_line_ap325);
            spec_field("^.{1,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap332); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.8");}

            pushFollow(FOLLOW_spec_field_in_line_ap336);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap343); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.9");}

            pushFollow(FOLLOW_spec_field_in_line_ap347);
            spec_field("^[0-9]{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap354); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.10");}

            pushFollow(FOLLOW_spec_field_in_line_ap358);
            spec_field("^[0-9]{1,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap365); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.11");}

            pushFollow(FOLLOW_spec_field_in_line_ap369);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap376); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.12");}

            pushFollow(FOLLOW_spec_field_in_line_ap380);
            spec_field("^.$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap387); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.13");}

            pushFollow(FOLLOW_spec_field_in_line_ap391);
            spec_field("^.{1,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap398); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_ap400);
            lvl1_fields("AP.14", ap_14, 6, "^.{1,48}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap405); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.15");}

            pushFollow(FOLLOW_spec_field_in_line_ap409);
            spec_field("^.{0,24}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap416); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AP.16");}

            pushFollow(FOLLOW_spec_field_in_line_ap420);
            spec_field("^[0-9]{1,6}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:3: ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==DELIMITER1) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:4: DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap428); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AP.17");}

                    pushFollow(FOLLOW_spec_field_in_line_ap432);
                    spec_field("^[0-9]{0,9}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:4: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DELIMITER1) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:5: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap441); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("AP.18");}

                            pushFollow(FOLLOW_spec_field_in_line_ap445);
                            spec_field("^(O|N)?$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:318:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==DELIMITER1) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:318:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap455); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("AP.19");}

                                    pushFollow(FOLLOW_spec_field_in_line_ap459);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    int alt15=2;
                                    int LA15_0 = input.LA(1);

                                    if ( (LA15_0==DELIMITER1) ) {
                                        alt15=1;
                                    }
                                    switch (alt15) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap470); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("AP.20");}

                                            pushFollow(FOLLOW_spec_field_in_line_ap474);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:7: ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            int alt14=2;
                                            int LA14_0 = input.LA(1);

                                            if ( (LA14_0==DELIMITER1) ) {
                                                alt14=1;
                                            }
                                            switch (alt14) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:8: DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap486); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("AP.21");}

                                                    pushFollow(FOLLOW_spec_field_in_line_ap491);
                                                    spec_field("^.{0,30}$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:321:8: ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    int alt13=2;
                                                    int LA13_0 = input.LA(1);

                                                    if ( (LA13_0==DELIMITER1) ) {
                                                        alt13=1;
                                                    }
                                                    switch (alt13) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:321:9: DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap504); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_in_line_ap506);
                                                            lvl1_fields("AP.22", ap_22, 0, "^.{0,200}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            int alt12=2;
                                                            int LA12_0 = input.LA(1);

                                                            if ( (LA12_0==DELIMITER1) ) {
                                                                alt12=1;
                                                            }
                                                            switch (alt12) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap518); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("AP.23");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_ap522);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:10: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    int alt11=2;
                                                                    int LA11_0 = input.LA(1);

                                                                    if ( (LA11_0==DELIMITER1) ) {
                                                                        alt11=1;
                                                                    }
                                                                    switch (alt11) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:11: DELIMITER1 spec_field[\"^$\", false, false]
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap537); if (state.failed) return ;

                                                                            pushFollow(FOLLOW_spec_field_in_line_ap539);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:1: line_ac : CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_ac() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:328:23: ( CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:329:3: CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_ac575); if (state.failed) return ;

            match(input,LINE_AC,FOLLOW_LINE_AC_in_line_ac577); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.1");content("AC");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac583); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.2");}

            pushFollow(FOLLOW_spec_field_in_line_ac587);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac594); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.3");}

            pushFollow(FOLLOW_spec_field_in_line_ac598);
            spec_field("^.{1,9}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac605); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.4");}

            pushFollow(FOLLOW_spec_field_in_line_ac609);
            spec_field("^.{1,15}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac616); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.5");}

            pushFollow(FOLLOW_spec_field_in_line_ac620);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac627); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.6");}

            pushFollow(FOLLOW_spec_field_in_line_ac631);
            spec_field("^[0-9]{6}(?:[0-9]{2})?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac638); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("AC.7");}

            pushFollow(FOLLOW_spec_field_in_line_ac642);
            spec_field("^.{0,28}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac649); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_ac651);
            lvl1_fields("AC.8", ac_8, 3, "^.{10}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:337:3: ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DELIMITER1) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:337:4: DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac657); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AC.9");}

                    pushFollow(FOLLOW_spec_field_in_line_ac661);
                    spec_field("^.{0,40}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:338:4: ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DELIMITER1) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:338:5: DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac670); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_ac672);
                            lvl1_fields("AC.10", ac_10, 0, "^.{0,200}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==DELIMITER1) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:339:6: DELIMITER1 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac680); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_ac682);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:342:1: line_act : CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? ;
    public final void line_act() throws RecognitionException {
        startElement("ACT");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:344:23: ( CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:345:3: CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )?
            {
            match(input,CR,FOLLOW_CR_in_line_act708); if (state.failed) return ;

            match(input,LINE_ACT,FOLLOW_LINE_ACT_in_line_act710); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.1");content("ACT");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act716); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.2");}

            pushFollow(FOLLOW_spec_field_in_line_act720);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act727); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.3");}

            pushFollow(FOLLOW_spec_field_in_line_act731);
            spec_field("^.{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act738); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.4");}

            pushFollow(FOLLOW_spec_field_in_line_act742);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act749); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.5");}

            pushFollow(FOLLOW_spec_field_in_line_act753);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act760); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.6");}

            pushFollow(FOLLOW_spec_field_in_line_act764);
            spec_field("^(?!.{11,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act771); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.7");}

            pushFollow(FOLLOW_spec_field_in_line_act775);
            spec_field("^.{0,64000}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act782); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.8");}

            pushFollow(FOLLOW_spec_field_in_line_act786);
            spec_field("^.{0,3}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act793); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_act795);
            lvl1_fields("ACT.9", act_9, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act815); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_act817);
            lvl1_fields("ACT.10", act_10, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:63: ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==REPETITEUR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:64: REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_act821); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_act823);
            	    lvl1_fields("ACT.10", act_10, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act831); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("ACT.11");}

            pushFollow(FOLLOW_spec_field_in_line_act835);
            spec_field("^(HR|RX|R)$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:3: ( DELIMITER1 spec_field[\"\", false, false] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DELIMITER1) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:4: DELIMITER1 spec_field[\"\", false, false]
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_act843); if (state.failed) return ;

                    pushFollow(FOLLOW_spec_field_in_line_act845);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:1: line_c : CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:22: ( CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:367:3: CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_c866); if (state.failed) return ;

            match(input,LINE_C,FOLLOW_LINE_C_in_line_c868); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.1");content("C");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c875); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.2");}

            pushFollow(FOLLOW_spec_field_in_line_c879);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:369:3: ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DELIMITER1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:369:4: DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c887); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("C.3");}

                    pushFollow(FOLLOW_spec_field_in_line_c891);
                    spec_field("^(P|L)?$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:4: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DELIMITER1) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:5: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c900); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("C.4");}

                            pushFollow(FOLLOW_spec_field_in_line_c904);
                            spec_field("^.{0,64000}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:95: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==REPETITEUR) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:96: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c910); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("C.4");}

                            	    pushFollow(FOLLOW_spec_field_in_line_c914);
                            	    spec_field("^.{0,64000}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {endElement();}

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:371:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==DELIMITER1) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:371:6: DELIMITER1 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c928); if (state.failed) return ;

                                    pushFollow(FOLLOW_spec_field_in_line_c930);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:374:1: line_fac : CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )? ;
    public final void line_fac() throws RecognitionException {
        startElement("FAC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:376:23: ( CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:377:3: CR LINE_FAC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,16}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?\", true, false] ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_fac956); if (state.failed) return ;

            match(input,LINE_FAC,FOLLOW_LINE_FAC_in_line_fac958); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.1");content("FAC");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac964); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.2");}

            pushFollow(FOLLOW_spec_field_in_line_fac968);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac975); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.3");}

            pushFollow(FOLLOW_spec_field_in_line_fac979);
            spec_field("^.{1,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac986); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.4");}

            pushFollow(FOLLOW_spec_field_in_line_fac990);
            spec_field("^.{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac997); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("FAC.5");}

            pushFollow(FOLLOW_spec_field_in_line_fac1001);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:382:3: ( DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==DELIMITER1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:382:4: DELIMITER1 lvl1_fields[\"FAC.6\", fac_6, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1009); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_fac1011);
                    lvl1_fields("FAC.6", fac_6, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:383:4: ( DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==DELIMITER1) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:383:5: DELIMITER1 lvl1_fields[\"FAC.7\", fac_7, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1018); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_fac1020);
                            lvl1_fields("FAC.7", fac_7, 0, "^.{0,60}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:5: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==DELIMITER1) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:6: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1028); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("FAC.8");}

                                    pushFollow(FOLLOW_spec_field_in_line_fac1032);
                                    spec_field("^(O|N)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:385:6: ( DELIMITER1 spec_field[\"\", false, false] )?
                                    int alt28=2;
                                    int LA28_0 = input.LA(1);

                                    if ( (LA28_0==DELIMITER1) ) {
                                        alt28=1;
                                    }
                                    switch (alt28) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:385:7: DELIMITER1 spec_field[\"\", false, false]
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_fac1043); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_field_in_line_fac1045);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:390:1: start_line_h : LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:390:14: ( LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:391:3: LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"]
            {
            match(input,LINE_H,FOLLOW_LINE_H_in_start_line_h1067); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.1");content("H");endElement();}

            if ( state.backtracking==0 ) {startElement("H.2");}

            pushFollow(FOLLOW_delimiters_in_start_line_h1075);
            delimiters();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1081); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.3");}

            pushFollow(FOLLOW_spec_field_in_start_line_h1085);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1092); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.4");}

            pushFollow(FOLLOW_spec_field_in_start_line_h1096);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1103); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h1105);
            lvl1_fields("H.5", h_5, 2, "^.{0,15}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h1110); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h1112);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:399:1: midd_line_h : DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:399:13: ( DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:400:3: DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1124); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_midd_line_h1126);
            lvl1_fields_repet("H.8", h_8, 0, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1131); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.9");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1135);
            spec_field("^.{0,40}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1142); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_midd_line_h1144);
            lvl1_fields("H.10", h_10, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1149); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.11");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1153);
            spec_field("^.{0,80}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1160); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.12");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1164);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:407:1: bloc_line_h_2_2 : DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:407:17: ( DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:408:5: DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_21180); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_21184);
            spec_field("^H2\\.2$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_21202); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_21206);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:410:1: bloc_line_h_2_1 : DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:410:17: ( DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:411:5: DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_11220); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_11224);
            spec_field("^H2\\.1$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_11242); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_11246);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:1: bloc_line_h_2_0 : DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_0() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:17: ( DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:5: DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_01260); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_01264);
            spec_field("^H2\\.0$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_01282); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_01286);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:1: end_line_h : DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? ;
    public final void end_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:12: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:419:3: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h1302); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.14");}

            pushFollow(FOLLOW_spec_field_in_end_line_h1306);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:420:3: ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DELIMITER1) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:420:4: DELIMITER1 ( spec_field[\"\", false, false] )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h1314); if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:420:15: ( spec_field[\"\", false, false] )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==CONTENT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:420:15: spec_field[\"\", false, false]
                            {
                            pushFollow(FOLLOW_spec_field_in_end_line_h1316);
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



    // $ANTLR start "start_line_h_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:423:1: start_line_h_oru : start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h ;
    public final void start_line_h_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:423:18: ( start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:424:3: start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_oru1331);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_oru1335); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_oru1339);
            spec_field("^ORU$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_oru1346);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:428:1: line_h2_2_oru[boolean record] : start_line_h_oru bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:430:23: ( start_line_h_oru bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:431:3: start_line_h_oru bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_2_oru1365);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru1369);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_oru1373);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:435:1: line_h2_1_oru[boolean record] : start_line_h_oru bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:437:23: ( start_line_h_oru bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:438:3: start_line_h_oru bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_1_oru1392);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru1396);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_oru1400);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:442:1: line_h2_0_oru[boolean record] : start_line_h_oru bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:444:23: ( start_line_h_oru bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:3: start_line_h_oru bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_0_oru1419);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru1423);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_oru1427);
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



    // $ANTLR start "start_line_h_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:1: start_line_h_adm : start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h ;
    public final void start_line_h_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:18: ( start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:3: start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_adm1438);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_adm1442); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_adm1446);
            spec_field("^ADM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_adm1453);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:455:1: line_h2_2_adm[boolean record] : start_line_h_adm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_adm(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:457:23: ( start_line_h_adm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:458:3: start_line_h_adm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_2_adm1472);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm1476);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_adm1480);
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



    // $ANTLR start "line_obr"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:464:1: line_obr : CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:466:23: ( CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:467:3: CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr1502); if (state.failed) return ;

            match(input,LINE_OBR,FOLLOW_LINE_OBR_in_line_obr1504); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.1");content("OBR");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1510); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.2");}

            pushFollow(FOLLOW_spec_field_in_line_obr1514);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1521); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1523);
            lvl1_fields("OBR.3", obr_3, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1528); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1530);
            lvl1_fields("OBR.4", obr_4, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1535); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1537);
            lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:61: ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==REPETITEUR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:62: REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1541); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_obr1543);
            	    lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1553); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.6");}

            pushFollow(FOLLOW_spec_field_in_line_obr1557);
            spec_field("^.{0,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:91: ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==REPETITEUR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:92: REPETITEUR spec_field[\"^.{0,2}$\", true, false]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1563); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {startElement("OBR.6");}

            	    pushFollow(FOLLOW_spec_field_in_line_obr1567);
            	    spec_field("^.{0,2}$", true, false);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {endElement();}

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1576); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.7");}

            pushFollow(FOLLOW_spec_field_in_line_obr1580);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1587); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1589);
            lvl1_fields("OBR.8", obr_8, 0, ".*");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1594); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.9");}

            pushFollow(FOLLOW_spec_field_in_line_obr1598);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1608); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.10");}

            pushFollow(FOLLOW_spec_field_in_line_obr1612);
            spec_field("^.{0,20}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1619); if (state.failed) return ;

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr1621);
            spec_sized_cna("OBR.11", obr_11, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1629); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.12");}

            pushFollow(FOLLOW_spec_field_in_line_obr1633);
            spec_field("^.{0,1}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:483:3: ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==DELIMITER1) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:483:4: DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1644); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1646);
                    lvl1_fields("OBR.13", obr_13, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:484:4: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==DELIMITER1) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:484:5: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1653); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBR.14");}

                            pushFollow(FOLLOW_spec_field_in_line_obr1657);
                            spec_field("^.{0,300}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==DELIMITER1) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1667); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBR.15");}

                                    pushFollow(FOLLOW_spec_field_in_line_obr1671);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:486:6: ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt60=2;
                                    int LA60_0 = input.LA(1);

                                    if ( (LA60_0==DELIMITER1) ) {
                                        alt60=1;
                                    }
                                    switch (alt60) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:486:7: DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1682); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_obr_16_in_line_obr1684);
                                            spec_obr_16("OBR.16", obr_16, 0, "^.{0,300}$");

                                            state._fsp--;
                                            if (state.failed) return ;

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:7: ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt59=2;
                                            int LA59_0 = input.LA(1);

                                            if ( (LA59_0==DELIMITER1) ) {
                                                alt59=1;
                                            }
                                            switch (alt59) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:8: DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1694); if (state.failed) return ;

                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1696);
                                                    lvl1_fields("OBR.17", obr_17, 0, "^.{0,60}$");

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:8: ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt58=2;
                                                    int LA58_0 = input.LA(1);

                                                    if ( (LA58_0==DELIMITER1) ) {
                                                        alt58=1;
                                                    }
                                                    switch (alt58) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:9: DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1707); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_repet_in_line_obr1709);
                                                            lvl1_fields_repet("OBR.18", obr_18, 0, "^.{0,40}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:9: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt57=2;
                                                            int LA57_0 = input.LA(1);

                                                            if ( (LA57_0==DELIMITER1) ) {
                                                                alt57=1;
                                                            }
                                                            switch (alt57) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:10: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1721); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBR.19");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1725);
                                                                    spec_field("^.{0,60}$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:10: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt56=2;
                                                                    int LA56_0 = input.LA(1);

                                                                    if ( (LA56_0==DELIMITER1) ) {
                                                                        alt56=1;
                                                                    }
                                                                    switch (alt56) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:11: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1740); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBR.20");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1744);
                                                                            spec_field("^.{0,60}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:11: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt55=2;
                                                                            int LA55_0 = input.LA(1);

                                                                            if ( (LA55_0==DELIMITER1) ) {
                                                                                alt55=1;
                                                                            }
                                                                            switch (alt55) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:12: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1760); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBR.21");}

                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1764);
                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:492:12: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt54=2;
                                                                                    int LA54_0 = input.LA(1);

                                                                                    if ( (LA54_0==DELIMITER1) ) {
                                                                                        alt54=1;
                                                                                    }
                                                                                    switch (alt54) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:492:13: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1781); if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {startElement("OBR.22");}

                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1785);
                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:13: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt53=2;
                                                                                            int LA53_0 = input.LA(1);

                                                                                            if ( (LA53_0==DELIMITER1) ) {
                                                                                                alt53=1;
                                                                                            }
                                                                                            switch (alt53) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:14: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1803); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.23");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1807);
                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:494:14: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt52=2;
                                                                                                    int LA52_0 = input.LA(1);

                                                                                                    if ( (LA52_0==DELIMITER1) ) {
                                                                                                        alt52=1;
                                                                                                    }
                                                                                                    switch (alt52) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:494:15: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1826); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.24");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1830);
                                                                                                            spec_field("^$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:495:15: ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt51=2;
                                                                                                            int LA51_0 = input.LA(1);

                                                                                                            if ( (LA51_0==DELIMITER1) ) {
                                                                                                                alt51=1;
                                                                                                            }
                                                                                                            switch (alt51) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:495:16: DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1850); if (state.failed) return ;

                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1852);
                                                                                                                    lvl1_fields("OBR.25", obr_25, 0, "^.{0,10}$");

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:496:16: ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt50=2;
                                                                                                                    int LA50_0 = input.LA(1);

                                                                                                                    if ( (LA50_0==DELIMITER1) ) {
                                                                                                                        alt50=1;
                                                                                                                    }
                                                                                                                    switch (alt50) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:496:17: DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1871); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.26");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1875);
                                                                                                                            spec_field("^(F|P|M|I|R|C|O|D|X)?$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:17: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt49=2;
                                                                                                                            int LA49_0 = input.LA(1);

                                                                                                                            if ( (LA49_0==DELIMITER1) ) {
                                                                                                                                alt49=1;
                                                                                                                            }
                                                                                                                            switch (alt49) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:18: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1897); if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.27");}

                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1901);
                                                                                                                                    spec_field("^$", true, false);

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:18: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt48=2;
                                                                                                                                    int LA48_0 = input.LA(1);

                                                                                                                                    if ( (LA48_0==DELIMITER1) ) {
                                                                                                                                        alt48=1;
                                                                                                                                    }
                                                                                                                                    switch (alt48) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:19: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1924); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.28");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1928);
                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt47=2;
                                                                                                                                            int LA47_0 = input.LA(1);

                                                                                                                                            if ( (LA47_0==DELIMITER1) ) {
                                                                                                                                                alt47=1;
                                                                                                                                            }
                                                                                                                                            switch (alt47) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:20: DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1952); if (state.failed) return ;

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1954);
                                                                                                                                                    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:81: ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )*
                                                                                                                                                    loop36:
                                                                                                                                                    do {
                                                                                                                                                        int alt36=2;
                                                                                                                                                        int LA36_0 = input.LA(1);

                                                                                                                                                        if ( (LA36_0==REPETITEUR) ) {
                                                                                                                                                            alt36=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt36) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:82: REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1958); if (state.failed) return ;

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1960);
                                                                                                                                                    	    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    	    state._fsp--;
                                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop36;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:500:20: ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt46=2;
                                                                                                                                                    int LA46_0 = input.LA(1);

                                                                                                                                                    if ( (LA46_0==DELIMITER1) ) {
                                                                                                                                                        alt46=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt46) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:500:21: DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1985); if (state.failed) return ;

                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_obr1987);
                                                                                                                                                            lvl1_fields("OBR.30", obr_30, 0, "^.{0,150}$");

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:501:21: ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt45=2;
                                                                                                                                                            int LA45_0 = input.LA(1);

                                                                                                                                                            if ( (LA45_0==DELIMITER1) ) {
                                                                                                                                                                alt45=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt45) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:501:22: DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2011); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.31");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr2015);
                                                                                                                                                                    spec_field("^(PORT|CART|WHLC|WALK)?$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:503:22: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    int alt44=2;
                                                                                                                                                                    int LA44_0 = input.LA(1);

                                                                                                                                                                    if ( (LA44_0==DELIMITER1) ) {
                                                                                                                                                                        alt44=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt44) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:503:23: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2064); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr2068);
                                                                                                                                                                            spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:503:114: ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )*
                                                                                                                                                                            loop37:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt37=2;
                                                                                                                                                                                int LA37_0 = input.LA(1);

                                                                                                                                                                                if ( (LA37_0==REPETITEUR) ) {
                                                                                                                                                                                    alt37=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt37) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:503:115: REPETITEUR spec_field[\"^.{0,300}$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2074); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_obr2078);
                                                                                                                                                                            	    spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop37;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:504:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            int alt43=2;
                                                                                                                                                                            int LA43_0 = input.LA(1);

                                                                                                                                                                            if ( (LA43_0==DELIMITER1) ) {
                                                                                                                                                                                alt43=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt43) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:504:24: DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2108); if (state.failed) return ;

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2110);
                                                                                                                                                                                    spec_sized_cna("OBR.33", obr_33, 0, "^.{0,60}$");

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    int alt42=2;
                                                                                                                                                                                    int LA42_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA42_0==DELIMITER1) ) {
                                                                                                                                                                                        alt42=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt42) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:25: DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2137); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2139);
                                                                                                                                                                                            spec_sized_cna("OBR.34", obr_34, 0, "^.{0,60}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:506:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            int alt41=2;
                                                                                                                                                                                            int LA41_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA41_0==DELIMITER1) ) {
                                                                                                                                                                                                alt41=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt41) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:506:26: DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2167); if (state.failed) return ;

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2169);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", obr_35, 0, "^.{0,60}$");

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:507:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    int alt40=2;
                                                                                                                                                                                                    int LA40_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA40_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt40=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt40) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:507:27: DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2198); if (state.failed) return ;

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2200);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", obr_36, 0, "^.{0,60}$");

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:508:27: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            int alt39=2;
                                                                                                                                                                                                            int LA39_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA39_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt39=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt39) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:508:28: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2230); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.37");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr2234);
                                                                                                                                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:509:28: ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    int alt38=2;
                                                                                                                                                                                                                    int LA38_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA38_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt38=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt38) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:509:29: DELIMITER1 spec_field[\"^$\", true, false]
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2267); if (state.failed) return ;

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr2269);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:512:1: line_obx : CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) ;
    public final void line_obx() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:514:23: ( CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:515:3: CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2341); if (state.failed) return ;

            match(input,LINE_OBX,FOLLOW_LINE_OBX_in_line_obx2343); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.1");content("OBX");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2349); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.2");}

            pushFollow(FOLLOW_spec_field_in_line_obx2353);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2360); if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:517:14: ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            int alt84=7;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==CONTENT) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==DELIMITER1) ) {
                    int LA84_2 = input.LA(3);

                    if ( (LA84_2==CONTENT) ) {
                        int LA84_3 = input.LA(4);

                        if ( (synpred5_HPRIMS()) ) {
                            alt84=1;
                        }
                        else if ( (synpred6_HPRIMS()) ) {
                            alt84=2;
                        }
                        else if ( (synpred7_HPRIMS()) ) {
                            alt84=3;
                        }
                        else if ( (synpred8_HPRIMS()) ) {
                            alt84=4;
                        }
                        else if ( (synpred9_HPRIMS()) ) {
                            alt84=5;
                        }
                        else if ( (synpred10_HPRIMS()) ) {
                            alt84=6;
                        }
                        else if ( (synpred11_HPRIMS()) ) {
                            alt84=7;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 84, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:518:5: ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:518:42: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2385);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2396); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2398);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:521:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==DELIMITER1) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:521:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2408); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2412);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:522:8: ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==DELIMITER1) ) {
                                alt65=1;
                            }
                            switch (alt65) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:522:9: DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2425); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2429);
                                    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:25: ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )*
                                    loop64:
                                    do {
                                        int alt64=2;
                                        int LA64_0 = input.LA(1);

                                        if ( (LA64_0==REPETITEUR) ) {
                                            alt64=1;
                                        }


                                        switch (alt64) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:26: REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2443); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2447);
                                    	    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop64;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2462);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:6: ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:528:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2504);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2515); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2517);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DELIMITER1) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2527); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2531);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==DELIMITER1) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2544); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2546);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop67:
                                    do {
                                        int alt67=2;
                                        int LA67_0 = input.LA(1);

                                        if ( (LA67_0==REPETITEUR) ) {
                                            alt67=1;
                                        }


                                        switch (alt67) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2550); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2552);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop67;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2565);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:6: ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:44: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:536:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2607);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2618); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2620);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:538:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==DELIMITER1) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:538:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2630); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2634);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==DELIMITER1) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2647); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2649);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop70:
                                    do {
                                        int alt70=2;
                                        int LA70_0 = input.LA(1);

                                        if ( (LA70_0==REPETITEUR) ) {
                                            alt70=1;
                                        }


                                        switch (alt70) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2653); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2655);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop70;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2668);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:6: ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:544:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2710);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2721); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2723);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:546:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==DELIMITER1) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:546:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2733); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2737);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==DELIMITER1) ) {
                                alt74=1;
                            }
                            switch (alt74) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2750); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2754);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop73:
                                    do {
                                        int alt73=2;
                                        int LA73_0 = input.LA(1);

                                        if ( (LA73_0==REPETITEUR) ) {
                                            alt73=1;
                                        }


                                        switch (alt73) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2760); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2762);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop73;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2775);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:6: ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:552:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2817);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2828); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2830);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:554:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==DELIMITER1) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:554:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2840); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2844);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==DELIMITER1) ) {
                                alt77=1;
                            }
                            switch (alt77) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2857); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2859);
                                    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:70: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )*
                                    loop76:
                                    do {
                                        int alt76=2;
                                        int LA76_0 = input.LA(1);

                                        if ( (LA76_0==REPETITEUR) ) {
                                            alt76=1;
                                        }


                                        switch (alt76) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:71: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2863); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2865);
                                    	    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop76;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2878);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:6: ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:560:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2920);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2931); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2933);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==DELIMITER1) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2943); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2947);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:8: ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==DELIMITER1) ) {
                                alt79=1;
                            }
                            switch (alt79) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:9: DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2960); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                                    pushFollow(FOLLOW_tx_field_in_line_obx2964);
                                    tx_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2977);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:70: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:568:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx3019);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3030); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx3032);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:570:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==DELIMITER1) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:570:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3042); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx3046);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==DELIMITER1) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3059); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx3063);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop81:
                                    do {
                                        int alt81=2;
                                        int LA81_0 = input.LA(1);

                                        if ( (LA81_0==REPETITEUR) ) {
                                            alt81=1;
                                        }


                                        switch (alt81) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3069); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx3073);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop81;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx3088);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:576:1: end_line_obx : ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void end_line_obx() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:576:13: ( ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:577:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:577:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==DELIMITER1) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:577:4: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3115); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("OBX.7");}

                    pushFollow(FOLLOW_spec_field_in_end_line_obx3119);
                    spec_field("^.{0,20}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:4: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==DELIMITER1) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:5: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3128); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.8");}

                            pushFollow(FOLLOW_spec_field_in_end_line_obx3132);
                            spec_field("^.{0,60}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:94: ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )*
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==REPETITEUR) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:95: REPETITEUR spec_field[\"^.{0,60}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3138); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("OBX.8");}

                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx3142);
                            	    spec_field("^.{0,60}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop85;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:579:5: ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==DELIMITER1) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:579:6: DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3152); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3156);
                                    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:579:137: ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )*
                                    loop86:
                                    do {
                                        int alt86=2;
                                        int LA86_0 = input.LA(1);

                                        if ( (LA86_0==REPETITEUR) ) {
                                            alt86=1;
                                        }


                                        switch (alt86) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:579:138: REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3162); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx3166);
                                    	    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop86;
                                        }
                                    } while (true);


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:580:6: ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    int alt97=2;
                                    int LA97_0 = input.LA(1);

                                    if ( (LA97_0==DELIMITER1) ) {
                                        alt97=1;
                                    }
                                    switch (alt97) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:580:7: DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3179); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("OBX.10");}

                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3183);
                                            spec_field("^(?!.{6,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:581:7: ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            int alt96=2;
                                            int LA96_0 = input.LA(1);

                                            if ( (LA96_0==DELIMITER1) ) {
                                                alt96=1;
                                            }
                                            switch (alt96) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:581:8: DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3195); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3199);
                                                    spec_field("^(A|S|R|N)?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:581:101: ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )*
                                                    loop87:
                                                    do {
                                                        int alt87=2;
                                                        int LA87_0 = input.LA(1);

                                                        if ( (LA87_0==REPETITEUR) ) {
                                                            alt87=1;
                                                        }


                                                        switch (alt87) {
                                                    	case 1 :
                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:581:102: REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false]
                                                    	    {
                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3205); if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx3209);
                                                    	    spec_field("^(A|S|R|N)?$", true, false);

                                                    	    state._fsp--;
                                                    	    if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {endElement();}

                                                    	    }
                                                    	    break;

                                                    	default :
                                                    	    break loop87;
                                                        }
                                                    } while (true);


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:582:8: ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    int alt95=2;
                                                    int LA95_0 = input.LA(1);

                                                    if ( (LA95_0==DELIMITER1) ) {
                                                        alt95=1;
                                                    }
                                                    switch (alt95) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:582:9: DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3224); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3228);
                                                            spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:582:110: ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )*
                                                            loop88:
                                                            do {
                                                                int alt88=2;
                                                                int LA88_0 = input.LA(1);

                                                                if ( (LA88_0==REPETITEUR) ) {
                                                                    alt88=1;
                                                                }


                                                                switch (alt88) {
                                                            	case 1 :
                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:582:111: REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false]
                                                            	    {
                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3234); if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx3238);
                                                            	    spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            	    state._fsp--;
                                                            	    if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                            	    }
                                                            	    break;

                                                            	default :
                                                            	    break loop88;
                                                                }
                                                            } while (true);


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:583:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            int alt94=2;
                                                            int LA94_0 = input.LA(1);

                                                            if ( (LA94_0==DELIMITER1) ) {
                                                                alt94=1;
                                                            }
                                                            switch (alt94) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:583:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3255); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBX.13");}

                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3259);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:584:10: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    int alt93=2;
                                                                    int LA93_0 = input.LA(1);

                                                                    if ( (LA93_0==DELIMITER1) ) {
                                                                        alt93=1;
                                                                    }
                                                                    switch (alt93) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:584:11: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3274); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3278);
                                                                            spec_field("^.{0,20}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:585:11: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            int alt92=2;
                                                                            int LA92_0 = input.LA(1);

                                                                            if ( (LA92_0==DELIMITER1) ) {
                                                                                alt92=1;
                                                                            }
                                                                            switch (alt92) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:585:12: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3294); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBX.15");}

                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3298);
                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:586:12: ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    int alt91=2;
                                                                                    int LA91_0 = input.LA(1);

                                                                                    if ( (LA91_0==DELIMITER1) ) {
                                                                                        alt91=1;
                                                                                    }
                                                                                    switch (alt91) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:586:13: DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3315); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_lvl1_fields_in_end_line_obx3317);
                                                                                            lvl1_fields("OBX.16", obx_16, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:587:13: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            int alt90=2;
                                                                                            int LA90_0 = input.LA(1);

                                                                                            if ( (LA90_0==DELIMITER1) ) {
                                                                                                alt90=1;
                                                                                            }
                                                                                            switch (alt90) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:587:14: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3333); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3337);
                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:588:14: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    int alt89=2;
                                                                                                    int LA89_0 = input.LA(1);

                                                                                                    if ( (LA89_0==DELIMITER1) ) {
                                                                                                        alt89=1;
                                                                                                    }
                                                                                                    switch (alt89) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:588:15: DELIMITER1 spec_field[\"^$\", false, false]
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3356); if (state.failed) return ;

                                                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3358);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:591:1: line_p : CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:23: ( CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:594:3: CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p3402); if (state.failed) return ;

            match(input,LINE_P,FOLLOW_LINE_P_in_line_p3404); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.1");content("P");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3411); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.2");}

            pushFollow(FOLLOW_spec_field_in_line_p3415);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3422); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_p3424);
            lvl1_fields("P.3", p_3, 1, "^.{1,36}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3429); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.4");}

            pushFollow(FOLLOW_spec_field_in_line_p3433);
            spec_field("^.{0,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:598:3: ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==DELIMITER1) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:598:4: DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3441); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("P.5");}

                    pushFollow(FOLLOW_spec_field_in_line_p3445);
                    spec_field("^.{0,16}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:599:4: ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==DELIMITER1) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:599:5: DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3454); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_p3456);
                            lvl1_fields("P.6", p_6, 0, "^.{0,48}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:600:5: ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt133=2;
                            int LA133_0 = input.LA(1);

                            if ( (LA133_0==DELIMITER1) ) {
                                alt133=1;
                            }
                            switch (alt133) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:600:6: DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3464); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("P.7");}

                                    pushFollow(FOLLOW_spec_field_in_line_p3468);
                                    spec_field("^.{0,24}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt132=2;
                                    int LA132_0 = input.LA(1);

                                    if ( (LA132_0==DELIMITER1) ) {
                                        alt132=1;
                                    }
                                    switch (alt132) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3479); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("P.8");}

                                            pushFollow(FOLLOW_spec_field_in_line_p3483);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:602:7: ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt131=2;
                                            int LA131_0 = input.LA(1);

                                            if ( (LA131_0==DELIMITER1) ) {
                                                alt131=1;
                                            }
                                            switch (alt131) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:602:8: DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3495); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("P.9");}

                                                    pushFollow(FOLLOW_spec_field_in_line_p3499);
                                                    spec_field("^[M|F|U]?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:603:8: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt130=2;
                                                    int LA130_0 = input.LA(1);

                                                    if ( (LA130_0==DELIMITER1) ) {
                                                        alt130=1;
                                                    }
                                                    switch (alt130) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:603:9: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3512); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("P.10");}

                                                            pushFollow(FOLLOW_spec_field_in_line_p3516);
                                                            spec_field("^$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:604:9: ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt129=2;
                                                            int LA129_0 = input.LA(1);

                                                            if ( (LA129_0==DELIMITER1) ) {
                                                                alt129=1;
                                                            }
                                                            switch (alt129) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:604:10: DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3530); if (state.failed) return ;

                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p3532);
                                                                    lvl1_fields("P.11", p_11, 0, "^.{0,200}$");

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:10: ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt128=2;
                                                                    int LA128_0 = input.LA(1);

                                                                    if ( (LA128_0==DELIMITER1) ) {
                                                                        alt128=1;
                                                                    }
                                                                    switch (alt128) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:11: DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3545); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("P.12");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_p3549);
                                                                            spec_field("^.{0,120}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:11: ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt127=2;
                                                                            int LA127_0 = input.LA(1);

                                                                            if ( (LA127_0==DELIMITER1) ) {
                                                                                alt127=1;
                                                                            }
                                                                            switch (alt127) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:12: DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3565); if (state.failed) return ;

                                                                                    pushFollow(FOLLOW_lvl1_fields_repet_in_line_p3567);
                                                                                    lvl1_fields_repet("P.13", p_13, 0, "^.{0,40}$");

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:12: ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt126=2;
                                                                                    int LA126_0 = input.LA(1);

                                                                                    if ( (LA126_0==DELIMITER1) ) {
                                                                                        alt126=1;
                                                                                    }
                                                                                    switch (alt126) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:13: DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3606); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p3608);
                                                                                            spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:69: ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )*
                                                                                            loop101:
                                                                                            do {
                                                                                                int alt101=2;
                                                                                                int LA101_0 = input.LA(1);

                                                                                                if ( (LA101_0==REPETITEUR) ) {
                                                                                                    alt101=1;
                                                                                                }


                                                                                                switch (alt101) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:70: REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3612); if (state.failed) return ;

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p3614);
                                                                                            	    spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            	    state._fsp--;
                                                                                            	    if (state.failed) return ;

                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop101;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:610:13: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt125=2;
                                                                                            int LA125_0 = input.LA(1);

                                                                                            if ( (LA125_0==DELIMITER1) ) {
                                                                                                alt125=1;
                                                                                            }
                                                                                            switch (alt125) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:610:14: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3632); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("P.15");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3636);
                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:611:14: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt124=2;
                                                                                                    int LA124_0 = input.LA(1);

                                                                                                    if ( (LA124_0==DELIMITER1) ) {
                                                                                                        alt124=1;
                                                                                                    }
                                                                                                    switch (alt124) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:611:15: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3655); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("P.16");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3659);
                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:613:15: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt123=2;
                                                                                                            int LA123_0 = input.LA(1);

                                                                                                            if ( (LA123_0==DELIMITER1) ) {
                                                                                                                alt123=1;
                                                                                                            }
                                                                                                            switch (alt123) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:613:16: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3694); if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {startElement("P.17");}

                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3698);
                                                                                                                    spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:615:16: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt122=2;
                                                                                                                    int LA122_0 = input.LA(1);

                                                                                                                    if ( (LA122_0==DELIMITER1) ) {
                                                                                                                        alt122=1;
                                                                                                                    }
                                                                                                                    switch (alt122) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:615:17: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3735); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("P.18");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3739);
                                                                                                                            spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:616:17: ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt121=2;
                                                                                                                            int LA121_0 = input.LA(1);

                                                                                                                            if ( (LA121_0==DELIMITER1) ) {
                                                                                                                                alt121=1;
                                                                                                                            }
                                                                                                                            switch (alt121) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:616:18: DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3761); if (state.failed) return ;

                                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p3763);
                                                                                                                                    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:616:72: ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )*
                                                                                                                                    loop102:
                                                                                                                                    do {
                                                                                                                                        int alt102=2;
                                                                                                                                        int LA102_0 = input.LA(1);

                                                                                                                                        if ( (LA102_0==REPETITEUR) ) {
                                                                                                                                            alt102=1;
                                                                                                                                        }


                                                                                                                                        switch (alt102) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:616:73: REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3767); if (state.failed) return ;

                                                                                                                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_p3769);
                                                                                                                                    	    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    	    state._fsp--;
                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop102;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:617:18: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt120=2;
                                                                                                                                    int LA120_0 = input.LA(1);

                                                                                                                                    if ( (LA120_0==DELIMITER1) ) {
                                                                                                                                        alt120=1;
                                                                                                                                    }
                                                                                                                                    switch (alt120) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:617:19: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3792); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3796);
                                                                                                                                            spec_field("^.{0,200}$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:617:108: ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )*
                                                                                                                                            loop103:
                                                                                                                                            do {
                                                                                                                                                int alt103=2;
                                                                                                                                                int LA103_0 = input.LA(1);

                                                                                                                                                if ( (LA103_0==REPETITEUR) ) {
                                                                                                                                                    alt103=1;
                                                                                                                                                }


                                                                                                                                                switch (alt103) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:617:109: REPETITEUR spec_field[\"^.{0,200}$\", true, false]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3802); if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p3806);
                                                                                                                                            	    spec_field("^.{0,200}$", true, false);

                                                                                                                                            	    state._fsp--;
                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop103;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:618:19: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt119=2;
                                                                                                                                            int LA119_0 = input.LA(1);

                                                                                                                                            if ( (LA119_0==DELIMITER1) ) {
                                                                                                                                                alt119=1;
                                                                                                                                            }
                                                                                                                                            switch (alt119) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:618:20: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3832); if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.21");}

                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3836);
                                                                                                                                                    spec_field("^.{0,200}$", true, false);

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:619:20: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt118=2;
                                                                                                                                                    int LA118_0 = input.LA(1);

                                                                                                                                                    if ( (LA118_0==DELIMITER1) ) {
                                                                                                                                                        alt118=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt118) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:619:21: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3861); if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.22");}

                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3865);
                                                                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:620:21: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt117=2;
                                                                                                                                                            int LA117_0 = input.LA(1);

                                                                                                                                                            if ( (LA117_0==DELIMITER1) ) {
                                                                                                                                                                alt117=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt117) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:620:22: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3891); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.23");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3895);
                                                                                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:621:22: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt116=2;
                                                                                                                                                                    int LA116_0 = input.LA(1);

                                                                                                                                                                    if ( (LA116_0==DELIMITER1) ) {
                                                                                                                                                                        alt116=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt116) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:621:23: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3922); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3926);
                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:621:151: ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )*
                                                                                                                                                                            loop104:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt104=2;
                                                                                                                                                                                int LA104_0 = input.LA(1);

                                                                                                                                                                                if ( (LA104_0==REPETITEUR) ) {
                                                                                                                                                                                    alt104=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt104) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:621:152: REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3932); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p3936);
                                                                                                                                                                            	    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop104;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:622:23: ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt115=2;
                                                                                                                                                                            int LA115_0 = input.LA(1);

                                                                                                                                                                            if ( (LA115_0==DELIMITER1) ) {
                                                                                                                                                                                alt115=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt115) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:622:24: DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3966); if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.25");}

                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3970);
                                                                                                                                                                                    spec_field("^(OP|IP|ER|PA|MP)?^$", true, false);

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:623:24: ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt114=2;
                                                                                                                                                                                    int LA114_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA114_0==DELIMITER1) ) {
                                                                                                                                                                                        alt114=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt114) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:623:25: DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3999); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_p4001);
                                                                                                                                                                                            lvl1_fields("P.26", p_26, 0, "^.{0,100}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:25: ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt113=2;
                                                                                                                                                                                            int LA113_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA113_0==DELIMITER1) ) {
                                                                                                                                                                                                alt113=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt113) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:26: DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4054); if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.27");}

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4058);
                                                                                                                                                                                                    spec_field("^.{0,100}$", true, false);

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:626:26: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt112=2;
                                                                                                                                                                                                    int LA112_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA112_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt112=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt112) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:626:27: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4089); if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.28");}

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4093);
                                                                                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:27: ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt111=2;
                                                                                                                                                                                                            int LA111_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA111_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt111=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt111) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:28: DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4152); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.29");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4156);
                                                                                                                                                                                                                    spec_field("^.{0,2}$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:630:28: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt110=2;
                                                                                                                                                                                                                    int LA110_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA110_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt110=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt110) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:630:29: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4217); if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.30");}

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4221);
                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:631:29: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt109=2;
                                                                                                                                                                                                                            int LA109_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA109_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt109=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt109) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:631:30: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4255); if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.31");}

                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4259);
                                                                                                                                                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:30: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt108=2;
                                                                                                                                                                                                                                    int LA108_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA108_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt108=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt108) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:31: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4324); if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.32");}

                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4328);
                                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:634:31: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt107=2;
                                                                                                                                                                                                                                            int LA107_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA107_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt107=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt107) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:634:32: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4364); if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.33");}

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4368);
                                                                                                                                                                                                                                                    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:635:32: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt106=2;
                                                                                                                                                                                                                                                    int LA106_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA106_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt106=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt106) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:635:33: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4405); if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.34");}

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4409);
                                                                                                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:636:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt105=2;
                                                                                                                                                                                                                                                            int LA105_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA105_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt105=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt105) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:636:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4446); if (state.failed) return ;

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



    // $ANTLR start "spec_sized_cna"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:639:1: spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] :h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_sized_cna(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        HPRIMSParser.field_return h =null;

        String i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:641:22: (h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:642:3: h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            if ( state.backtracking==0 ) {startElement(nameElement + ".1");}

            pushFollow(FOLLOW_field_in_spec_sized_cna4530);
            h=field(true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:643:4: ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==DELIMITER2) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:643:5: DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4539); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl2_fields_in_spec_sized_cna4543);
                    i=lvl2_fields(nameElement + ".2", patterns, nbMandatory, ".*");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:644:5: ( DELIMITER2 j= field[true] )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==DELIMITER2) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:644:6: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4551); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_sized_cna4557);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:647:1: spec_obr_16[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_obr_16(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String h =null;

        HPRIMSParser.field_return i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:649:22: (h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:650:3: h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            pushFollow(FOLLOW_lvl2_fields_in_spec_obr_164588);
            h=lvl2_fields(nameElement + ".1", patterns, nbMandatory, ".*");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:651:3: ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==DELIMITER2) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:651:4: DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_164594); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement(nameElement + ".2");}

                    pushFollow(FOLLOW_field_in_spec_obr_164600);
                    i=field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:652:4: ( DELIMITER2 j= field[true] )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==DELIMITER2) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:652:5: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_164609); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_obr_164615);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:657:1: lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl1_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:659:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:660:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_fields4653);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:662:1: lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:662:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt142=3;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==CONTENT) ) {
                int LA142_1 = input.LA(2);

                if ( (LA142_1==DELIMITER2) && ((size < nbMandatory))) {
                    alt142=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt142=1;
                }
                else if ( (true) ) {
                    alt142=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;

            }
            switch (alt142) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:663:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:663:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:663:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4681);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:664:38: ({...}? DELIMITER2 spec_field[\"\", false, false] )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==DELIMITER2) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:664:39: {...}? DELIMITER2 spec_field[\"\", false, false]
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "strictNess <= 2");
                            }

                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4726); if (state.failed) return contentText;

                            pushFollow(FOLLOW_spec_field_in_lvl1_subfields4728);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4788);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4825); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields4829);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:671:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:671:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:671:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4878);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:6: ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==DELIMITER2) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==EOF||(LA141_0 >= CR && LA141_0 <= DELIMITER1)||LA141_0==REPETITEUR) ) {
                        alt141=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;

                    }
                    switch (alt141) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:8: DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4890); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields4894);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:673:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:676:1: lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final void lvl1_fields_repet(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:678:23: (r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:679:3: r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet4937);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:681:1: lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields_repet(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:681:173: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt146=3;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==CONTENT) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==REPETITEUR) && ((size < nbMandatory))) {
                    alt146=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt146=1;
                }
                else if ( (true) ) {
                    alt146=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;

            }
            switch (alt146) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:682:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:682:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:682:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4961);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:38: ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |)
                    int alt144=2;
                    switch ( input.LA(1) ) {
                    case REPETITEUR:
                        {
                        alt144=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA144_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt144=1;
                        }
                        else if ( (true) ) {
                            alt144=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA144_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt144=1;
                        }
                        else if ( (true) ) {
                            alt144=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA144_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt144=1;
                        }
                        else if ( (true) ) {
                            alt144=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 144, 0, input);

                        throw nvae;

                    }

                    switch (alt144) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:39: {...}? ( REPETITEUR spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:58: ( REPETITEUR spec_field[\"\", false, false] )?
                            int alt143=2;
                            int LA143_0 = input.LA(1);

                            if ( (LA143_0==REPETITEUR) ) {
                                alt143=1;
                            }
                            switch (alt143) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:59: REPETITEUR spec_field[\"\", false, false]
                                    {
                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet5007); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet5009);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:30: (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:31: g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet5073);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet5110); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet5114);
                    h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet5163);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:6: ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==REPETITEUR) ) {
                        alt145=1;
                    }
                    else if ( (LA145_0==EOF||(LA145_0 >= CR && LA145_0 <= DELIMITER1)) ) {
                        alt145=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 145, 0, input);

                        throw nvae;

                    }
                    switch (alt145) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:691:8: REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet5175); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet5179);
                            h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:692:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:1: lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl2_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:698:23: (r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:699:3: r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_fields5227);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:701:1: lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl2_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:701:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt150=3;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==CONTENT) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==DELIMITER3) && ((size < nbMandatory))) {
                    alt150=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt150=1;
                }
                else if ( (true) ) {
                    alt150=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 150, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;

            }
            switch (alt150) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:702:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:702:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:702:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5253);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:703:38: ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |)
                    int alt148=2;
                    switch ( input.LA(1) ) {
                    case DELIMITER3:
                        {
                        alt148=1;
                        }
                        break;
                    case DELIMITER2:
                        {
                        int LA148_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt148=1;
                        }
                        else if ( (true) ) {
                            alt148=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA148_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt148=1;
                        }
                        else if ( (true) ) {
                            alt148=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case REPETITEUR:
                        {
                        int LA148_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt148=1;
                        }
                        else if ( (true) ) {
                            alt148=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA148_5 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt148=1;
                        }
                        else if ( (true) ) {
                            alt148=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA148_6 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt148=1;
                        }
                        else if ( (true) ) {
                            alt148=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;

                    }

                    switch (alt148) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:703:39: {...}? ( DELIMITER3 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:703:58: ( DELIMITER3 spec_field[\"\", false, false] )?
                            int alt147=2;
                            int LA147_0 = input.LA(1);

                            if ( (LA147_0==DELIMITER3) ) {
                                alt147=1;
                            }
                            switch (alt147) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:703:59: DELIMITER3 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields5299); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5301);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:703:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5365);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields5402); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields5406);
                    h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:710:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:710:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:710:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5455);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:711:6: ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==DELIMITER3) ) {
                        alt149=1;
                    }
                    else if ( (LA149_0==EOF||(LA149_0 >= CR && LA149_0 <= DELIMITER2)||LA149_0==REPETITEUR) ) {
                        alt149=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 149, 0, input);

                        throw nvae;

                    }
                    switch (alt149) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:711:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:711:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:711:8: DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields5467); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields5471);
                            h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:712:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:1: spec_field[String fieldPattern, boolean record, boolean forceRegex] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:69: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:717:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern, forceRegex))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field5509); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:722:1: field[boolean record] : CONTENT ;
    public final HPRIMSParser.field_return field(boolean record) throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:722:23: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:723:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field5525); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:727:1: tx_field[String fieldPattern, boolean record, boolean forceRegex] : tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] ;
    public final void tx_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:727:67: ( tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:728:3: tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex]
            {
            pushFollow(FOLLOW_tx_field_internal_in_tx_field5541);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:730:1: tx_field_internal[String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex] : (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) ;
    public final void tx_field_internal(String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex) throws RecognitionException {
        Token h=null;

        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:730:100: ( (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:731:3: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:731:4: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==CONTENT||(LA151_0 >= DELIMITER2 && LA151_0 <= DELIMITER3)) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:731:4: h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:731:5: ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:731:6: ( CONTENT | DELIMITER2 | DELIMITER3 )
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:5: ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==REPETITEUR) ) {
                alt152=1;
            }
            else if ( (LA152_0==EOF||(LA152_0 >= CR && LA152_0 <= DELIMITER1)) ) {
                alt152=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;

            }
            switch (alt152) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:732:7: REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_tx_field_internal5578); if (state.failed) return ;

                    pushFollow(FOLLOW_tx_field_internal_in_tx_field_internal5580);
                    tx_field_internal(fieldPattern, recorded.append('\n'), record, forceRegex);

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:733:6: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:736:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:737:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5606); if (state.failed) return retval;

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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:276:3: ( line_h2_2_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:276:4: line_h2_2_oru[false]
        {
        pushFollow(FOLLOW_line_h2_2_oru_in_synpred1_HPRIMS75);
        line_h2_2_oru(false);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_HPRIMS

    // $ANTLR start synpred2_HPRIMS
    public final void synpred2_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:279:3: ( line_h2_1_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:279:4: line_h2_1_oru[false]
        {
        pushFollow(FOLLOW_line_h2_1_oru_in_synpred2_HPRIMS106);
        line_h2_1_oru(false);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_HPRIMS

    // $ANTLR start synpred3_HPRIMS
    public final void synpred3_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:282:3: ( line_h2_0_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:282:4: line_h2_0_oru[false]
        {
        pushFollow(FOLLOW_line_h2_0_oru_in_synpred3_HPRIMS137);
        line_h2_0_oru(false);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_HPRIMS

    // $ANTLR start synpred4_HPRIMS
    public final void synpred4_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:285:3: ( line_h2_2_adm[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:285:4: line_h2_2_adm[false]
        {
        pushFollow(FOLLOW_line_h2_2_adm_in_synpred4_HPRIMS168);
        line_h2_2_adm(false);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_HPRIMS

    // $ANTLR start synpred5_HPRIMS
    public final void synpred5_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:518:5: ( spec_field[\"^NM$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:518:6: spec_field[\"^NM$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred5_HPRIMS2369);
        spec_field("^NM$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_HPRIMS

    // $ANTLR start synpred6_HPRIMS
    public final void synpred6_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:6: ( spec_field[\"^CE$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:7: spec_field[\"^CE$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred6_HPRIMS2488);
        spec_field("^CE$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_HPRIMS

    // $ANTLR start synpred7_HPRIMS
    public final void synpred7_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:6: ( spec_field[\"^FIC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:7: spec_field[\"^FIC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred7_HPRIMS2591);
        spec_field("^FIC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_HPRIMS

    // $ANTLR start synpred8_HPRIMS
    public final void synpred8_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:6: ( spec_field[\"^ST$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:7: spec_field[\"^ST$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred8_HPRIMS2694);
        spec_field("^ST$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_HPRIMS

    // $ANTLR start synpred9_HPRIMS
    public final void synpred9_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:6: ( spec_field[\"^GC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:7: spec_field[\"^GC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred9_HPRIMS2801);
        spec_field("^GC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_HPRIMS

    // $ANTLR start synpred10_HPRIMS
    public final void synpred10_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:6: ( spec_field[\"^TX$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:7: spec_field[\"^TX$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred10_HPRIMS2904);
        spec_field("^TX$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_HPRIMS

    // $ANTLR start synpred11_HPRIMS
    public final void synpred11_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:7: spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred11_HPRIMS3003);
        spec_field("^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_HPRIMS

    // Delegated rules

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


 

    public static final BitSet FOLLOW_line_h2_2_oru_in_hprim88 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim91 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_hprim119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_hprim150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_hprim181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_oru204 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru207 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_obr_in_body_p_oru215 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru218 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_obx_in_body_p_oru227 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru230 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CR_in_line_ap258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LINE_AP_in_line_ap260 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap270 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap281 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap303 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap325 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap358 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap369 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap380 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap391 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ap400 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap409 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap420 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap432 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap445 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap459 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap474 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap491 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ap506 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap522 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ap539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_ac575 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LINE_AC_in_line_ac577 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac587 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac620 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac631 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac642 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ac651 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac661 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_ac672 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_ac682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_act708 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LINE_ACT_in_line_act710 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act720 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act731 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act742 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act753 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act786 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act817 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_act821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act823 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act835 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_act843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_act845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c866 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LINE_C_in_line_c868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c879 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c891 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c904 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c914 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_fac956 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LINE_FAC_in_line_fac958 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac968 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac979 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1001 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_fac1011 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_fac1020 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1032 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_fac1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_fac1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_H_in_start_line_h1067 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h1075 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h1085 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h1096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h1105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h1110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_midd_line_h1126 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_midd_line_h1144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1153 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_21180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_21184 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_21202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_21206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_11220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_11224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_11242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_01260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_01264 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_01282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_01286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h1302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h1306 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h1314 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_oru1331 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_oru1335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_oru1339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_oru1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_2_oru1365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru1369 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_oru1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_1_oru1392 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru1396 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_oru1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_0_oru1419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru1423 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_oru1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_adm1438 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_adm1442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_adm1446 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_adm1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_2_adm1472 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm1476 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_adm1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr1502 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LINE_OBR_in_line_obr1504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1523 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1530 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1537 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1543 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1557 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1567 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1580 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1589 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1621 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1633 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1646 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1657 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1671 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_obr_16_in_line_obr1684 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1696 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_obr1709 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1725 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1744 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1764 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1785 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1807 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1830 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1852 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1875 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1901 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1928 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1954 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1960 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1987 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2015 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2068 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2078 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2110 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2139 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2169 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2200 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2234 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2341 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LINE_OBX_in_line_obx2343 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2353 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_line_obx2385 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2398 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2412 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2429 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2447 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2517 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2531 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2546 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2552 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2620 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2634 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2649 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2655 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2710 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2723 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2737 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2754 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2762 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2817 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2830 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2844 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2859 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2865 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2920 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2933 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2947 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2960 = new BitSet(new long[]{0x0000000000100190L});
    public static final BitSet FOLLOW_tx_field_in_line_obx2964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx3019 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx3032 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3046 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3063 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx3073 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3119 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3132 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3142 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3156 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3166 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3183 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3199 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3209 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3228 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3238 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3259 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3278 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3298 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_end_line_obx3317 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3337 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p3402 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LINE_P_in_line_p3404 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3424 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3433 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3445 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3456 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3468 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3483 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3499 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3516 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3532 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3549 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_p3567 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p3608 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p3614 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3636 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3659 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3698 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3739 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3763 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3769 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3796 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3806 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3836 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3865 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3895 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3926 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3936 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3970 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p4001 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4058 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4093 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4156 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4221 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4259 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4328 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4368 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4409 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna4530 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_sized_cna4543 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_obr_164588 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_164594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_164600 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_164609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_164615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_fields4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4681 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4788 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4878 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4961 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet5007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet5073 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet5110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet5163 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet5175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_fields5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5253 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields5299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5365 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields5402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5455 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields5467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tx_field_internal5556 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_REPETITEUR_in_tx_field_internal5578 = new BitSet(new long[]{0x0000000000100190L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field_internal5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_synpred1_HPRIMS75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_synpred2_HPRIMS106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_synpred3_HPRIMS137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_synpred4_HPRIMS168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred5_HPRIMS2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred6_HPRIMS2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred7_HPRIMS2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred8_HPRIMS2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred9_HPRIMS2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred10_HPRIMS2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred11_HPRIMS3003 = new BitSet(new long[]{0x0000000000000002L});

}