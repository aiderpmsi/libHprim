// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-01 23:59:45

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
      private final static List<String> p_14 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> p_19 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> p_26 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*", ".*", ".*"});
      private final static List<String> obr_3 = Arrays.asList(new String[] {"^.{0,12}$", "^.{0,10}$"});
      private final static List<String> obr_4 = Arrays.asList(new String[] {".*", ".*"});
      private final static List<String> obr_5 = Arrays.asList(new String[] {".*", ".*", ".*", ".*", ".*", ".*"});

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:244:1: hprim[int strictNess] : ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) );
    public final void hprim(int strictNess) throws RecognitionException {
        this.strictNess = strictNess;startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:246:24: ( ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF ) | ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:247:3: ( line_h2_2_oru[false] )=> ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:248:5: ( line_h2_2_oru[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:248:6: line_h2_2_oru[true] ( body_p_oru )+ EOF
                    {
                    pushFollow(FOLLOW_line_h2_2_oru_in_hprim86);
                    line_h2_2_oru(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:248:26: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:248:26: body_p_oru
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:250:3: ( line_h2_2_adm[false] )=> ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:251:5: ( line_h2_2_adm[true] ( body_p_oru )+ EOF )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:251:6: line_h2_2_adm[true] ( body_p_oru )+ EOF
                    {
                    pushFollow(FOLLOW_line_h2_2_adm_in_hprim113);
                    line_h2_2_adm(true);

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:251:26: ( body_p_oru )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:251:26: body_p_oru
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:254:1: body_p_oru : ( start_line_p )=> ( line_p ( ( start_line_c )=> line_c )* ) ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:254:12: ( ( start_line_p )=> ( line_p ( ( start_line_c )=> line_c )* ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:255:3: ( start_line_p )=> ( line_p ( ( start_line_c )=> line_c )* )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:255:21: ( line_p ( ( start_line_c )=> line_c )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:256:5: line_p ( ( start_line_c )=> line_c )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru145);
            line_p();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:256:12: ( ( start_line_c )=> line_c )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CR) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==CONTENT) ) {
                        int LA4_3 = input.LA(3);

                        if ( (LA4_3==DELIMITER1) ) {
                            int LA4_4 = input.LA(4);

                            if ( (LA4_4==CONTENT) ) {
                                int LA4_5 = input.LA(5);

                                if ( (LA4_5==DELIMITER1) ) {
                                    int LA4_6 = input.LA(6);

                                    if ( (LA4_6==CONTENT) ) {
                                        int LA4_9 = input.LA(7);

                                        if ( (LA4_9==DELIMITER1) ) {
                                            int LA4_10 = input.LA(8);

                                            if ( (LA4_10==CONTENT) ) {
                                                int LA4_11 = input.LA(9);

                                                if ( (synpred4_HPRIMS()) ) {
                                                    alt4=1;
                                                }


                                            }


                                        }
                                        else if ( (LA4_9==EOF) && (synpred4_HPRIMS())) {
                                            alt4=1;
                                        }
                                        else if ( (LA4_9==CR) && (synpred4_HPRIMS())) {
                                            alt4=1;
                                        }


                                    }


                                }
                                else if ( (LA4_5==EOF) && (synpred4_HPRIMS())) {
                                    alt4=1;
                                }
                                else if ( (LA4_5==CR) && (synpred4_HPRIMS())) {
                                    alt4=1;
                                }


                            }


                        }


                    }


                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:256:13: ( start_line_c )=> line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_oru154);
            	    line_c();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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



    // $ANTLR start "start_line_c"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:262:1: start_line_c : CR spec_field[\"^C$\", false, true] ;
    public final void start_line_c() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:262:13: ( CR spec_field[\"^C$\", false, true] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:263:3: CR spec_field[\"^C$\", false, true]
            {
            match(input,CR,FOLLOW_CR_in_start_line_c170); if (state.failed) return ;

            pushFollow(FOLLOW_spec_field_in_start_line_c172);
            spec_field("^C$", false, true);

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
    // $ANTLR end "start_line_c"



    // $ANTLR start "line_c"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:265:1: line_c : CR spec_field[\"^C$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 )? )? )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:267:22: ( CR spec_field[\"^C$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:268:3: CR spec_field[\"^C$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,10}$\", true, false] ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_c190); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.1");}

            pushFollow(FOLLOW_spec_field_in_line_c194);
            spec_field("^C$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c202); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("C.2");}

            pushFollow(FOLLOW_spec_field_in_line_c206);
            spec_field("^[0-9]{1,10}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:270:3: ( DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 )? )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DELIMITER1) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:270:4: DELIMITER1 spec_field[\"^(P|L)?$\", true, false] ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c214); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("C.3");}

                    pushFollow(FOLLOW_spec_field_in_line_c218);
                    spec_field("^(P|L)?$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:4: ( DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==DELIMITER1) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:5: DELIMITER1 spec_field[\"^.{0,64000}$\", true, false] ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )* ( DELIMITER1 )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c227); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement("C.4");}

                            pushFollow(FOLLOW_spec_field_in_line_c231);
                            spec_field("^.{0,64000}$", true, false);

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {endElement();}

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:95: ( REPETITEUR spec_field[\"^.{0,64000}$\", true, false] )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==REPETITEUR) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:271:96: REPETITEUR spec_field[\"^.{0,64000}$\", true, false]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c237); if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {startElement("C.4");}

                            	    pushFollow(FOLLOW_spec_field_in_line_c241);
                            	    spec_field("^.{0,64000}$", true, false);

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    if ( state.backtracking==0 ) {endElement();}

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:272:5: ( DELIMITER1 )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==DELIMITER1) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:272:5: DELIMITER1
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c254); if (state.failed) return ;

                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:1: start_line_h : delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:277:14: ( delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:278:3: delimiters DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 spec_field[\"^.{0,12}$\", true, false] DELIMITER1 lvl1_fields[\"H.5\", h_5, 2, \"^.{0,15}$\"] DELIMITER1 lvl1_fields[\"H.6\", h_6, 0, \"^.{0,100}$\"]
            {
            if ( state.backtracking==0 ) {startElement("H.1");content("H");endElement();}

            if ( state.backtracking==0 ) {startElement("H.2");}

            pushFollow(FOLLOW_delimiters_in_start_line_h278);
            delimiters();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h284); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.3");}

            pushFollow(FOLLOW_spec_field_in_start_line_h288);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h295); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.4");}

            pushFollow(FOLLOW_spec_field_in_start_line_h299);
            spec_field("^.{0,12}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h306); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h308);
            lvl1_fields("H.5", h_5, 2, "^.{0,15}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h313); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_start_line_h315);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:1: midd_line_h : DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:286:13: ( DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:287:3: DELIMITER1 lvl1_fields_repet[\"H.8\", h_8, 0, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,40}$\", true, false] DELIMITER1 lvl1_fields[\"H.10\", h_10, 2, \"^.{0,40}$\"] DELIMITER1 spec_field[\"^.{0,80}$\", true, false] DELIMITER1 spec_field[\"^[P|D|T]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h327); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_repet_in_midd_line_h329);
            lvl1_fields_repet("H.8", h_8, 0, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h334); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.9");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h338);
            spec_field("^.{0,40}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h345); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_midd_line_h347);
            lvl1_fields("H.10", h_10, 2, "^.{0,40}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h352); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.11");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h356);
            spec_field("^.{0,80}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h363); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.12");}

            pushFollow(FOLLOW_spec_field_in_midd_line_h367);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:294:1: bloc_line_h_2_2 : DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] ;
    public final void bloc_line_h_2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:294:17: ( DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:295:5: DELIMITER1 spec_field[\"^H2\\\\.2$\", true, true] DELIMITER2 spec_field[\"^[C|L|R]$\", true, false]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_bloc_line_h_2_2383); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13");startElement("H.13.1");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_2387);
            spec_field("^H2\\.2$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_bloc_line_h_2_2405); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.13.2");}

            pushFollow(FOLLOW_spec_field_in_bloc_line_h_2_2409);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:1: end_line_h : DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? ( spec_field[\"\", false, false] )? ;
    public final void end_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:299:12: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? ( spec_field[\"\", false, false] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:300:3: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? ( spec_field[\"\", false, false] )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h425); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.14");}

            pushFollow(FOLLOW_spec_field_in_end_line_h429);
            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:3: ( DELIMITER1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DELIMITER1) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_end_line_h436); if (state.failed) return ;

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:15: ( spec_field[\"\", false, false] )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CONTENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:301:15: spec_field[\"\", false, false]
                    {
                    pushFollow(FOLLOW_spec_field_in_end_line_h439);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:304:1: start_line_h_oru : start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h ;
    public final void start_line_h_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:304:18: ( start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:305:3: start_line_h DELIMITER1 spec_field[\"^ORU$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_oru452);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_oru456); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_oru460);
            spec_field("^ORU$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_oru467);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:309:1: line_h2_2_oru[boolean record] : start_line_h_oru bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_oru(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:311:23: ( start_line_h_oru bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:312:3: start_line_h_oru bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_oru_in_line_h2_2_oru486);
            start_line_h_oru();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru490);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_oru494);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:1: start_line_h_adm : start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h ;
    public final void start_line_h_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:317:18: ( start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:318:3: start_line_h DELIMITER1 spec_field[\"^ADM$\", true, true] midd_line_h
            {
            pushFollow(FOLLOW_start_line_h_in_start_line_h_adm505);
            start_line_h();

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h_adm509); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("H.7");}

            pushFollow(FOLLOW_spec_field_in_start_line_h_adm513);
            spec_field("^ADM$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            pushFollow(FOLLOW_midd_line_h_in_start_line_h_adm520);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:322:1: line_h2_2_adm[boolean record] : start_line_h_adm bloc_line_h_2_2 end_line_h ;
    public final void line_h2_2_adm(boolean record) throws RecognitionException {
        this.record = record;startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:324:23: ( start_line_h_adm bloc_line_h_2_2 end_line_h )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:325:3: start_line_h_adm bloc_line_h_2_2 end_line_h
            {
            pushFollow(FOLLOW_start_line_h_adm_in_line_h2_2_adm539);
            start_line_h_adm();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm543);
            bloc_line_h_2_2();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_end_line_h_in_line_h2_2_adm547);
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



    // $ANTLR start "start_line_obr"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:331:1: start_line_obr : CR spec_field[\"^OBR$\", false, true] ;
    public final void start_line_obr() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:331:15: ( CR spec_field[\"^OBR$\", false, true] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:332:3: CR spec_field[\"^OBR$\", false, true]
            {
            match(input,CR,FOLLOW_CR_in_start_line_obr560); if (state.failed) return ;

            pushFollow(FOLLOW_spec_field_in_start_line_obr562);
            spec_field("^OBR$", false, true);

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
    // $ANTLR end "start_line_obr"



    // $ANTLR start "line_obr"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:334:1: line_obr : CR spec_field[\"^OBR$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* ;
    public final void line_obr() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:336:23: ( CR spec_field[\"^OBR$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:337:3: CR spec_field[\"^OBR$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"OBR.3\", obr_3, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.4\", obr_4, 0, \"^.{0,22}$\"] DELIMITER1 lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )*
            {
            match(input,CR,FOLLOW_CR_in_line_obr581); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.1");}

            pushFollow(FOLLOW_spec_field_in_line_obr585);
            spec_field("^OBR$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr592); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("OBR.2");}

            pushFollow(FOLLOW_spec_field_in_line_obr596);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr603); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr605);
            lvl1_fields("OBR.3", obr_3, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr610); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr612);
            lvl1_fields("OBR.4", obr_4, 0, "^.{0,22}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr617); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_obr619);
            lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:61: ( REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"] )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==REPETITEUR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:341:62: REPETITEUR lvl1_fields[\"OBR.5\", obr_5, 0, \"^.{0,64000}$\"]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr623); if (state.failed) return ;

            	    pushFollow(FOLLOW_lvl1_fields_in_line_obr625);
            	    lvl1_fields("OBR.5", obr_5, 0, "^.{0,64000}$");

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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



    // $ANTLR start "start_line_p"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:1: start_line_p : CR spec_field[\"^P$\", false, true] ;
    public final void start_line_p() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:384:13: ( CR spec_field[\"^P$\", false, true] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:385:3: CR spec_field[\"^P$\", false, true]
            {
            match(input,CR,FOLLOW_CR_in_start_line_p707); if (state.failed) return ;

            pushFollow(FOLLOW_spec_field_in_start_line_p709);
            spec_field("^P$", false, true);

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
    // $ANTLR end "start_line_p"



    // $ANTLR start "line_p"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:387:1: line_p : CR spec_field[\"^P$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:389:23: ( CR spec_field[\"^P$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:390:3: CR spec_field[\"^P$\", true, true] DELIMITER1 spec_field[\"^[0-9]{1,4}$\", true, false] DELIMITER1 lvl1_fields[\"P.3\", p_3, 1, \"^.{1,36}$\"] DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p730); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.1");}

            pushFollow(FOLLOW_spec_field_in_line_p734);
            spec_field("^P$", true, true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p742); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.2");}

            pushFollow(FOLLOW_spec_field_in_line_p746);
            spec_field("^[0-9]{1,4}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p753); if (state.failed) return ;

            pushFollow(FOLLOW_lvl1_fields_in_line_p755);
            lvl1_fields("P.3", p_3, 1, "^.{1,36}$");

            state._fsp--;
            if (state.failed) return ;

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p760); if (state.failed) return ;

            if ( state.backtracking==0 ) {startElement("P.4");}

            pushFollow(FOLLOW_spec_field_in_line_p764);
            spec_field("^.{0,16}$", true, false);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:3: ( DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DELIMITER1) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:394:4: DELIMITER1 spec_field[\"^.{0,16}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p772); if (state.failed) return ;

                    if ( state.backtracking==0 ) {startElement("P.5");}

                    pushFollow(FOLLOW_spec_field_in_line_p776);
                    spec_field("^.{0,16}$", true, false);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:4: ( DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DELIMITER1) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:395:5: DELIMITER1 lvl1_fields[\"P.6\", p_6, 0, \"^.{0,48}$\"] ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p785); if (state.failed) return ;

                            pushFollow(FOLLOW_lvl1_fields_in_line_p787);
                            lvl1_fields("P.6", p_6, 0, "^.{0,48}$");

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:396:5: ( DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==DELIMITER1) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:396:6: DELIMITER1 spec_field[\"^.{0,24}$\", true, false] ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p795); if (state.failed) return ;

                                    if ( state.backtracking==0 ) {startElement("P.7");}

                                    pushFollow(FOLLOW_spec_field_in_line_p799);
                                    spec_field("^.{0,24}$", true, false);

                                    state._fsp--;
                                    if (state.failed) return ;

                                    if ( state.backtracking==0 ) {endElement();}

                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:6: ( DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt43=2;
                                    int LA43_0 = input.LA(1);

                                    if ( (LA43_0==DELIMITER1) ) {
                                        alt43=1;
                                    }
                                    switch (alt43) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:397:7: DELIMITER1 spec_field[\"^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p810); if (state.failed) return ;

                                            if ( state.backtracking==0 ) {startElement("P.8");}

                                            pushFollow(FOLLOW_spec_field_in_line_p814);
                                            spec_field("^(?:[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?)?$", true, false);

                                            state._fsp--;
                                            if (state.failed) return ;

                                            if ( state.backtracking==0 ) {endElement();}

                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:7: ( DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt42=2;
                                            int LA42_0 = input.LA(1);

                                            if ( (LA42_0==DELIMITER1) ) {
                                                alt42=1;
                                            }
                                            switch (alt42) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:398:8: DELIMITER1 spec_field[\"^[M|F|U]?$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p826); if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {startElement("P.9");}

                                                    pushFollow(FOLLOW_spec_field_in_line_p830);
                                                    spec_field("^[M|F|U]?$", true, false);

                                                    state._fsp--;
                                                    if (state.failed) return ;

                                                    if ( state.backtracking==0 ) {endElement();}

                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:399:8: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt41=2;
                                                    int LA41_0 = input.LA(1);

                                                    if ( (LA41_0==DELIMITER1) ) {
                                                        alt41=1;
                                                    }
                                                    switch (alt41) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:399:9: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p843); if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {startElement("P.10");}

                                                            pushFollow(FOLLOW_spec_field_in_line_p847);
                                                            spec_field("^$", true, false);

                                                            state._fsp--;
                                                            if (state.failed) return ;

                                                            if ( state.backtracking==0 ) {endElement();}

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:400:9: ( DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt40=2;
                                                            int LA40_0 = input.LA(1);

                                                            if ( (LA40_0==DELIMITER1) ) {
                                                                alt40=1;
                                                            }
                                                            switch (alt40) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:400:10: DELIMITER1 lvl1_fields[\"P.11\", p_11, 0, \"^.{0,200}$\"] ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p861); if (state.failed) return ;

                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p863);
                                                                    lvl1_fields("P.11", p_11, 0, "^.{0,200}$");

                                                                    state._fsp--;
                                                                    if (state.failed) return ;

                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:401:10: ( DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt39=2;
                                                                    int LA39_0 = input.LA(1);

                                                                    if ( (LA39_0==DELIMITER1) ) {
                                                                        alt39=1;
                                                                    }
                                                                    switch (alt39) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:401:11: DELIMITER1 spec_field[\"^.{0,120}$\", true, false] ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p876); if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {startElement("P.12");}

                                                                            pushFollow(FOLLOW_spec_field_in_line_p880);
                                                                            spec_field("^.{0,120}$", true, false);

                                                                            state._fsp--;
                                                                            if (state.failed) return ;

                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:11: ( DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt38=2;
                                                                            int LA38_0 = input.LA(1);

                                                                            if ( (LA38_0==DELIMITER1) ) {
                                                                                alt38=1;
                                                                            }
                                                                            switch (alt38) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:402:12: DELIMITER1 lvl1_fields_repet[\"P.13\", p_13, 0, \"^.{0,40}$\"] ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p896); if (state.failed) return ;

                                                                                    pushFollow(FOLLOW_lvl1_fields_repet_in_line_p898);
                                                                                    lvl1_fields_repet("P.13", p_13, 0, "^.{0,40}$");

                                                                                    state._fsp--;
                                                                                    if (state.failed) return ;

                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:405:12: ( DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt37=2;
                                                                                    int LA37_0 = input.LA(1);

                                                                                    if ( (LA37_0==DELIMITER1) ) {
                                                                                        alt37=1;
                                                                                    }
                                                                                    switch (alt37) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:405:13: DELIMITER1 spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )* ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p937); if (state.failed) return ;

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p939);
                                                                                            spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            state._fsp--;
                                                                                            if (state.failed) return ;

                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:405:69: ( REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"] )*
                                                                                            loop12:
                                                                                            do {
                                                                                                int alt12=2;
                                                                                                int LA12_0 = input.LA(1);

                                                                                                if ( (LA12_0==REPETITEUR) ) {
                                                                                                    alt12=1;
                                                                                                }


                                                                                                switch (alt12) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:405:70: REPETITEUR spec_sized_cna[\"P.14\", p_14, 0, \"^.{0,60}$\"]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p943); if (state.failed) return ;

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p945);
                                                                                            	    spec_sized_cna("P.14", p_14, 0, "^.{0,60}$");

                                                                                            	    state._fsp--;
                                                                                            	    if (state.failed) return ;

                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop12;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:406:13: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt36=2;
                                                                                            int LA36_0 = input.LA(1);

                                                                                            if ( (LA36_0==DELIMITER1) ) {
                                                                                                alt36=1;
                                                                                            }
                                                                                            switch (alt36) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:406:14: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p963); if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {startElement("P.15");}

                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p967);
                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                    state._fsp--;
                                                                                                    if (state.failed) return ;

                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:407:14: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt35=2;
                                                                                                    int LA35_0 = input.LA(1);

                                                                                                    if ( (LA35_0==DELIMITER1) ) {
                                                                                                        alt35=1;
                                                                                                    }
                                                                                                    switch (alt35) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:407:15: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p986); if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {startElement("P.16");}

                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p990);
                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                            state._fsp--;
                                                                                                            if (state.failed) return ;

                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:409:15: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt34=2;
                                                                                                            int LA34_0 = input.LA(1);

                                                                                                            if ( (LA34_0==DELIMITER1) ) {
                                                                                                                alt34=1;
                                                                                                            }
                                                                                                            switch (alt34) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:409:16: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1025); if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {startElement("P.17");}

                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1029);
                                                                                                                    spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                    state._fsp--;
                                                                                                                    if (state.failed) return ;

                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:411:16: ( DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt33=2;
                                                                                                                    int LA33_0 = input.LA(1);

                                                                                                                    if ( (LA33_0==DELIMITER1) ) {
                                                                                                                        alt33=1;
                                                                                                                    }
                                                                                                                    switch (alt33) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:411:17: DELIMITER1 spec_field[\"^[0-9]{0,10}$\", true, false] ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1066); if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {startElement("P.18");}

                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1070);
                                                                                                                            spec_field("^[0-9]{0,10}$", true, false);

                                                                                                                            state._fsp--;
                                                                                                                            if (state.failed) return ;

                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:412:17: ( DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt32=2;
                                                                                                                            int LA32_0 = input.LA(1);

                                                                                                                            if ( (LA32_0==DELIMITER1) ) {
                                                                                                                                alt32=1;
                                                                                                                            }
                                                                                                                            switch (alt32) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:412:18: DELIMITER1 lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1092); if (state.failed) return ;

                                                                                                                                    pushFollow(FOLLOW_lvl1_fields_in_line_p1094);
                                                                                                                                    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    state._fsp--;
                                                                                                                                    if (state.failed) return ;

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:412:72: ( REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"] )*
                                                                                                                                    loop13:
                                                                                                                                    do {
                                                                                                                                        int alt13=2;
                                                                                                                                        int LA13_0 = input.LA(1);

                                                                                                                                        if ( (LA13_0==REPETITEUR) ) {
                                                                                                                                            alt13=1;
                                                                                                                                        }


                                                                                                                                        switch (alt13) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:412:73: REPETITEUR lvl1_fields[\"P.19\", p_19, 0, \"^.{0,200}$\"]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1098); if (state.failed) return ;

                                                                                                                                    	    pushFollow(FOLLOW_lvl1_fields_in_line_p1100);
                                                                                                                                    	    lvl1_fields("P.19", p_19, 0, "^.{0,200}$");

                                                                                                                                    	    state._fsp--;
                                                                                                                                    	    if (state.failed) return ;

                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop13;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:18: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt31=2;
                                                                                                                                    int LA31_0 = input.LA(1);

                                                                                                                                    if ( (LA31_0==DELIMITER1) ) {
                                                                                                                                        alt31=1;
                                                                                                                                    }
                                                                                                                                    switch (alt31) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:19: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )* ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1123); if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1127);
                                                                                                                                            spec_field("^.{0,200}$", true, false);

                                                                                                                                            state._fsp--;
                                                                                                                                            if (state.failed) return ;

                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:108: ( REPETITEUR spec_field[\"^.{0,200}$\", true, false] )*
                                                                                                                                            loop14:
                                                                                                                                            do {
                                                                                                                                                int alt14=2;
                                                                                                                                                int LA14_0 = input.LA(1);

                                                                                                                                                if ( (LA14_0==REPETITEUR) ) {
                                                                                                                                                    alt14=1;
                                                                                                                                                }


                                                                                                                                                switch (alt14) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:413:109: REPETITEUR spec_field[\"^.{0,200}$\", true, false]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1133); if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.20");}

                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p1137);
                                                                                                                                            	    spec_field("^.{0,200}$", true, false);

                                                                                                                                            	    state._fsp--;
                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop14;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:19: ( DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt30=2;
                                                                                                                                            int LA30_0 = input.LA(1);

                                                                                                                                            if ( (LA30_0==DELIMITER1) ) {
                                                                                                                                                alt30=1;
                                                                                                                                            }
                                                                                                                                            switch (alt30) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:414:20: DELIMITER1 spec_field[\"^.{0,200}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1163); if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.21");}

                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1167);
                                                                                                                                                    spec_field("^.{0,200}$", true, false);

                                                                                                                                                    state._fsp--;
                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:20: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt29=2;
                                                                                                                                                    int LA29_0 = input.LA(1);

                                                                                                                                                    if ( (LA29_0==DELIMITER1) ) {
                                                                                                                                                        alt29=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt29) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:415:21: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1192); if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.22");}

                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1196);
                                                                                                                                                            spec_field("^.{0,60}$", true, false);

                                                                                                                                                            state._fsp--;
                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:416:21: ( DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt28=2;
                                                                                                                                                            int LA28_0 = input.LA(1);

                                                                                                                                                            if ( (LA28_0==DELIMITER1) ) {
                                                                                                                                                                alt28=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt28) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:416:22: DELIMITER1 spec_field[\"^.{0,60}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1222); if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.23");}

                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1226);
                                                                                                                                                                    spec_field("^.{0,60}$", true, false);

                                                                                                                                                                    state._fsp--;
                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:417:22: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt27=2;
                                                                                                                                                                    int LA27_0 = input.LA(1);

                                                                                                                                                                    if ( (LA27_0==DELIMITER1) ) {
                                                                                                                                                                        alt27=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt27) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:417:23: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )* ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1253); if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1257);
                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            state._fsp--;
                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:417:151: ( REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] )*
                                                                                                                                                                            loop15:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt15=2;
                                                                                                                                                                                int LA15_0 = input.LA(1);

                                                                                                                                                                                if ( (LA15_0==REPETITEUR) ) {
                                                                                                                                                                                    alt15=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt15) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:417:152: REPETITEUR spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1263); if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {startElement("P.24");}

                                                                                                                                                                            	    pushFollow(FOLLOW_spec_field_in_line_p1267);
                                                                                                                                                                            	    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                            	    state._fsp--;
                                                                                                                                                                            	    if (state.failed) return ;

                                                                                                                                                                            	    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop15;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:23: ( DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt26=2;
                                                                                                                                                                            int LA26_0 = input.LA(1);

                                                                                                                                                                            if ( (LA26_0==DELIMITER1) ) {
                                                                                                                                                                                alt26=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt26) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:418:24: DELIMITER1 spec_field[\"^(OP|IP|ER|PA|MP)?^$\", true, false] ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1297); if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.25");}

                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1301);
                                                                                                                                                                                    spec_field("^(OP|IP|ER|PA|MP)?^$", true, false);

                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:419:24: ( DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt25=2;
                                                                                                                                                                                    int LA25_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA25_0==DELIMITER1) ) {
                                                                                                                                                                                        alt25=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt25) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:419:25: DELIMITER1 lvl1_fields[\"P.26\", p_26, 0, \"^.{0,100}$\"] ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1330); if (state.failed) return ;

                                                                                                                                                                                            pushFollow(FOLLOW_lvl1_fields_in_line_p1332);
                                                                                                                                                                                            lvl1_fields("P.26", p_26, 0, "^.{0,100}$");

                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:421:25: ( DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt24=2;
                                                                                                                                                                                            int LA24_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA24_0==DELIMITER1) ) {
                                                                                                                                                                                                alt24=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt24) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:421:26: DELIMITER1 spec_field[\"^.{0,100}$\", true, false] ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1385); if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.27");}

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1389);
                                                                                                                                                                                                    spec_field("^.{0,100}$", true, false);

                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:422:26: ( DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt23=2;
                                                                                                                                                                                                    int LA23_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA23_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt23=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt23) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:422:27: DELIMITER1 spec_field[\"^$\", true, false] ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1420); if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.28");}

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1424);
                                                                                                                                                                                                            spec_field("^$", true, false);

                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:424:27: ( DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt22=2;
                                                                                                                                                                                                            int LA22_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA22_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt22=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt22) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:424:28: DELIMITER1 spec_field[\"^.{0,2}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1483); if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.29");}

                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1487);
                                                                                                                                                                                                                    spec_field("^.{0,2}$", true, false);

                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:426:28: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt21=2;
                                                                                                                                                                                                                    int LA21_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA21_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt21=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt21) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:426:29: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1548); if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.30");}

                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1552);
                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:427:29: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt20=2;
                                                                                                                                                                                                                            int LA20_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA20_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt20=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt20) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:427:30: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1586); if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.31");}

                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1590);
                                                                                                                                                                                                                                    spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:429:30: ( DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt19=2;
                                                                                                                                                                                                                                    int LA19_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA19_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt19=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt19) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:429:31: DELIMITER1 spec_field[\"^.{0,20}$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1655); if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.32");}

                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1659);
                                                                                                                                                                                                                                            spec_field("^.{0,20}$", true, false);

                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:430:31: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt18=2;
                                                                                                                                                                                                                                            int LA18_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA18_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt18=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt18) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:430:32: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1695); if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {startElement("P.33");}

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_spec_field_in_line_p1699);
                                                                                                                                                                                                                                                    spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                    state._fsp--;
                                                                                                                                                                                                                                                    if (state.failed) return ;

                                                                                                                                                                                                                                                    if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:431:32: ( DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt17=2;
                                                                                                                                                                                                                                                    int LA17_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA17_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt17=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt17) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:431:33: DELIMITER1 spec_field[\"^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$\", true, false] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1736); if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {startElement("P.34");}

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_spec_field_in_line_p1740);
                                                                                                                                                                                                                                                            spec_field("^[0-9]{6}(?:[0-9]{2}(?:[0-9]{4}(?:[0-9]{2})?)?)?$", true, false);

                                                                                                                                                                                                                                                            state._fsp--;
                                                                                                                                                                                                                                                            if (state.failed) return ;

                                                                                                                                                                                                                                                            if ( state.backtracking==0 ) {endElement();}

                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:432:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt16=2;
                                                                                                                                                                                                                                                            int LA16_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA16_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt16=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt16) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:432:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1777); if (state.failed) return ;

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:435:1: spec_sized_cna[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] :h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?;
    public final void spec_sized_cna(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        HPRIMSParser.field_return h =null;

        String i =null;

        HPRIMSParser.field_return j =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:437:22: (h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:438:3: h= field[true] ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )? {...}?
            {
            if ( state.backtracking==0 ) {startElement(nameElement + ".1");}

            pushFollow(FOLLOW_field_in_spec_sized_cna1861);
            h=field(true);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {endElement();}

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:4: ( DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DELIMITER2) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:439:5: DELIMITER2 i= lvl2_fields[$nameElement + \".2\", $patterns, $nbMandatory, \".*\"] ( DELIMITER2 j= field[true] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna1870); if (state.failed) return ;

                    pushFollow(FOLLOW_lvl2_fields_in_spec_sized_cna1874);
                    i=lvl2_fields(nameElement + ".2", patterns, nbMandatory, ".*");

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:440:5: ( DELIMITER2 j= field[true] )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DELIMITER2) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:440:6: DELIMITER2 j= field[true]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna1882); if (state.failed) return ;

                            if ( state.backtracking==0 ) {startElement(nameElement + ".3");}

                            pushFollow(FOLLOW_field_in_spec_sized_cna1888);
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



    // $ANTLR start "lvl1_fields"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:445:1: lvl1_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl1_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:447:23: (r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:448:3: r= lvl1_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_fields1926);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:1: lvl1_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:450:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==CONTENT) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==DELIMITER2) && ((size < nbMandatory))) {
                    alt51=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:451:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? DELIMITER2 spec_field[\"\", false, false] )? {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields1954);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:452:38: ({...}? DELIMITER2 spec_field[\"\", false, false] )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==DELIMITER2) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:452:39: {...}? DELIMITER2 spec_field[\"\", false, false]
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields", "strictNess <= 2");
                            }

                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields1999); if (state.failed) return contentText;

                            pushFollow(FOLLOW_spec_field_in_lvl1_subfields2001);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:455:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:455:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:455:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields2061);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields2098); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields2102);
                    h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:459:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:459:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:459:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields2151);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:6: ( ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==DELIMITER2) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==EOF||(LA50_0 >= CR && LA50_0 <= DELIMITER1)||LA50_0==REPETITEUR) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;

                    }
                    switch (alt50) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:7: ( DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:460:8: DELIMITER2 h= lvl1_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_lvl1_subfields2163); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_in_lvl1_subfields2167);
                            h=lvl1_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:461:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:464:1: lvl1_fields_repet[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] : r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final void lvl1_fields_repet(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:466:23: (r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:467:3: r= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet2210);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:1: lvl1_subfields_repet[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl1_subfields_repet(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:469:173: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==CONTENT) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==REPETITEUR) && ((size < nbMandatory))) {
                    alt55=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:470:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:470:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:470:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet2234);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:38: ({...}? ( REPETITEUR spec_field[\"\", false, false] )? |)
                    int alt53=2;
                    switch ( input.LA(1) ) {
                    case REPETITEUR:
                        {
                        alt53=1;
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA53_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt53=1;
                        }
                        else if ( (true) ) {
                            alt53=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA53_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt53=1;
                        }
                        else if ( (true) ) {
                            alt53=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA53_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt53=1;
                        }
                        else if ( (true) ) {
                            alt53=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;

                    }

                    switch (alt53) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:39: {...}? ( REPETITEUR spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl1_subfields_repet", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:58: ( REPETITEUR spec_field[\"\", false, false] )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==REPETITEUR) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:59: REPETITEUR spec_field[\"\", false, false]
                                    {
                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet2280); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet2282);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:471:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:474:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl1_subfields_repet", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:474:30: (g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:474:31: g= spec_field[$patterns.get($size - 1), true, false] REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet2346);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet2383); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet2387);
                    h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:478:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl1_subfields_repet2436);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:479:6: ( ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==REPETITEUR) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==EOF||(LA54_0 >= CR && LA54_0 <= DELIMITER1)) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;

                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:479:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:479:7: ( REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:479:8: REPETITEUR h= lvl1_subfields_repet[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,REPETITEUR,FOLLOW_REPETITEUR_in_lvl1_subfields_repet2448); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet2452);
                            h=lvl1_subfields_repet(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:480:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:484:1: lvl2_fields[String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern] returns [String contentText] : r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] ;
    public final String lvl2_fields(String nameElement, List<String> patterns, int nbMandatory, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        String r =null;


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:486:23: (r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:487:3: r= lvl2_subfields[$nameElement, $patterns, $nbMandatory, 1, new StringBuilder(), $completeFieldPattern]
            {
            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_fields2500);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:1: lvl2_subfields[String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern] returns [String contentText] : ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) );
    public final String lvl2_subfields(String nameElement, List<String> patterns, int nbMandatory, int size, StringBuilder recorded, String completeFieldPattern) throws RecognitionException {
        String contentText = null;


        HPRIMSParser.spec_field_return g =null;

        String h =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:489:167: ({...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?) |{...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) | (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) ) )
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==CONTENT) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==DELIMITER3) && ((size < nbMandatory))) {
                    alt59=2;
                }
                else if ( ((size == patterns.size())) ) {
                    alt59=1;
                }
                else if ( (true) ) {
                    alt59=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return contentText;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return contentText;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    {
                    if ( !((size == patterns.size())) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size == $patterns.size()");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:35: (g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?)
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:490:36: g= spec_field[$patterns.get($size - 1), true, false] ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |) {...}?
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields2526);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:38: ({...}? ( DELIMITER3 spec_field[\"\", false, false] )? |)
                    int alt57=2;
                    switch ( input.LA(1) ) {
                    case DELIMITER3:
                        {
                        alt57=1;
                        }
                        break;
                    case DELIMITER2:
                        {
                        int LA57_2 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt57=1;
                        }
                        else if ( (true) ) {
                            alt57=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case REPETITEUR:
                        {
                        int LA57_3 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt57=1;
                        }
                        else if ( (true) ) {
                            alt57=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DELIMITER1:
                        {
                        int LA57_4 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt57=1;
                        }
                        else if ( (true) ) {
                            alt57=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 4, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CR:
                        {
                        int LA57_5 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt57=1;
                        }
                        else if ( (true) ) {
                            alt57=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 5, input);

                            throw nvae;

                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA57_6 = input.LA(2);

                        if ( ((strictNess <= 2)) ) {
                            alt57=1;
                        }
                        else if ( (true) ) {
                            alt57=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return contentText;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;

                    }

                    switch (alt57) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:39: {...}? ( DELIMITER3 spec_field[\"\", false, false] )?
                            {
                            if ( !((strictNess <= 2)) ) {
                                if (state.backtracking>0) {state.failed=true; return contentText;}
                                throw new FailedPredicateException(input, "lvl2_subfields", "strictNess <= 2");
                            }

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:58: ( DELIMITER3 spec_field[\"\", false, false] )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==DELIMITER3) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:59: DELIMITER3 spec_field[\"\", false, false]
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields2572); if (state.failed) return contentText;

                                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields2574);
                                    spec_field("", false, false);

                                    state._fsp--;
                                    if (state.failed) return contentText;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:491:103: 
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:494:3: {...}? => (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    {
                    if ( !((size < nbMandatory)) ) {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        throw new FailedPredicateException(input, "lvl2_subfields", "$size < $nbMandatory");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:494:30: (g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:494:31: g= spec_field[$patterns.get($size - 1), true, false] DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields2638);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields2675); if (state.failed) return contentText;

                    pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields2679);
                    h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {contentText = h;}

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:3: (g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?) )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:498:4: g= spec_field[$patterns.get($size - 1), true, false] ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    {
                    if ( state.backtracking==0 ) {startElement(nameElement + "." + size);}

                    pushFollow(FOLLOW_spec_field_in_lvl2_subfields2728);
                    g=spec_field(patterns.get(size - 1), true, false);

                    state._fsp--;
                    if (state.failed) return contentText;

                    if ( state.backtracking==0 ) {recorded.append((g!=null?input.toString(g.start,g.stop):null));endElement();}

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:6: ( ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] ) |{...}?)
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==DELIMITER3) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==EOF||(LA58_0 >= CR && LA58_0 <= DELIMITER2)||LA58_0==REPETITEUR) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return contentText;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;

                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            {
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:7: ( DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern] )
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:499:8: DELIMITER3 h= lvl2_subfields[$nameElement, $patterns, $nbMandatory, $size + 1, $recorded, $completeFieldPattern]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_lvl2_subfields2740); if (state.failed) return contentText;

                            pushFollow(FOLLOW_lvl2_subfields_in_lvl2_subfields2744);
                            h=lvl2_subfields(nameElement, patterns, nbMandatory, size + 1, recorded, completeFieldPattern);

                            state._fsp--;
                            if (state.failed) return contentText;

                            if ( state.backtracking==0 ) {contentText = h;}

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:500:8: {...}?
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:504:1: spec_field[String fieldPattern, boolean record, boolean forceRegex] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern, boolean record, boolean forceRegex) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:504:69: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:505:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern, forceRegex))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), $fieldPattern, $forceRegex)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field2782); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:510:1: field[boolean record] : CONTENT ;
    public final HPRIMSParser.field_return field(boolean record) throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:510:23: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:511:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field2798); if (state.failed) return retval;

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:515:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:515:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:516:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters2813); if (state.failed) return retval;

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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:247:3: ( line_h2_2_oru[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:247:4: line_h2_2_oru[false]
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
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:250:3: ( line_h2_2_adm[false] )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:250:4: line_h2_2_adm[false]
        {
        pushFollow(FOLLOW_line_h2_2_adm_in_synpred2_HPRIMS102);
        line_h2_2_adm(false);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_HPRIMS

    // $ANTLR start synpred4_HPRIMS
    public final void synpred4_HPRIMS_fragment() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:256:13: ( start_line_c )
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:256:14: start_line_c
        {
        pushFollow(FOLLOW_start_line_c_in_synpred4_HPRIMS149);
        start_line_c();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_HPRIMS

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


 

    public static final BitSet FOLLOW_line_h2_2_oru_in_hprim86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim89 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_hprim113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_hprim119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_oru145 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru154 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CR_in_start_line_c170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_c172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c206 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c218 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c231 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_c241 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h288 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h299 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h308 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_start_line_h315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_midd_line_h329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h338 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_midd_line_h347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h356 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_midd_line_h367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_bloc_line_h_2_2383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_2387 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_bloc_line_h_2_2405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_bloc_line_h_2_2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h429 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_DELIMITER1_in_end_line_h436 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_spec_field_in_end_line_h439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_oru452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_oru456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_oru460 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_oru467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_oru_in_line_h2_2_oru486 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_oru490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_oru494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_start_line_h_adm505 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h_adm509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h_adm513 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_midd_line_h_in_start_line_h_adm520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_adm_in_line_h2_2_adm539 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_bloc_line_h_2_2_in_line_h2_2_adm543 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_end_line_h_in_line_h2_2_adm547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_start_line_obr560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_obr562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr585 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_obr596 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr605 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr619 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_obr625 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_CR_in_start_line_p707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_p709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p734 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p746 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p764 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p776 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p787 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p799 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p814 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p830 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p847 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p863 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p880 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_repet_in_line_p898 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p939 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p945 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p967 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p990 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1029 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1070 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p1094 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p1100 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1127 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1137 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1167 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1196 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1226 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1257 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1267 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1301 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_fields_in_line_p1332 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1389 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1424 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1487 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1552 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1590 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1659 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1699 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_line_p1740 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna1861 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna1870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_fields_in_spec_sized_cna1874 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna1882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_spec_sized_cna1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_fields1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields1954 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields1999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields2061 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields2098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields2151 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_lvl1_subfields2163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_in_lvl1_subfields2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_fields_repet2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet2234 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet2280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet2346 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet2383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl1_subfields_repet2436 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_REPETITEUR_in_lvl1_subfields_repet2448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl1_subfields_repet_in_lvl1_subfields_repet2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_fields2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields2526 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields2572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields2638 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields2675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_field_in_lvl2_subfields2728 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_DELIMITER3_in_lvl2_subfields2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_lvl2_subfields_in_lvl2_subfields2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_synpred1_HPRIMS75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_adm_in_synpred2_HPRIMS102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_c_in_synpred4_HPRIMS149 = new BitSet(new long[]{0x0000000000000002L});

}