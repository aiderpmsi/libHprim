// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-01 13:06:26

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTENT", "CR", "DELIMITER1", "DELIMITER2", "DELIMITER3", "DELIMITERS", "REPETITEUR"
    };

    public static final int EOF=-1;
    public static final int CONTENT=4;
    public static final int CR=5;
    public static final int DELIMITER1=6;
    public static final int DELIMITER2=7;
    public static final int DELIMITER3=8;
    public static final int DELIMITERS=9;
    public static final int REPETITEUR=10;

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
      private final static List<String> h_5 = Arrays.asList(new String[] {"^.{1,}$", "^.{1,}$"});
      private final static List<String> h_6 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> h_8 = Arrays.asList(new String[] {".*", ".*"});
      private final static List<String> h_10 = Arrays.asList(new String[] {"^.{1,}$", "^.{1,}$"});
      private final static List<String> p_3 = Arrays.asList(new String[] {"^.{1,}$", ".*", ".*"});
      private final static List<String> p_6 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> p_11 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> p_13 = Arrays.asList(new String[] {".*", ".*"});

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




    // $ANTLR start "hprim"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:238:1: hprim[int strictNess] : ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) );
    public final void hprim(int strictNess) throws RecognitionException {
        this.strictNess = strictNess;startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:240:24: ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DELIMITERS) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred1_HPRIMS()) ) {
                    alt3=1;
                }
                else if ( (synpred2_HPRIMS()) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:241:3: ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:242:5: ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:242:6: line_h2_2_oru[true] ( body_p_oru )+ EOF
                    {
                    pushFollow(FOLLOW_line_h2_2_oru_in_hprim86);
                    line_h2_2_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:242:26: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:242:26: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim89);
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


                    match(input,EOF,FOLLOW_EOF_in_hprim92); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:244:3: ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:245:5: ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:245:6: line_h2_2_adm[true] ( body_p_oru )+ EOF
                    {
                    pushFollow(FOLLOW_line_h2_2_adm_in_hprim113);
                    line_h2_2_adm(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:245:26: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:245:26: body_p_oru
                    	    {
                    	    pushFollow(FOLLOW_body_p_oru_in_hprim116);
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


                    match(input,EOF,FOLLOW_EOF_in_hprim119); if (state.failed) return ;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:248:1: body_p_oru : line_p ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:248:12: ( line_p )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:249:3: line_p
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru133);
            line_p();

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
    // $ANTLR end "body_p_oru"



    // $ANTLR start "start_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:256:1: start_line_h : delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:256:14: ( delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:257:3: delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"]
            {
            if ( state.backtracking==0 ) {startElement("H.1");content("H");endElement();}

            if ( state.backtracking==0 ) {startElement("H.2");}

            pushFollow(FOLLOW_delimiters_in_start_line_h154);
            delimiters();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h160); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.3");}

            pushFollow(FOLLOW_spec_field_in_start_line_h164);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h171); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.4");}

            pushFollow(FOLLOW_spec_field_in_start_line_h175);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h182); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h184);
            lvl1_fields("H.5", h_5, 2, "^.{0,15}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h189); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h191);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:265:1: midd_line_h : DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:265:13: ( DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:266:3: DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h203); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_midd_line_h205);
            lvl1_fields_repet("H.8", h_8, 0, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h210); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.9");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h214);
            spec_field("^.{0,40}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h221); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_midd_line_h223);
            lvl1_fields("H.10", h_10, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h228); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.11");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h232);
            spec_field("^.{0,80}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h239); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.12");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h243);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:273:1: bloc_line_h_2_2 : DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:273:17: ( DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:274:5: DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_2259); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_2263);
            spec_field("^H2\\.2$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_2281); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_2285);
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



    // $ANTLR start "end_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:1: end_line_h : DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? ( spec_field[\"\", false, false] )? ;
    public final void end_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:12: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? ( spec_field[\"\", false, false] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:279:3: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? ( spec_field[\"\", false, false] )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h301); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.14");}

            pushFollow(FOLLOW_spec_field_in_end_line_h305);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:3: ( DELIMITER1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DELIMITER1) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h312); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:15: ( spec_field[\"\", false, false] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONTENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:280:15: spec_field[\"\", false, false]
                    {
                    pushFollow(FOLLOW_spec_field_in_end_line_h315);
                    spec_field("", false, false);

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
    // $ANTLR end "end_line_h"



    // $ANTLR start "start_line_h_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:1: start_line_h_oru : start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h ;
    public final void start_line_h_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:283:18: ( start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:284:3: start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_oru328);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_oru332); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_oru336);
            spec_field("^ORU$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_oru343);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:288:1: line_h2_2_oru[boolean record] : start_line_h_oru bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:290:23: ( start_line_h_oru bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:291:3: start_line_h_oru bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_2_oru362);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru366);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_oru370);
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



    // $ANTLR start "start_line_h_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:1: start_line_h_adm : start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h ;
    public final void start_line_h_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:296:18: ( start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:297:3: start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_adm381);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_adm385); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_adm389);
            spec_field("^ADM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_adm396);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:1: line_h2_2_adm[boolean record] : start_line_h_adm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_adm(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:303:23: ( start_line_h_adm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:304:3: start_line_h_adm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_2_adm415);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm419);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_adm423);
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



    // $ANTLR start "line_p"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:309:1: line_p : CR spec_field[\"^P$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:23: ( CR spec_field[\"^P$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:312:3: CR spec_field[\"^P$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p442); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.1");}

            pushFollow(FOLLOW_spec_field_in_line_p446);
            spec_field("^P$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p454); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.2");}

            pushFollow(FOLLOW_spec_field_in_line_p458);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p465); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_p467);
            lvl1_fields("P.3", p_3, 1, "^.{1,36}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p472); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.4");}

            pushFollow(FOLLOW_spec_field_in_line_p476);
            spec_field("^.{0,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:3: ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )? )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DELIMITER1) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:316:4: DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p484); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("P.5");}

                    pushFollow(FOLLOW_spec_field_in_line_p488);
                    spec_field("^.{0,16}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:4: ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==DELIMITER1) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:5: DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p497); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_p499);
                            lvl1_fields("P.6", p_6, 0, "^.{0,48}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:318:5: ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )? )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==DELIMITER1) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:318:6: DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p507); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("P.7");}

                                    pushFollow(FOLLOW_spec_field_in_line_p511);
                                    spec_field("^.{0,24}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )? )?
                                    int alt11=2;
                                    int LA11_0 = input.LA(1);

                                    if ( (LA11_0==DELIMITER1) ) {
                                        alt11=1;
                                    }
                                    switch (alt11) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:319:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p522); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("P.8");}

                                            pushFollow(FOLLOW_spec_field_in_line_p526);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:7: ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )? )?
                                            int alt10=2;
                                            int LA10_0 = input.LA(1);

                                            if ( (LA10_0==DELIMITER1) ) {
                                                alt10=1;
                                            }
                                            switch (alt10) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:320:8: DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p538); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("P.9");}

                                                    pushFollow(FOLLOW_spec_field_in_line_p542);
                                                    spec_field("^[M|F|U]?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:321:8: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )? )?
                                                    int alt9=2;
                                                    int LA9_0 = input.LA(1);

                                                    if ( (LA9_0==DELIMITER1) ) {
                                                        alt9=1;
                                                    }
                                                    switch (alt9) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:321:9: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p555); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("P.10");}

                                                            pushFollow(FOLLOW_spec_field_in_line_p559);
                                                            spec_field("^$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:9: ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )? )?
                                                            int alt8=2;
                                                            int LA8_0 = input.LA(1);

                                                            if ( (LA8_0==DELIMITER1) ) {
                                                                alt8=1;
                                                            }
                                                            switch (alt8) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:10: DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p573); if (state.failed) return ;

                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p575);
                                                                    lvl1_fields("P.11", p_11, 0, "^.{0,200}$");

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:10: ( spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )? )?
                                                                    int alt7=2;
                                                                    int LA7_0 = input.LA(1);

                                                                    if ( (LA7_0==CONTENT) ) {
                                                                        alt7=1;
                                                                    }
                                                                    switch (alt7) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:323:11: spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )?
                                                                            {
                                                                            if ( state.backtracking==0 ) {startElement("P.12");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_p590);
                                                                            spec_field("^.{0,120}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:324:11: ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] )?
                                                                            int alt6=2;
                                                                            int LA6_0 = input.LA(1);

                                                                            if ( (LA6_0==DELIMITER1) ) {
                                                                                alt6=1;
                                                                            }
                                                                            switch (alt6) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:324:12: DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"]
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p606); if (state.failed) return ;

                                                                                    pushFollow(FOLLOW_lvl1_fields_repet_in_line_p608);
                                                                                    lvl1_fields_repet("P.13", p_13, 0, "^.{0,40}$");

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:359:1: spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] :h= field[true, false] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] (j= field[true, false] )? )? ;
    public final void spec_sized_cna(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        HPRIMSParser.field_return h =null;

        String i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:361:22: (h= field[true, false] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] (j= field[true, false] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:362:3: h= field[true, false] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] (j= field[true, false] )? )?
            {
            if ( state.backtracking==0 ) {startElement(nameElement + ".1")}

            pushFollow(FOLLOW_field_in_spec_sized_cna839);
            h=field(true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:363:4: ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] (j= field[true, false] )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DELIMITER2) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:363:5: DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] (j= field[true, false] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna848); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl2_fields_in_spec_sized_cna852);
                    i=lvl2_fields(nameElement + ".2", patterns, nbMandatory, ".*");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:5: (j= field[true, false] )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==CONTENT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:364:6: j= field[true, false]
                            {
                            if ( state.backtracking==0 ) {startElement(nameElement + ".3")}

                            pushFollow(FOLLOW_field_in_spec_sized_cna864);
                            j=field(true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {matchRegex(((h!=null?input.toString(h.start,h.stop):null) == null ? "" : (h!=null?input.toString(h.start,h.stop):null)) + (i == null ? "" : i) + ((j!=null?input.toString(j.start,j.stop):null) == null ? "" : (j!=null?input.toString(j.start,j.stop):null)));}

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



    // $ANTLR start "lvl1_fields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:369:1: lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl1_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:371:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:372:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_fields902);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:374:1: lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER2 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:374:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER2 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CONTENT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DELIMITER2) && ((size < nbMandatory))) {
                    alt20=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:375:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER2 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:375:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER2 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:375:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER2 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields928);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:376:38: ({...}? ( DELIMITER2 spec_field[\"\", false, false] )? |)
                    int alt18=2;
                    switch ( input.LA(1) ) {
                    case DELIMITER2:
                        {
                        alt18=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA18_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA18_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA18_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CONTENT:
                        {
                        int LA18_5 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }

                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:376:39: {...}? ( DELIMITER2 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:376:58: ( DELIMITER2 spec_field[\"\", false, false] )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==DELIMITER2) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:376:59: DELIMITER2 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields974); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields976);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:376:103: 
                            {
                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {contentText = recorded.toString()}

                    if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                    }

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:379:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:379:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:379:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields1040);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields1077); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields1081);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:383:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:383:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:383:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields1130);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:6: ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==DELIMITER2) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==EOF||(LA19_0 >= CONTENT && LA19_0 <= DELIMITER1)) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:8: DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields1142); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields1146);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:385:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:388:1: lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final void lvl1_fields_repet(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:390:23: (r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:391:3: r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet1189);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:393:1: lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields_repet(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:393:173: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CONTENT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==REPETITEUR) && ((size < nbMandatory))) {
                    alt24=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet1213);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:38: ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |)
                    int alt22=2;
                    switch ( input.LA(1) ) {
                    case REPETITEUR:
                        {
                        alt22=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA22_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt22=1;
                        }
                        else if ( (true) ) {
                            alt22=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA22_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt22=1;
                        }
                        else if ( (true) ) {
                            alt22=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA22_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt22=1;
                        }
                        else if ( (true) ) {
                            alt22=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }

                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:39: {...}? ( REPETITEUR spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:58: ( REPETITEUR spec_field[\"\", false, false] )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==REPETITEUR) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:59: REPETITEUR spec_field[\"\", false, false]
                                    {
                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet1259); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet1261);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:103: 
                            {
                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {contentText = recorded.toString()}

                    if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                    }

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:30: (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:31: g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet1325);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet1362); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields_repet1366);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet1415);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:403:6: ( ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==REPETITEUR) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==EOF||(LA23_0 >= CR && LA23_0 <= DELIMITER1)) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:403:7: ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:403:7: ( REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:403:8: REPETITEUR h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet1427); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields_repet1431);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:404:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:408:1: lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl2_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:410:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:411:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl2_fields1479);
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
    // $ANTLR end "lvl2_fields"



    // $ANTLR start "lvl2_subfields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:1: lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl2_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CONTENT) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==DELIMITER3) && ((size < nbMandatory))) {
                    alt28=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields1505);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:38: ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |)
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DELIMITER3) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==EOF) ) {
                        int LA26_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt26=1;
                        }
                        else if ( (true) ) {
                            alt26=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 2, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:39: {...}? ( DELIMITER3 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:58: ( DELIMITER3 spec_field[\"\", false, false] )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==DELIMITER3) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:59: DELIMITER3 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields1551); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields1553);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:103: 
                            {
                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {contentText = recorded.toString()}

                    if ( !((matchRegex(recorded.toString(), completeFieldPattern, false))) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "matchRegex($recorded.toString(), $completeFieldPattern, false)");
                    }

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields1617);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields1654); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl2_subfields1658);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:422:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:422:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:422:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields1707);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:423:6: ( ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DELIMITER3) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==EOF) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:423:7: ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:423:7: ( DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:423:8: DELIMITER3 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields1719); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl2_subfields1723);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:424:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:428:1: spec_field[String fieldPattern, boolean record, boolean forceRegex] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:428:69: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:429:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern, forceRegex))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field1761); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:1: field[boolean record] : CONTENT ;
    public final HPRIMSParser.field_return field(boolean record) throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:434:23: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:435:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field1777); if (state.failed) return retval;

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


    public static class delimiters_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "delimiters"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:440:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters1792); if (state.failed) return retval;

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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:241:3: ( line_h2_2_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:241:4: line_h2_2_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:244:3: ( line_h2_2_adm[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:244:4: line_h2_2_adm[false]
        {
        pushFollow(FOLLOW_line_h2_2_adm_in_synpred2_HPRIMS102);
        line_h2_2_adm(false);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_HPRIMS

    // Delegated rules

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


 

    public static final BitSet FOLLOW_line_h2_2_oru_in_hprim86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim89 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_hprim113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_oru133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h175 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h184 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_midd_line_h205 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h214 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_midd_line_h223 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h232 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_2259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_2263 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_2281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h305 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h312 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_oru328 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_oru332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_oru336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_oru343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_2_oru362 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru366 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_oru370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_adm381 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_adm385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_adm389 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_adm396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_2_adm415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_adm423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p446 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p476 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p488 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p499 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p511 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p526 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p542 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p559 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p575 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_line_p590 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_p608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna839 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_sized_cna852 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_fields902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields928 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields1040 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields1077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields1130 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields1142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet1213 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet1325 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet1362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields_repet1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet1415 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields_repet1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl2_fields1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields1505 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields1551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields1617 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields1654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl2_subfields1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields1707 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields1719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl2_subfields1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_synpred1_HPRIMS75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_synpred2_HPRIMS102 = new BitSet(new long[]{0x0000000000000002L});

}