// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-06 00:14:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTENT", "CR", "DELIMITER1", "DELIMITER2", "DELIMITER3", "DELIMITERS", "LINE_AC", "LINE_ACT", "LINE_AP", "LINE_C", "LINE_GENERIC", "LINE_H", "LINE_OBR", "LINE_OBX", "LINE_P", "REPETITEUR"
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
    public static final int LINE_GENERIC=14;
    public static final int LINE_H=15;
    public static final int LINE_OBR=16;
    public static final int LINE_OBX=17;
    public static final int LINE_P=18;
    public static final int REPETITEUR=19;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:1: hprim[int strictNess] : ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) );
    public final void hprim(int strictNess) throws RecognitionException {
        this.strictNess = strictNess;startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:273:24: ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:3: ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:275:5: ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:275:6: line_h2_2_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_2");}

                    pushFollow(FOLLOW_line_h2_2_oru_in_hprim88);
                    line_h2_2_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:275:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:275:59: body_p_oru
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:3: ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:5: ( line_h2_1_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:6: line_h2_1_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_1");}

                    pushFollow(FOLLOW_line_h2_1_oru_in_hprim119);
                    line_h2_1_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:59: body_p_oru
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:3: ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:5: ( line_h2_0_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:6: line_h2_0_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_0");}

                    pushFollow(FOLLOW_line_h2_0_oru_in_hprim150);
                    line_h2_0_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:281:59: body_p_oru
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:3: ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:5: ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:6: line_h2_2_adm[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ADM.2_2");}

                    pushFollow(FOLLOW_line_h2_2_adm_in_hprim181);
                    line_h2_2_adm(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:59: body_p_oru
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:1: body_p_oru : ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* ) ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:12: ( ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:288:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:288:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:288:4: line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru204);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:288:11: ( line_c )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:288:12: line_c
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:4: ( line_obr ( line_c )* ( line_obx ( line_c )* )* )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:5: line_obr ( line_c )* ( line_obx ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_obr_in_body_p_oru215);
            	    line_obr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:14: ( line_c )*
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
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:289:15: line_c
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


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:5: ( line_obx ( line_c )* )*
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
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:6: line_obx ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obx_in_body_p_oru227);
            	    	    line_obx();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:15: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:16: line_c
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:295:1: line_ap : CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? ;
    public final void line_ap() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:297:23: ( CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:298:3: CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
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

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:3: ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==DELIMITER1) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:4: DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap428); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AP.17");}

                    pushFollow(FOLLOW_spec_field_in_line_ap432);
                    spec_field("^[0-9]{0,9}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:315:4: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DELIMITER1) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:315:5: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap441); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("AP.18");}

                            pushFollow(FOLLOW_spec_field_in_line_ap445);
                            spec_field("^(O|N)?$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==DELIMITER1) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap455); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("AP.19");}

                                    pushFollow(FOLLOW_spec_field_in_line_ap459);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    int alt15=2;
                                    int LA15_0 = input.LA(1);

                                    if ( (LA15_0==DELIMITER1) ) {
                                        alt15=1;
                                    }
                                    switch (alt15) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap470); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("AP.20");}

                                            pushFollow(FOLLOW_spec_field_in_line_ap474);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:318:7: ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            int alt14=2;
                                            int LA14_0 = input.LA(1);

                                            if ( (LA14_0==DELIMITER1) ) {
                                                alt14=1;
                                            }
                                            switch (alt14) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:318:8: DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap486); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("AP.21");}

                                                    pushFollow(FOLLOW_spec_field_in_line_ap491);
                                                    spec_field("^.{0,30}$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:8: ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    int alt13=2;
                                                    int LA13_0 = input.LA(1);

                                                    if ( (LA13_0==DELIMITER1) ) {
                                                        alt13=1;
                                                    }
                                                    switch (alt13) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:9: DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap504); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_in_line_ap506);
                                                            lvl1_fields("AP.22", ap_22, 0, "^.{0,200}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            int alt12=2;
                                                            int LA12_0 = input.LA(1);

                                                            if ( (LA12_0==DELIMITER1) ) {
                                                                alt12=1;
                                                            }
                                                            switch (alt12) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap518); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("AP.23");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_ap522);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:321:10: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    int alt11=2;
                                                                    int LA11_0 = input.LA(1);

                                                                    if ( (LA11_0==DELIMITER1) ) {
                                                                        alt11=1;
                                                                    }
                                                                    switch (alt11) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:321:11: DELIMITER1 spec_field[\"^$\", false, false]
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:324:1: line_ac : CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_ac() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:23: ( CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:327:3: CR LINE_AC DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,9}$\", true, false] DELIMITER1 spec_field[\"^.{1,15}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?$\", true, false] DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2})?$\", true, false] DELIMITER1 spec_field[\"^.{0,28}$\", true, false] DELIMITER1 lvl1_fields[\"AC.8\", ac_8, 3, \"^.{10}$\"] ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
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

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:3: ( DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DELIMITER1) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:335:4: DELIMITER1 spec_field[\"^.{0,40}$\", true, false] ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac657); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AC.9");}

                    pushFollow(FOLLOW_spec_field_in_line_ac661);
                    spec_field("^.{0,40}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:336:4: ( DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DELIMITER1) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:336:5: DELIMITER1 lvl1_fields[\"AC.10\", ac_10, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac670); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_ac672);
                            lvl1_fields("AC.10", ac_10, 0, "^.{0,200}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:337:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==DELIMITER1) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:337:6: DELIMITER1 spec_field[\"\", false, false]
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:340:1: line_act : CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? ;
    public final void line_act() throws RecognitionException {
        startElement("ACT");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:342:23: ( CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:343:3: CR LINE_ACT DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.{1,10}$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^(?!.{11,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] DELIMITER1 spec_field[\"^.{0,3}$\", true, false] DELIMITER1 lvl1_fields[\"ACT.9\", act_9, 0, \"^.{0,60}$\"] DELIMITER1 lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^(HR|RX|R)$\", true, false] ( DELIMITER1 spec_field[\"\", false, false] )?
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

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:357:63: ( REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"] )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==REPETITEUR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:357:64: REPETITEUR lvl1_fields[\"ACT.10\", act_10, 0, \"^.{0,64000}$\"]
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

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:3: ( DELIMITER1 spec_field[\"\", false, false] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DELIMITER1) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:4: DELIMITER1 spec_field[\"\", false, false]
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:1: line_c : CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:22: ( CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:3: CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
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

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:367:3: ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DELIMITER1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:367:4: DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c887); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("C.3");}

                    pushFollow(FOLLOW_spec_field_in_line_c891);
                    spec_field("^(P|L)?$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:368:4: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DELIMITER1) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:368:5: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 spec_field[\"\", false, false] )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c900); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("C.4");}

                            pushFollow(FOLLOW_spec_field_in_line_c904);
                            spec_field("^.{0,64000}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:368:95: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==REPETITEUR) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:368:96: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
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


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:369:5: ( DELIMITER1 spec_field[\"\", false, false] )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==DELIMITER1) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:369:6: DELIMITER1 spec_field[\"\", false, false]
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



    // $ANTLR start "start_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:374:1: start_line_h : LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:374:14: ( LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:375:3: LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"]
            {
            match(input,LINE_H,FOLLOW_LINE_H_in_start_line_h950); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.1");content("H");endElement();}

            if ( state.backtracking==0 ) {startElement("H.2");}

            pushFollow(FOLLOW_delimiters_in_start_line_h958);
            delimiters();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h964); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.3");}

            pushFollow(FOLLOW_spec_field_in_start_line_h968);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h975); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.4");}

            pushFollow(FOLLOW_spec_field_in_start_line_h979);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h986); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h988);
            lvl1_fields("H.5", h_5, 2, "^.{0,15}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h993); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h995);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:383:1: midd_line_h : DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:383:13: ( DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:3: DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1007); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_midd_line_h1009);
            lvl1_fields_repet("H.8", h_8, 0, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1014); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.9");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1018);
            spec_field("^.{0,40}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1025); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_midd_line_h1027);
            lvl1_fields("H.10", h_10, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1032); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.11");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1036);
            spec_field("^.{0,80}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h1043); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.12");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h1047);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:391:1: bloc_line_h_2_2 : DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:391:17: ( DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:392:5: DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_21063); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_21067);
            spec_field("^H2\\.2$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_21085); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_21089);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:1: bloc_line_h_2_1 : DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:17: ( DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:5: DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_11103); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_11107);
            spec_field("^H2\\.1$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_11125); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_11129);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:1: bloc_line_h_2_0 : DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_0() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:17: ( DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:5: DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_01143); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_01147);
            spec_field("^H2\\.0$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_01165); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_01169);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:1: end_line_h : DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? ;
    public final void end_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:12: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:403:3: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h1185); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.14");}

            pushFollow(FOLLOW_spec_field_in_end_line_h1189);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:404:3: ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DELIMITER1) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:404:4: DELIMITER1 ( spec_field[\"\", false, false] )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h1197); if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:404:15: ( spec_field[\"\", false, false] )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==CONTENT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:404:15: spec_field[\"\", false, false]
                            {
                            pushFollow(FOLLOW_spec_field_in_end_line_h1199);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:407:1: start_line_h_oru : start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h ;
    public final void start_line_h_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:407:18: ( start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:408:3: start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_oru1214);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_oru1218); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_oru1222);
            spec_field("^ORU$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_oru1229);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:412:1: line_h2_2_oru[boolean record] : start_line_h_oru bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:23: ( start_line_h_oru bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:3: start_line_h_oru bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_2_oru1248);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru1252);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_oru1256);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:419:1: line_h2_1_oru[boolean record] : start_line_h_oru bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:421:23: ( start_line_h_oru bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:422:3: start_line_h_oru bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_1_oru1275);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru1279);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_oru1283);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:426:1: line_h2_0_oru[boolean record] : start_line_h_oru bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:428:23: ( start_line_h_oru bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:429:3: start_line_h_oru bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_0_oru1302);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru1306);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_oru1310);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:1: start_line_h_adm : start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h ;
    public final void start_line_h_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:18: ( start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:435:3: start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_adm1321);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_adm1325); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_adm1329);
            spec_field("^ADM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_adm1336);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:1: line_h2_2_adm[boolean record] : start_line_h_adm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_adm(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:441:23: ( start_line_h_adm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:442:3: start_line_h_adm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_2_adm1355);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm1359);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_adm1363);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:448:1: line_obr : CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:23: ( CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:3: CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr1385); if (state.failed) return ;

            match(input,LINE_OBR,FOLLOW_LINE_OBR_in_line_obr1387); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.1");content("OBR");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1393); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.2");}

            pushFollow(FOLLOW_spec_field_in_line_obr1397);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1404); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1406);
            lvl1_fields("OBR.3", obr_3, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1411); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1413);
            lvl1_fields("OBR.4", obr_4, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1418); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1420);
            lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:455:61: ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==REPETITEUR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:455:62: REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1424); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_obr1426);
            	    lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1436); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.6");}

            pushFollow(FOLLOW_spec_field_in_line_obr1440);
            spec_field("^.{0,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:457:91: ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==REPETITEUR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:457:92: REPETITEUR spec_field[\"^.{0,2}$\", true, false]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1446); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {startElement("OBR.6");}

            	    pushFollow(FOLLOW_spec_field_in_line_obr1450);
            	    spec_field("^.{0,2}$", true, false);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {endElement();}

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1459); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.7");}

            pushFollow(FOLLOW_spec_field_in_line_obr1463);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1470); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1472);
            lvl1_fields("OBR.8", obr_8, 0, ".*");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1477); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.9");}

            pushFollow(FOLLOW_spec_field_in_line_obr1481);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1491); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.10");}

            pushFollow(FOLLOW_spec_field_in_line_obr1495);
            spec_field("^.{0,20}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1502); if (state.failed) return ;

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr1504);
            spec_sized_cna("OBR.11", obr_11, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1512); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.12");}

            pushFollow(FOLLOW_spec_field_in_line_obr1516);
            spec_field("^.{0,1}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:467:3: ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==DELIMITER1) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:467:4: DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1527); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1529);
                    lvl1_fields("OBR.13", obr_13, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:468:4: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==DELIMITER1) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:468:5: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1536); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBR.14");}

                            pushFollow(FOLLOW_spec_field_in_line_obr1540);
                            spec_field("^.{0,300}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==DELIMITER1) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1550); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBR.15");}

                                    pushFollow(FOLLOW_spec_field_in_line_obr1554);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:470:6: ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt56=2;
                                    int LA56_0 = input.LA(1);

                                    if ( (LA56_0==DELIMITER1) ) {
                                        alt56=1;
                                    }
                                    switch (alt56) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:470:7: DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1565); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_obr_16_in_line_obr1567);
                                            spec_obr_16("OBR.16", obr_16, 0, "^.{0,300}$");

                                            state._fsp--;
                                            if (state.failed) return ;

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:7: ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt55=2;
                                            int LA55_0 = input.LA(1);

                                            if ( (LA55_0==DELIMITER1) ) {
                                                alt55=1;
                                            }
                                            switch (alt55) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:8: DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1577); if (state.failed) return ;

                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1579);
                                                    lvl1_fields("OBR.17", obr_17, 0, "^.{0,60}$");

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:472:8: ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt54=2;
                                                    int LA54_0 = input.LA(1);

                                                    if ( (LA54_0==DELIMITER1) ) {
                                                        alt54=1;
                                                    }
                                                    switch (alt54) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:472:9: DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1590); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_repet_in_line_obr1592);
                                                            lvl1_fields_repet("OBR.18", obr_18, 0, "^.{0,40}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:9: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt53=2;
                                                            int LA53_0 = input.LA(1);

                                                            if ( (LA53_0==DELIMITER1) ) {
                                                                alt53=1;
                                                            }
                                                            switch (alt53) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:10: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1604); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBR.19");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1608);
                                                                    spec_field("^.{0,60}$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:474:10: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt52=2;
                                                                    int LA52_0 = input.LA(1);

                                                                    if ( (LA52_0==DELIMITER1) ) {
                                                                        alt52=1;
                                                                    }
                                                                    switch (alt52) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:474:11: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1623); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBR.20");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1627);
                                                                            spec_field("^.{0,60}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:475:11: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt51=2;
                                                                            int LA51_0 = input.LA(1);

                                                                            if ( (LA51_0==DELIMITER1) ) {
                                                                                alt51=1;
                                                                            }
                                                                            switch (alt51) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:475:12: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1643); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBR.21");}

                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1647);
                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:476:12: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt50=2;
                                                                                    int LA50_0 = input.LA(1);

                                                                                    if ( (LA50_0==DELIMITER1) ) {
                                                                                        alt50=1;
                                                                                    }
                                                                                    switch (alt50) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:476:13: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1664); if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {startElement("OBR.22");}

                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1668);
                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:477:13: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt49=2;
                                                                                            int LA49_0 = input.LA(1);

                                                                                            if ( (LA49_0==DELIMITER1) ) {
                                                                                                alt49=1;
                                                                                            }
                                                                                            switch (alt49) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:477:14: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1686); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.23");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1690);
                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:14: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt48=2;
                                                                                                    int LA48_0 = input.LA(1);

                                                                                                    if ( (LA48_0==DELIMITER1) ) {
                                                                                                        alt48=1;
                                                                                                    }
                                                                                                    switch (alt48) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:15: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1709); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.24");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1713);
                                                                                                            spec_field("^$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:479:15: ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt47=2;
                                                                                                            int LA47_0 = input.LA(1);

                                                                                                            if ( (LA47_0==DELIMITER1) ) {
                                                                                                                alt47=1;
                                                                                                            }
                                                                                                            switch (alt47) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:479:16: DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1733); if (state.failed) return ;

                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1735);
                                                                                                                    lvl1_fields("OBR.25", obr_25, 0, "^.{0,10}$");

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:480:16: ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt46=2;
                                                                                                                    int LA46_0 = input.LA(1);

                                                                                                                    if ( (LA46_0==DELIMITER1) ) {
                                                                                                                        alt46=1;
                                                                                                                    }
                                                                                                                    switch (alt46) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:480:17: DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1754); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.26");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1758);
                                                                                                                            spec_field("^(F|P|M|I|R|C|O|D|X)?$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:481:17: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt45=2;
                                                                                                                            int LA45_0 = input.LA(1);

                                                                                                                            if ( (LA45_0==DELIMITER1) ) {
                                                                                                                                alt45=1;
                                                                                                                            }
                                                                                                                            switch (alt45) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:481:18: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1780); if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.27");}

                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1784);
                                                                                                                                    spec_field("^$", true, false);

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:482:18: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt44=2;
                                                                                                                                    int LA44_0 = input.LA(1);

                                                                                                                                    if ( (LA44_0==DELIMITER1) ) {
                                                                                                                                        alt44=1;
                                                                                                                                    }
                                                                                                                                    switch (alt44) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:482:19: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1807); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.28");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1811);
                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:483:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt43=2;
                                                                                                                                            int LA43_0 = input.LA(1);

                                                                                                                                            if ( (LA43_0==DELIMITER1) ) {
                                                                                                                                                alt43=1;
                                                                                                                                            }
                                                                                                                                            switch (alt43) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:483:20: DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1835); if (state.failed) return ;

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1837);
                                                                                                                                                    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:483:81: ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )*
                                                                                                                                                    loop32:
                                                                                                                                                    do {
                                                                                                                                                        int alt32=2;
                                                                                                                                                        int LA32_0 = input.LA(1);

                                                                                                                                                        if ( (LA32_0==REPETITEUR) ) {
                                                                                                                                                            alt32=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt32) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:483:82: REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1841); if (state.failed) return ;

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1843);
                                                                                                                                                    	    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    	    state._fsp--;
                                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop32;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:484:20: ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt42=2;
                                                                                                                                                    int LA42_0 = input.LA(1);

                                                                                                                                                    if ( (LA42_0==DELIMITER1) ) {
                                                                                                                                                        alt42=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt42) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:484:21: DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1868); if (state.failed) return ;

                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_obr1870);
                                                                                                                                                            lvl1_fields("OBR.30", obr_30, 0, "^.{0,150}$");

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:21: ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt41=2;
                                                                                                                                                            int LA41_0 = input.LA(1);

                                                                                                                                                            if ( (LA41_0==DELIMITER1) ) {
                                                                                                                                                                alt41=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt41) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:22: DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1894); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.31");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1898);
                                                                                                                                                                    spec_field("^(PORT|CART|WHLC|WALK)?$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:22: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    int alt40=2;
                                                                                                                                                                    int LA40_0 = input.LA(1);

                                                                                                                                                                    if ( (LA40_0==DELIMITER1) ) {
                                                                                                                                                                        alt40=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt40) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:23: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1947); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1951);
                                                                                                                                                                            spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:114: ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )*
                                                                                                                                                                            loop33:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt33=2;
                                                                                                                                                                                int LA33_0 = input.LA(1);

                                                                                                                                                                                if ( (LA33_0==REPETITEUR) ) {
                                                                                                                                                                                    alt33=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt33) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:115: REPETITEUR spec_field[\"^.{0,300}$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1957); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_obr1961);
                                                                                                                                                                            	    spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop33;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            int alt39=2;
                                                                                                                                                                            int LA39_0 = input.LA(1);

                                                                                                                                                                            if ( (LA39_0==DELIMITER1) ) {
                                                                                                                                                                                alt39=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt39) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:24: DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1991); if (state.failed) return ;

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1993);
                                                                                                                                                                                    spec_sized_cna("OBR.33", obr_33, 0, "^.{0,60}$");

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    int alt38=2;
                                                                                                                                                                                    int LA38_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA38_0==DELIMITER1) ) {
                                                                                                                                                                                        alt38=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt38) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:25: DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2020); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2022);
                                                                                                                                                                                            spec_sized_cna("OBR.34", obr_34, 0, "^.{0,60}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            int alt37=2;
                                                                                                                                                                                            int LA37_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA37_0==DELIMITER1) ) {
                                                                                                                                                                                                alt37=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt37) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:26: DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2050); if (state.failed) return ;

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2052);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", obr_35, 0, "^.{0,60}$");

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    int alt36=2;
                                                                                                                                                                                                    int LA36_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA36_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt36=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt36) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:27: DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2081); if (state.failed) return ;

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2083);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", obr_36, 0, "^.{0,60}$");

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:492:27: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            int alt35=2;
                                                                                                                                                                                                            int LA35_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA35_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt35=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt35) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:492:28: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2113); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.37");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr2117);
                                                                                                                                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:28: ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    int alt34=2;
                                                                                                                                                                                                                    int LA34_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA34_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt34=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt34) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:29: DELIMITER1 spec_field[\"^$\", true, false]
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2150); if (state.failed) return ;

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr2152);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:496:1: line_obx : CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) ;
    public final void line_obx() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:23: ( CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:3: CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2224); if (state.failed) return ;

            match(input,LINE_OBX,FOLLOW_LINE_OBX_in_line_obx2226); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.1");content("OBX");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2232); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.2");}

            pushFollow(FOLLOW_spec_field_in_line_obx2236);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2243); if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:501:14: ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            int alt80=7;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==CONTENT) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==DELIMITER1) ) {
                    int LA80_2 = input.LA(3);

                    if ( (LA80_2==CONTENT) ) {
                        int LA80_3 = input.LA(4);

                        if ( (synpred5_HPRIMS()) ) {
                            alt80=1;
                        }
                        else if ( (synpred6_HPRIMS()) ) {
                            alt80=2;
                        }
                        else if ( (synpred7_HPRIMS()) ) {
                            alt80=3;
                        }
                        else if ( (synpred8_HPRIMS()) ) {
                            alt80=4;
                        }
                        else if ( (synpred9_HPRIMS()) ) {
                            alt80=5;
                        }
                        else if ( (synpred10_HPRIMS()) ) {
                            alt80=6;
                        }
                        else if ( (synpred11_HPRIMS()) ) {
                            alt80=7;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 80, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:502:5: ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:502:42: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:503:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2268);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2279); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2281);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==DELIMITER1) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2291); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2295);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:506:8: ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==DELIMITER1) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:506:9: DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2308); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2312);
                                    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:507:25: ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )*
                                    loop60:
                                    do {
                                        int alt60=2;
                                        int LA60_0 = input.LA(1);

                                        if ( (LA60_0==REPETITEUR) ) {
                                            alt60=1;
                                        }


                                        switch (alt60) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:507:26: REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2326); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2330);
                                    	    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop60;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2345);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:511:6: ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:511:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:512:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2387);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2398); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2400);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:514:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==DELIMITER1) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:514:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2410); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2414);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:515:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==DELIMITER1) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:515:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2427); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2429);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:515:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop63:
                                    do {
                                        int alt63=2;
                                        int LA63_0 = input.LA(1);

                                        if ( (LA63_0==REPETITEUR) ) {
                                            alt63=1;
                                        }


                                        switch (alt63) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:515:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2433); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2435);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop63;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2448);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:6: ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:44: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:520:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2490);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2501); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2503);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:522:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==DELIMITER1) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:522:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2513); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2517);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==DELIMITER1) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2530); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2532);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop66:
                                    do {
                                        int alt66=2;
                                        int LA66_0 = input.LA(1);

                                        if ( (LA66_0==REPETITEUR) ) {
                                            alt66=1;
                                        }


                                        switch (alt66) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2536); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2538);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop66;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2551);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:6: ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:528:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2593);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2604); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2606);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==DELIMITER1) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2616); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2620);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==DELIMITER1) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2633); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2637);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop69:
                                    do {
                                        int alt69=2;
                                        int LA69_0 = input.LA(1);

                                        if ( (LA69_0==REPETITEUR) ) {
                                            alt69=1;
                                        }


                                        switch (alt69) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:531:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2643); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2645);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop69;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2658);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:6: ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:536:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2700);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2711); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2713);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:538:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==DELIMITER1) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:538:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2723); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2727);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==DELIMITER1) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2740); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2742);
                                    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:70: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )*
                                    loop72:
                                    do {
                                        int alt72=2;
                                        int LA72_0 = input.LA(1);

                                        if ( (LA72_0==REPETITEUR) ) {
                                            alt72=1;
                                        }


                                        switch (alt72) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:539:71: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2746); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2748);
                                    	    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop72;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2761);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:6: ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:544:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2803);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2814); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2816);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:546:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==DELIMITER1) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:546:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2826); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2830);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:8: ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==DELIMITER1) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:9: DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2843); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                                    pushFollow(FOLLOW_tx_field_in_line_obx2847);
                                    tx_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2860);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:70: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:552:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2902);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2913); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2915);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:554:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==DELIMITER1) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:554:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2925); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2929);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==DELIMITER1) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2942); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2946);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop77:
                                    do {
                                        int alt77=2;
                                        int LA77_0 = input.LA(1);

                                        if ( (LA77_0==REPETITEUR) ) {
                                            alt77=1;
                                        }


                                        switch (alt77) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2952); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2956);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop77;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2971);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:560:1: end_line_obx : ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void end_line_obx() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:560:13: ( ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:561:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:561:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==DELIMITER1) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:561:4: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2998); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("OBX.7");}

                    pushFollow(FOLLOW_spec_field_in_end_line_obx3002);
                    spec_field("^.{0,20}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:4: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==DELIMITER1) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:5: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3011); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.8");}

                            pushFollow(FOLLOW_spec_field_in_end_line_obx3015);
                            spec_field("^.{0,60}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:94: ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==REPETITEUR) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:95: REPETITEUR spec_field[\"^.{0,60}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3021); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("OBX.8");}

                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx3025);
                            	    spec_field("^.{0,60}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop81;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:5: ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==DELIMITER1) ) {
                                alt94=1;
                            }
                            switch (alt94) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:6: DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3035); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3039);
                                    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:137: ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )*
                                    loop82:
                                    do {
                                        int alt82=2;
                                        int LA82_0 = input.LA(1);

                                        if ( (LA82_0==REPETITEUR) ) {
                                            alt82=1;
                                        }


                                        switch (alt82) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:138: REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3045); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx3049);
                                    	    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop82;
                                        }
                                    } while (true);


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:564:6: ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    int alt93=2;
                                    int LA93_0 = input.LA(1);

                                    if ( (LA93_0==DELIMITER1) ) {
                                        alt93=1;
                                    }
                                    switch (alt93) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:564:7: DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3062); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("OBX.10");}

                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3066);
                                            spec_field("^(?!.{6,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:565:7: ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            int alt92=2;
                                            int LA92_0 = input.LA(1);

                                            if ( (LA92_0==DELIMITER1) ) {
                                                alt92=1;
                                            }
                                            switch (alt92) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:565:8: DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3078); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3082);
                                                    spec_field("^(A|S|R|N)?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:565:101: ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )*
                                                    loop83:
                                                    do {
                                                        int alt83=2;
                                                        int LA83_0 = input.LA(1);

                                                        if ( (LA83_0==REPETITEUR) ) {
                                                            alt83=1;
                                                        }


                                                        switch (alt83) {
                                                    	case 1 :
                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:565:102: REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false]
                                                    	    {
                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3088); if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx3092);
                                                    	    spec_field("^(A|S|R|N)?$", true, false);

                                                    	    state._fsp--;
                                                    	    if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {endElement();}

                                                    	    }
                                                    	    break;

                                                    	default :
                                                    	    break loop83;
                                                        }
                                                    } while (true);


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:566:8: ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    int alt91=2;
                                                    int LA91_0 = input.LA(1);

                                                    if ( (LA91_0==DELIMITER1) ) {
                                                        alt91=1;
                                                    }
                                                    switch (alt91) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:566:9: DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3107); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3111);
                                                            spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:566:110: ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )*
                                                            loop84:
                                                            do {
                                                                int alt84=2;
                                                                int LA84_0 = input.LA(1);

                                                                if ( (LA84_0==REPETITEUR) ) {
                                                                    alt84=1;
                                                                }


                                                                switch (alt84) {
                                                            	case 1 :
                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:566:111: REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false]
                                                            	    {
                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx3117); if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx3121);
                                                            	    spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            	    state._fsp--;
                                                            	    if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                            	    }
                                                            	    break;

                                                            	default :
                                                            	    break loop84;
                                                                }
                                                            } while (true);


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            int alt90=2;
                                                            int LA90_0 = input.LA(1);

                                                            if ( (LA90_0==DELIMITER1) ) {
                                                                alt90=1;
                                                            }
                                                            switch (alt90) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3138); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBX.13");}

                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3142);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:568:10: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    int alt89=2;
                                                                    int LA89_0 = input.LA(1);

                                                                    if ( (LA89_0==DELIMITER1) ) {
                                                                        alt89=1;
                                                                    }
                                                                    switch (alt89) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:568:11: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3157); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3161);
                                                                            spec_field("^.{0,20}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:569:11: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            int alt88=2;
                                                                            int LA88_0 = input.LA(1);

                                                                            if ( (LA88_0==DELIMITER1) ) {
                                                                                alt88=1;
                                                                            }
                                                                            switch (alt88) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:569:12: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3177); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBX.15");}

                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3181);
                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:570:12: ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    int alt87=2;
                                                                                    int LA87_0 = input.LA(1);

                                                                                    if ( (LA87_0==DELIMITER1) ) {
                                                                                        alt87=1;
                                                                                    }
                                                                                    switch (alt87) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:570:13: DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3198); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_lvl1_fields_in_end_line_obx3200);
                                                                                            lvl1_fields("OBX.16", obx_16, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:13: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            int alt86=2;
                                                                                            int LA86_0 = input.LA(1);

                                                                                            if ( (LA86_0==DELIMITER1) ) {
                                                                                                alt86=1;
                                                                                            }
                                                                                            switch (alt86) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:571:14: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3216); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx3220);
                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:572:14: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    int alt85=2;
                                                                                                    int LA85_0 = input.LA(1);

                                                                                                    if ( (LA85_0==DELIMITER1) ) {
                                                                                                        alt85=1;
                                                                                                    }
                                                                                                    switch (alt85) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:572:15: DELIMITER1 spec_field[\"^$\", false, false]
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx3239); if (state.failed) return ;

                                                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx3241);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:575:1: line_p : CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:577:23: ( CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:3: CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p3285); if (state.failed) return ;

            match(input,LINE_P,FOLLOW_LINE_P_in_line_p3287); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.1");content("P");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3294); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.2");}

            pushFollow(FOLLOW_spec_field_in_line_p3298);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3305); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_p3307);
            lvl1_fields("P.3", p_3, 1, "^.{1,36}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3312); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.4");}

            pushFollow(FOLLOW_spec_field_in_line_p3316);
            spec_field("^.{0,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:582:3: ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==DELIMITER1) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:582:4: DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3324); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("P.5");}

                    pushFollow(FOLLOW_spec_field_in_line_p3328);
                    spec_field("^.{0,16}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:583:4: ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==DELIMITER1) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:583:5: DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3337); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_p3339);
                            lvl1_fields("P.6", p_6, 0, "^.{0,48}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:584:5: ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt129=2;
                            int LA129_0 = input.LA(1);

                            if ( (LA129_0==DELIMITER1) ) {
                                alt129=1;
                            }
                            switch (alt129) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:584:6: DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3347); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("P.7");}

                                    pushFollow(FOLLOW_spec_field_in_line_p3351);
                                    spec_field("^.{0,24}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:585:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt128=2;
                                    int LA128_0 = input.LA(1);

                                    if ( (LA128_0==DELIMITER1) ) {
                                        alt128=1;
                                    }
                                    switch (alt128) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:585:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3362); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("P.8");}

                                            pushFollow(FOLLOW_spec_field_in_line_p3366);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:586:7: ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt127=2;
                                            int LA127_0 = input.LA(1);

                                            if ( (LA127_0==DELIMITER1) ) {
                                                alt127=1;
                                            }
                                            switch (alt127) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:586:8: DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3378); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("P.9");}

                                                    pushFollow(FOLLOW_spec_field_in_line_p3382);
                                                    spec_field("^[M|F|U]?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:587:8: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt126=2;
                                                    int LA126_0 = input.LA(1);

                                                    if ( (LA126_0==DELIMITER1) ) {
                                                        alt126=1;
                                                    }
                                                    switch (alt126) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:587:9: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3395); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("P.10");}

                                                            pushFollow(FOLLOW_spec_field_in_line_p3399);
                                                            spec_field("^$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:588:9: ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt125=2;
                                                            int LA125_0 = input.LA(1);

                                                            if ( (LA125_0==DELIMITER1) ) {
                                                                alt125=1;
                                                            }
                                                            switch (alt125) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:588:10: DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3413); if (state.failed) return ;

                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p3415);
                                                                    lvl1_fields("P.11", p_11, 0, "^.{0,200}$");

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:589:10: ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt124=2;
                                                                    int LA124_0 = input.LA(1);

                                                                    if ( (LA124_0==DELIMITER1) ) {
                                                                        alt124=1;
                                                                    }
                                                                    switch (alt124) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:589:11: DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3428); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("P.12");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_p3432);
                                                                            spec_field("^.{0,120}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:590:11: ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt123=2;
                                                                            int LA123_0 = input.LA(1);

                                                                            if ( (LA123_0==DELIMITER1) ) {
                                                                                alt123=1;
                                                                            }
                                                                            switch (alt123) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:590:12: DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3448); if (state.failed) return ;

                                                                                    pushFollow(FOLLOW_lvl1_fields_repet_in_line_p3450);
                                                                                    lvl1_fields_repet("P.13", p_13, 0, "^.{0,40}$");

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:12: ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt122=2;
                                                                                    int LA122_0 = input.LA(1);

                                                                                    if ( (LA122_0==DELIMITER1) ) {
                                                                                        alt122=1;
                                                                                    }
                                                                                    switch (alt122) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:13: DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3489); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p3491);
                                                                                            spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:69: ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )*
                                                                                            loop97:
                                                                                            do {
                                                                                                int alt97=2;
                                                                                                int LA97_0 = input.LA(1);

                                                                                                if ( (LA97_0==REPETITEUR) ) {
                                                                                                    alt97=1;
                                                                                                }


                                                                                                switch (alt97) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:70: REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3495); if (state.failed) return ;

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p3497);
                                                                                            	    spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            	    state._fsp--;
                                                                                            	    if (state.failed) return ;

                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop97;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:594:13: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt121=2;
                                                                                            int LA121_0 = input.LA(1);

                                                                                            if ( (LA121_0==DELIMITER1) ) {
                                                                                                alt121=1;
                                                                                            }
                                                                                            switch (alt121) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:594:14: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3515); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("P.15");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3519);
                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:595:14: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt120=2;
                                                                                                    int LA120_0 = input.LA(1);

                                                                                                    if ( (LA120_0==DELIMITER1) ) {
                                                                                                        alt120=1;
                                                                                                    }
                                                                                                    switch (alt120) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:595:15: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3538); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("P.16");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3542);
                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:597:15: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt119=2;
                                                                                                            int LA119_0 = input.LA(1);

                                                                                                            if ( (LA119_0==DELIMITER1) ) {
                                                                                                                alt119=1;
                                                                                                            }
                                                                                                            switch (alt119) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:597:16: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3577); if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {startElement("P.17");}

                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3581);
                                                                                                                    spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:599:16: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt118=2;
                                                                                                                    int LA118_0 = input.LA(1);

                                                                                                                    if ( (LA118_0==DELIMITER1) ) {
                                                                                                                        alt118=1;
                                                                                                                    }
                                                                                                                    switch (alt118) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:599:17: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3618); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("P.18");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3622);
                                                                                                                            spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:600:17: ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt117=2;
                                                                                                                            int LA117_0 = input.LA(1);

                                                                                                                            if ( (LA117_0==DELIMITER1) ) {
                                                                                                                                alt117=1;
                                                                                                                            }
                                                                                                                            switch (alt117) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:600:18: DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3644); if (state.failed) return ;

                                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p3646);
                                                                                                                                    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:600:72: ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )*
                                                                                                                                    loop98:
                                                                                                                                    do {
                                                                                                                                        int alt98=2;
                                                                                                                                        int LA98_0 = input.LA(1);

                                                                                                                                        if ( (LA98_0==REPETITEUR) ) {
                                                                                                                                            alt98=1;
                                                                                                                                        }


                                                                                                                                        switch (alt98) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:600:73: REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3650); if (state.failed) return ;

                                                                                                                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_p3652);
                                                                                                                                    	    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    	    state._fsp--;
                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop98;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:18: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt116=2;
                                                                                                                                    int LA116_0 = input.LA(1);

                                                                                                                                    if ( (LA116_0==DELIMITER1) ) {
                                                                                                                                        alt116=1;
                                                                                                                                    }
                                                                                                                                    switch (alt116) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:19: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3675); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3679);
                                                                                                                                            spec_field("^.{0,200}$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:108: ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )*
                                                                                                                                            loop99:
                                                                                                                                            do {
                                                                                                                                                int alt99=2;
                                                                                                                                                int LA99_0 = input.LA(1);

                                                                                                                                                if ( (LA99_0==REPETITEUR) ) {
                                                                                                                                                    alt99=1;
                                                                                                                                                }


                                                                                                                                                switch (alt99) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:109: REPETITEUR spec_field[\"^.{0,200}$\", true, false]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3685); if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p3689);
                                                                                                                                            	    spec_field("^.{0,200}$", true, false);

                                                                                                                                            	    state._fsp--;
                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop99;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:602:19: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt115=2;
                                                                                                                                            int LA115_0 = input.LA(1);

                                                                                                                                            if ( (LA115_0==DELIMITER1) ) {
                                                                                                                                                alt115=1;
                                                                                                                                            }
                                                                                                                                            switch (alt115) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:602:20: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3715); if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.21");}

                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3719);
                                                                                                                                                    spec_field("^.{0,200}$", true, false);

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:603:20: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt114=2;
                                                                                                                                                    int LA114_0 = input.LA(1);

                                                                                                                                                    if ( (LA114_0==DELIMITER1) ) {
                                                                                                                                                        alt114=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt114) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:603:21: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3744); if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.22");}

                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3748);
                                                                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:604:21: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt113=2;
                                                                                                                                                            int LA113_0 = input.LA(1);

                                                                                                                                                            if ( (LA113_0==DELIMITER1) ) {
                                                                                                                                                                alt113=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt113) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:604:22: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3774); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.23");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3778);
                                                                                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:22: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt112=2;
                                                                                                                                                                    int LA112_0 = input.LA(1);

                                                                                                                                                                    if ( (LA112_0==DELIMITER1) ) {
                                                                                                                                                                        alt112=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt112) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:23: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3805); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3809);
                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:151: ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )*
                                                                                                                                                                            loop100:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt100=2;
                                                                                                                                                                                int LA100_0 = input.LA(1);

                                                                                                                                                                                if ( (LA100_0==REPETITEUR) ) {
                                                                                                                                                                                    alt100=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt100) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:152: REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3815); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p3819);
                                                                                                                                                                            	    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop100;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:23: ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt111=2;
                                                                                                                                                                            int LA111_0 = input.LA(1);

                                                                                                                                                                            if ( (LA111_0==DELIMITER1) ) {
                                                                                                                                                                                alt111=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt111) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:24: DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3849); if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.25");}

                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3853);
                                                                                                                                                                                    spec_field("^(OP|IP|ER|PA|MP)?^$", true, false);

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:607:24: ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt110=2;
                                                                                                                                                                                    int LA110_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA110_0==DELIMITER1) ) {
                                                                                                                                                                                        alt110=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt110) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:607:25: DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3882); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_p3884);
                                                                                                                                                                                            lvl1_fields("P.26", p_26, 0, "^.{0,100}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:25: ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt109=2;
                                                                                                                                                                                            int LA109_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA109_0==DELIMITER1) ) {
                                                                                                                                                                                                alt109=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt109) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:26: DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3937); if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.27");}

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3941);
                                                                                                                                                                                                    spec_field("^.{0,100}$", true, false);

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:610:26: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt108=2;
                                                                                                                                                                                                    int LA108_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA108_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt108=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt108) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:610:27: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3972); if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.28");}

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3976);
                                                                                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:612:27: ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt107=2;
                                                                                                                                                                                                            int LA107_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA107_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt107=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt107) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:612:28: DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4035); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.29");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4039);
                                                                                                                                                                                                                    spec_field("^.{0,2}$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:614:28: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt106=2;
                                                                                                                                                                                                                    int LA106_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA106_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt106=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt106) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:614:29: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4100); if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.30");}

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4104);
                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:615:29: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt105=2;
                                                                                                                                                                                                                            int LA105_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA105_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt105=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt105) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:615:30: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4138); if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.31");}

                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4142);
                                                                                                                                                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:617:30: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt104=2;
                                                                                                                                                                                                                                    int LA104_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA104_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt104=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt104) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:617:31: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4207); if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.32");}

                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4211);
                                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:618:31: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt103=2;
                                                                                                                                                                                                                                            int LA103_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA103_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt103=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt103) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:618:32: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4247); if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.33");}

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p4251);
                                                                                                                                                                                                                                                    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:619:32: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt102=2;
                                                                                                                                                                                                                                                    int LA102_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA102_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt102=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt102) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:619:33: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4288); if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.34");}

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4292);
                                                                                                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:620:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt101=2;
                                                                                                                                                                                                                                                            int LA101_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA101_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt101=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt101) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:620:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4329); if (state.failed) return ;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:623:1: spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] :h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_sized_cna(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        HPRIMSParser.field_return h =null;

        String i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:22: (h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:626:3: h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            if ( state.backtracking==0 ) {startElement(nameElement + ".1");}

            pushFollow(FOLLOW_field_in_spec_sized_cna4413);
            h=field(true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:627:4: ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==DELIMITER2) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:627:5: DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4422); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl2_fields_in_spec_sized_cna4426);
                    i=lvl2_fields(nameElement + ".2", patterns, nbMandatory, ".*");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:5: ( DELIMITER2 j= field[true] )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==DELIMITER2) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:6: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4434); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_sized_cna4440);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:631:1: spec_obr_16[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_obr_16(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String h =null;

        HPRIMSParser.field_return i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:22: (h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:634:3: h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            pushFollow(FOLLOW_lvl2_fields_in_spec_obr_164471);
            h=lvl2_fields(nameElement + ".1", patterns, nbMandatory, ".*");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:635:3: ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==DELIMITER2) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:635:4: DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_164477); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement(nameElement + ".2");}

                    pushFollow(FOLLOW_field_in_spec_obr_164483);
                    i=field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:636:4: ( DELIMITER2 j= field[true] )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==DELIMITER2) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:636:5: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_164492); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_obr_164498);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:641:1: lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl1_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:643:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:644:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_fields4536);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:646:1: lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:646:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt138=3;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==CONTENT) ) {
                int LA138_1 = input.LA(2);

                if ( (LA138_1==DELIMITER2) && ((size < nbMandatory))) {
                    alt138=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt138=1;
                }
                else if ( (true) ) {
                    alt138=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 138, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;

            }
            switch (alt138) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:647:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:647:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:647:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4564);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:648:38: ({...}? DELIMITER2 spec_field[\"\", false, false] )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==DELIMITER2) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:648:39: {...}? DELIMITER2 spec_field[\"\", false, false]
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "strictNess <= 2");
                            }

                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4609); if (state.failed) return contentText;

                            pushFollow(FOLLOW_spec_field_in_lvl1_subfields4611);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:651:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:651:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:651:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4671);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4708); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields4712);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:655:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:655:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:655:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4761);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:656:6: ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==DELIMITER2) ) {
                        alt137=1;
                    }
                    else if ( (LA137_0==EOF||(LA137_0 >= CR && LA137_0 <= DELIMITER1)||LA137_0==REPETITEUR) ) {
                        alt137=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 137, 0, input);

                        throw nvae;

                    }
                    switch (alt137) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:656:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:656:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:656:8: DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4773); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields4777);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:657:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:660:1: lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final void lvl1_fields_repet(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:662:23: (r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:663:3: r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet4820);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:665:1: lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields_repet(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:665:173: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt142=3;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==CONTENT) ) {
                int LA142_1 = input.LA(2);

                if ( (LA142_1==REPETITEUR) && ((size < nbMandatory))) {
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:666:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:666:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:666:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4844);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:38: ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |)
                    int alt140=2;
                    switch ( input.LA(1) ) {
                    case REPETITEUR:
                        {
                        alt140=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA140_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt140=1;
                        }
                        else if ( (true) ) {
                            alt140=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA140_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt140=1;
                        }
                        else if ( (true) ) {
                            alt140=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA140_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt140=1;
                        }
                        else if ( (true) ) {
                            alt140=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 0, input);

                        throw nvae;

                    }

                    switch (alt140) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:39: {...}? ( REPETITEUR spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:58: ( REPETITEUR spec_field[\"\", false, false] )?
                            int alt139=2;
                            int LA139_0 = input.LA(1);

                            if ( (LA139_0==REPETITEUR) ) {
                                alt139=1;
                            }
                            switch (alt139) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:59: REPETITEUR spec_field[\"\", false, false]
                                    {
                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet4890); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4892);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:667:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:670:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:670:30: (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:670:31: g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4956);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet4993); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet4997);
                    h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet5046);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:675:6: ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==REPETITEUR) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==EOF||(LA141_0 >= CR && LA141_0 <= DELIMITER1)) ) {
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
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:675:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:675:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:675:8: REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet5058); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet5062);
                            h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:676:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:680:1: lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl2_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:682:23: (r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:683:3: r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_fields5110);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:1: lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl2_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt146=3;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==CONTENT) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==DELIMITER3) && ((size < nbMandatory))) {
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5136);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:38: ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |)
                    int alt144=2;
                    switch ( input.LA(1) ) {
                    case DELIMITER3:
                        {
                        alt144=1;
                        }
                        break;
                    case DELIMITER2:
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
                    case DELIMITER1:
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
                    case REPETITEUR:
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
                    case CR:
                        {
                        int LA144_5 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt144=1;
                        }
                        else if ( (true) ) {
                            alt144=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA144_6 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt144=1;
                        }
                        else if ( (true) ) {
                            alt144=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 6, input);

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
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:39: {...}? ( DELIMITER3 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:58: ( DELIMITER3 spec_field[\"\", false, false] )?
                            int alt143=2;
                            int LA143_0 = input.LA(1);

                            if ( (LA143_0==DELIMITER3) ) {
                                alt143=1;
                            }
                            switch (alt143) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:59: DELIMITER3 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields5182); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5184);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5248);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields5285); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields5289);
                    h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5338);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:6: ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==DELIMITER3) ) {
                        alt145=1;
                    }
                    else if ( (LA145_0==EOF||(LA145_0 >= CR && LA145_0 <= DELIMITER2)||LA145_0==REPETITEUR) ) {
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
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:8: DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields5350); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields5354);
                            h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:1: spec_field[String fieldPattern, boolean record, boolean forceRegex] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:700:69: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:701:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern, forceRegex))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field5392); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:1: field[boolean record] : CONTENT ;
    public final HPRIMSParser.field_return field(boolean record) throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:706:23: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:707:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field5408); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:711:1: tx_field[String fieldPattern, boolean record, boolean forceRegex] : tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] ;
    public final void tx_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:711:67: ( tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:712:3: tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex]
            {
            pushFollow(FOLLOW_tx_field_internal_in_tx_field5424);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:714:1: tx_field_internal[String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex] : (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) ;
    public final void tx_field_internal(String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex) throws RecognitionException {
        Token h=null;

        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:714:100: ( (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:3: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:4: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==CONTENT||(LA147_0 >= DELIMITER2 && LA147_0 <= DELIMITER3)) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:4: h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:5: ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:715:6: ( CONTENT | DELIMITER2 | DELIMITER3 )
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:5: ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==REPETITEUR) ) {
                alt148=1;
            }
            else if ( (LA148_0==EOF||(LA148_0 >= CR && LA148_0 <= DELIMITER1)) ) {
                alt148=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;

            }
            switch (alt148) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:716:7: REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_tx_field_internal5461); if (state.failed) return ;

                    pushFollow(FOLLOW_tx_field_internal_in_tx_field_internal5463);
                    tx_field_internal(fieldPattern, recorded.append('\n'), record, forceRegex);

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:717:6: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:720:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:720:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:721:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5489); if (state.failed) return retval;

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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:3: ( line_h2_2_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:4: line_h2_2_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:3: ( line_h2_1_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:4: line_h2_1_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:3: ( line_h2_0_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:4: line_h2_0_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:3: ( line_h2_2_adm[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:4: line_h2_2_adm[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:502:5: ( spec_field[\"^NM$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:502:6: spec_field[\"^NM$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred5_HPRIMS2252);
        spec_field("^NM$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_HPRIMS

    // $ANTLR start synpred6_HPRIMS
    public final void synpred6_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:511:6: ( spec_field[\"^CE$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:511:7: spec_field[\"^CE$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred6_HPRIMS2371);
        spec_field("^CE$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_HPRIMS

    // $ANTLR start synpred7_HPRIMS
    public final void synpred7_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:6: ( spec_field[\"^FIC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:7: spec_field[\"^FIC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred7_HPRIMS2474);
        spec_field("^FIC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_HPRIMS

    // $ANTLR start synpred8_HPRIMS
    public final void synpred8_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:6: ( spec_field[\"^ST$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:7: spec_field[\"^ST$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred8_HPRIMS2577);
        spec_field("^ST$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_HPRIMS

    // $ANTLR start synpred9_HPRIMS
    public final void synpred9_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:6: ( spec_field[\"^GC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:7: spec_field[\"^GC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred9_HPRIMS2684);
        spec_field("^GC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_HPRIMS

    // $ANTLR start synpred10_HPRIMS
    public final void synpred10_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:6: ( spec_field[\"^TX$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:7: spec_field[\"^TX$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred10_HPRIMS2787);
        spec_field("^TX$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_HPRIMS

    // $ANTLR start synpred11_HPRIMS
    public final void synpred11_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:7: spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred11_HPRIMS2886);
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
    public static final BitSet FOLLOW_lvl1_fields_in_line_act817 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_act821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_act823 = new BitSet(new long[]{0x0000000000080040L});
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
    public static final BitSet FOLLOW_spec_field_in_line_c904 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c914 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_H_in_start_line_h950 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h958 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h968 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h979 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_midd_line_h1009 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1018 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_midd_line_h1027 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1036 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_21063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_21067 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_21085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_21089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_11103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_11107 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_11125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_11129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_01143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_01147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_01165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_01169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h1185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h1189 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h1197 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_oru1214 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_oru1218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_oru1222 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_oru1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_2_oru1248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru1252 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_oru1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_1_oru1275 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru1279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_oru1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_0_oru1302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru1306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_oru1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_adm1321 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_adm1325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_adm1329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_adm1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_2_adm1355 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm1359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_adm1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr1385 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LINE_OBR_in_line_obr1387 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1406 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1420 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1426 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1440 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1450 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1472 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1495 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1516 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1529 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1540 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1554 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_obr_16_in_line_obr1567 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1579 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_obr1592 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1608 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1627 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1647 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1668 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1690 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1713 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1735 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1758 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1784 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1811 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1837 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1843 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1870 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1898 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1951 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1961 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1993 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2022 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2052 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2083 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2117 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2224 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LINE_OBX_in_line_obx2226 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2236 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_line_obx2268 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2281 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2295 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2312 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2330 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2387 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2400 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2414 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2429 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2435 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2503 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2517 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2532 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2538 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2593 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2606 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2620 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2637 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2645 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2700 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2713 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2727 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2742 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2748 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2803 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2816 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2830 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2843 = new BitSet(new long[]{0x0000000000080190L});
    public static final BitSet FOLLOW_tx_field_in_line_obx2847 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2902 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2915 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2929 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2946 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2956 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3002 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3015 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3025 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3039 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3049 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3066 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3082 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3092 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3111 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx3117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3121 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3142 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3161 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3181 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_end_line_obx3200 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3220 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx3239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p3285 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LINE_P_in_line_p3287 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3307 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3316 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3328 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3339 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3351 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3366 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3382 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3399 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3415 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3432 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_p3450 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p3491 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p3497 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3519 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3542 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3581 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3622 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3646 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3652 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3679 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3689 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3719 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3748 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3778 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3809 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3819 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3853 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3884 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3941 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3976 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4039 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4104 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4142 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4211 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4251 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4292 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna4413 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_sized_cna4426 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_obr_164471 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_164477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_164483 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_164492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_164498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_fields4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4564 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4671 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4761 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4844 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet4890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4956 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet4993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet5046 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet5058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_fields5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5136 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields5182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5248 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields5285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5338 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields5350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tx_field_internal5439 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_REPETITEUR_in_tx_field_internal5461 = new BitSet(new long[]{0x0000000000080190L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field_internal5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_synpred1_HPRIMS75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_synpred2_HPRIMS106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_synpred3_HPRIMS137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_synpred4_HPRIMS168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred5_HPRIMS2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred6_HPRIMS2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred7_HPRIMS2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred8_HPRIMS2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred9_HPRIMS2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred10_HPRIMS2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred11_HPRIMS2886 = new BitSet(new long[]{0x0000000000000002L});

}