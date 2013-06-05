// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-05 23:17:57

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTENT", "CR", "DELIMITER1", "DELIMITER2", "DELIMITER3", "DELIMITERS", "LINE_AP", "LINE_C", "LINE_GENERIC", "LINE_H", "LINE_OBR", "LINE_OBX", "LINE_P", "REPETITEUR"
    };

    public static final int EOF=-1;
    public static final int CONTENT=4;
    public static final int CR=5;
    public static final int DELIMITER1=6;
    public static final int DELIMITER2=7;
    public static final int DELIMITER3=8;
    public static final int DELIMITERS=9;
    public static final int LINE_AP=10;
    public static final int LINE_C=11;
    public static final int LINE_GENERIC=12;
    public static final int LINE_H=13;
    public static final int LINE_OBR=14;
    public static final int LINE_OBX=15;
    public static final int LINE_P=16;
    public static final int REPETITEUR=17;

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
      private final static List<String> ap_14 = Arrays.asList(new String[] {".{1,}", ".{1,}", ".{1,}", ".{1,}", ".{1,}", ".{1,}"});
      private final static List<String> ap_22 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:267:1: hprim[int strictNess] : ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) );
    public final void hprim(int strictNess) throws RecognitionException {
        this.strictNess = strictNess;startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:269:24: ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:270:3: ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:5: ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:6: line_h2_2_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_2");}

                    pushFollow(FOLLOW_line_h2_2_oru_in_hprim88);
                    line_h2_2_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:59: body_p_oru
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:273:3: ( line_h2_1_oru[false] )=> ( line_h2_1_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:5: ( line_h2_1_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:6: line_h2_1_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_1");}

                    pushFollow(FOLLOW_line_h2_1_oru_in_hprim119);
                    line_h2_1_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:59: body_p_oru
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:276:3: ( line_h2_0_oru[false] )=> ( line_h2_0_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:5: ( line_h2_0_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:6: line_h2_0_oru[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ORU.2_0");}

                    pushFollow(FOLLOW_line_h2_0_oru_in_hprim150);
                    line_h2_0_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:59: body_p_oru
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:279:3: ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:5: ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:6: line_h2_2_adm[true] ( body_p_oru )+ EOF
                    {
                    if ( state.backtracking==0 ) {startElement("HPRIM.ADM.2_2");}

                    pushFollow(FOLLOW_line_h2_2_adm_in_hprim181);
                    line_h2_2_adm(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:59: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:59: body_p_oru
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:1: body_p_oru : ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* ) ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:12: ( ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:3: ( line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:4: line_p ( line_c )* ( line_obr ( line_c )* ( line_obx ( line_c )* )* )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru204);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:11: ( line_c )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:12: line_c
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:285:4: ( line_obr ( line_c )* ( line_obx ( line_c )* )* )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:285:5: line_obr ( line_c )* ( line_obx ( line_c )* )*
            	    {
            	    pushFollow(FOLLOW_line_obr_in_body_p_oru215);
            	    line_obr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:285:14: ( line_c )*
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
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:285:15: line_c
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


            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:5: ( line_obx ( line_c )* )*
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
            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:6: line_obx ( line_c )*
            	    	    {
            	    	    pushFollow(FOLLOW_line_obx_in_body_p_oru227);
            	    	    line_obx();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:15: ( line_c )*
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
            	    	    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:16: line_c
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:291:1: line_ap : CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? ;
    public final void line_ap() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:293:23: ( CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:294:3: CR LINE_AP DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,15}$\", true, false] DELIMITER1 spec_field[\"^.{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,2}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,3}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 spec_field[\"^.$\", true, false] DELIMITER1 spec_field[\"^.{1,2}$\", true, false] DELIMITER1 lvl1_fields[\"AP.14\", ap_14, 6, \"^.{1,48}$\"] DELIMITER1 spec_field[\"^.{0,24}$\", true, false] DELIMITER1 spec_field[\"^[0-9]{1,6}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
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

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:310:3: ( DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==DELIMITER1) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:310:4: DELIMITER1 spec_field[\"^[0-9]{0,9}$\", true, false] ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap428); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("AP.17");}

                    pushFollow(FOLLOW_spec_field_in_line_ap432);
                    spec_field("^[0-9]{0,9}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:4: ( DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DELIMITER1) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:5: DELIMITER1 spec_field[\"^(O|N)?$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap441); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("AP.18");}

                            pushFollow(FOLLOW_spec_field_in_line_ap445);
                            spec_field("^(O|N)?$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:312:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==DELIMITER1) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:312:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap455); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("AP.19");}

                                    pushFollow(FOLLOW_spec_field_in_line_ap459);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:313:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                    int alt15=2;
                                    int LA15_0 = input.LA(1);

                                    if ( (LA15_0==DELIMITER1) ) {
                                        alt15=1;
                                    }
                                    switch (alt15) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:313:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2})?)?\", true, false] ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap470); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("AP.20");}

                                            pushFollow(FOLLOW_spec_field_in_line_ap474);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2})?)?", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:7: ( DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                            int alt14=2;
                                            int LA14_0 = input.LA(1);

                                            if ( (LA14_0==DELIMITER1) ) {
                                                alt14=1;
                                            }
                                            switch (alt14) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:314:8: DELIMITER1 spec_field[\"^.{0,30}$\", true, false] ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap486); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("AP.21");}

                                                    pushFollow(FOLLOW_spec_field_in_line_ap491);
                                                    spec_field("^.{0,30}$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:315:8: ( DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                    int alt13=2;
                                                    int LA13_0 = input.LA(1);

                                                    if ( (LA13_0==DELIMITER1) ) {
                                                        alt13=1;
                                                    }
                                                    switch (alt13) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:315:9: DELIMITER1 lvl1_fields[\"AP.22\", ap_22, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap504); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_in_line_ap506);
                                                            lvl1_fields("AP.22", ap_22, 0, "^.{0,200}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                            int alt12=2;
                                                            int LA12_0 = input.LA(1);

                                                            if ( (LA12_0==DELIMITER1) ) {
                                                                alt12=1;
                                                            }
                                                            switch (alt12) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap518); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("AP.23");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_ap522);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:10: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                    int alt11=2;
                                                                    int LA11_0 = input.LA(1);

                                                                    if ( (LA11_0==DELIMITER1) ) {
                                                                        alt11=1;
                                                                    }
                                                                    switch (alt11) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:11: DELIMITER1 spec_field[\"^$\", false, false]
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



    // $ANTLR start "line_c"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:1: line_c : CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )? )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:22: ( CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:3: CR LINE_C DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_c574); if (state.failed) return ;

            match(input,LINE_C,FOLLOW_LINE_C_in_line_c576); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.1");content("C");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c583); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.2");}

            pushFollow(FOLLOW_spec_field_in_line_c587);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:325:3: ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DELIMITER1) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:325:4: DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c595); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("C.3");}

                    pushFollow(FOLLOW_spec_field_in_line_c599);
                    spec_field("^(P|L)?$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:4: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==DELIMITER1) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:5: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c608); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("C.4");}

                            pushFollow(FOLLOW_spec_field_in_line_c612);
                            spec_field("^.{0,64000}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:95: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==REPETITEUR) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:326:96: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c618); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("C.4");}

                            	    pushFollow(FOLLOW_spec_field_in_line_c622);
                            	    spec_field("^.{0,64000}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {endElement();}

                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:327:5: ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==DELIMITER1) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:327:6: DELIMITER1 ( spec_field[\"\", false, false] )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c636); if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:327:17: ( spec_field[\"\", false, false] )?
                                    int alt20=2;
                                    int LA20_0 = input.LA(1);

                                    if ( (LA20_0==CONTENT) ) {
                                        alt20=1;
                                    }
                                    switch (alt20) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:327:17: spec_field[\"\", false, false]
                                            {
                                            pushFollow(FOLLOW_spec_field_in_line_c638);
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
    // $ANTLR end "line_c"



    // $ANTLR start "start_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:332:1: start_line_h : LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:332:14: ( LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:333:3: LINE_H delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"]
            {
            match(input,LINE_H,FOLLOW_LINE_H_in_start_line_h659); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.1");content("H");endElement();}

            if ( state.backtracking==0 ) {startElement("H.2");}

            pushFollow(FOLLOW_delimiters_in_start_line_h667);
            delimiters();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h673); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.3");}

            pushFollow(FOLLOW_spec_field_in_start_line_h677);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h684); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.4");}

            pushFollow(FOLLOW_spec_field_in_start_line_h688);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h695); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h697);
            lvl1_fields("H.5", h_5, 2, "^.{0,15}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h702); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h704);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:1: midd_line_h : DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:13: ( DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:342:3: DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h716); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_midd_line_h718);
            lvl1_fields_repet("H.8", h_8, 0, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h723); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.9");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h727);
            spec_field("^.{0,40}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h734); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_midd_line_h736);
            lvl1_fields("H.10", h_10, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h741); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.11");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h745);
            spec_field("^.{0,80}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h752); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.12");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h756);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:1: bloc_line_h_2_2 : DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:349:17: ( DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:350:5: DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_2772); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_2776);
            spec_field("^H2\\.2$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_2794); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_2798);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:352:1: bloc_line_h_2_1 : DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:352:17: ( DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:353:5: DELIMITER1 spec_field[\"^H2\\\\.1$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_1812); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_1816);
            spec_field("^H2\\.1$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_1834); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_1838);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:1: bloc_line_h_2_0 : DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_0() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:355:17: ( DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:356:5: DELIMITER1 spec_field[\"^H2\\\\.0$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_0852); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_0856);
            spec_field("^H2\\.0$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_0874); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_0878);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:1: end_line_h : DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? ;
    public final void end_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:360:12: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:3: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h894); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.14");}

            pushFollow(FOLLOW_spec_field_in_end_line_h898);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:3: ( DELIMITER1 ( spec_field[\"\", false, false] )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==DELIMITER1) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:4: DELIMITER1 ( spec_field[\"\", false, false] )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h906); if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:15: ( spec_field[\"\", false, false] )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==CONTENT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:15: spec_field[\"\", false, false]
                            {
                            pushFollow(FOLLOW_spec_field_in_end_line_h908);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:1: start_line_h_oru : start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h ;
    public final void start_line_h_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:365:18: ( start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:366:3: start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_oru923);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_oru927); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_oru931);
            spec_field("^ORU$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_oru938);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:370:1: line_h2_2_oru[boolean record] : start_line_h_oru bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:372:23: ( start_line_h_oru bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:373:3: start_line_h_oru bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_2_oru957);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru961);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_oru965);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:377:1: line_h2_1_oru[boolean record] : start_line_h_oru bloc_line_h_2_1 end_line_h ;
    public final void line_h2_1_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:379:23: ( start_line_h_oru bloc_line_h_2_1 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:380:3: start_line_h_oru bloc_line_h_2_1 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_1_oru984);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru988);
            bloc_line_h_2_1();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_1_oru992);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:1: line_h2_0_oru[boolean record] : start_line_h_oru bloc_line_h_2_0 end_line_h ;
    public final void line_h2_0_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:386:23: ( start_line_h_oru bloc_line_h_2_0 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:387:3: start_line_h_oru bloc_line_h_2_0 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_0_oru1011);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru1015);
            bloc_line_h_2_0();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_0_oru1019);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:392:1: start_line_h_adm : start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h ;
    public final void start_line_h_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:392:18: ( start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:393:3: start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_adm1030);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_adm1034); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_adm1038);
            spec_field("^ADM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_adm1045);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:1: line_h2_2_adm[boolean record] : start_line_h_adm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_adm(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:399:23: ( start_line_h_adm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:400:3: start_line_h_adm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_2_adm1064);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm1068);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_adm1072);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:406:1: line_obr : CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:408:23: ( CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:409:3: CR LINE_OBR DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )* DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 lvl1_fields[\"OBR.8\", obr_8, 0, \".*\"] DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] DELIMITER1 spec_field[\"^.{0,20}$\", true, false] DELIMITER1 spec_sized_cna[\"OBR.11\", obr_11, 0, \"^.{0,60}$\"] DELIMITER1 spec_field[\"^.{0,1}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr1094); if (state.failed) return ;

            match(input,LINE_OBR,FOLLOW_LINE_OBR_in_line_obr1096); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.1");content("OBR");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1102); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.2");}

            pushFollow(FOLLOW_spec_field_in_line_obr1106);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1113); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1115);
            lvl1_fields("OBR.3", obr_3, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1120); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1122);
            lvl1_fields("OBR.4", obr_4, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1127); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1129);
            lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:61: ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==REPETITEUR) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:62: REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1133); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_obr1135);
            	    lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1145); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.6");}

            pushFollow(FOLLOW_spec_field_in_line_obr1149);
            spec_field("^.{0,2}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:91: ( REPETITEUR spec_field[\"^.{0,2}$\", true, false] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==REPETITEUR) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:92: REPETITEUR spec_field[\"^.{0,2}$\", true, false]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1155); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {startElement("OBR.6");}

            	    pushFollow(FOLLOW_spec_field_in_line_obr1159);
            	    spec_field("^.{0,2}$", true, false);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {endElement();}

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1168); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.7");}

            pushFollow(FOLLOW_spec_field_in_line_obr1172);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1179); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr1181);
            lvl1_fields("OBR.8", obr_8, 0, ".*");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1186); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.9");}

            pushFollow(FOLLOW_spec_field_in_line_obr1190);
            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1200); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.10");}

            pushFollow(FOLLOW_spec_field_in_line_obr1204);
            spec_field("^.{0,20}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1211); if (state.failed) return ;

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr1213);
            spec_sized_cna("OBR.11", obr_11, 0, "^.{0,60}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1221); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.12");}

            pushFollow(FOLLOW_spec_field_in_line_obr1225);
            spec_field("^.{0,1}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:425:3: ( DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==DELIMITER1) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:425:4: DELIMITER1 lvl1_fields[\"OBR.13\", obr_13, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1236); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1238);
                    lvl1_fields("OBR.13", obr_13, 0, "^.{0,60}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:426:4: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DELIMITER1) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:426:5: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1245); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBR.14");}

                            pushFollow(FOLLOW_spec_field_in_line_obr1249);
                            spec_field("^.{0,300}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:427:5: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==DELIMITER1) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:427:6: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1259); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBR.15");}

                                    pushFollow(FOLLOW_spec_field_in_line_obr1263);
                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:428:6: ( DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt52=2;
                                    int LA52_0 = input.LA(1);

                                    if ( (LA52_0==DELIMITER1) ) {
                                        alt52=1;
                                    }
                                    switch (alt52) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:428:7: DELIMITER1 spec_obr_16[\"OBR.16\", obr_16, 0, \"^.{0,300}$\"] ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1274); if (state.failed) return ;

                                            pushFollow(FOLLOW_spec_obr_16_in_line_obr1276);
                                            spec_obr_16("OBR.16", obr_16, 0, "^.{0,300}$");

                                            state._fsp--;
                                            if (state.failed) return ;

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:429:7: ( DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt51=2;
                                            int LA51_0 = input.LA(1);

                                            if ( (LA51_0==DELIMITER1) ) {
                                                alt51=1;
                                            }
                                            switch (alt51) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:429:8: DELIMITER1 lvl1_fields[\"OBR.17\", obr_17, 0, \"^.{0,60}$\"] ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1286); if (state.failed) return ;

                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1288);
                                                    lvl1_fields("OBR.17", obr_17, 0, "^.{0,60}$");

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:430:8: ( DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt50=2;
                                                    int LA50_0 = input.LA(1);

                                                    if ( (LA50_0==DELIMITER1) ) {
                                                        alt50=1;
                                                    }
                                                    switch (alt50) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:430:9: DELIMITER1 lvl1_fields_repet[\"OBR.18\", obr_18, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1299); if (state.failed) return ;

                                                            pushFollow(FOLLOW_lvl1_fields_repet_in_line_obr1301);
                                                            lvl1_fields_repet("OBR.18", obr_18, 0, "^.{0,40}$");

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:431:9: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt49=2;
                                                            int LA49_0 = input.LA(1);

                                                            if ( (LA49_0==DELIMITER1) ) {
                                                                alt49=1;
                                                            }
                                                            switch (alt49) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:431:10: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1313); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBR.19");}

                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1317);
                                                                    spec_field("^.{0,60}$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:432:10: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt48=2;
                                                                    int LA48_0 = input.LA(1);

                                                                    if ( (LA48_0==DELIMITER1) ) {
                                                                        alt48=1;
                                                                    }
                                                                    switch (alt48) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:432:11: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1332); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBR.20");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1336);
                                                                            spec_field("^.{0,60}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:433:11: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt47=2;
                                                                            int LA47_0 = input.LA(1);

                                                                            if ( (LA47_0==DELIMITER1) ) {
                                                                                alt47=1;
                                                                            }
                                                                            switch (alt47) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:433:12: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1352); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBR.21");}

                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1356);
                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:12: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt46=2;
                                                                                    int LA46_0 = input.LA(1);

                                                                                    if ( (LA46_0==DELIMITER1) ) {
                                                                                        alt46=1;
                                                                                    }
                                                                                    switch (alt46) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:13: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1373); if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {startElement("OBR.22");}

                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1377);
                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:435:13: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt45=2;
                                                                                            int LA45_0 = input.LA(1);

                                                                                            if ( (LA45_0==DELIMITER1) ) {
                                                                                                alt45=1;
                                                                                            }
                                                                                            switch (alt45) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:435:14: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1395); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.23");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1399);
                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:436:14: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt44=2;
                                                                                                    int LA44_0 = input.LA(1);

                                                                                                    if ( (LA44_0==DELIMITER1) ) {
                                                                                                        alt44=1;
                                                                                                    }
                                                                                                    switch (alt44) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:436:15: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1418); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.24");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1422);
                                                                                                            spec_field("^$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:437:15: ( DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt43=2;
                                                                                                            int LA43_0 = input.LA(1);

                                                                                                            if ( (LA43_0==DELIMITER1) ) {
                                                                                                                alt43=1;
                                                                                                            }
                                                                                                            switch (alt43) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:437:16: DELIMITER1 lvl1_fields[\"OBR.25\", obr_25, 0, \"^.{0,10}$\"] ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1442); if (state.failed) return ;

                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_obr1444);
                                                                                                                    lvl1_fields("OBR.25", obr_25, 0, "^.{0,10}$");

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:438:16: ( DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt42=2;
                                                                                                                    int LA42_0 = input.LA(1);

                                                                                                                    if ( (LA42_0==DELIMITER1) ) {
                                                                                                                        alt42=1;
                                                                                                                    }
                                                                                                                    switch (alt42) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:438:17: DELIMITER1 spec_field[\"^(F|P|M|I|R|C|O|D|X)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1463); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.26");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1467);
                                                                                                                            spec_field("^(F|P|M|I|R|C|O|D|X)?$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:17: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt41=2;
                                                                                                                            int LA41_0 = input.LA(1);

                                                                                                                            if ( (LA41_0==DELIMITER1) ) {
                                                                                                                                alt41=1;
                                                                                                                            }
                                                                                                                            switch (alt41) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:18: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1489); if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.27");}

                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1493);
                                                                                                                                    spec_field("^$", true, false);

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:440:18: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt40=2;
                                                                                                                                    int LA40_0 = input.LA(1);

                                                                                                                                    if ( (LA40_0==DELIMITER1) ) {
                                                                                                                                        alt40=1;
                                                                                                                                    }
                                                                                                                                    switch (alt40) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:440:19: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1516); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.28");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1520);
                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:441:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt39=2;
                                                                                                                                            int LA39_0 = input.LA(1);

                                                                                                                                            if ( (LA39_0==DELIMITER1) ) {
                                                                                                                                                alt39=1;
                                                                                                                                            }
                                                                                                                                            switch (alt39) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:441:20: DELIMITER1 spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )* ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1544); if (state.failed) return ;

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1546);
                                                                                                                                                    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:441:81: ( REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"] )*
                                                                                                                                                    loop28:
                                                                                                                                                    do {
                                                                                                                                                        int alt28=2;
                                                                                                                                                        int LA28_0 = input.LA(1);

                                                                                                                                                        if ( (LA28_0==REPETITEUR) ) {
                                                                                                                                                            alt28=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt28) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:441:82: REPETITEUR spec_sized_cna[\"OBR.29\", obr_29, 0, \"^.{0,150}$\"]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1550); if (state.failed) return ;

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1552);
                                                                                                                                                    	    spec_sized_cna("OBR.29", obr_29, 0, "^.{0,150}$");

                                                                                                                                                    	    state._fsp--;
                                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop28;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:442:20: ( DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt38=2;
                                                                                                                                                    int LA38_0 = input.LA(1);

                                                                                                                                                    if ( (LA38_0==DELIMITER1) ) {
                                                                                                                                                        alt38=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt38) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:442:21: DELIMITER1 lvl1_fields[\"OBR.30\", obr_30, 0, \"^.{0,150}$\"] ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1577); if (state.failed) return ;

                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_obr1579);
                                                                                                                                                            lvl1_fields("OBR.30", obr_30, 0, "^.{0,150}$");

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:443:21: ( DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt37=2;
                                                                                                                                                            int LA37_0 = input.LA(1);

                                                                                                                                                            if ( (LA37_0==DELIMITER1) ) {
                                                                                                                                                                alt37=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt37) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:443:22: DELIMITER1 spec_field[\"^(PORT|CART|WHLC|WALK)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1603); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.31");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1607);
                                                                                                                                                                    spec_field("^(PORT|CART|WHLC|WALK)?$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:22: ( DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )? )?
                                                                                                                                                                    int alt36=2;
                                                                                                                                                                    int LA36_0 = input.LA(1);

                                                                                                                                                                    if ( (LA36_0==DELIMITER1) ) {
                                                                                                                                                                        alt36=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt36) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:23: DELIMITER1 spec_field[\"^.{0,300}$\", true, false] ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1656); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1660);
                                                                                                                                                                            spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:114: ( REPETITEUR spec_field[\"^.{0,300}$\", true, false] )*
                                                                                                                                                                            loop29:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt29=2;
                                                                                                                                                                                int LA29_0 = input.LA(1);

                                                                                                                                                                                if ( (LA29_0==REPETITEUR) ) {
                                                                                                                                                                                    alt29=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt29) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:115: REPETITEUR spec_field[\"^.{0,300}$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr1666); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("OBR.32");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_obr1670);
                                                                                                                                                                            	    spec_field("^.{0,300}$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop29;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:446:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )? )?
                                                                                                                                                                            int alt35=2;
                                                                                                                                                                            int LA35_0 = input.LA(1);

                                                                                                                                                                            if ( (LA35_0==DELIMITER1) ) {
                                                                                                                                                                                alt35=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt35) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:446:24: DELIMITER1 spec_sized_cna[\"OBR.33\", obr_33, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1700); if (state.failed) return ;

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1702);
                                                                                                                                                                                    spec_sized_cna("OBR.33", obr_33, 0, "^.{0,60}$");

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:447:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )? )?
                                                                                                                                                                                    int alt34=2;
                                                                                                                                                                                    int LA34_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA34_0==DELIMITER1) ) {
                                                                                                                                                                                        alt34=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt34) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:447:25: DELIMITER1 spec_sized_cna[\"OBR.34\", obr_34, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1729); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr1731);
                                                                                                                                                                                            spec_sized_cna("OBR.34", obr_34, 0, "^.{0,60}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:448:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )? )?
                                                                                                                                                                                            int alt33=2;
                                                                                                                                                                                            int LA33_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA33_0==DELIMITER1) ) {
                                                                                                                                                                                                alt33=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt33) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:448:26: DELIMITER1 spec_sized_cna[\"OBR.35\", obr_35, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1759); if (state.failed) return ;

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr1761);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", obr_35, 0, "^.{0,60}$");

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:449:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )? )?
                                                                                                                                                                                                    int alt32=2;
                                                                                                                                                                                                    int LA32_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA32_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt32=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt32) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:449:27: DELIMITER1 spec_sized_cna[\"OBR.36\", obr_36, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1790); if (state.failed) return ;

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr1792);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", obr_36, 0, "^.{0,60}$");

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:27: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )? )?
                                                                                                                                                                                                            int alt31=2;
                                                                                                                                                                                                            int LA31_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA31_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt31=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt31) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:28: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1822); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("OBR.37");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_obr1826);
                                                                                                                                                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:28: ( DELIMITER1 spec_field[\"^$\", true, false] )?
                                                                                                                                                                                                                    int alt30=2;
                                                                                                                                                                                                                    int LA30_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA30_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt30=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt30) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:29: DELIMITER1 spec_field[\"^$\", true, false]
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr1859); if (state.failed) return ;

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_obr1861);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:454:1: line_obx : CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) ;
    public final void line_obx() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:456:23: ( CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:457:3: CR LINE_OBX DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] DELIMITER1 ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx1933); if (state.failed) return ;

            match(input,LINE_OBX,FOLLOW_LINE_OBX_in_line_obx1935); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.1");content("OBX");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx1941); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBX.2");}

            pushFollow(FOLLOW_spec_field_in_line_obx1945);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx1952); if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:459:14: ( ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) | ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? ) | ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? ) | ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? ) )
            int alt76=7;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==CONTENT) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==DELIMITER1) ) {
                    int LA76_2 = input.LA(3);

                    if ( (LA76_2==CONTENT) ) {
                        int LA76_3 = input.LA(4);

                        if ( (synpred5_HPRIMS()) ) {
                            alt76=1;
                        }
                        else if ( (synpred6_HPRIMS()) ) {
                            alt76=2;
                        }
                        else if ( (synpred7_HPRIMS()) ) {
                            alt76=3;
                        }
                        else if ( (synpred8_HPRIMS()) ) {
                            alt76=4;
                        }
                        else if ( (synpred9_HPRIMS()) ) {
                            alt76=5;
                        }
                        else if ( (synpred10_HPRIMS()) ) {
                            alt76=6;
                        }
                        else if ( (synpred11_HPRIMS()) ) {
                            alt76=7;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:5: ( spec_field[\"^NM$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:42: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:461:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx1977);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx1988); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx1990);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:463:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )? )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==DELIMITER1) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:463:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2000); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2004);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:464:8: ( DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==DELIMITER1) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:464:9: DELIMITER1 spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2017); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2021);
                                    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:465:25: ( REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] )*
                                    loop56:
                                    do {
                                        int alt56=2;
                                        int LA56_0 = input.LA(1);

                                        if ( (LA56_0==REPETITEUR) ) {
                                            alt56=1;
                                        }


                                        switch (alt56) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:465:26: REPETITEUR spec_field[\"^(?!.{64001,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2035); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2039);
                                    	    spec_field("^(?!.{64001,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop56;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2054);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:6: ( spec_field[\"^CE$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:470:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2096);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2107); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2109);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:472:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==DELIMITER1) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:472:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2119); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2123);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==DELIMITER1) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2136); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2138);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop59:
                                    do {
                                        int alt59=2;
                                        int LA59_0 = input.LA(1);

                                        if ( (LA59_0==REPETITEUR) ) {
                                            alt59=1;
                                        }


                                        switch (alt59) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:473:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2142); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2144);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop59;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2157);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:477:6: ( spec_field[\"^FIC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:477:44: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2199);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2210); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2212);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:480:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==DELIMITER1) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:480:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2222); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2226);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:481:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==DELIMITER1) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:481:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2239); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2241);
                                    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:481:71: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"] )*
                                    loop62:
                                    do {
                                        int alt62=2;
                                        int LA62_0 = input.LA(1);

                                        if ( (LA62_0==REPETITEUR) ) {
                                            alt62=1;
                                        }


                                        switch (alt62) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:481:72: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_std, 0, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2245); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2247);
                                    	    lvl1_fields("OBX.6", obx_6_std, 0, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop62;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2260);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:6: ( spec_field[\"^ST$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:486:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2302);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2313); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2315);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==DELIMITER1) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:488:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2325); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2329);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==DELIMITER1) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2342); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2346);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop65:
                                    do {
                                        int alt65=2;
                                        int LA65_0 = input.LA(1);

                                        if ( (LA65_0==REPETITEUR) ) {
                                            alt65=1;
                                        }


                                        switch (alt65) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2352); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2354);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop65;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2367);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:6: ( spec_field[\"^GC$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:494:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2409);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2420); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2422);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:496:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )? )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DELIMITER1) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:496:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2432); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2436);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:8: ( DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==DELIMITER1) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:9: DELIMITER1 lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2449); if (state.failed) return ;

                                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2451);
                                    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    state._fsp--;
                                    if (state.failed) return ;

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:70: ( REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"] )*
                                    loop68:
                                    do {
                                        int alt68=2;
                                        int LA68_0 = input.LA(1);

                                        if ( (LA68_0==REPETITEUR) ) {
                                            alt68=1;
                                        }


                                        switch (alt68) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:497:71: REPETITEUR lvl1_fields[\"OBX.6\", obx_6_gc, 2, \"^.{0,64000}$\"]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2455); if (state.failed) return ;

                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_obx2457);
                                    	    lvl1_fields("OBX.6", obx_6_gc, 2, "^.{0,64000}$");

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop68;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2470);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:501:6: ( spec_field[\"^TX$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:501:43: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:502:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2512);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2523); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2525);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:504:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )? )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==DELIMITER1) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:504:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2535); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2539);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:8: ( DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==DELIMITER1) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:9: DELIMITER1 tx_field[\"^.{0,64000}$\", true, false] end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2552); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                                    pushFollow(FOLLOW_tx_field_in_line_obx2556);
                                    tx_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2569);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:509:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )=> ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:509:70: ( field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:510:7: field[true] DELIMITER1 lvl1_fields[\"OBX.4\", obx_4, 1, \"^.{1,200}$\"] ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    {
                    if ( state.backtracking==0 ) {startElement("OBX.3");}

                    pushFollow(FOLLOW_field_in_line_obx2611);
                    field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2622); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl1_fields_in_line_obx2624);
                    lvl1_fields("OBX.4", obx_4, 1, "^.{1,200}$");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:512:7: ( DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )? )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==DELIMITER1) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:512:8: DELIMITER1 spec_field[\"^.{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2634); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.5");}

                            pushFollow(FOLLOW_spec_field_in_line_obx2638);
                            spec_field("^.{0,10}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:513:8: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx )?
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==DELIMITER1) ) {
                                alt74=1;
                            }
                            switch (alt74) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:513:9: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* end_line_obx
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2651); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    pushFollow(FOLLOW_spec_field_in_line_obx2655);
                                    spec_field("^.{0,64000}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:513:101: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                                    loop73:
                                    do {
                                        int alt73=2;
                                        int LA73_0 = input.LA(1);

                                        if ( (LA73_0==REPETITEUR) ) {
                                            alt73=1;
                                        }


                                        switch (alt73) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:513:102: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2661); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.6");}

                                    	    pushFollow(FOLLOW_spec_field_in_line_obx2665);
                                    	    spec_field("^.{0,64000}$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop73;
                                        }
                                    } while (true);


                                    pushFollow(FOLLOW_end_line_obx_in_line_obx2680);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:518:1: end_line_obx : ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void end_line_obx() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:518:13: ( ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:3: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )? )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==DELIMITER1) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:519:4: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2707); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("OBX.7");}

                    pushFollow(FOLLOW_spec_field_in_end_line_obx2711);
                    spec_field("^.{0,20}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:520:4: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )? )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==DELIMITER1) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:520:5: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )* ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2720); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("OBX.8");}

                            pushFollow(FOLLOW_spec_field_in_end_line_obx2724);
                            spec_field("^.{0,60}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:520:94: ( REPETITEUR spec_field[\"^.{0,60}$\", true, false] )*
                            loop77:
                            do {
                                int alt77=2;
                                int LA77_0 = input.LA(1);

                                if ( (LA77_0==REPETITEUR) ) {
                                    alt77=1;
                                }


                                switch (alt77) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:520:95: REPETITEUR spec_field[\"^.{0,60}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx2730); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("OBX.8");}

                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx2734);
                            	    spec_field("^.{0,60}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop77;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:521:5: ( DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )? )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==DELIMITER1) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:521:6: DELIMITER1 spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2744); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    pushFollow(FOLLOW_spec_field_in_end_line_obx2748);
                                    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:521:137: ( REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false] )*
                                    loop78:
                                    do {
                                        int alt78=2;
                                        int LA78_0 = input.LA(1);

                                        if ( (LA78_0==REPETITEUR) ) {
                                            alt78=1;
                                        }


                                        switch (alt78) {
                                    	case 1 :
                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:521:138: REPETITEUR spec_field[\"^(L|H|LL|HH|\\\\<|\\\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$\", true, false]
                                    	    {
                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx2754); if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {startElement("OBX.9");}

                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx2758);
                                    	    spec_field("^(L|H|LL|HH|\\<|\\>|N|A|AA|Null|U|D|B|W|R|I|S|MS)?$", true, false);

                                    	    state._fsp--;
                                    	    if (state.failed) return ;

                                    	    if ( state.backtracking==0 ) {endElement();}

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop78;
                                        }
                                    } while (true);


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:522:6: ( DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )? )?
                                    int alt89=2;
                                    int LA89_0 = input.LA(1);

                                    if ( (LA89_0==DELIMITER1) ) {
                                        alt89=1;
                                    }
                                    switch (alt89) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:522:7: DELIMITER1 spec_field[\"^(?!.{6,})(?:\\\\+|-)?(?:(?:[0-9]+(?:\\\\.[0-9]*)?)|(?:[0-9]*(?:\\\\.[0-9]+)?))$\", true, false] ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2771); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("OBX.10");}

                                            pushFollow(FOLLOW_spec_field_in_end_line_obx2775);
                                            spec_field("^(?!.{6,})(?:\\+|-)?(?:(?:[0-9]+(?:\\.[0-9]*)?)|(?:[0-9]*(?:\\.[0-9]+)?))$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:7: ( DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )? )?
                                            int alt88=2;
                                            int LA88_0 = input.LA(1);

                                            if ( (LA88_0==DELIMITER1) ) {
                                                alt88=1;
                                            }
                                            switch (alt88) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:8: DELIMITER1 spec_field[\"^(A|S|R|N)?$\", true, false] ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2787); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx2791);
                                                    spec_field("^(A|S|R|N)?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:101: ( REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false] )*
                                                    loop79:
                                                    do {
                                                        int alt79=2;
                                                        int LA79_0 = input.LA(1);

                                                        if ( (LA79_0==REPETITEUR) ) {
                                                            alt79=1;
                                                        }


                                                        switch (alt79) {
                                                    	case 1 :
                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:523:102: REPETITEUR spec_field[\"^(A|S|R|N)?$\", true, false]
                                                    	    {
                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx2797); if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {startElement("OBX.11");}

                                                    	    pushFollow(FOLLOW_spec_field_in_end_line_obx2801);
                                                    	    spec_field("^(A|S|R|N)?$", true, false);

                                                    	    state._fsp--;
                                                    	    if (state.failed) return ;

                                                    	    if ( state.backtracking==0 ) {endElement();}

                                                    	    }
                                                    	    break;

                                                    	default :
                                                    	    break loop79;
                                                        }
                                                    } while (true);


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:524:8: ( DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )? )?
                                                    int alt87=2;
                                                    int LA87_0 = input.LA(1);

                                                    if ( (LA87_0==DELIMITER1) ) {
                                                        alt87=1;
                                                    }
                                                    switch (alt87) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:524:9: DELIMITER1 spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2816); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx2820);
                                                            spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:524:110: ( REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false] )*
                                                            loop80:
                                                            do {
                                                                int alt80=2;
                                                                int LA80_0 = input.LA(1);

                                                                if ( (LA80_0==REPETITEUR) ) {
                                                                    alt80=1;
                                                                }


                                                                switch (alt80) {
                                                            	case 1 :
                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:524:111: REPETITEUR spec_field[\"^(R|P|F|C|I|D|X|U)?$\", true, false]
                                                            	    {
                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_end_line_obx2826); if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {startElement("OBX.12");}

                                                            	    pushFollow(FOLLOW_spec_field_in_end_line_obx2830);
                                                            	    spec_field("^(R|P|F|C|I|D|X|U)?$", true, false);

                                                            	    state._fsp--;
                                                            	    if (state.failed) return ;

                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                            	    }
                                                            	    break;

                                                            	default :
                                                            	    break loop80;
                                                                }
                                                            } while (true);


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:525:9: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )? )?
                                                            int alt86=2;
                                                            int LA86_0 = input.LA(1);

                                                            if ( (LA86_0==DELIMITER1) ) {
                                                                alt86=1;
                                                            }
                                                            switch (alt86) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:525:10: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2847); if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {startElement("OBX.13");}

                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx2851);
                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:526:10: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )? )?
                                                                    int alt85=2;
                                                                    int LA85_0 = input.LA(1);

                                                                    if ( (LA85_0==DELIMITER1) ) {
                                                                        alt85=1;
                                                                    }
                                                                    switch (alt85) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:526:11: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2866); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx2870);
                                                                            spec_field("^.{0,20}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:11: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )? )?
                                                                            int alt84=2;
                                                                            int LA84_0 = input.LA(1);

                                                                            if ( (LA84_0==DELIMITER1) ) {
                                                                                alt84=1;
                                                                            }
                                                                            switch (alt84) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:527:12: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2886); if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {startElement("OBX.15");}

                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx2890);
                                                                                    spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:528:12: ( DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )? )?
                                                                                    int alt83=2;
                                                                                    int LA83_0 = input.LA(1);

                                                                                    if ( (LA83_0==DELIMITER1) ) {
                                                                                        alt83=1;
                                                                                    }
                                                                                    switch (alt83) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:528:13: DELIMITER1 lvl1_fields[\"OBX.16\", obx_16, 0, \"^.{0,60}$\"] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2907); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_lvl1_fields_in_end_line_obx2909);
                                                                                            lvl1_fields("OBX.16", obx_16, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:529:13: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )? )?
                                                                                            int alt82=2;
                                                                                            int LA82_0 = input.LA(1);

                                                                                            if ( (LA82_0==DELIMITER1) ) {
                                                                                                alt82=1;
                                                                                            }
                                                                                            switch (alt82) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:529:14: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2925); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("OBX.14");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_end_line_obx2929);
                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:14: ( DELIMITER1 spec_field[\"^$\", false, false] )?
                                                                                                    int alt81=2;
                                                                                                    int LA81_0 = input.LA(1);

                                                                                                    if ( (LA81_0==DELIMITER1) ) {
                                                                                                        alt81=1;
                                                                                                    }
                                                                                                    switch (alt81) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:530:15: DELIMITER1 spec_field[\"^$\", false, false]
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_obx2948); if (state.failed) return ;

                                                                                                            pushFollow(FOLLOW_spec_field_in_end_line_obx2950);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:533:1: line_p : CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:535:23: ( CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:536:3: CR LINE_P DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p2994); if (state.failed) return ;

            match(input,LINE_P,FOLLOW_LINE_P_in_line_p2996); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.1");content("P");endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3003); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.2");}

            pushFollow(FOLLOW_spec_field_in_line_p3007);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3014); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_p3016);
            lvl1_fields("P.3", p_3, 1, "^.{1,36}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3021); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.4");}

            pushFollow(FOLLOW_spec_field_in_line_p3025);
            spec_field("^.{0,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:540:3: ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==DELIMITER1) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:540:4: DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3033); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("P.5");}

                    pushFollow(FOLLOW_spec_field_in_line_p3037);
                    spec_field("^.{0,16}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:541:4: ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==DELIMITER1) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:541:5: DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3046); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_p3048);
                            lvl1_fields("P.6", p_6, 0, "^.{0,48}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:542:5: ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt125=2;
                            int LA125_0 = input.LA(1);

                            if ( (LA125_0==DELIMITER1) ) {
                                alt125=1;
                            }
                            switch (alt125) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:542:6: DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3056); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("P.7");}

                                    pushFollow(FOLLOW_spec_field_in_line_p3060);
                                    spec_field("^.{0,24}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt124=2;
                                    int LA124_0 = input.LA(1);

                                    if ( (LA124_0==DELIMITER1) ) {
                                        alt124=1;
                                    }
                                    switch (alt124) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:543:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3071); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("P.8");}

                                            pushFollow(FOLLOW_spec_field_in_line_p3075);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:544:7: ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt123=2;
                                            int LA123_0 = input.LA(1);

                                            if ( (LA123_0==DELIMITER1) ) {
                                                alt123=1;
                                            }
                                            switch (alt123) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:544:8: DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3087); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("P.9");}

                                                    pushFollow(FOLLOW_spec_field_in_line_p3091);
                                                    spec_field("^[M|F|U]?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:545:8: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt122=2;
                                                    int LA122_0 = input.LA(1);

                                                    if ( (LA122_0==DELIMITER1) ) {
                                                        alt122=1;
                                                    }
                                                    switch (alt122) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:545:9: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3104); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("P.10");}

                                                            pushFollow(FOLLOW_spec_field_in_line_p3108);
                                                            spec_field("^$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:546:9: ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt121=2;
                                                            int LA121_0 = input.LA(1);

                                                            if ( (LA121_0==DELIMITER1) ) {
                                                                alt121=1;
                                                            }
                                                            switch (alt121) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:546:10: DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3122); if (state.failed) return ;

                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p3124);
                                                                    lvl1_fields("P.11", p_11, 0, "^.{0,200}$");

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:10: ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt120=2;
                                                                    int LA120_0 = input.LA(1);

                                                                    if ( (LA120_0==DELIMITER1) ) {
                                                                        alt120=1;
                                                                    }
                                                                    switch (alt120) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:547:11: DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3137); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("P.12");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_p3141);
                                                                            spec_field("^.{0,120}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:548:11: ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt119=2;
                                                                            int LA119_0 = input.LA(1);

                                                                            if ( (LA119_0==DELIMITER1) ) {
                                                                                alt119=1;
                                                                            }
                                                                            switch (alt119) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:548:12: DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3157); if (state.failed) return ;

                                                                                    pushFollow(FOLLOW_lvl1_fields_repet_in_line_p3159);
                                                                                    lvl1_fields_repet("P.13", p_13, 0, "^.{0,40}$");

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:12: ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt118=2;
                                                                                    int LA118_0 = input.LA(1);

                                                                                    if ( (LA118_0==DELIMITER1) ) {
                                                                                        alt118=1;
                                                                                    }
                                                                                    switch (alt118) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:13: DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3198); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p3200);
                                                                                            spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:69: ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )*
                                                                                            loop93:
                                                                                            do {
                                                                                                int alt93=2;
                                                                                                int LA93_0 = input.LA(1);

                                                                                                if ( (LA93_0==REPETITEUR) ) {
                                                                                                    alt93=1;
                                                                                                }


                                                                                                switch (alt93) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:551:70: REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3204); if (state.failed) return ;

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p3206);
                                                                                            	    spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            	    state._fsp--;
                                                                                            	    if (state.failed) return ;

                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop93;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:552:13: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt117=2;
                                                                                            int LA117_0 = input.LA(1);

                                                                                            if ( (LA117_0==DELIMITER1) ) {
                                                                                                alt117=1;
                                                                                            }
                                                                                            switch (alt117) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:552:14: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3224); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("P.15");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3228);
                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:553:14: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt116=2;
                                                                                                    int LA116_0 = input.LA(1);

                                                                                                    if ( (LA116_0==DELIMITER1) ) {
                                                                                                        alt116=1;
                                                                                                    }
                                                                                                    switch (alt116) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:553:15: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3247); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("P.16");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3251);
                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:15: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt115=2;
                                                                                                            int LA115_0 = input.LA(1);

                                                                                                            if ( (LA115_0==DELIMITER1) ) {
                                                                                                                alt115=1;
                                                                                                            }
                                                                                                            switch (alt115) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:555:16: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3286); if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {startElement("P.17");}

                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3290);
                                                                                                                    spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:557:16: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt114=2;
                                                                                                                    int LA114_0 = input.LA(1);

                                                                                                                    if ( (LA114_0==DELIMITER1) ) {
                                                                                                                        alt114=1;
                                                                                                                    }
                                                                                                                    switch (alt114) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:557:17: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3327); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("P.18");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3331);
                                                                                                                            spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:558:17: ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt113=2;
                                                                                                                            int LA113_0 = input.LA(1);

                                                                                                                            if ( (LA113_0==DELIMITER1) ) {
                                                                                                                                alt113=1;
                                                                                                                            }
                                                                                                                            switch (alt113) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:558:18: DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3353); if (state.failed) return ;

                                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p3355);
                                                                                                                                    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:558:72: ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )*
                                                                                                                                    loop94:
                                                                                                                                    do {
                                                                                                                                        int alt94=2;
                                                                                                                                        int LA94_0 = input.LA(1);

                                                                                                                                        if ( (LA94_0==REPETITEUR) ) {
                                                                                                                                            alt94=1;
                                                                                                                                        }


                                                                                                                                        switch (alt94) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:558:73: REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3359); if (state.failed) return ;

                                                                                                                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_p3361);
                                                                                                                                    	    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    	    state._fsp--;
                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop94;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:18: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt112=2;
                                                                                                                                    int LA112_0 = input.LA(1);

                                                                                                                                    if ( (LA112_0==DELIMITER1) ) {
                                                                                                                                        alt112=1;
                                                                                                                                    }
                                                                                                                                    switch (alt112) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:19: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3384); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3388);
                                                                                                                                            spec_field("^.{0,200}$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:108: ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )*
                                                                                                                                            loop95:
                                                                                                                                            do {
                                                                                                                                                int alt95=2;
                                                                                                                                                int LA95_0 = input.LA(1);

                                                                                                                                                if ( (LA95_0==REPETITEUR) ) {
                                                                                                                                                    alt95=1;
                                                                                                                                                }


                                                                                                                                                switch (alt95) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:559:109: REPETITEUR spec_field[\"^.{0,200}$\", true, false]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3394); if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p3398);
                                                                                                                                            	    spec_field("^.{0,200}$", true, false);

                                                                                                                                            	    state._fsp--;
                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop95;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:560:19: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt111=2;
                                                                                                                                            int LA111_0 = input.LA(1);

                                                                                                                                            if ( (LA111_0==DELIMITER1) ) {
                                                                                                                                                alt111=1;
                                                                                                                                            }
                                                                                                                                            switch (alt111) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:560:20: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3424); if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.21");}

                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3428);
                                                                                                                                                    spec_field("^.{0,200}$", true, false);

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:561:20: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt110=2;
                                                                                                                                                    int LA110_0 = input.LA(1);

                                                                                                                                                    if ( (LA110_0==DELIMITER1) ) {
                                                                                                                                                        alt110=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt110) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:561:21: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3453); if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.22");}

                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3457);
                                                                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:21: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt109=2;
                                                                                                                                                            int LA109_0 = input.LA(1);

                                                                                                                                                            if ( (LA109_0==DELIMITER1) ) {
                                                                                                                                                                alt109=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt109) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:562:22: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3483); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.23");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3487);
                                                                                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:22: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt108=2;
                                                                                                                                                                    int LA108_0 = input.LA(1);

                                                                                                                                                                    if ( (LA108_0==DELIMITER1) ) {
                                                                                                                                                                        alt108=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt108) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:23: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3514); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3518);
                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:151: ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )*
                                                                                                                                                                            loop96:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt96=2;
                                                                                                                                                                                int LA96_0 = input.LA(1);

                                                                                                                                                                                if ( (LA96_0==REPETITEUR) ) {
                                                                                                                                                                                    alt96=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt96) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:563:152: REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p3524); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p3528);
                                                                                                                                                                            	    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop96;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:564:23: ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt107=2;
                                                                                                                                                                            int LA107_0 = input.LA(1);

                                                                                                                                                                            if ( (LA107_0==DELIMITER1) ) {
                                                                                                                                                                                alt107=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt107) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:564:24: DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3558); if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.25");}

                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3562);
                                                                                                                                                                                    spec_field("^(OP|IP|ER|PA|MP)?^$", true, false);

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:565:24: ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt106=2;
                                                                                                                                                                                    int LA106_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA106_0==DELIMITER1) ) {
                                                                                                                                                                                        alt106=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt106) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:565:25: DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3591); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_p3593);
                                                                                                                                                                                            lvl1_fields("P.26", p_26, 0, "^.{0,100}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:25: ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt105=2;
                                                                                                                                                                                            int LA105_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA105_0==DELIMITER1) ) {
                                                                                                                                                                                                alt105=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt105) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:567:26: DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3646); if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.27");}

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3650);
                                                                                                                                                                                                    spec_field("^.{0,100}$", true, false);

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:568:26: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt104=2;
                                                                                                                                                                                                    int LA104_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA104_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt104=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt104) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:568:27: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3681); if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.28");}

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3685);
                                                                                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:570:27: ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt103=2;
                                                                                                                                                                                                            int LA103_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA103_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt103=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt103) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:570:28: DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3744); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.29");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3748);
                                                                                                                                                                                                                    spec_field("^.{0,2}$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:572:28: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt102=2;
                                                                                                                                                                                                                    int LA102_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA102_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt102=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt102) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:572:29: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3809); if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.30");}

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3813);
                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:573:29: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt101=2;
                                                                                                                                                                                                                            int LA101_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA101_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt101=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt101) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:573:30: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3847); if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.31");}

                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3851);
                                                                                                                                                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:575:30: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt100=2;
                                                                                                                                                                                                                                    int LA100_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA100_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt100=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt100) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:575:31: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3916); if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.32");}

                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p3920);
                                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:576:31: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt99=2;
                                                                                                                                                                                                                                            int LA99_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA99_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt99=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt99) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:576:32: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3956); if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.33");}

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p3960);
                                                                                                                                                                                                                                                    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:577:32: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt98=2;
                                                                                                                                                                                                                                                    int LA98_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA98_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt98=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt98) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:577:33: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p3997); if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.34");}

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p4001);
                                                                                                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt97=2;
                                                                                                                                                                                                                                                            int LA97_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA97_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt97=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt97) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:578:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p4038); if (state.failed) return ;

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:581:1: spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] :h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_sized_cna(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        HPRIMSParser.field_return h =null;

        String i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:583:22: (h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:584:3: h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            if ( state.backtracking==0 ) {startElement(nameElement + ".1");}

            pushFollow(FOLLOW_field_in_spec_sized_cna4122);
            h=field(true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:585:4: ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==DELIMITER2) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:585:5: DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4131); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl2_fields_in_spec_sized_cna4135);
                    i=lvl2_fields(nameElement + ".2", patterns, nbMandatory, ".*");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:586:5: ( DELIMITER2 j= field[true] )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==DELIMITER2) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:586:6: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4143); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_sized_cna4149);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:589:1: spec_obr_16[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_obr_16(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String h =null;

        HPRIMSParser.field_return i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:591:22: (h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:592:3: h= lvl2_fields[$nameElement + \".1\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            pushFollow(FOLLOW_lvl2_fields_in_spec_obr_164180);
            h=lvl2_fields(nameElement + ".1", patterns, nbMandatory, ".*");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:3: ( DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )? )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==DELIMITER2) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:593:4: DELIMITER2 i= field[true] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_164186); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement(nameElement + ".2");}

                    pushFollow(FOLLOW_field_in_spec_obr_164192);
                    i=field(true);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:594:4: ( DELIMITER2 j= field[true] )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==DELIMITER2) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:594:5: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_obr_164201); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_obr_164207);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:599:1: lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl1_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:601:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:602:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_fields4245);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:604:1: lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:604:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt134=3;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==CONTENT) ) {
                int LA134_1 = input.LA(2);

                if ( (LA134_1==DELIMITER2) && ((size < nbMandatory))) {
                    alt134=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt134=1;
                }
                else if ( (true) ) {
                    alt134=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 134, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;

            }
            switch (alt134) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:605:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4273);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:38: ({...}? DELIMITER2 spec_field[\"\", false, false] )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==DELIMITER2) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:606:39: {...}? DELIMITER2 spec_field[\"\", false, false]
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "strictNess <= 2");
                            }

                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4318); if (state.failed) return contentText;

                            pushFollow(FOLLOW_spec_field_in_lvl1_subfields4320);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:609:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4380);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4417); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields4421);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:613:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:613:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:613:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields4470);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:614:6: ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==DELIMITER2) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==EOF||(LA133_0 >= CR && LA133_0 <= DELIMITER1)||LA133_0==REPETITEUR) ) {
                        alt133=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;

                    }
                    switch (alt133) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:614:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:614:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:614:8: DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields4482); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields4486);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:615:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:618:1: lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final void lvl1_fields_repet(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:620:23: (r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:621:3: r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet4529);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:623:1: lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields_repet(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:623:173: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt138=3;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==CONTENT) ) {
                int LA138_1 = input.LA(2);

                if ( (LA138_1==REPETITEUR) && ((size < nbMandatory))) {
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:624:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:624:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:624:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4553);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:38: ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |)
                    int alt136=2;
                    switch ( input.LA(1) ) {
                    case REPETITEUR:
                        {
                        alt136=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA136_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt136=1;
                        }
                        else if ( (true) ) {
                            alt136=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 136, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA136_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt136=1;
                        }
                        else if ( (true) ) {
                            alt136=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 136, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA136_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt136=1;
                        }
                        else if ( (true) ) {
                            alt136=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 136, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 136, 0, input);

                        throw nvae;

                    }

                    switch (alt136) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:39: {...}? ( REPETITEUR spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:58: ( REPETITEUR spec_field[\"\", false, false] )?
                            int alt135=2;
                            int LA135_0 = input.LA(1);

                            if ( (LA135_0==REPETITEUR) ) {
                                alt135=1;
                            }
                            switch (alt135) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:59: REPETITEUR spec_field[\"\", false, false]
                                    {
                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet4599); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4601);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:625:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:30: (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:628:31: g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4665);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet4702); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet4706);
                    h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:632:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:632:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:632:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet4755);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:6: ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==REPETITEUR) ) {
                        alt137=1;
                    }
                    else if ( (LA137_0==EOF||(LA137_0 >= CR && LA137_0 <= DELIMITER1)) ) {
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
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:633:8: REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet4767); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet4771);
                            h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:634:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:638:1: lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl2_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:640:23: (r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:641:3: r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_fields4819);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:643:1: lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl2_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:643:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt142=3;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==CONTENT) ) {
                int LA142_1 = input.LA(2);

                if ( (LA142_1==DELIMITER3) && ((size < nbMandatory))) {
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:644:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:644:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:644:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields4845);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:645:38: ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |)
                    int alt140=2;
                    switch ( input.LA(1) ) {
                    case DELIMITER3:
                        {
                        alt140=1;
                        }
                        break;
                    case DELIMITER2:
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
                    case DELIMITER1:
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
                    case REPETITEUR:
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
                    case CR:
                        {
                        int LA140_5 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt140=1;
                        }
                        else if ( (true) ) {
                            alt140=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA140_6 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt140=1;
                        }
                        else if ( (true) ) {
                            alt140=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 6, input);

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
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:645:39: {...}? ( DELIMITER3 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:645:58: ( DELIMITER3 spec_field[\"\", false, false] )?
                            int alt139=2;
                            int LA139_0 = input.LA(1);

                            if ( (LA139_0==DELIMITER3) ) {
                                alt139=1;
                            }
                            switch (alt139) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:645:59: DELIMITER3 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields4891); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields4893);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:645:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:648:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:648:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:648:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields4957);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields4994); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields4998);
                    h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:652:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:652:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:652:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields5047);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:653:6: ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==DELIMITER3) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==EOF||(LA141_0 >= CR && LA141_0 <= DELIMITER2)||LA141_0==REPETITEUR) ) {
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
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:653:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:653:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:653:8: DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields5059); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields5063);
                            h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:654:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:658:1: spec_field[String fieldPattern, boolean record, boolean forceRegex] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:658:69: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:659:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern, forceRegex))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field5101); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:664:1: field[boolean record] : CONTENT ;
    public final HPRIMSParser.field_return field(boolean record) throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:664:23: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:665:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field5117); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:669:1: tx_field[String fieldPattern, boolean record, boolean forceRegex] : tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] ;
    public final void tx_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:669:67: ( tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:670:3: tx_field_internal[$fieldPattern, new StringBuilder(), $record, $forceRegex]
            {
            pushFollow(FOLLOW_tx_field_internal_in_tx_field5133);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:1: tx_field_internal[String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex] : (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) ;
    public final void tx_field_internal(String fieldPattern, StringBuilder recorded, boolean record, boolean forceRegex) throws RecognitionException {
        Token h=null;

        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:672:100: ( (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:673:3: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )? ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:673:4: (h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==CONTENT||(LA143_0 >= DELIMITER2 && LA143_0 <= DELIMITER3)) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:673:4: h= ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:673:5: ( ( CONTENT | DELIMITER2 | DELIMITER3 ) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:673:6: ( CONTENT | DELIMITER2 | DELIMITER3 )
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:5: ( ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] ) |{...}?)
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==REPETITEUR) ) {
                alt144=1;
            }
            else if ( (LA144_0==EOF||(LA144_0 >= CR && LA144_0 <= DELIMITER1)) ) {
                alt144=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;

            }
            switch (alt144) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:6: ( REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:674:7: REPETITEUR tx_field_internal[$fieldPattern, $recorded.append('\\n'), $record, $forceRegex]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_tx_field_internal5170); if (state.failed) return ;

                    pushFollow(FOLLOW_tx_field_internal_in_tx_field_internal5172);
                    tx_field_internal(fieldPattern, recorded.append('\n'), record, forceRegex);

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:675:6: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:678:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:678:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:679:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5198); if (state.failed) return retval;

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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:270:3: ( line_h2_2_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:270:4: line_h2_2_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:273:3: ( line_h2_1_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:273:4: line_h2_1_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:276:3: ( line_h2_0_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:276:4: line_h2_0_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:279:3: ( line_h2_2_adm[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:279:4: line_h2_2_adm[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:5: ( spec_field[\"^NM$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:6: spec_field[\"^NM$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred5_HPRIMS1961);
        spec_field("^NM$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_HPRIMS

    // $ANTLR start synpred6_HPRIMS
    public final void synpred6_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:6: ( spec_field[\"^CE$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:7: spec_field[\"^CE$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred6_HPRIMS2080);
        spec_field("^CE$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_HPRIMS

    // $ANTLR start synpred7_HPRIMS
    public final void synpred7_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:477:6: ( spec_field[\"^FIC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:477:7: spec_field[\"^FIC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred7_HPRIMS2183);
        spec_field("^FIC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_HPRIMS

    // $ANTLR start synpred8_HPRIMS
    public final void synpred8_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:6: ( spec_field[\"^ST$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:485:7: spec_field[\"^ST$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred8_HPRIMS2286);
        spec_field("^ST$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_HPRIMS

    // $ANTLR start synpred9_HPRIMS
    public final void synpred9_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:6: ( spec_field[\"^GC$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:493:7: spec_field[\"^GC$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred9_HPRIMS2393);
        spec_field("^GC$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_HPRIMS

    // $ANTLR start synpred10_HPRIMS
    public final void synpred10_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:501:6: ( spec_field[\"^TX$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:501:7: spec_field[\"^TX$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred10_HPRIMS2496);
        spec_field("^TX$", false, true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_HPRIMS

    // $ANTLR start synpred11_HPRIMS
    public final void synpred11_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:509:6: ( spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:509:7: spec_field[\"^(AD|CK|CNA|DT|PN|RT|TN|GB|GN)$\", false, true]
        {
        pushFollow(FOLLOW_spec_field_in_synpred11_HPRIMS2595);
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
    public static final BitSet FOLLOW_CR_in_line_ap258 = new BitSet(new long[]{0x0000000000000400L});
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
    public static final BitSet FOLLOW_CR_in_line_c574 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LINE_C_in_line_c576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c587 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c599 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c612 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c622 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c636 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_line_c638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_H_in_start_line_h659 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h667 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h677 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_midd_line_h718 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h727 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_midd_line_h736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_2772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_2776 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_2794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_1812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_1816 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_1834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_0852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_0856 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_0874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_0878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h898 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h906 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_oru923 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_oru927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_oru931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_oru938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_2_oru957 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru961 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_oru965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_1_oru984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_1_in_line_h2_1_oru988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_1_oru992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_0_oru1011 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_0_in_line_h2_0_oru1015 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_0_oru1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_adm1030 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_adm1034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_adm1038 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_adm1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_2_adm1064 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm1068 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_adm1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr1094 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LINE_OBR_in_line_obr1096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1129 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1135 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1149 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1159 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1172 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1190 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1213 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1225 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1238 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1249 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1263 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_obr_16_in_line_obr1276 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1288 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_obr1301 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1317 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1336 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1356 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1377 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1399 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1422 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1444 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1467 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1493 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1520 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1546 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1552 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr1579 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1607 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1660 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr1666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1670 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1702 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1731 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1761 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr1792 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1826 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr1859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx1933 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LINE_OBX_in_line_obx1935 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx1941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx1945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx1952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_line_obx1977 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx1988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx1990 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2004 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2021 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2039 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2109 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2123 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2138 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2144 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2212 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2226 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2241 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2247 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2315 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2329 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2346 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2354 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2409 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2422 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2436 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2451 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2457 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2512 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2525 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2539 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2552 = new BitSet(new long[]{0x0000000000020190L});
    public static final BitSet FOLLOW_tx_field_in_line_obx2556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_line_obx2611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obx2624 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2638 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2655 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obx2665 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_end_line_obx_in_line_obx2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2711 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2724 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx2730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2734 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2748 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx2754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2758 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2775 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2791 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx2797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2801 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2820 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_end_line_obx2826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2830 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2851 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2870 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2890 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_end_line_obx2909 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2929 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_obx2948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_obx2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p2994 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LINE_P_in_line_p2996 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3007 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3025 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3037 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3048 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3060 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3075 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3091 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3108 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3124 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3141 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_p3159 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p3200 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p3206 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3228 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3251 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3290 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3331 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3355 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3361 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3388 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3398 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3428 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3457 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3487 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3518 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p3524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3528 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3562 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p3593 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3650 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3685 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3748 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3813 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3851 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3920 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p3960 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p3997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p4001 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna4122 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_sized_cna4135 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_obr_164180 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_164186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_164192 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_obr_164201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_obr_164207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_fields4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4273 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4380 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields4470 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields4482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4553 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet4599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4665 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet4702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet4755 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet4767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_fields4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields4845 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields4891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields4957 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields4994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields5047 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields5059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tx_field_internal5148 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_REPETITEUR_in_tx_field_internal5170 = new BitSet(new long[]{0x0000000000020190L});
    public static final BitSet FOLLOW_tx_field_internal_in_tx_field_internal5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_synpred1_HPRIMS75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_synpred2_HPRIMS106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_synpred3_HPRIMS137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_synpred4_HPRIMS168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred5_HPRIMS1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred6_HPRIMS2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred7_HPRIMS2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred8_HPRIMS2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred9_HPRIMS2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred10_HPRIMS2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_synpred11_HPRIMS2595 = new BitSet(new long[]{0x0000000000000002L});

}