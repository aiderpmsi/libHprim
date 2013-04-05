// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-04-06 00:35:28

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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class HPRIMSParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARA", "CHARB", "CHARC", "CHARD", "CHARE", "CHARF", "CHARG", "CHARH", "CHARI", "CHARK", "CHARL", "CHARM", "CHARN", "CHARO", "CHARP", "CHARR", "CHARS", "CHART", "CHARU", "CHARV", "CHARW", "CHARX", "CHAR_SYMBOL_INF", "CHAR_SYMBOL_SUP", "CHARl", "CHARu", "CHIFFRE0", "CHIFFRE1", "CHIFFRE2", "CHIFFRE3", "CHIFFRE4", "CHIFFRE5", "CHIFFRE6", "CHIFFRE7", "CHIFFRE8", "CHIFFRE9", "CR", "DELIMITER1", "DELIMITER2", "DELIMITER3", "DELIMITERS", "LETTRE", "MOINS", "PLUS", "POINT", "REPETITEUR", "TOKENMISMATCH"
    };

    public static final int EOF=-1;
    public static final int CHARA=4;
    public static final int CHARB=5;
    public static final int CHARC=6;
    public static final int CHARD=7;
    public static final int CHARE=8;
    public static final int CHARF=9;
    public static final int CHARG=10;
    public static final int CHARH=11;
    public static final int CHARI=12;
    public static final int CHARK=13;
    public static final int CHARL=14;
    public static final int CHARM=15;
    public static final int CHARN=16;
    public static final int CHARO=17;
    public static final int CHARP=18;
    public static final int CHARR=19;
    public static final int CHARS=20;
    public static final int CHART=21;
    public static final int CHARU=22;
    public static final int CHARV=23;
    public static final int CHARW=24;
    public static final int CHARX=25;
    public static final int CHAR_SYMBOL_INF=26;
    public static final int CHAR_SYMBOL_SUP=27;
    public static final int CHARl=28;
    public static final int CHARu=29;
    public static final int CHIFFRE0=30;
    public static final int CHIFFRE1=31;
    public static final int CHIFFRE2=32;
    public static final int CHIFFRE3=33;
    public static final int CHIFFRE4=34;
    public static final int CHIFFRE5=35;
    public static final int CHIFFRE6=36;
    public static final int CHIFFRE7=37;
    public static final int CHIFFRE8=38;
    public static final int CHIFFRE9=39;
    public static final int CR=40;
    public static final int DELIMITER1=41;
    public static final int DELIMITER2=42;
    public static final int DELIMITER3=43;
    public static final int DELIMITERS=44;
    public static final int LETTRE=45;
    public static final int MOINS=46;
    public static final int PLUS=47;
    public static final int POINT=48;
    public static final int REPETITEUR=49;
    public static final int TOKENMISMATCH=50;

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
    public String getGrammarFileName() { return "C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g"; }



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




    // $ANTLR start "hprim"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:205:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );
    public final void hprim() throws RecognitionException {
        startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:207:23: ( hprim_oru_2_2 | hprim_oru_2_1 )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:208:3: hprim_oru_2_2
                    {
                    pushFollow(FOLLOW_hprim_oru_2_2_in_hprim68);
                    hprim_oru_2_2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:208:19: hprim_oru_2_1
                    {
                    pushFollow(FOLLOW_hprim_oru_2_1_in_hprim72);
                    hprim_oru_2_1();

                    state._fsp--;


                    }
                    break;

            }
            endDocument();
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



    // $ANTLR start "hprim_oru_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:213:1: hprim_oru_2_2 : line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_2() throws RecognitionException {
        startElement("HPRIM.ORU.2.2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:215:22: ( line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:216:3: line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_in_hprim_oru_2_292);
            line_h2_2();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:3: ( body_p2_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CR) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==CHARP) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:3: body_p2_1
            	    {
            	    pushFollow(FOLLOW_body_p2_1_in_hprim_oru_2_296);
            	    body_p2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            pushFollow(FOLLOW_line_l2_1_in_hprim_oru_2_2101);
            line_l2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:219:3: ( CR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:219:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_2105); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_2110); 

            }

            endElement();
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
    // $ANTLR end "hprim_oru_2_2"



    // $ANTLR start "hprim_oru_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:1: hprim_oru_2_1 : line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_1() throws RecognitionException {
        startElement("HPRIM.ORU.2.1");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:224:22: ( line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:225:3: line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_in_hprim_oru_2_1127);
            line_h2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:3: ( body_p2_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CR) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==CHARP) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:3: body_p2_1
            	    {
            	    pushFollow(FOLLOW_body_p2_1_in_hprim_oru_2_1131);
            	    body_p2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            pushFollow(FOLLOW_line_l2_1_in_hprim_oru_2_1136);
            line_l2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:228:3: ( CR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:228:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_1140); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_1145); 

            }

            endElement();
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
    // $ANTLR end "hprim_oru_2_1"



    // $ANTLR start "hprim_oru_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:1: hprim_oru_2_0 : line_h2_0 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_0() throws RecognitionException {
        startElement("HPRIM.ORU.2.0");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:233:22: ( line_h2_0 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:234:3: line_h2_0 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_0_in_hprim_oru_2_0162);
            line_h2_0();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:3: ( body_p2_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CR) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==CHARP) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:3: body_p2_1
            	    {
            	    pushFollow(FOLLOW_body_p2_1_in_hprim_oru_2_0166);
            	    body_p2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            pushFollow(FOLLOW_line_l2_1_in_hprim_oru_2_0171);
            line_l2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:3: ( CR )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_0175); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_0180); 

            }

            endElement();
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
    // $ANTLR end "hprim_oru_2_0"



    // $ANTLR start "body_p2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:240:1: body_p2_1 : line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ ;
    public final void body_p2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:240:11: ( line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:3: line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+
            {
            pushFollow(FOLLOW_line_p2_1_in_body_p2_1190);
            line_p2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:13: ( line_c2_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CR) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==CHARC) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:14: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_p2_1193);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:242:4: ( body_obr2_1 )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CR) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==CHARO) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:242:4: body_obr2_1
            	    {
            	    pushFollow(FOLLOW_body_obr2_1_in_body_p2_1200);
            	    body_obr2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


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
    // $ANTLR end "body_p2_1"



    // $ANTLR start "body_obr2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:244:1: body_obr2_1 : line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ ;
    public final void body_obr2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:244:13: ( line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:4: line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+
            {
            pushFollow(FOLLOW_line_obr2_1_in_body_obr2_1212);
            line_obr2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:16: ( line_c2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==CR) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==CHARC) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obr2_1215);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:5: ( body_obx2_1 )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CR) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==CHARO) ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3==CHARB) ) {
                            int LA11_4 = input.LA(4);

                            if ( (LA11_4==CHARX) ) {
                                alt11=1;
                            }


                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:5: body_obx2_1
            	    {
            	    pushFollow(FOLLOW_body_obx2_1_in_body_obr2_1223);
            	    body_obx2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


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
    // $ANTLR end "body_obr2_1"



    // $ANTLR start "body_obx2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:1: body_obx2_1 : line_obx2_1 ( line_c2_1 )* ;
    public final void body_obx2_1() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:13: ( line_obx2_1 ( line_c2_1 )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:4: line_obx2_1 ( line_c2_1 )*
            {
            pushFollow(FOLLOW_line_obx2_1_in_body_obx2_1235);
            line_obx2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:16: ( line_c2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==CR) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==CHARC) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obx2_1238);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "body_obx2_1"



    // $ANTLR start "line_h2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:255:1: line_h2_2 : delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:257:22: ( delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:258:3: delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_2261);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2265); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2267);
            st_sized_optionnal("H.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2272); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2274);
            st_sized_optionnal("H.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2279); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2281);
            spec_sized_mult_lvl1_st_mandatory_2("H.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2286); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2288);
            spec_sized_mult_lvl1_st_optionnal_6("H.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2293); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_2295);
            spec_const_7_7_contexte("H.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2300); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_2302);
            spec_sized_tn("H.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2307); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2309);
            st_sized_optionnal("H.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2314); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2316);
            spec_sized_mult_lvl1_st_mandatory_2("H.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2321); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2323);
            st_sized_optionnal("H.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2328); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_2330);
            spec_const_7_12("H.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2335); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2337);
            spec_const_7_13_version_2_2("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2342); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2344);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:3: ( DELIMITER1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DELIMITER1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2349); 

                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_h2_2"



    // $ANTLR start "line_h2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:1: line_h2_1 : delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:22: ( delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:3: delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_1369);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1373); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1375);
            st_sized_optionnal("H.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1380); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1382);
            st_sized_optionnal("H.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1387); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1389);
            spec_sized_mult_lvl1_st_mandatory_2("H.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1394); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1396);
            spec_sized_mult_lvl1_st_optionnal_6("H.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1401); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_1403);
            spec_const_7_7_contexte("H.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1408); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_1410);
            spec_sized_tn("H.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1415); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1417);
            st_sized_optionnal("H.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1422); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1424);
            spec_sized_mult_lvl1_st_mandatory_2("H.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1429); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1431);
            st_sized_optionnal("H.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1436); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_1438);
            spec_const_7_12("H.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1443); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1445);
            spec_const_7_13_version_2_1("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1450); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1452);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:291:3: ( DELIMITER1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DELIMITER1) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:291:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1457); 

                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_h2_1"



    // $ANTLR start "line_h2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:294:1: line_h2_0 : delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_0() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:22: ( delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:297:3: delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H.7\"] DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_0476);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0480); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_0482);
            st_sized_optionnal("H.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0487); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_0489);
            st_sized_optionnal("H.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0494); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_0496);
            spec_sized_mult_lvl1_st_mandatory_2("H.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0501); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_0503);
            spec_sized_mult_lvl1_st_optionnal_6("H.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0508); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_0510);
            spec_const_7_7_contexte("H.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0515); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_0517);
            spec_sized_tn("H.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0522); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_0524);
            st_sized_optionnal("H.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0529); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_0531);
            spec_sized_mult_lvl1_st_mandatory_2("H.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0536); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_0538);
            st_sized_optionnal("H.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0543); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_0545);
            spec_const_7_12("H.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0550); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0552);
            spec_const_7_13_version_2_0("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0557); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_0559);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:3: ( DELIMITER1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DELIMITER1) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0564); 

                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_h2_0"



    // $ANTLR start "line_p2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:1: line_p2_2 : line_p2_1 ;
    public final void line_p2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:10: ( line_p2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:314:3: line_p2_1
            {
            pushFollow(FOLLOW_line_p2_1_in_line_p2_2575);
            line_p2_1();

            state._fsp--;


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
    // $ANTLR end "line_p2_2"



    // $ANTLR start "line_p2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:1: line_p2_1 : CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p2_1() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:22: ( CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:3: CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p2_1592); 

            match(input,CHARP,FOLLOW_CHARP_in_line_p2_1594); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1598); 

            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_p2_1600);
            nm_integer_sized_optionnal("P.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1605); 

            pushFollow(FOLLOW_spec_sized_8_3_in_line_p2_1607);
            spec_sized_8_3("P.3", 36);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1612); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1614);
            st_sized_optionnal("P.4", 16);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:3: ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DELIMITER1) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:4: DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1620); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1622);
                    st_sized_optionnal("P.5", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==DELIMITER1) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1629); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1631);
                            spec_sized_mult_lvl1_st_optionnal_6("P.6", 48);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:5: ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==DELIMITER1) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:6: DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1639); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1641);
                                    st_sized_optionnal("P.7", 24);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:6: ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt47=2;
                                    int LA47_0 = input.LA(1);

                                    if ( (LA47_0==DELIMITER1) ) {
                                        alt47=1;
                                    }
                                    switch (alt47) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:7: DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1650); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1652);
                                            ts_sized_optionnal("P.8", 26);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:7: ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt46=2;
                                            int LA46_0 = input.LA(1);

                                            if ( (LA46_0==DELIMITER1) ) {
                                                alt46=1;
                                            }
                                            switch (alt46) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:8: DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1662); 

                                                    pushFollow(FOLLOW_spec_const_sexe_in_line_p2_1664);
                                                    spec_const_sexe("P.9");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:8: ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt45=2;
                                                    int LA45_0 = input.LA(1);

                                                    if ( (LA45_0==DELIMITER1) ) {
                                                        alt45=1;
                                                    }
                                                    switch (alt45) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:9: DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1675); 

                                                            pushFollow(FOLLOW_spec_const_race_in_line_p2_1677);
                                                            spec_const_race("P.10");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:9: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt44=2;
                                                            int LA44_0 = input.LA(1);

                                                            if ( (LA44_0==DELIMITER1) ) {
                                                                alt44=1;
                                                            }
                                                            switch (alt44) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:10: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1689); 

                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1691);
                                                                    spec_sized_mult_lvl1_st_optionnal_6("P.11", 200);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:10: ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt43=2;
                                                                    int LA43_0 = input.LA(1);

                                                                    if ( (LA43_0==DELIMITER1) ) {
                                                                        alt43=1;
                                                                    }
                                                                    switch (alt43) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:11: DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1704); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1706);
                                                                            st_sized_optionnal("P.12", 120);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:11: ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt42=2;
                                                                            int LA42_0 = input.LA(1);

                                                                            if ( (LA42_0==DELIMITER1) ) {
                                                                                alt42=1;
                                                                            }
                                                                            switch (alt42) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:12: DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1720); 

                                                                                    pushFollow(FOLLOW_spec_sized_tn_in_line_p2_1722);
                                                                                    spec_sized_tn("P.13", 40);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:12: ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt41=2;
                                                                                    int LA41_0 = input.LA(1);

                                                                                    if ( (LA41_0==DELIMITER1) ) {
                                                                                        alt41=1;
                                                                                    }
                                                                                    switch (alt41) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:13: DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1761); 

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1763);
                                                                                            spec_sized_cna("P.14", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:51: ( REPETITEUR spec_sized_cna[\"P.14\", 60] )*
                                                                                            loop16:
                                                                                            do {
                                                                                                int alt16=2;
                                                                                                int LA16_0 = input.LA(1);

                                                                                                if ( (LA16_0==REPETITEUR) ) {
                                                                                                    alt16=1;
                                                                                                }


                                                                                                switch (alt16) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:52: REPETITEUR spec_sized_cna[\"P.14\", 60]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1767); 

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1769);
                                                                                            	    spec_sized_cna("P.14", 60);

                                                                                            	    state._fsp--;


                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop16;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:13: ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt40=2;
                                                                                            int LA40_0 = input.LA(1);

                                                                                            if ( (LA40_0==DELIMITER1) ) {
                                                                                                alt40=1;
                                                                                            }
                                                                                            switch (alt40) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:14: DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1787); 

                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1789);
                                                                                                    st_sized_optionnal("P.15", 60);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:14: ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt39=2;
                                                                                                    int LA39_0 = input.LA(1);

                                                                                                    if ( (LA39_0==DELIMITER1) ) {
                                                                                                        alt39=1;
                                                                                                    }
                                                                                                    switch (alt39) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:15: DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1806); 

                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1808);
                                                                                                            st_sized_optionnal("P.16", 60);

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:15: ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt38=2;
                                                                                                            int LA38_0 = input.LA(1);

                                                                                                            if ( (LA38_0==DELIMITER1) ) {
                                                                                                                alt38=1;
                                                                                                            }
                                                                                                            switch (alt38) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:16: DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1841); 

                                                                                                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1843);
                                                                                                                    nm_sized_optionnal("P.17", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:16: ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt37=2;
                                                                                                                    int LA37_0 = input.LA(1);

                                                                                                                    if ( (LA37_0==DELIMITER1) ) {
                                                                                                                        alt37=1;
                                                                                                                    }
                                                                                                                    switch (alt37) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:17: DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1878); 

                                                                                                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1880);
                                                                                                                            nm_sized_optionnal("P.18", 10);

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:17: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt36=2;
                                                                                                                            int LA36_0 = input.LA(1);

                                                                                                                            if ( (LA36_0==DELIMITER1) ) {
                                                                                                                                alt36=1;
                                                                                                                            }
                                                                                                                            switch (alt36) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:18: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1900); 

                                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1902);
                                                                                                                                    spec_sized_mult_lvl1_st_optionnal_6("P.19", 200);

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:78: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )*
                                                                                                                                    loop17:
                                                                                                                                    do {
                                                                                                                                        int alt17=2;
                                                                                                                                        int LA17_0 = input.LA(1);

                                                                                                                                        if ( (LA17_0==REPETITEUR) ) {
                                                                                                                                            alt17=1;
                                                                                                                                        }


                                                                                                                                        switch (alt17) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:79: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1906); 

                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1908);
                                                                                                                                    	    spec_sized_mult_lvl1_st_optionnal_6("P.19", 200);

                                                                                                                                    	    state._fsp--;


                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop17;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:18: ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt35=2;
                                                                                                                                    int LA35_0 = input.LA(1);

                                                                                                                                    if ( (LA35_0==DELIMITER1) ) {
                                                                                                                                        alt35=1;
                                                                                                                                    }
                                                                                                                                    switch (alt35) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:19: DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1931); 

                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1933);
                                                                                                                                            st_sized_optionnal("P.20", 200);

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:62: ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )*
                                                                                                                                            loop18:
                                                                                                                                            do {
                                                                                                                                                int alt18=2;
                                                                                                                                                int LA18_0 = input.LA(1);

                                                                                                                                                if ( (LA18_0==REPETITEUR) ) {
                                                                                                                                                    alt18=1;
                                                                                                                                                }


                                                                                                                                                switch (alt18) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:63: REPETITEUR st_sized_optionnal[\"P.20\", 200]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1937); 

                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1939);
                                                                                                                                            	    st_sized_optionnal("P.20", 200);

                                                                                                                                            	    state._fsp--;


                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop18;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:19: ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt34=2;
                                                                                                                                            int LA34_0 = input.LA(1);

                                                                                                                                            if ( (LA34_0==DELIMITER1) ) {
                                                                                                                                                alt34=1;
                                                                                                                                            }
                                                                                                                                            switch (alt34) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:20: DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1963); 

                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1965);
                                                                                                                                                    st_sized_optionnal("P.21", 200);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:20: ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt33=2;
                                                                                                                                                    int LA33_0 = input.LA(1);

                                                                                                                                                    if ( (LA33_0==DELIMITER1) ) {
                                                                                                                                                        alt33=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt33) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:21: DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1988); 

                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1990);
                                                                                                                                                            st_sized_optionnal("P.22", 60);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:345:21: ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt32=2;
                                                                                                                                                            int LA32_0 = input.LA(1);

                                                                                                                                                            if ( (LA32_0==DELIMITER1) ) {
                                                                                                                                                                alt32=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt32) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:345:22: DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11014); 

                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11016);
                                                                                                                                                                    st_sized_optionnal("P.23", 60);

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:22: ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt31=2;
                                                                                                                                                                    int LA31_0 = input.LA(1);

                                                                                                                                                                    if ( (LA31_0==DELIMITER1) ) {
                                                                                                                                                                        alt31=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt31) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:23: DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11041); 

                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11043);
                                                                                                                                                                            ts_sized_optionnal("P.24", 26);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:65: ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )?
                                                                                                                                                                            int alt19=2;
                                                                                                                                                                            int LA19_0 = input.LA(1);

                                                                                                                                                                            if ( (LA19_0==REPETITEUR) ) {
                                                                                                                                                                                alt19=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt19) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:66: REPETITEUR ts_sized_optionnal[\"P.24\", 26]
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_11047); 

                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11049);
                                                                                                                                                                                    ts_sized_optionnal("P.24", 26);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:23: ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt30=2;
                                                                                                                                                                            int LA30_0 = input.LA(1);

                                                                                                                                                                            if ( (LA30_0==DELIMITER1) ) {
                                                                                                                                                                                alt30=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt30) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:24: DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11077); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_const_8_25_in_line_p2_11079);
                                                                                                                                                                                    spec_const_8_25("P.25");

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:348:24: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt29=2;
                                                                                                                                                                                    int LA29_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA29_0==DELIMITER1) ) {
                                                                                                                                                                                        alt29=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt29) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:348:25: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11106); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_11108);
                                                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_8("P.26", 100);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:350:25: ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt28=2;
                                                                                                                                                                                            int LA28_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA28_0==DELIMITER1) ) {
                                                                                                                                                                                                alt28=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt28) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:350:26: DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11161); 

                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11163);
                                                                                                                                                                                                    st_sized_optionnal("P.27", 100);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:26: ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt27=2;
                                                                                                                                                                                                    int LA27_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA27_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt27=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt27) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:27: DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11192); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_p2_11194);
                                                                                                                                                                                                            spec_const_race("P.28");

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:27: ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt26=2;
                                                                                                                                                                                                            int LA26_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA26_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt26=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt26) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:28: DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11251); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11253);
                                                                                                                                                                                                                    st_sized_optionnal("P.29", 2);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:355:28: ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt25=2;
                                                                                                                                                                                                                    int LA25_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA25_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt25=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt25) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:355:29: DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11312); 

                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11314);
                                                                                                                                                                                                                            st_sized_optionnal("P.30", 20);

                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:29: ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt24=2;
                                                                                                                                                                                                                            int LA24_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA24_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt24=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt24) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:30: DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11346); 

                                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11348);
                                                                                                                                                                                                                                    st_sized_optionnal("P.31", 20);

                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:30: ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt23=2;
                                                                                                                                                                                                                                    int LA23_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA23_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt23=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt23) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:31: DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11411); 

                                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11413);
                                                                                                                                                                                                                                            st_sized_optionnal("P.32", 20);

                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:31: ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt22=2;
                                                                                                                                                                                                                                            int LA22_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA22_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt22=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt22) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:32: DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11447); 

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11449);
                                                                                                                                                                                                                                                    ts_sized_optionnal("P.33", 26);

                                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:32: ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt21=2;
                                                                                                                                                                                                                                                    int LA21_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA21_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt21=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt21) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:33: DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11484); 

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11486);
                                                                                                                                                                                                                                                            ts_sized_optionnal("P.34", 26);

                                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt20=2;
                                                                                                                                                                                                                                                            int LA20_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA20_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt20=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt20) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11521); 

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_p2_1"



    // $ANTLR start "line_obr2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:1: line_obr2_2 : line_obr2_1 ;
    public final void line_obr2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:12: ( line_obr2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:3: line_obr2_1
            {
            pushFollow(FOLLOW_line_obr2_1_in_line_obr2_21592);
            line_obr2_1();

            state._fsp--;


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
    // $ANTLR end "line_obr2_2"



    // $ANTLR start "line_obr2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:367:1: line_obr2_1 : CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr2_1() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:22: ( CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:370:3: CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2_11609); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obr2_11611); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obr2_11613); 

            match(input,CHARR,FOLLOW_CHARR_in_line_obr2_11615); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11619); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11621);
            nm_integer_sized_mandatory("OBR.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11626); 

            pushFollow(FOLLOW_spec_sized_9_3_in_line_obr2_11628);
            spec_sized_9_3("OBR.3", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11633); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11635);
            spec_sized_mult_lvl1_st_optionnal_2("OBR.4", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11640); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11642);
            spec_sized_mult_lvl1_st_optionnal_6("OBR.5", 640000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:374:67: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==REPETITEUR) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:374:68: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11646); 

            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11648);
            	    spec_sized_mult_lvl1_st_optionnal_6("OBR.5", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11658); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11660);
            st_sized_optionnal("OBR.6", 2);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:45: ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==REPETITEUR) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:46: REPETITEUR st_sized_optionnal[\"OBR.6\", 2]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11664); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11666);
            	    st_sized_optionnal("OBR.6", 2);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11673); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11675);
            ts_sized_optionnal("OBR.7", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11680); 

            pushFollow(FOLLOW_spec_non_sized_9_8_in_line_obr2_11682);
            spec_non_sized_9_8("OBR.8");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11687); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11689);
            ts_sized_optionnal("OBR.9", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11697); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11699);
            st_sized_optionnal("OBR.10", 20);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11704); 

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11706);
            spec_sized_cna("OBR.11", 60);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11714); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11716);
            st_sized_optionnal("OBR.12", 1);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:3: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==DELIMITER1) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:4: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11725); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11727);
                    spec_sized_mult_lvl1_st_optionnal_2("OBR.13", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:387:4: ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==DELIMITER1) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:387:5: DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11734); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11736);
                            st_sized_optionnal("OBR.14", 300);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:5: ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==DELIMITER1) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:6: DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11744); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11746);
                                    ts_sized_optionnal("OBR.15", 26);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:389:6: ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt77=2;
                                    int LA77_0 = input.LA(1);

                                    if ( (LA77_0==DELIMITER1) ) {
                                        alt77=1;
                                    }
                                    switch (alt77) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:389:7: DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11755); 

                                            pushFollow(FOLLOW_spec_sized_9_16_in_line_obr2_11757);
                                            spec_sized_9_16("OBR.16", 300);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:390:7: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt76=2;
                                            int LA76_0 = input.LA(1);

                                            if ( (LA76_0==DELIMITER1) ) {
                                                alt76=1;
                                            }
                                            switch (alt76) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:390:8: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11767); 

                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11769);
                                                    spec_sized_mult_lvl1_st_optionnal_6("OBR.17", 60);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:391:8: ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt75=2;
                                                    int LA75_0 = input.LA(1);

                                                    if ( (LA75_0==DELIMITER1) ) {
                                                        alt75=1;
                                                    }
                                                    switch (alt75) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:391:9: DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11780); 

                                                            pushFollow(FOLLOW_spec_sized_tn_in_line_obr2_11782);
                                                            spec_sized_tn("OBR.18", 40);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:392:9: ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt74=2;
                                                            int LA74_0 = input.LA(1);

                                                            if ( (LA74_0==DELIMITER1) ) {
                                                                alt74=1;
                                                            }
                                                            switch (alt74) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:392:10: DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11794); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11796);
                                                                    st_sized_optionnal("OBR.19", 60);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:393:10: ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt73=2;
                                                                    int LA73_0 = input.LA(1);

                                                                    if ( (LA73_0==DELIMITER1) ) {
                                                                        alt73=1;
                                                                    }
                                                                    switch (alt73) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:393:11: DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11809); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11811);
                                                                            st_sized_optionnal("OBR.20", 60);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:11: ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt72=2;
                                                                            int LA72_0 = input.LA(1);

                                                                            if ( (LA72_0==DELIMITER1) ) {
                                                                                alt72=1;
                                                                            }
                                                                            switch (alt72) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:12: DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11825); 

                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11827);
                                                                                    st_sized_optionnal("OBR.21", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:12: ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt71=2;
                                                                                    int LA71_0 = input.LA(1);

                                                                                    if ( (LA71_0==DELIMITER1) ) {
                                                                                        alt71=1;
                                                                                    }
                                                                                    switch (alt71) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:13: DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11842); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11844);
                                                                                            st_sized_optionnal("OBR.22", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:396:13: ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt70=2;
                                                                                            int LA70_0 = input.LA(1);

                                                                                            if ( (LA70_0==DELIMITER1) ) {
                                                                                                alt70=1;
                                                                                            }
                                                                                            switch (alt70) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:396:14: DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11860); 

                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11862);
                                                                                                    ts_sized_optionnal("OBR.23", 26);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:14: ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt69=2;
                                                                                                    int LA69_0 = input.LA(1);

                                                                                                    if ( (LA69_0==DELIMITER1) ) {
                                                                                                        alt69=1;
                                                                                                    }
                                                                                                    switch (alt69) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:15: DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11879); 

                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2_11881);
                                                                                                            spec_const_race("OBR.24");

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:398:15: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt68=2;
                                                                                                            int LA68_0 = input.LA(1);

                                                                                                            if ( (LA68_0==DELIMITER1) ) {
                                                                                                                alt68=1;
                                                                                                            }
                                                                                                            switch (alt68) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:398:16: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11899); 

                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11901);
                                                                                                                    spec_sized_mult_lvl1_st_optionnal_2("OBR.25", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:16: ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt67=2;
                                                                                                                    int LA67_0 = input.LA(1);

                                                                                                                    if ( (LA67_0==DELIMITER1) ) {
                                                                                                                        alt67=1;
                                                                                                                    }
                                                                                                                    switch (alt67) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:17: DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11920); 

                                                                                                                            pushFollow(FOLLOW_spec_const_9_26_in_line_obr2_11922);
                                                                                                                            spec_const_9_26("OBR.26");

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:17: ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt66=2;
                                                                                                                            int LA66_0 = input.LA(1);

                                                                                                                            if ( (LA66_0==DELIMITER1) ) {
                                                                                                                                alt66=1;
                                                                                                                            }
                                                                                                                            switch (alt66) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:18: DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11942); 

                                                                                                                                    pushFollow(FOLLOW_spec_const_race_in_line_obr2_11944);
                                                                                                                                    spec_const_race("OBR.27");

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:401:18: ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt65=2;
                                                                                                                                    int LA65_0 = input.LA(1);

                                                                                                                                    if ( (LA65_0==DELIMITER1) ) {
                                                                                                                                        alt65=1;
                                                                                                                                    }
                                                                                                                                    switch (alt65) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:401:19: DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11965); 

                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2_11967);
                                                                                                                                            spec_const_race("OBR.28");

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt64=2;
                                                                                                                                            int LA64_0 = input.LA(1);

                                                                                                                                            if ( (LA64_0==DELIMITER1) ) {
                                                                                                                                                alt64=1;
                                                                                                                                            }
                                                                                                                                            switch (alt64) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:20: DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11989); 

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11991);
                                                                                                                                                    spec_sized_cna("OBR.29", 150);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:61: ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )*
                                                                                                                                                    loop53:
                                                                                                                                                    do {
                                                                                                                                                        int alt53=2;
                                                                                                                                                        int LA53_0 = input.LA(1);

                                                                                                                                                        if ( (LA53_0==REPETITEUR) ) {
                                                                                                                                                            alt53=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt53) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:62: REPETITEUR spec_sized_cna[\"OBR.29\", 150]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11995); 

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11997);
                                                                                                                                                    	    spec_sized_cna("OBR.29", 150);

                                                                                                                                                    	    state._fsp--;


                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop53;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:403:20: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt63=2;
                                                                                                                                                    int LA63_0 = input.LA(1);

                                                                                                                                                    if ( (LA63_0==DELIMITER1) ) {
                                                                                                                                                        alt63=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt63) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:403:21: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12022); 

                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_12024);
                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_4("OBR.30", 150);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:21: ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt62=2;
                                                                                                                                                            int LA62_0 = input.LA(1);

                                                                                                                                                            if ( (LA62_0==DELIMITER1) ) {
                                                                                                                                                                alt62=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt62) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:22: DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12048); 

                                                                                                                                                                    pushFollow(FOLLOW_spec_const_9_31_in_line_obr2_12050);
                                                                                                                                                                    spec_const_9_31("OBR.31");

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:406:22: ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    int alt61=2;
                                                                                                                                                                    int LA61_0 = input.LA(1);

                                                                                                                                                                    if ( (LA61_0==DELIMITER1) ) {
                                                                                                                                                                        alt61=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt61) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:406:23: DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12097); 

                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_12099);
                                                                                                                                                                            st_sized_optionnal("OBR.32", 300);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:406:68: ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )*
                                                                                                                                                                            loop54:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt54=2;
                                                                                                                                                                                int LA54_0 = input.LA(1);

                                                                                                                                                                                if ( (LA54_0==REPETITEUR) ) {
                                                                                                                                                                                    alt54=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt54) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:406:69: REPETITEUR st_sized_optionnal[\"OBR.32\", 300]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_12103); 

                                                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_12105);
                                                                                                                                                                            	    st_sized_optionnal("OBR.32", 300);

                                                                                                                                                                            	    state._fsp--;


                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop54;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:407:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            int alt60=2;
                                                                                                                                                                            int LA60_0 = input.LA(1);

                                                                                                                                                                            if ( (LA60_0==DELIMITER1) ) {
                                                                                                                                                                                alt60=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt60) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:407:24: DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12133); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12135);
                                                                                                                                                                                    spec_sized_cna("OBR.33", 60);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:408:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    int alt59=2;
                                                                                                                                                                                    int LA59_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA59_0==DELIMITER1) ) {
                                                                                                                                                                                        alt59=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt59) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:408:25: DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12162); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12164);
                                                                                                                                                                                            spec_sized_cna("OBR.34", 60);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            int alt58=2;
                                                                                                                                                                                            int LA58_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA58_0==DELIMITER1) ) {
                                                                                                                                                                                                alt58=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt58) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:26: DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12192); 

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12194);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", 60);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    int alt57=2;
                                                                                                                                                                                                    int LA57_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA57_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt57=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt57) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:27: DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12223); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12225);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", 60);

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:27: ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            int alt56=2;
                                                                                                                                                                                                            int LA56_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA56_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt56=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt56) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:28: DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12255); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_12257);
                                                                                                                                                                                                                    ts_sized_optionnal("OBR.37", 26);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:29: ( DELIMITER1 )?
                                                                                                                                                                                                                    int alt55=2;
                                                                                                                                                                                                                    int LA55_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA55_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt55=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt55) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:29: DELIMITER1
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12288); 

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_obr2_1"



    // $ANTLR start "line_obx2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:414:1: line_obx2_1 : CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) ;
    public final void line_obx2_1() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:416:22: ( CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:3: CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2_12356); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obx2_12358); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obx2_12360); 

            match(input,CHARX,FOLLOW_CHARX_in_line_obx2_12362); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12366); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12368);
            nm_integer_sized_mandatory("OBX.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12373); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:5: ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            int alt116=7;
            switch ( input.LA(1) ) {
            case CHARN:
                {
                alt116=1;
                }
                break;
            case CHARC:
                {
                int LA116_2 = input.LA(2);

                if ( (LA116_2==CHARE) ) {
                    alt116=2;
                }
                else if ( (LA116_2==CHARK||LA116_2==CHARN) ) {
                    alt116=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARF:
                {
                alt116=3;
                }
                break;
            case CHARS:
                {
                alt116=4;
                }
                break;
            case CHARG:
                {
                int LA116_5 = input.LA(2);

                if ( (LA116_5==CHARC) ) {
                    alt116=5;
                }
                else if ( (LA116_5==CHARB||LA116_5==CHARN) ) {
                    alt116=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 5, input);

                    throw nvae;

                }
                }
                break;
            case CHART:
                {
                int LA116_6 = input.LA(2);

                if ( (LA116_6==CHARX) ) {
                    alt116=6;
                }
                else if ( (LA116_6==CHARN) ) {
                    alt116=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARA:
            case CHARD:
            case CHARP:
                {
                alt116=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }

            switch (alt116) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:6: ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:6: ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:7: spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_nm_in_line_obx2_12381);
                    spec_const_10_3_nm("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==DELIMITER1) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12390); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12392);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==DELIMITER1) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12402); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12404);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:8: ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt83=2;
                                    int LA83_0 = input.LA(1);

                                    if ( (LA83_0==DELIMITER1) ) {
                                        alt83=1;
                                    }
                                    switch (alt83) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:9: DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12415); 

                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12417);
                                            nm_sized_optionnal("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:55: ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )*
                                            loop81:
                                            do {
                                                int alt81=2;
                                                int LA81_0 = input.LA(1);

                                                if ( (LA81_0==REPETITEUR) ) {
                                                    alt81=1;
                                                }


                                                switch (alt81) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:56: REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12421); 

                                            	    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12423);
                                            	    nm_sized_optionnal("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop81;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:9: ( line_obx2_1_post10_6 )?
                                            int alt82=2;
                                            int LA82_0 = input.LA(1);

                                            if ( (LA82_0==DELIMITER1) ) {
                                                alt82=1;
                                            }
                                            switch (alt82) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12436);
                                                    line_obx2_1_post10_6();

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
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
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:7: ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:7: ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:8: spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_ce_in_line_obx2_12453);
                    spec_const_10_3_ce("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:426:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==DELIMITER1) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:426:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12462); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12464);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==DELIMITER1) ) {
                                alt89=1;
                            }
                            switch (alt89) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12474); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12476);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:8: ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt88=2;
                                    int LA88_0 = input.LA(1);

                                    if ( (LA88_0==DELIMITER1) ) {
                                        alt88=1;
                                    }
                                    switch (alt88) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:9: DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12487); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12489);
                                            spec_sized_10_6("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:52: ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )*
                                            loop86:
                                            do {
                                                int alt86=2;
                                                int LA86_0 = input.LA(1);

                                                if ( (LA86_0==REPETITEUR) ) {
                                                    alt86=1;
                                                }


                                                switch (alt86) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:53: REPETITEUR spec_sized_10_6[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12493); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12495);
                                            	    spec_sized_10_6("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop86;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:429:9: ( line_obx2_1_post10_6 )?
                                            int alt87=2;
                                            int LA87_0 = input.LA(1);

                                            if ( (LA87_0==DELIMITER1) ) {
                                                alt87=1;
                                            }
                                            switch (alt87) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:429:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12508);
                                                    line_obx2_1_post10_6();

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
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
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:7: ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:7: ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:8: spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_fic_in_line_obx2_12525);
                    spec_const_10_3_fic("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:431:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==DELIMITER1) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:431:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12534); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12536);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==DELIMITER1) ) {
                                alt94=1;
                            }
                            switch (alt94) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12546); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12548);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:8: ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt93=2;
                                    int LA93_0 = input.LA(1);

                                    if ( (LA93_0==DELIMITER1) ) {
                                        alt93=1;
                                    }
                                    switch (alt93) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:9: DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12559); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12561);
                                            spec_sized_10_6("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:52: ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )*
                                            loop91:
                                            do {
                                                int alt91=2;
                                                int LA91_0 = input.LA(1);

                                                if ( (LA91_0==REPETITEUR) ) {
                                                    alt91=1;
                                                }


                                                switch (alt91) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:53: REPETITEUR spec_sized_10_6[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12565); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12567);
                                            	    spec_sized_10_6("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop91;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:9: ( line_obx2_1_post10_6 )?
                                            int alt92=2;
                                            int LA92_0 = input.LA(1);

                                            if ( (LA92_0==DELIMITER1) ) {
                                                alt92=1;
                                            }
                                            switch (alt92) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12580);
                                                    line_obx2_1_post10_6();

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
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
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:7: ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:7: ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:8: spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_st_in_line_obx2_12597);
                    spec_const_10_3_st("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:436:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==DELIMITER1) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:436:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12606); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12608);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:437:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt99=2;
                            int LA99_0 = input.LA(1);

                            if ( (LA99_0==DELIMITER1) ) {
                                alt99=1;
                            }
                            switch (alt99) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:437:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12618); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12620);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt98=2;
                                    int LA98_0 = input.LA(1);

                                    if ( (LA98_0==DELIMITER1) ) {
                                        alt98=1;
                                    }
                                    switch (alt98) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:9: DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12631); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12633);
                                            spec_sized_10_6_tx("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:55: ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )*
                                            loop96:
                                            do {
                                                int alt96=2;
                                                int LA96_0 = input.LA(1);

                                                if ( (LA96_0==REPETITEUR) ) {
                                                    alt96=1;
                                                }


                                                switch (alt96) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:56: REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12637); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12639);
                                            	    spec_sized_10_6_tx("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop96;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:9: ( line_obx2_1_post10_6 )?
                                            int alt97=2;
                                            int LA97_0 = input.LA(1);

                                            if ( (LA97_0==DELIMITER1) ) {
                                                alt97=1;
                                            }
                                            switch (alt97) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12652);
                                                    line_obx2_1_post10_6();

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
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
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:7: ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:7: ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:8: spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_gc_in_line_obx2_12669);
                    spec_const_10_3_gc("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==DELIMITER1) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12678); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12680);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt104=2;
                            int LA104_0 = input.LA(1);

                            if ( (LA104_0==DELIMITER1) ) {
                                alt104=1;
                            }
                            switch (alt104) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12690); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12692);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:8: ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt103=2;
                                    int LA103_0 = input.LA(1);

                                    if ( (LA103_0==DELIMITER1) ) {
                                        alt103=1;
                                    }
                                    switch (alt103) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:9: DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12703); 

                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12705);
                                            spec_sized_mult_lvl1_nm_optionnal_2("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:72: ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )*
                                            loop101:
                                            do {
                                                int alt101=2;
                                                int LA101_0 = input.LA(1);

                                                if ( (LA101_0==REPETITEUR) ) {
                                                    alt101=1;
                                                }


                                                switch (alt101) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:73: REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12709); 

                                            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12711);
                                            	    spec_sized_mult_lvl1_nm_optionnal_2("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop101;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:444:9: ( line_obx2_1_post10_6 )?
                                            int alt102=2;
                                            int LA102_0 = input.LA(1);

                                            if ( (LA102_0==DELIMITER1) ) {
                                                alt102=1;
                                            }
                                            switch (alt102) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:444:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12724);
                                                    line_obx2_1_post10_6();

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
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
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:7: ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:7: ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:8: spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_tx_in_line_obx2_12741);
                    spec_const_10_3_tx("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==DELIMITER1) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12750); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12752);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt109=2;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==DELIMITER1) ) {
                                alt109=1;
                            }
                            switch (alt109) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12762); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12764);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt108=2;
                                    int LA108_0 = input.LA(1);

                                    if ( (LA108_0==DELIMITER1) ) {
                                        alt108=1;
                                    }
                                    switch (alt108) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:9: DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12775); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12777);
                                            spec_sized_10_6_tx("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:55: ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )*
                                            loop106:
                                            do {
                                                int alt106=2;
                                                int LA106_0 = input.LA(1);

                                                if ( (LA106_0==REPETITEUR) ) {
                                                    alt106=1;
                                                }


                                                switch (alt106) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:56: REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12781); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12783);
                                            	    spec_sized_10_6_tx("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop106;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:9: ( line_obx2_1_post10_6 )?
                                            int alt107=2;
                                            int LA107_0 = input.LA(1);

                                            if ( (LA107_0==DELIMITER1) ) {
                                                alt107=1;
                                            }
                                            switch (alt107) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12796);
                                                    line_obx2_1_post10_6();

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
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
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:450:7: ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:450:7: ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:450:8: spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_std_in_line_obx2_12813);
                    spec_const_10_3_std("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==DELIMITER1) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12822); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12824);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:452:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt114=2;
                            int LA114_0 = input.LA(1);

                            if ( (LA114_0==DELIMITER1) ) {
                                alt114=1;
                            }
                            switch (alt114) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:452:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12834); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12836);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:8: ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt113=2;
                                    int LA113_0 = input.LA(1);

                                    if ( (LA113_0==DELIMITER1) ) {
                                        alt113=1;
                                    }
                                    switch (alt113) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:9: DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12847); 

                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12849);
                                            st_sized_optionnal("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:55: ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )*
                                            loop111:
                                            do {
                                                int alt111=2;
                                                int LA111_0 = input.LA(1);

                                                if ( (LA111_0==REPETITEUR) ) {
                                                    alt111=1;
                                                }


                                                switch (alt111) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:56: REPETITEUR st_sized_optionnal[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12853); 

                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12855);
                                            	    st_sized_optionnal("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop111;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:454:9: ( line_obx2_1_post10_6 )?
                                            int alt112=2;
                                            int LA112_0 = input.LA(1);

                                            if ( (LA112_0==DELIMITER1) ) {
                                                alt112=1;
                                            }
                                            switch (alt112) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:454:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12868);
                                                    line_obx2_1_post10_6();

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
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
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_obx2_1"



    // $ANTLR start "line_obx2_1_post10_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:1: line_obx2_1_post10_6 : ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) ;
    public final void line_obx2_1_post10_6() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:21: ( ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:5: ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:5: ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:6: DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62889); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62891);
            st_sized_optionnal("OBX.7", 20);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:6: ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==DELIMITER1) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:7: DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62900); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62902);
                    st_sized_optionnal("OBX.8", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:50: ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==REPETITEUR) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:51: REPETITEUR st_sized_optionnal[\"OBX.8\", 60]
                    	    {
                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62906); 

                    	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62908);
                    	    st_sized_optionnal("OBX.8", 60);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:459:7: ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==DELIMITER1) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:459:8: DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62920); 

                            pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62922);
                            spec_const_10_9("OBX.9");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:459:44: ( REPETITEUR spec_const_10_9[\"OBX.9\"] )*
                            loop118:
                            do {
                                int alt118=2;
                                int LA118_0 = input.LA(1);

                                if ( (LA118_0==REPETITEUR) ) {
                                    alt118=1;
                                }


                                switch (alt118) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:459:45: REPETITEUR spec_const_10_9[\"OBX.9\"]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62926); 

                            	    pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62928);
                            	    spec_const_10_9("OBX.9");

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop118;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:460:8: ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            int alt128=2;
                            int LA128_0 = input.LA(1);

                            if ( (LA128_0==DELIMITER1) ) {
                                alt128=1;
                            }
                            switch (alt128) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:460:9: DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62941); 

                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62943);
                                    nm_sized_optionnal("OBX.10", 5);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:461:9: ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    int alt127=2;
                                    int LA127_0 = input.LA(1);

                                    if ( (LA127_0==DELIMITER1) ) {
                                        alt127=1;
                                    }
                                    switch (alt127) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:461:10: DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62955); 

                                            pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62957);
                                            spec_const_10_11("OBX.11");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:461:48: ( REPETITEUR spec_const_10_11[\"OBX.11\"] )*
                                            loop119:
                                            do {
                                                int alt119=2;
                                                int LA119_0 = input.LA(1);

                                                if ( (LA119_0==REPETITEUR) ) {
                                                    alt119=1;
                                                }


                                                switch (alt119) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:461:49: REPETITEUR spec_const_10_11[\"OBX.11\"]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62961); 

                                            	    pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62963);
                                            	    spec_const_10_11("OBX.11");

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop119;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:462:10: ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            int alt126=2;
                                            int LA126_0 = input.LA(1);

                                            if ( (LA126_0==DELIMITER1) ) {
                                                alt126=1;
                                            }
                                            switch (alt126) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:462:11: DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62978); 

                                                    pushFollow(FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62980);
                                                    spec_const_10_12("OBX.12");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:11: ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    int alt125=2;
                                                    int LA125_0 = input.LA(1);

                                                    if ( (LA125_0==DELIMITER1) ) {
                                                        alt125=1;
                                                    }
                                                    switch (alt125) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:12: DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62995); 

                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62997);
                                                            ts_sized_optionnal("OBX.13", 26);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:464:12: ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            int alt124=2;
                                                            int LA124_0 = input.LA(1);

                                                            if ( (LA124_0==DELIMITER1) ) {
                                                                alt124=1;
                                                            }
                                                            switch (alt124) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:464:13: DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63013); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63015);
                                                                    st_sized_optionnal("OBX.14", 20);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:465:13: ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    int alt123=2;
                                                                    int LA123_0 = input.LA(1);

                                                                    if ( (LA123_0==DELIMITER1) ) {
                                                                        alt123=1;
                                                                    }
                                                                    switch (alt123) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:465:14: DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63031); 

                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_63033);
                                                                            ts_sized_optionnal("OBX.15", 26);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:14: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )?
                                                                            int alt122=2;
                                                                            int LA122_0 = input.LA(1);

                                                                            if ( (LA122_0==DELIMITER1) ) {
                                                                                alt122=1;
                                                                            }
                                                                            switch (alt122) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:15: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63050); 

                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_63052);
                                                                                    spec_sized_mult_lvl1_st_optionnal_6("OBX.16", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:15: ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )?
                                                                                    int alt121=2;
                                                                                    int LA121_0 = input.LA(1);

                                                                                    if ( (LA121_0==DELIMITER1) ) {
                                                                                        alt121=1;
                                                                                    }
                                                                                    switch (alt121) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:16: DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63070); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63072);
                                                                                            st_sized_optionnal("OBX.17", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:60: ( DELIMITER1 )?
                                                                                            int alt120=2;
                                                                                            int LA120_0 = input.LA(1);

                                                                                            if ( (LA120_0==DELIMITER1) ) {
                                                                                                alt120=1;
                                                                                            }
                                                                                            switch (alt120) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:60: DELIMITER1
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63075); 

                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_obx2_1_post10_6"



    // $ANTLR start "line_c2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:469:1: line_c2_1 : CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )? ;
    public final void line_c2_1() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:471:22: ( CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:472:3: CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )?
            {
            match(input,CR,FOLLOW_CR_in_line_c2_13114); 

            match(input,CHARC,FOLLOW_CHARC_in_line_c2_13116); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13120); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_c2_13122);
            nm_integer_sized_mandatory("C.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13127); 

            pushFollow(FOLLOW_spec_const_12_3_in_line_c2_13129);
            spec_const_12_3("C.3");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13134); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13136);
            st_sized_optionnal("C.4", 64000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:47: ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==REPETITEUR) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:48: REPETITEUR st_sized_optionnal[\"C.4\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c2_13140); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13142);
            	    st_sized_optionnal("C.4", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:3: ( DELIMITER1 )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==DELIMITER1) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13151); 

                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_c2_1"



    // $ANTLR start "line_l2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:478:1: line_l2_1 : CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )? ;
    public final void line_l2_1() throws RecognitionException {
        startElement("L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:22: ( CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:3: CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l2_13169); 

            match(input,CHARL,FOLLOW_CHARL_in_line_l2_13171); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:3: ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==DELIMITER1) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:4: DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13176); 

                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13178);
                    nm_integer_sized_optionnal("L.2", 1);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:4: ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==DELIMITER1) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:5: DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13185); 

                            pushFollow(FOLLOW_spec_const_race_in_line_l2_13187);
                            spec_const_race("L.3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:5: ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )?
                            int alt136=2;
                            int LA136_0 = input.LA(1);

                            if ( (LA136_0==DELIMITER1) ) {
                                alt136=1;
                            }
                            switch (alt136) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:6: DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13195); 

                                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13197);
                                    nm_integer_sized_optionnal("L.4", 4);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:6: ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )?
                                    int alt135=2;
                                    int LA135_0 = input.LA(1);

                                    if ( (LA135_0==DELIMITER1) ) {
                                        alt135=1;
                                    }
                                    switch (alt135) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:7: DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13206); 

                                            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13208);
                                            nm_integer_sized_optionnal("L.5", 10);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:7: ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )?
                                            int alt134=2;
                                            int LA134_0 = input.LA(1);

                                            if ( (LA134_0==DELIMITER1) ) {
                                                alt134=1;
                                            }
                                            switch (alt134) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:8: DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13218); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_l2_13220);
                                                    st_sized_optionnal("L.6", 12);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:49: ( DELIMITER1 )?
                                                    int alt133=2;
                                                    int LA133_0 = input.LA(1);

                                                    if ( (LA133_0==DELIMITER1) ) {
                                                        alt133=1;
                                                    }
                                                    switch (alt133) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:49: DELIMITER1
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13223); 

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "line_l2_1"



    // $ANTLR start "spec_const_sexe"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:496:1: spec_const_sexe[String nameElement] : ( final_charM | final_charF | final_charU )? ;
    public final void spec_const_sexe(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:22: ( ( final_charM | final_charF | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:3: ( final_charM | final_charF | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:3: ( final_charM | final_charF | final_charU )?
            int alt139=4;
            switch ( input.LA(1) ) {
                case CHARM:
                    {
                    alt139=1;
                    }
                    break;
                case CHARF:
                    {
                    alt139=2;
                    }
                    break;
                case CHARU:
                    {
                    alt139=3;
                    }
                    break;
            }

            switch (alt139) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:4: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_sexe3261);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:18: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_sexe3265);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:32: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_sexe3269);
                    final_charU();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_sexe"



    // $ANTLR start "spec_const_race"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:501:1: spec_const_race[String nameElement] :;
    public final void spec_const_race(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:503:22: ()
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:3: 
            {
            }

            endElement();
        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "spec_const_race"



    // $ANTLR start "spec_const_7_13_version_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:1: spec_const_7_13_version_2_0[String nameElement] : spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_0(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:508:22: ( spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:509:3: spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03306);
            spec_const_7_13_1_version_2_0(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03309); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03311);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "spec_const_7_13_version_2_0"



    // $ANTLR start "spec_const_7_13_version_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:511:1: spec_const_7_13_version_2_1[String nameElement] : spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_1(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:22: ( spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:514:3: spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13332);
            spec_const_7_13_1_version_2_1(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13335); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13337);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "spec_const_7_13_version_2_1"



    // $ANTLR start "spec_const_7_13_version_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:1: spec_const_7_13_version_2_2[String nameElement] : spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:518:22: ( spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:519:3: spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23356);
            spec_const_7_13_1_version_2_2(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23359); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23361);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "spec_const_7_13_version_2_2"



    // $ANTLR start "spec_const_7_13_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:1: spec_const_7_13_2[String nameElement] : ( final_charC | final_charL | final_charR );
    public final void spec_const_7_13_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:22: ( final_charC | final_charL | final_charR )
            int alt140=3;
            switch ( input.LA(1) ) {
            case CHARC:
                {
                alt140=1;
                }
                break;
            case CHARL:
                {
                alt140=2;
                }
                break;
            case CHARR:
                {
                alt140=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;

            }

            switch (alt140) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:524:3: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_7_13_23380);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:524:17: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_7_13_23384);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:524:31: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_7_13_23388);
                    final_charR();

                    state._fsp--;


                    }
                    break;

            }
            endElement();
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
    // $ANTLR end "spec_const_7_13_2"



    // $ANTLR start "spec_const_7_7_contexte"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:1: spec_const_7_7_contexte[String nameElement] : final_ORU ;
    public final void spec_const_7_7_contexte(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:22: ( final_ORU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:529:3: final_ORU
            {
            pushFollow(FOLLOW_final_ORU_in_spec_const_7_7_contexte3406);
            final_ORU();

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "spec_const_7_7_contexte"



    // $ANTLR start "spec_const_7_12"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:1: spec_const_7_12[String nameElement] : ( final_charP | final_charD | final_charT ) ;
    public final void spec_const_7_12(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:22: ( ( final_charP | final_charD | final_charT ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:3: ( final_charP | final_charD | final_charT )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:3: ( final_charP | final_charD | final_charT )
            int alt141=3;
            switch ( input.LA(1) ) {
            case CHARP:
                {
                alt141=1;
                }
                break;
            case CHARD:
                {
                alt141=2;
                }
                break;
            case CHART:
                {
                alt141=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;

            }

            switch (alt141) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_7_123425);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:18: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_7_123429);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:32: final_charT
                    {
                    pushFollow(FOLLOW_final_charT_in_spec_const_7_123433);
                    final_charT();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_7_12"



    // $ANTLR start "spec_const_9_31"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:1: spec_const_9_31[String nameElement] : ( final_PORT | final_CART | final_WHLC | final_WALK )? ;
    public final void spec_const_9_31(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:22: ( ( final_PORT | final_CART | final_WHLC | final_WALK )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            int alt142=5;
            switch ( input.LA(1) ) {
                case CHARP:
                    {
                    alt142=1;
                    }
                    break;
                case CHARC:
                    {
                    alt142=2;
                    }
                    break;
                case CHARW:
                    {
                    int LA142_3 = input.LA(2);

                    if ( (LA142_3==CHARH) ) {
                        alt142=3;
                    }
                    else if ( (LA142_3==CHARA) ) {
                        alt142=4;
                    }
                    }
                    break;
            }

            switch (alt142) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:4: final_PORT
                    {
                    pushFollow(FOLLOW_final_PORT_in_spec_const_9_313453);
                    final_PORT();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:17: final_CART
                    {
                    pushFollow(FOLLOW_final_CART_in_spec_const_9_313457);
                    final_CART();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:30: final_WHLC
                    {
                    pushFollow(FOLLOW_final_WHLC_in_spec_const_9_313461);
                    final_WHLC();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:43: final_WALK
                    {
                    pushFollow(FOLLOW_final_WALK_in_spec_const_9_313465);
                    final_WALK();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_9_31"



    // $ANTLR start "spec_const_8_25"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:541:1: spec_const_8_25[String nameElement] : ( final_OP | final_IP | final_ER | final_PA | final_MP )? ;
    public final void spec_const_8_25(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:543:22: ( ( final_OP | final_IP | final_ER | final_PA | final_MP )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            int alt143=6;
            switch ( input.LA(1) ) {
                case CHARO:
                    {
                    alt143=1;
                    }
                    break;
                case CHARI:
                    {
                    alt143=2;
                    }
                    break;
                case CHARE:
                    {
                    alt143=3;
                    }
                    break;
                case CHARP:
                    {
                    alt143=4;
                    }
                    break;
                case CHARM:
                    {
                    alt143=5;
                    }
                    break;
            }

            switch (alt143) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:4: final_OP
                    {
                    pushFollow(FOLLOW_final_OP_in_spec_const_8_253486);
                    final_OP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:15: final_IP
                    {
                    pushFollow(FOLLOW_final_IP_in_spec_const_8_253490);
                    final_IP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:26: final_ER
                    {
                    pushFollow(FOLLOW_final_ER_in_spec_const_8_253494);
                    final_ER();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:37: final_PA
                    {
                    pushFollow(FOLLOW_final_PA_in_spec_const_8_253498);
                    final_PA();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:48: final_MP
                    {
                    pushFollow(FOLLOW_final_MP_in_spec_const_8_253502);
                    final_MP();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_8_25"



    // $ANTLR start "spec_const_9_26"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:546:1: spec_const_9_26[String nameElement] : ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? ;
    public final void spec_const_9_26(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:22: ( ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            int alt144=10;
            switch ( input.LA(1) ) {
                case CHARF:
                    {
                    alt144=1;
                    }
                    break;
                case CHARP:
                    {
                    alt144=2;
                    }
                    break;
                case CHARM:
                    {
                    alt144=3;
                    }
                    break;
                case CHARI:
                    {
                    alt144=4;
                    }
                    break;
                case CHARR:
                    {
                    alt144=5;
                    }
                    break;
                case CHARC:
                    {
                    alt144=6;
                    }
                    break;
                case CHARO:
                    {
                    alt144=7;
                    }
                    break;
                case CHARD:
                    {
                    alt144=8;
                    }
                    break;
                case CHARX:
                    {
                    alt144=9;
                    }
                    break;
            }

            switch (alt144) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:4: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_9_263523);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_9_263527);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:32: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_9_263531);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:46: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_9_263535);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:60: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_9_263539);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:74: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_9_263543);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:88: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_const_9_263547);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:550:3: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_9_263553);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:550:17: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_9_263557);
                    final_charX();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_9_26"


    public static class spec_const_10_3_nm_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_const_10_3_nm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:552:1: spec_const_10_3_nm[String nameElement] : CHARN CHARM ;
    public final HPRIMSParser.spec_const_10_3_nm_return spec_const_10_3_nm(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_nm_return retval = new HPRIMSParser.spec_const_10_3_nm_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:554:22: ( CHARN CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:555:3: CHARN CHARM
            {
            match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_nm3578); 

            match(input,CHARM,FOLLOW_CHARM_in_spec_const_10_3_nm3580); 

            content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_const_10_3_nm"


    public static class spec_const_10_3_ce_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_const_10_3_ce"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:1: spec_const_10_3_ce[String nameElement] : CHARC CHARE ;
    public final HPRIMSParser.spec_const_10_3_ce_return spec_const_10_3_ce(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_ce_return retval = new HPRIMSParser.spec_const_10_3_ce_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:22: ( CHARC CHARE )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:3: CHARC CHARE
            {
            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_ce3601); 

            match(input,CHARE,FOLLOW_CHARE_in_spec_const_10_3_ce3603); 

            content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_const_10_3_ce"


    public static class spec_const_10_3_st_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_const_10_3_st"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:1: spec_const_10_3_st[String nameElement] : CHARS CHART ;
    public final HPRIMSParser.spec_const_10_3_st_return spec_const_10_3_st(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_st_return retval = new HPRIMSParser.spec_const_10_3_st_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:22: ( CHARS CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:565:3: CHARS CHART
            {
            match(input,CHARS,FOLLOW_CHARS_in_spec_const_10_3_st3624); 

            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_st3626); 

            content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_const_10_3_st"


    public static class spec_const_10_3_gc_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_const_10_3_gc"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:1: spec_const_10_3_gc[String nameElement] : CHARG CHARC ;
    public final HPRIMSParser.spec_const_10_3_gc_return spec_const_10_3_gc(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_gc_return retval = new HPRIMSParser.spec_const_10_3_gc_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:22: ( CHARG CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:570:3: CHARG CHARC
            {
            match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_gc3647); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_gc3649); 

            content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_const_10_3_gc"


    public static class spec_const_10_3_tx_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_const_10_3_tx"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:572:1: spec_const_10_3_tx[String nameElement] : CHART CHARX ;
    public final HPRIMSParser.spec_const_10_3_tx_return spec_const_10_3_tx(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_tx_return retval = new HPRIMSParser.spec_const_10_3_tx_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:574:22: ( CHART CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:575:3: CHART CHARX
            {
            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_tx3671); 

            match(input,CHARX,FOLLOW_CHARX_in_spec_const_10_3_tx3673); 

            content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_const_10_3_tx"


    public static class spec_const_10_3_fic_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_const_10_3_fic"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:577:1: spec_const_10_3_fic[String nameElement] : ( CHARF CHARI CHARC ) ;
    public final HPRIMSParser.spec_const_10_3_fic_return spec_const_10_3_fic(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_fic_return retval = new HPRIMSParser.spec_const_10_3_fic_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:579:22: ( ( CHARF CHARI CHARC ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:3: ( CHARF CHARI CHARC )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:3: ( CHARF CHARI CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:4: CHARF CHARI CHARC
            {
            match(input,CHARF,FOLLOW_CHARF_in_spec_const_10_3_fic3694); 

            match(input,CHARI,FOLLOW_CHARI_in_spec_const_10_3_fic3696); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_fic3698); 

            }


            content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_const_10_3_fic"


    public static class spec_const_10_3_std_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_const_10_3_std"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:582:1: spec_const_10_3_std[String nameElement] : ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) );
    public final HPRIMSParser.spec_const_10_3_std_return spec_const_10_3_std(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_std_return retval = new HPRIMSParser.spec_const_10_3_std_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:22: ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) )
            int alt145=8;
            switch ( input.LA(1) ) {
            case CHARA:
                {
                alt145=1;
                }
                break;
            case CHARC:
                {
                int LA145_2 = input.LA(2);

                if ( (LA145_2==CHARK) ) {
                    alt145=2;
                }
                else if ( (LA145_2==CHARN) ) {
                    alt145=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARD:
                {
                alt145=4;
                }
                break;
            case CHARP:
                {
                alt145=5;
                }
                break;
            case CHART:
                {
                alt145=6;
                }
                break;
            case CHARG:
                {
                int LA145_6 = input.LA(2);

                if ( (LA145_6==CHARB) ) {
                    alt145=7;
                }
                else if ( (LA145_6==CHARN) ) {
                    alt145=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;

            }

            switch (alt145) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:3: ( CHARA CHARD )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:3: ( CHARA CHARD )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:4: CHARA CHARD
                    {
                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3720); 

                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3722); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:19: ( CHARC CHARK )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:19: ( CHARC CHARK )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:20: CHARC CHARK
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3728); 

                    match(input,CHARK,FOLLOW_CHARK_in_spec_const_10_3_std3730); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:35: ( CHARC CHARN CHARA )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:35: ( CHARC CHARN CHARA )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:36: CHARC CHARN CHARA
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3736); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3738); 

                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3740); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:57: ( CHARD CHART )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:57: ( CHARD CHART )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:58: CHARD CHART
                    {
                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3746); 

                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3748); 

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:3: ( CHARP CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:3: ( CHARP CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:4: CHARP CHARN
                    {
                    match(input,CHARP,FOLLOW_CHARP_in_spec_const_10_3_std3756); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3758); 

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:19: ( CHART CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:19: ( CHART CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:20: CHART CHARN
                    {
                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3764); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3766); 

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:3: ( CHARG CHARB )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:3: ( CHARG CHARB )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:4: CHARG CHARB
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3774); 

                    match(input,CHARB,FOLLOW_CHARB_in_spec_const_10_3_std3776); 

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:19: ( CHARG CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:19: ( CHARG CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:20: CHARG CHARN
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3782); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3784); 

                    }


                    content(input.toString(retval.start,input.LT(-1)));

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_const_10_3_std"


    public static class spec_sized_10_6_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_10_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:1: spec_sized_10_6[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? ;
    public final HPRIMSParser.spec_sized_10_6_return spec_sized_10_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_6_return retval = new HPRIMSParser.spec_sized_10_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:593:22: ( st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:594:3: st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63807);
            st_sized_optionnal(nameElement + ".1", 10);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==DELIMITER2) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63813); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63815);
                    st_sized_optionnal(nameElement + ".2", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:4: ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==DELIMITER2) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:5: DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63822); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63824);
                            st_sized_optionnal(nameElement + ".3", 10);

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_10_6"



    // $ANTLR start "spec_const_10_9"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:599:1: spec_const_10_9[String nameElement] : ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? ;
    public final void spec_const_10_9(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:601:22: ( ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            int alt148=20;
            switch ( input.LA(1) ) {
                case CHARL:
                    {
                    int LA148_1 = input.LA(2);

                    if ( (LA148_1==CHARL) ) {
                        alt148=3;
                    }
                    else if ( ((LA148_1 >= CR && LA148_1 <= DELIMITER1)||LA148_1==REPETITEUR) ) {
                        alt148=1;
                    }
                    }
                    break;
                case CHARH:
                    {
                    int LA148_2 = input.LA(2);

                    if ( (LA148_2==CHARH) ) {
                        alt148=4;
                    }
                    else if ( ((LA148_2 >= CR && LA148_2 <= DELIMITER1)||LA148_2==REPETITEUR) ) {
                        alt148=2;
                    }
                    }
                    break;
                case CHAR_SYMBOL_INF:
                    {
                    alt148=5;
                    }
                    break;
                case CHAR_SYMBOL_SUP:
                    {
                    alt148=6;
                    }
                    break;
                case CHARN:
                    {
                    int LA148_5 = input.LA(2);

                    if ( (LA148_5==CHARu) ) {
                        alt148=10;
                    }
                    else if ( ((LA148_5 >= CR && LA148_5 <= DELIMITER1)||LA148_5==REPETITEUR) ) {
                        alt148=7;
                    }
                    }
                    break;
                case CHARA:
                    {
                    int LA148_6 = input.LA(2);

                    if ( (LA148_6==CHARA) ) {
                        alt148=9;
                    }
                    else if ( ((LA148_6 >= CR && LA148_6 <= DELIMITER1)||LA148_6==REPETITEUR) ) {
                        alt148=8;
                    }
                    }
                    break;
                case CHARU:
                    {
                    alt148=11;
                    }
                    break;
                case CHARD:
                    {
                    alt148=12;
                    }
                    break;
                case CHARB:
                    {
                    alt148=13;
                    }
                    break;
                case CHARW:
                    {
                    alt148=14;
                    }
                    break;
                case CHARR:
                    {
                    alt148=15;
                    }
                    break;
                case CHARI:
                    {
                    alt148=16;
                    }
                    break;
                case CHARS:
                    {
                    alt148=17;
                    }
                    break;
                case CHARM:
                    {
                    alt148=18;
                    }
                    break;
                case CHARV:
                    {
                    alt148=19;
                    }
                    break;
            }

            switch (alt148) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:4: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_10_93852);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:18: final_charH
                    {
                    pushFollow(FOLLOW_final_charH_in_spec_const_10_93856);
                    final_charH();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:32: final_LL
                    {
                    pushFollow(FOLLOW_final_LL_in_spec_const_10_93860);
                    final_LL();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:43: final_HH
                    {
                    pushFollow(FOLLOW_final_HH_in_spec_const_10_93864);
                    final_HH();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:54: final_symbol_inf
                    {
                    pushFollow(FOLLOW_final_symbol_inf_in_spec_const_10_93868);
                    final_symbol_inf();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:73: final_symbol_sup
                    {
                    pushFollow(FOLLOW_final_symbol_sup_in_spec_const_10_93872);
                    final_symbol_sup();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:3: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_93878);
                    final_charN();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:17: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_93882);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:31: final_AA
                    {
                    pushFollow(FOLLOW_final_AA_in_spec_const_10_93886);
                    final_AA();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:42: final_Null
                    {
                    pushFollow(FOLLOW_final_Null_in_spec_const_10_93890);
                    final_Null();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:55: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_93894);
                    final_charU();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:69: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_93898);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:83: final_charB
                    {
                    pushFollow(FOLLOW_final_charB_in_spec_const_10_93902);
                    final_charB();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:3: final_charW
                    {
                    pushFollow(FOLLOW_final_charW_in_spec_const_10_93908);
                    final_charW();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:17: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_93912);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:31: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_93916);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:45: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_93920);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:59: final_MS
                    {
                    pushFollow(FOLLOW_final_MS_in_spec_const_10_93924);
                    final_MS();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:70: final_VS
                    {
                    pushFollow(FOLLOW_final_VS_in_spec_const_10_93928);
                    final_VS();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_10_9"



    // $ANTLR start "spec_const_10_11"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:606:1: spec_const_10_11[String nameElement] : ( final_charA | final_charS | final_charR | final_charN )? ;
    public final void spec_const_10_11(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:608:22: ( ( final_charA | final_charS | final_charR | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:3: ( final_charA | final_charS | final_charR | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:3: ( final_charA | final_charS | final_charR | final_charN )?
            int alt149=5;
            switch ( input.LA(1) ) {
                case CHARA:
                    {
                    alt149=1;
                    }
                    break;
                case CHARS:
                    {
                    alt149=2;
                    }
                    break;
                case CHARR:
                    {
                    alt149=3;
                    }
                    break;
                case CHARN:
                    {
                    alt149=4;
                    }
                    break;
            }

            switch (alt149) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:4: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_113949);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:18: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_113953);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:32: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_113957);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:46: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_113961);
                    final_charN();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_10_11"



    // $ANTLR start "spec_const_10_12"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:611:1: spec_const_10_12[String nameElement] : ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? ;
    public final void spec_const_10_12(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:613:22: ( ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            int alt150=9;
            switch ( input.LA(1) ) {
                case CHARR:
                    {
                    alt150=1;
                    }
                    break;
                case CHARP:
                    {
                    alt150=2;
                    }
                    break;
                case CHARF:
                    {
                    alt150=3;
                    }
                    break;
                case CHARC:
                    {
                    alt150=4;
                    }
                    break;
                case CHARI:
                    {
                    alt150=5;
                    }
                    break;
                case CHARD:
                    {
                    alt150=6;
                    }
                    break;
                case CHARX:
                    {
                    alt150=7;
                    }
                    break;
                case CHARU:
                    {
                    alt150=8;
                    }
                    break;
            }

            switch (alt150) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:4: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_123982);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_10_123986);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:32: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_10_123990);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:46: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_10_123994);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:60: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_123998);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:74: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_124002);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:4: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_10_124009);
                    final_charX();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:18: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_124013);
                    final_charU();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_10_12"



    // $ANTLR start "spec_const_12_3"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:617:1: spec_const_12_3[String nameElement] : ( final_charP | final_charL )? ;
    public final void spec_const_12_3(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:619:22: ( ( final_charP | final_charL )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:3: ( final_charP | final_charL )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:3: ( final_charP | final_charL )?
            int alt151=3;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==CHARP) ) {
                alt151=1;
            }
            else if ( (LA151_0==CHARL) ) {
                alt151=2;
            }
            switch (alt151) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_12_34034);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:18: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_12_34038);
                    final_charL();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_const_12_3"


    public static class spec_sized_mult_lvl1_st_mandatory_2_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_st_mandatory_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:622:1: spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return spec_sized_mult_lvl1_st_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:624:22: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24058);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_24064); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24066);
            st_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl1_st_mandatory_2"


    public static class spec_sized_mult_lvl1_st_optionnal_2_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_st_optionnal_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:629:1: spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return spec_sized_mult_lvl1_st_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:632:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24089);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==DELIMITER2) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_24095); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24097);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl1_st_optionnal_2"


    public static class spec_sized_mult_lvl1_st_optionnal_4_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_st_optionnal_4"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:1: spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return spec_sized_mult_lvl1_st_optionnal_4(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:639:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:640:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44122);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==DELIMITER2) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44128); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44130);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==DELIMITER2) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44137); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44139);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            int alt153=2;
                            int LA153_0 = input.LA(1);

                            if ( (LA153_0==DELIMITER2) ) {
                                alt153=1;
                            }
                            switch (alt153) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44147); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44149);
                                    st_non_sized_optionnal(nameElement + ".2");

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl1_st_optionnal_4"


    public static class spec_sized_mult_lvl1_st_optionnal_6_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_st_optionnal_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:1: spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return spec_sized_mult_lvl1_st_optionnal_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:650:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64178);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==DELIMITER2) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64185); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64187);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt159=2;
                    int LA159_0 = input.LA(1);

                    if ( (LA159_0==DELIMITER2) ) {
                        alt159=1;
                    }
                    switch (alt159) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64195); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64197);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:653:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt158=2;
                            int LA158_0 = input.LA(1);

                            if ( (LA158_0==DELIMITER2) ) {
                                alt158=1;
                            }
                            switch (alt158) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:653:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64206); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64208);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt157=2;
                                    int LA157_0 = input.LA(1);

                                    if ( (LA157_0==DELIMITER2) ) {
                                        alt157=1;
                                    }
                                    switch (alt157) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64218); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64220);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:655:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt156=2;
                                            int LA156_0 = input.LA(1);

                                            if ( (LA156_0==DELIMITER2) ) {
                                                alt156=1;
                                            }
                                            switch (alt156) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:655:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64231); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64233);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl1_st_optionnal_6"


    public static class spec_sized_mult_lvl1_st_optionnal_8_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_st_optionnal_8"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:1: spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return spec_sized_mult_lvl1_st_optionnal_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:661:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:662:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84266);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:663:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==DELIMITER2) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:663:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84272); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84274);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==DELIMITER2) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84281); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84283);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:665:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            int alt165=2;
                            int LA165_0 = input.LA(1);

                            if ( (LA165_0==DELIMITER2) ) {
                                alt165=1;
                            }
                            switch (alt165) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:665:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84291); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84293);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    int alt164=2;
                                    int LA164_0 = input.LA(1);

                                    if ( (LA164_0==DELIMITER2) ) {
                                        alt164=1;
                                    }
                                    switch (alt164) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84302); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84304);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            int alt163=2;
                                            int LA163_0 = input.LA(1);

                                            if ( (LA163_0==DELIMITER2) ) {
                                                alt163=1;
                                            }
                                            switch (alt163) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84314); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84316);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    int alt162=2;
                                                    int LA162_0 = input.LA(1);

                                                    if ( (LA162_0==DELIMITER2) ) {
                                                        alt162=1;
                                                    }
                                                    switch (alt162) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            {
                                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84327); 

                                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84329);
                                                            st_non_sized_optionnal(nameElement + ".7");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:9: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            int alt161=2;
                                                            int LA161_0 = input.LA(1);

                                                            if ( (LA161_0==DELIMITER2) ) {
                                                                alt161=1;
                                                            }
                                                            switch (alt161) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:10: DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"]
                                                                    {
                                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84341); 

                                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84343);
                                                                    st_non_sized_optionnal(nameElement + ".8");

                                                                    state._fsp--;


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl1_st_optionnal_8"



    // $ANTLR start "spec_sized_mult_lvl2_st_optionnal_3"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:673:1: spec_sized_mult_lvl2_st_optionnal_3[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_3(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:675:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:676:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34380);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==DELIMITER3) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34386); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34388);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==DELIMITER3) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34395); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34397);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl2_st_optionnal_3"



    // $ANTLR start "spec_sized_mult_lvl2_st_optionnal_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:680:1: spec_sized_mult_lvl2_st_optionnal_6[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_6(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:682:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64420);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:684:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==DELIMITER3) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:684:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64426); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64428);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==DELIMITER3) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64435); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64437);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:686:5: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt172=2;
                            int LA172_0 = input.LA(1);

                            if ( (LA172_0==DELIMITER3) ) {
                                alt172=1;
                            }
                            switch (alt172) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:686:6: DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64445); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64447);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:6: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt171=2;
                                    int LA171_0 = input.LA(1);

                                    if ( (LA171_0==DELIMITER3) ) {
                                        alt171=1;
                                    }
                                    switch (alt171) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:7: DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64456); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64458);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:7: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt170=2;
                                            int LA170_0 = input.LA(1);

                                            if ( (LA170_0==DELIMITER3) ) {
                                                alt170=1;
                                            }
                                            switch (alt170) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:8: DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64468); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64470);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl2_st_optionnal_6"


    public static class spec_sized_mult_lvl1_nm_optionnal_2_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_nm_optionnal_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:1: spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize] : nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return spec_sized_mult_lvl1_nm_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:692:22: ( nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:693:3: nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24499);
            nm_nonsized_optionnal(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24504); 

            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24506);
            nm_nonsized_optionnal(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl1_nm_optionnal_2"


    public static class spec_sized_mult_lvl1_nm_mandatory_2_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_nm_mandatory_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:697:1: spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return spec_sized_mult_lvl1_nm_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:699:22: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:700:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24531);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24536); 

            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24538);
            nm_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_mult_lvl1_nm_mandatory_2"


    public static class spec_sized_cna_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_cna"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:1: spec_sized_cna[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_cna_return spec_sized_cna(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_cna_return retval = new HPRIMSParser.spec_sized_cna_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:707:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4561);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:4: ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==DELIMITER2) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:5: DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4568); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4570);
                    spec_sized_mult_lvl2_st_optionnal_6(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:709:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==DELIMITER2) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:709:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4578); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4580);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_cna"


    public static class spec_sized_8_3_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_8_3"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:717:1: spec_sized_8_3[String nameElement, int maxSize] : ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_8_3_return spec_sized_8_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_8_3_return retval = new HPRIMSParser.spec_sized_8_3_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:719:22: ( ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:720:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:720:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( ((LA178_0 >= CHARA && LA178_0 <= CHIFFRE9)||(LA178_0 >= LETTRE && LA178_0 <= POINT)) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:720:4: st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    pushFollow(FOLLOW_st_sized_mandatory_in_spec_sized_8_34612);
                    st_sized_mandatory(nameElement + ".1", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:721:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==DELIMITER2) ) {
                        alt177=1;
                    }
                    switch (alt177) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:721:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34619); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34621);
                            st_non_sized_optionnal(nameElement + ".2");

                            state._fsp--;


                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34629); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34631);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_8_3"


    public static class spec_sized_9_3_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_9_3"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:733:1: spec_sized_9_3[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? ;
    public final HPRIMSParser.spec_sized_9_3_return spec_sized_9_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_3_return retval = new HPRIMSParser.spec_sized_9_3_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:735:22: ( st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:737:3: st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34671);
            st_sized_optionnal(nameElement + ".1", 12);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:738:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==DELIMITER2) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:738:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_34677); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34679);
                    st_sized_optionnal(nameElement + ".2", 10);

                    state._fsp--;


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_9_3"



    // $ANTLR start "spec_non_sized_9_8"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:741:1: spec_non_sized_9_8[String nameElement] : ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? ;
    public final void spec_non_sized_9_8(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:743:22: ( ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:744:3: ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            {
            pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84704);
            ts_sized_optionnal(nameElement + ".1", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:4: ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==REPETITEUR) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:5: REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_non_sized_9_84711); 

                    pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84713);
                    ts_sized_optionnal(nameElement + ".2", 26);

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "spec_non_sized_9_8"


    public static class spec_sized_9_16_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_9_16"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:747:1: spec_sized_9_16[String nameElement, int maxSize] : spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_9_16_return spec_sized_9_16(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_16_return retval = new HPRIMSParser.spec_sized_9_16_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:749:22: ( spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:3: spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164734);
            spec_sized_mult_lvl2_st_optionnal_3(nameElement + ".2");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:751:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==DELIMITER2) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:751:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164740); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164742);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==DELIMITER2) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164749); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164751);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_9_16"


    public static class spec_sized_10_4_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_10_4"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:755:1: spec_sized_10_4[String nameElement, int maxsize] : st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_10_4_return spec_sized_10_4(String nameElement, int maxsize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_4_return retval = new HPRIMSParser.spec_sized_10_4_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:757:22: ( st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:3: st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44778);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:759:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==DELIMITER2) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:759:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44784); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44786);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:760:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt186=2;
                    int LA186_0 = input.LA(1);

                    if ( (LA186_0==DELIMITER2) ) {
                        alt186=1;
                    }
                    switch (alt186) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:760:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44793); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44795);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:761:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt185=2;
                            int LA185_0 = input.LA(1);

                            if ( (LA185_0==DELIMITER2) ) {
                                alt185=1;
                            }
                            switch (alt185) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:761:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44803); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44805);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt184=2;
                                    int LA184_0 = input.LA(1);

                                    if ( (LA184_0==DELIMITER2) ) {
                                        alt184=1;
                                    }
                                    switch (alt184) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44814); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44816);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:763:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt183=2;
                                            int LA183_0 = input.LA(1);

                                            if ( (LA183_0==DELIMITER2) ) {
                                                alt183=1;
                                            }
                                            switch (alt183) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:763:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44826); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44828);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxsize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_10_4"



    // $ANTLR start "spec_sized_10_6_tx"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:766:1: spec_sized_10_6_tx[String nameElement, int maxSize] : (g= final_spec_10_6_tx )? ;
    public final void spec_sized_10_6_tx(String nameElement, int maxSize) throws RecognitionException {
        String g =null;



          ParserRuleReturnScope retval = new ParserRuleReturnScope();
          retval.start = input.LT(1);
          startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:22: ( (g= final_spec_10_6_tx )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:3: (g= final_spec_10_6_tx )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:4: (g= final_spec_10_6_tx )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( ((LA188_0 >= CHARA && LA188_0 <= CHIFFRE9)||LA188_0==DELIMITER2||(LA188_0 >= LETTRE && LA188_0 <= POINT)) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:4: g= final_spec_10_6_tx
                    {
                    pushFollow(FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4863);
                    g=final_spec_10_6_tx();

                    state._fsp--;


                    }
                    break;

            }


            if (g != null)
                matchRegex(g, "^.{0," + maxSize + "}$", retval.start);

            }

            endElement();
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
    // $ANTLR end "spec_sized_10_6_tx"


    public static class spec_sized_tn_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_tn"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:776:1: spec_sized_tn[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_tn_return spec_sized_tn(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_tn_return retval = new HPRIMSParser.spec_sized_tn_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:778:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:2: st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4885);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:3: ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==REPETITEUR) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:4: REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_sized_tn4891); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4893);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "spec_sized_tn"


    public static class st_sized_optionnal_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "st_sized_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:1: st_sized_optionnal[String nameElement, int maxSize] : ( final_st )? ;
    public final HPRIMSParser.st_sized_optionnal_return st_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_optionnal_return retval = new HPRIMSParser.st_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:788:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:3: ( final_st )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( ((LA190_0 >= CHARA && LA190_0 <= CHIFFRE9)||(LA190_0 >= LETTRE && LA190_0 <= POINT)) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_sized_optionnal4921);
                    final_st();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "st_sized_optionnal"


    public static class st_sized_mandatory_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "st_sized_mandatory"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:1: st_sized_mandatory[String nameElement, int maxSize] : final_st ;
    public final HPRIMSParser.st_sized_mandatory_return st_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_mandatory_return retval = new HPRIMSParser.st_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_sized_mandatory4944);
            final_st();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "st_sized_mandatory"



    // $ANTLR start "st_non_sized_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:799:1: st_non_sized_optionnal[String nameElement] : ( final_st )? ;
    public final void st_non_sized_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:3: ( final_st )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( ((LA191_0 >= CHARA && LA191_0 <= CHIFFRE9)||(LA191_0 >= LETTRE && LA191_0 <= POINT)) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_non_sized_optionnal4966);
                    final_st();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "st_non_sized_optionnal"



    // $ANTLR start "st_nonsized_mandatory"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:1: st_nonsized_mandatory[String nameElement] : final_st ;
    public final void st_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_nonsized_mandatory4985);
            final_st();

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "st_nonsized_mandatory"


    public static class nm_sized_optionnal_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nm_sized_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:1: nm_sized_optionnal[String nameElement, int maxSize] : ( final_nm )? ;
    public final HPRIMSParser.nm_sized_optionnal_return nm_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_sized_optionnal_return retval = new HPRIMSParser.nm_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:3: ( final_nm )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( ((LA192_0 >= CHIFFRE0 && LA192_0 <= CHIFFRE9)||(LA192_0 >= MOINS && LA192_0 <= POINT)) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_sized_optionnal5003);
                    final_nm();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "nm_sized_optionnal"


    public static class nm_integer_sized_optionnal_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nm_integer_sized_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:1: nm_integer_sized_optionnal[String nameElement, int maxSize] : ( final_nm_integer )? ;
    public final HPRIMSParser.nm_integer_sized_optionnal_return nm_integer_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_optionnal_return retval = new HPRIMSParser.nm_integer_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:818:22: ( ( final_nm_integer )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:819:3: ( final_nm_integer )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:819:3: ( final_nm_integer )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( ((LA193_0 >= CHIFFRE0 && LA193_0 <= CHIFFRE9)) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:819:3: final_nm_integer
                    {
                    pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal5026);
                    final_nm_integer();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "nm_integer_sized_optionnal"


    public static class nm_integer_sized_mandatory_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nm_integer_sized_mandatory"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:1: nm_integer_sized_mandatory[String nameElement, int maxSize] : final_nm_integer ;
    public final HPRIMSParser.nm_integer_sized_mandatory_return nm_integer_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_mandatory_return retval = new HPRIMSParser.nm_integer_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:22: ( final_nm_integer )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:826:3: final_nm_integer
            {
            pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory5054);
            final_nm_integer();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "nm_integer_sized_mandatory"


    public static class ts_sized_optionnal_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "ts_sized_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:1: ts_sized_optionnal[String nameElement, int maxSize] : ( final_ts )? ;
    public final HPRIMSParser.ts_sized_optionnal_return ts_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_optionnal_return retval = new HPRIMSParser.ts_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:22: ( ( final_ts )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:3: ( final_ts )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:3: ( final_ts )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( ((LA194_0 >= CHIFFRE0 && LA194_0 <= CHIFFRE9)) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:3: final_ts
                    {
                    pushFollow(FOLLOW_final_ts_in_ts_sized_optionnal5077);
                    final_ts();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "ts_sized_optionnal"


    public static class ts_sized_mandatory_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "ts_sized_mandatory"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:837:1: ts_sized_mandatory[String nameElement, int maxSize] : final_ts ;
    public final HPRIMSParser.ts_sized_mandatory_return ts_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_mandatory_return retval = new HPRIMSParser.ts_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:839:22: ( final_ts )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:840:3: final_ts
            {
            pushFollow(FOLLOW_final_ts_in_ts_sized_mandatory5100);
            final_ts();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            endElement();
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
    // $ANTLR end "ts_sized_mandatory"



    // $ANTLR start "nm_nonsized_mandatory"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:843:1: nm_nonsized_mandatory[String nameElement] : final_nm ;
    public final void nm_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:845:22: ( final_nm )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:3: final_nm
            {
            pushFollow(FOLLOW_final_nm_in_nm_nonsized_mandatory5122);
            final_nm();

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "nm_nonsized_mandatory"



    // $ANTLR start "nm_nonsized_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:1: nm_nonsized_optionnal[String nameElement] : ( final_nm )? ;
    public final void nm_nonsized_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:3: ( final_nm )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( ((LA195_0 >= CHIFFRE0 && LA195_0 <= CHIFFRE9)||(LA195_0 >= MOINS && LA195_0 <= POINT)) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_nonsized_optionnal5140);
                    final_nm();

                    state._fsp--;


                    }
                    break;

            }


            }

            endElement();
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
    // $ANTLR end "nm_nonsized_optionnal"



    // $ANTLR start "spec_const_7_13_1_version_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:1: spec_const_7_13_1_version_2_0[String nameElement] : final_version_2_0 ;
    public final void spec_const_7_13_1_version_2_0(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:855:22: ( final_version_2_0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:856:3: final_version_2_0
            {
            pushFollow(FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05159);
            final_version_2_0();

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "spec_const_7_13_1_version_2_0"



    // $ANTLR start "spec_const_7_13_1_version_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:1: spec_const_7_13_1_version_2_1[String nameElement] : final_version_2_1 ;
    public final void spec_const_7_13_1_version_2_1(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:860:22: ( final_version_2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:3: final_version_2_1
            {
            pushFollow(FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15177);
            final_version_2_1();

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "spec_const_7_13_1_version_2_1"



    // $ANTLR start "spec_const_7_13_1_version_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:863:1: spec_const_7_13_1_version_2_2[String nameElement] : final_version_2_2 ;
    public final void spec_const_7_13_1_version_2_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:865:22: ( final_version_2_2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:866:3: final_version_2_2
            {
            pushFollow(FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25197);
            final_version_2_2();

            state._fsp--;


            }

            endElement();
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
    // $ANTLR end "spec_const_7_13_1_version_2_2"



    // $ANTLR start "final_spec_10_6_tx"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:1: final_spec_10_6_tx returns [String consoText] : g= content_spec_10_6 ;
    public final String final_spec_10_6_tx() throws RecognitionException {
        String consoText = null;


        String g =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:46: (g= content_spec_10_6 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:871:3: g= content_spec_10_6
            {
            pushFollow(FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5214);
            g=content_spec_10_6();

            state._fsp--;


            content(g);
               consoText = g;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return consoText;
    }
    // $ANTLR end "final_spec_10_6_tx"



    // $ANTLR start "content_spec_10_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:1: content_spec_10_6 returns [String consoText] : (r= character | DELIMITER2 ) (p= content_spec_10_6 )? ;
    public final String content_spec_10_6() throws RecognitionException {
        String consoText = null;


        HPRIMSParser.character_return r =null;

        String p =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:45: ( (r= character | DELIMITER2 ) (p= content_spec_10_6 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:3: (r= character | DELIMITER2 ) (p= content_spec_10_6 )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:3: (r= character | DELIMITER2 )
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( ((LA196_0 >= CHARA && LA196_0 <= CHIFFRE9)||(LA196_0 >= LETTRE && LA196_0 <= POINT)) ) {
                alt196=1;
            }
            else if ( (LA196_0==DELIMITER2) ) {
                alt196=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 196, 0, input);

                throw nvae;

            }
            switch (alt196) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:4: r= character
                    {
                    pushFollow(FOLLOW_character_in_content_spec_10_65236);
                    r=character();

                    state._fsp--;


                    consoText = (r!=null?input.toString(r.start,r.stop):null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:42: DELIMITER2
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_content_spec_10_65242); 

                    consoText = "\n";

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:877:6: (p= content_spec_10_6 )?
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( ((LA197_0 >= CHARA && LA197_0 <= CHIFFRE9)||LA197_0==DELIMITER2||(LA197_0 >= LETTRE && LA197_0 <= POINT)) ) {
                alt197=1;
            }
            switch (alt197) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:877:6: p= content_spec_10_6
                    {
                    pushFollow(FOLLOW_content_spec_10_6_in_content_spec_10_65253);
                    p=content_spec_10_6();

                    state._fsp--;


                    }
                    break;

            }


            if (p != null) { consoText += p; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return consoText;
    }
    // $ANTLR end "content_spec_10_6"


    public static class final_ts_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_ts"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:879:1: final_ts : chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? ;
    public final HPRIMSParser.final_ts_return final_ts() throws RecognitionException {
        HPRIMSParser.final_ts_return retval = new HPRIMSParser.final_ts_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:879:9: ( chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:3: chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            {
            pushFollow(FOLLOW_chiffre_in_final_ts5265);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5267);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5271);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5273);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5275);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5279);
            chiffre();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:882:11: ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( ((LA200_0 >= CHIFFRE0 && LA200_0 <= CHIFFRE9)) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:882:12: chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    {
                    pushFollow(FOLLOW_chiffre_in_final_ts5282);
                    chiffre();

                    state._fsp--;


                    pushFollow(FOLLOW_chiffre_in_final_ts5284);
                    chiffre();

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:3: ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( ((LA199_0 >= CHIFFRE0 && LA199_0 <= CHIFFRE9)) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:4: chiffre chiffre chiffre chiffre ( chiffre chiffre )?
                            {
                            pushFollow(FOLLOW_chiffre_in_final_ts5289);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5291);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5293);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5297);
                            chiffre();

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:884:11: ( chiffre chiffre )?
                            int alt198=2;
                            int LA198_0 = input.LA(1);

                            if ( ((LA198_0 >= CHIFFRE0 && LA198_0 <= CHIFFRE9)) ) {
                                alt198=1;
                            }
                            switch (alt198) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:884:12: chiffre chiffre
                                    {
                                    pushFollow(FOLLOW_chiffre_in_final_ts5300);
                                    chiffre();

                                    state._fsp--;


                                    pushFollow(FOLLOW_chiffre_in_final_ts5302);
                                    chiffre();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_ts"


    public static class final_st_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_st"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:887:1: final_st : ( character )+ ;
    public final HPRIMSParser.final_st_return final_st() throws RecognitionException {
        HPRIMSParser.final_st_return retval = new HPRIMSParser.final_st_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:887:9: ( ( character )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:888:3: ( character )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:888:3: ( character )+
            int cnt201=0;
            loop201:
            do {
                int alt201=2;
                int LA201_0 = input.LA(1);

                if ( ((LA201_0 >= CHARA && LA201_0 <= CHIFFRE9)||(LA201_0 >= LETTRE && LA201_0 <= POINT)) ) {
                    alt201=1;
                }


                switch (alt201) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:888:3: character
            	    {
            	    pushFollow(FOLLOW_character_in_final_st5321);
            	    character();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt201 >= 1 ) break loop201;
                        EarlyExitException eee =
                            new EarlyExitException(201, input);
                        throw eee;
                }
                cnt201++;
            } while (true);


            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_st"


    public static class final_nm_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_nm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:891:1: final_nm : ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) ;
    public final HPRIMSParser.final_nm_return final_nm() throws RecognitionException {
        HPRIMSParser.final_nm_return retval = new HPRIMSParser.final_nm_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:891:9: ( ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:4: ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:4: ( PLUS | MOINS )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( ((LA202_0 >= MOINS && LA202_0 <= PLUS)) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:
                    {
                    if ( (input.LA(1) >= MOINS && input.LA(1) <= PLUS) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:3: ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( ((LA207_0 >= CHIFFRE0 && LA207_0 <= CHIFFRE9)) ) {
                alt207=1;
            }
            else if ( (LA207_0==POINT) ) {
                alt207=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 207, 0, input);

                throw nvae;

            }
            switch (alt207) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:5: ( chiffre )+ ( POINT ( chiffre )* )?
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:5: ( chiffre )+
                    int cnt203=0;
                    loop203:
                    do {
                        int alt203=2;
                        int LA203_0 = input.LA(1);

                        if ( ((LA203_0 >= CHIFFRE0 && LA203_0 <= CHIFFRE9)) ) {
                            alt203=1;
                        }


                        switch (alt203) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:5: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5350);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt203 >= 1 ) break loop203;
                                EarlyExitException eee =
                                    new EarlyExitException(203, input);
                                throw eee;
                        }
                        cnt203++;
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:14: ( POINT ( chiffre )* )?
                    int alt205=2;
                    int LA205_0 = input.LA(1);

                    if ( (LA205_0==POINT) ) {
                        alt205=1;
                    }
                    switch (alt205) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:15: POINT ( chiffre )*
                            {
                            match(input,POINT,FOLLOW_POINT_in_final_nm5354); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:21: ( chiffre )*
                            loop204:
                            do {
                                int alt204=2;
                                int LA204_0 = input.LA(1);

                                if ( ((LA204_0 >= CHIFFRE0 && LA204_0 <= CHIFFRE9)) ) {
                                    alt204=1;
                                }


                                switch (alt204) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:21: chiffre
                            	    {
                            	    pushFollow(FOLLOW_chiffre_in_final_nm5356);
                            	    chiffre();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop204;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:4: ( POINT ( chiffre )+ )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:4: ( POINT ( chiffre )+ )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:5: POINT ( chiffre )+
                    {
                    match(input,POINT,FOLLOW_POINT_in_final_nm5366); 

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:11: ( chiffre )+
                    int cnt206=0;
                    loop206:
                    do {
                        int alt206=2;
                        int LA206_0 = input.LA(1);

                        if ( ((LA206_0 >= CHIFFRE0 && LA206_0 <= CHIFFRE9)) ) {
                            alt206=1;
                        }


                        switch (alt206) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:11: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5368);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt206 >= 1 ) break loop206;
                                EarlyExitException eee =
                                    new EarlyExitException(206, input);
                                throw eee;
                        }
                        cnt206++;
                    } while (true);


                    }


                    }
                    break;

            }


            }


            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_nm"


    public static class final_nm_integer_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_nm_integer"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:897:1: final_nm_integer : ( chiffre )+ ;
    public final HPRIMSParser.final_nm_integer_return final_nm_integer() throws RecognitionException {
        HPRIMSParser.final_nm_integer_return retval = new HPRIMSParser.final_nm_integer_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:897:17: ( ( chiffre )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:898:3: ( chiffre )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:898:3: ( chiffre )+
            int cnt208=0;
            loop208:
            do {
                int alt208=2;
                int LA208_0 = input.LA(1);

                if ( ((LA208_0 >= CHIFFRE0 && LA208_0 <= CHIFFRE9)) ) {
                    alt208=1;
                }


                switch (alt208) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:898:3: chiffre
            	    {
            	    pushFollow(FOLLOW_chiffre_in_final_nm_integer5385);
            	    chiffre();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt208 >= 1 ) break loop208;
                        EarlyExitException eee =
                            new EarlyExitException(208, input);
                        throw eee;
                }
                cnt208++;
            } while (true);


            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_nm_integer"


    public static class final_ORU_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_ORU"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:901:1: final_ORU : CHARO CHARR CHARU ;
    public final HPRIMSParser.final_ORU_return final_ORU() throws RecognitionException {
        HPRIMSParser.final_ORU_return retval = new HPRIMSParser.final_ORU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:901:10: ( CHARO CHARR CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:901:12: CHARO CHARR CHARU
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORU5397); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORU5399); 

            match(input,CHARU,FOLLOW_CHARU_in_final_ORU5401); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_ORU"


    public static class final_CART_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_CART"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:903:1: final_CART : CHARC CHARA CHARR CHART ;
    public final HPRIMSParser.final_CART_return final_CART() throws RecognitionException {
        HPRIMSParser.final_CART_return retval = new HPRIMSParser.final_CART_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:903:11: ( CHARC CHARA CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:903:13: CHARC CHARA CHARR CHART
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_CART5410); 

            match(input,CHARA,FOLLOW_CHARA_in_final_CART5412); 

            match(input,CHARR,FOLLOW_CHARR_in_final_CART5414); 

            match(input,CHART,FOLLOW_CHART_in_final_CART5416); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_CART"


    public static class final_PORT_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_PORT"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:904:1: final_PORT : CHARP CHARO CHARR CHART ;
    public final HPRIMSParser.final_PORT_return final_PORT() throws RecognitionException {
        HPRIMSParser.final_PORT_return retval = new HPRIMSParser.final_PORT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:904:11: ( CHARP CHARO CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:904:13: CHARP CHARO CHARR CHART
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PORT5424); 

            match(input,CHARO,FOLLOW_CHARO_in_final_PORT5426); 

            match(input,CHARR,FOLLOW_CHARR_in_final_PORT5428); 

            match(input,CHART,FOLLOW_CHART_in_final_PORT5430); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_PORT"


    public static class final_WHLC_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_WHLC"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:1: final_WHLC : CHARW CHARH CHARL CHARC ;
    public final HPRIMSParser.final_WHLC_return final_WHLC() throws RecognitionException {
        HPRIMSParser.final_WHLC_return retval = new HPRIMSParser.final_WHLC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:11: ( CHARW CHARH CHARL CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:13: CHARW CHARH CHARL CHARC
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WHLC5438); 

            match(input,CHARH,FOLLOW_CHARH_in_final_WHLC5440); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WHLC5442); 

            match(input,CHARC,FOLLOW_CHARC_in_final_WHLC5444); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_WHLC"


    public static class final_WALK_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_WALK"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:906:1: final_WALK : CHARW CHARA CHARL CHARK ;
    public final HPRIMSParser.final_WALK_return final_WALK() throws RecognitionException {
        HPRIMSParser.final_WALK_return retval = new HPRIMSParser.final_WALK_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:906:11: ( CHARW CHARA CHARL CHARK )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:906:13: CHARW CHARA CHARL CHARK
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WALK5452); 

            match(input,CHARA,FOLLOW_CHARA_in_final_WALK5454); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WALK5456); 

            match(input,CHARK,FOLLOW_CHARK_in_final_WALK5458); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_WALK"


    public static class final_LL_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_LL"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:908:1: final_LL : CHARL CHARL ;
    public final HPRIMSParser.final_LL_return final_LL() throws RecognitionException {
        HPRIMSParser.final_LL_return retval = new HPRIMSParser.final_LL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:908:9: ( CHARL CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:908:11: CHARL CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_LL5467); 

            match(input,CHARL,FOLLOW_CHARL_in_final_LL5469); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_LL"


    public static class final_AA_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_AA"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:1: final_AA : CHARA CHARA ;
    public final HPRIMSParser.final_AA_return final_AA() throws RecognitionException {
        HPRIMSParser.final_AA_return retval = new HPRIMSParser.final_AA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:9: ( CHARA CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:11: CHARA CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_AA5477); 

            match(input,CHARA,FOLLOW_CHARA_in_final_AA5479); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_AA"


    public static class final_HH_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_HH"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:910:1: final_HH : CHARH CHARH ;
    public final HPRIMSParser.final_HH_return final_HH() throws RecognitionException {
        HPRIMSParser.final_HH_return retval = new HPRIMSParser.final_HH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:910:9: ( CHARH CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:910:11: CHARH CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_HH5487); 

            match(input,CHARH,FOLLOW_CHARH_in_final_HH5489); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_HH"


    public static class final_MS_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_MS"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:911:1: final_MS : CHARM CHARS ;
    public final HPRIMSParser.final_MS_return final_MS() throws RecognitionException {
        HPRIMSParser.final_MS_return retval = new HPRIMSParser.final_MS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:911:9: ( CHARM CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:911:11: CHARM CHARS
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MS5497); 

            match(input,CHARS,FOLLOW_CHARS_in_final_MS5499); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_MS"


    public static class final_VS_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_VS"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:912:1: final_VS : CHARV CHARS ;
    public final HPRIMSParser.final_VS_return final_VS() throws RecognitionException {
        HPRIMSParser.final_VS_return retval = new HPRIMSParser.final_VS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:912:9: ( CHARV CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:912:11: CHARV CHARS
            {
            match(input,CHARV,FOLLOW_CHARV_in_final_VS5507); 

            match(input,CHARS,FOLLOW_CHARS_in_final_VS5509); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_VS"


    public static class final_Null_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_Null"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:913:1: final_Null : CHARN CHARu CHARl CHARl ;
    public final HPRIMSParser.final_Null_return final_Null() throws RecognitionException {
        HPRIMSParser.final_Null_return retval = new HPRIMSParser.final_Null_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:913:11: ( CHARN CHARu CHARl CHARl )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:913:13: CHARN CHARu CHARl CHARl
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_Null5517); 

            match(input,CHARu,FOLLOW_CHARu_in_final_Null5519); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5521); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5523); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_Null"


    public static class final_symbol_inf_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_symbol_inf"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:914:1: final_symbol_inf : CHAR_SYMBOL_INF ;
    public final HPRIMSParser.final_symbol_inf_return final_symbol_inf() throws RecognitionException {
        HPRIMSParser.final_symbol_inf_return retval = new HPRIMSParser.final_symbol_inf_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:914:17: ( CHAR_SYMBOL_INF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:914:19: CHAR_SYMBOL_INF
            {
            match(input,CHAR_SYMBOL_INF,FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5531); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_symbol_inf"


    public static class final_symbol_sup_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_symbol_sup"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:1: final_symbol_sup : CHAR_SYMBOL_SUP ;
    public final HPRIMSParser.final_symbol_sup_return final_symbol_sup() throws RecognitionException {
        HPRIMSParser.final_symbol_sup_return retval = new HPRIMSParser.final_symbol_sup_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:17: ( CHAR_SYMBOL_SUP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:19: CHAR_SYMBOL_SUP
            {
            match(input,CHAR_SYMBOL_SUP,FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5539); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_symbol_sup"


    public static class final_version_2_0_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_version_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:917:1: final_version_2_0 : CHARH CHIFFRE2 POINT CHIFFRE0 ;
    public final HPRIMSParser.final_version_2_0_return final_version_2_0() throws RecognitionException {
        HPRIMSParser.final_version_2_0_return retval = new HPRIMSParser.final_version_2_0_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:917:18: ( CHARH CHIFFRE2 POINT CHIFFRE0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:917:20: CHARH CHIFFRE2 POINT CHIFFRE0
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_05548); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_05550); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_05552); 

            match(input,CHIFFRE0,FOLLOW_CHIFFRE0_in_final_version_2_05554); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_version_2_0"


    public static class final_version_2_1_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_version_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:918:1: final_version_2_1 : CHARH CHIFFRE2 POINT CHIFFRE1 ;
    public final HPRIMSParser.final_version_2_1_return final_version_2_1() throws RecognitionException {
        HPRIMSParser.final_version_2_1_return retval = new HPRIMSParser.final_version_2_1_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:918:18: ( CHARH CHIFFRE2 POINT CHIFFRE1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:918:20: CHARH CHIFFRE2 POINT CHIFFRE1
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_15562); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_15564); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_15566); 

            match(input,CHIFFRE1,FOLLOW_CHIFFRE1_in_final_version_2_15568); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_version_2_1"


    public static class final_version_2_2_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_version_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:919:1: final_version_2_2 : CHARH CHIFFRE2 POINT CHIFFRE2 ;
    public final HPRIMSParser.final_version_2_2_return final_version_2_2() throws RecognitionException {
        HPRIMSParser.final_version_2_2_return retval = new HPRIMSParser.final_version_2_2_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:919:18: ( CHARH CHIFFRE2 POINT CHIFFRE2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:919:20: CHARH CHIFFRE2 POINT CHIFFRE2
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_25576); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25578); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_25580); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25582); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_version_2_2"


    public static class final_OP_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_OP"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:921:1: final_OP : CHARO CHARP ;
    public final HPRIMSParser.final_OP_return final_OP() throws RecognitionException {
        HPRIMSParser.final_OP_return retval = new HPRIMSParser.final_OP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:921:9: ( CHARO CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:921:11: CHARO CHARP
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_OP5591); 

            match(input,CHARP,FOLLOW_CHARP_in_final_OP5593); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_OP"


    public static class final_IP_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_IP"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:1: final_IP : CHARI CHARP ;
    public final HPRIMSParser.final_IP_return final_IP() throws RecognitionException {
        HPRIMSParser.final_IP_return retval = new HPRIMSParser.final_IP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:9: ( CHARI CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:11: CHARI CHARP
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_IP5601); 

            match(input,CHARP,FOLLOW_CHARP_in_final_IP5603); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_IP"


    public static class final_ER_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_ER"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:923:1: final_ER : CHARE CHARR ;
    public final HPRIMSParser.final_ER_return final_ER() throws RecognitionException {
        HPRIMSParser.final_ER_return retval = new HPRIMSParser.final_ER_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:923:9: ( CHARE CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:923:11: CHARE CHARR
            {
            match(input,CHARE,FOLLOW_CHARE_in_final_ER5611); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ER5613); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_ER"


    public static class final_PA_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_PA"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:924:1: final_PA : CHARP CHARA ;
    public final HPRIMSParser.final_PA_return final_PA() throws RecognitionException {
        HPRIMSParser.final_PA_return retval = new HPRIMSParser.final_PA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:924:9: ( CHARP CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:924:11: CHARP CHARA
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PA5621); 

            match(input,CHARA,FOLLOW_CHARA_in_final_PA5623); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_PA"


    public static class final_MP_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_MP"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:925:1: final_MP : CHARM CHARP ;
    public final HPRIMSParser.final_MP_return final_MP() throws RecognitionException {
        HPRIMSParser.final_MP_return retval = new HPRIMSParser.final_MP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:925:9: ( CHARM CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:925:11: CHARM CHARP
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MP5631); 

            match(input,CHARP,FOLLOW_CHARP_in_final_MP5633); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_MP"


    public static class final_charA_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charA"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:927:1: final_charA : CHARA ;
    public final HPRIMSParser.final_charA_return final_charA() throws RecognitionException {
        HPRIMSParser.final_charA_return retval = new HPRIMSParser.final_charA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:927:12: ( CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:927:14: CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_charA5644); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charA"


    public static class final_charB_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charB"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:928:1: final_charB : CHARB ;
    public final HPRIMSParser.final_charB_return final_charB() throws RecognitionException {
        HPRIMSParser.final_charB_return retval = new HPRIMSParser.final_charB_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:928:12: ( CHARB )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:928:14: CHARB
            {
            match(input,CHARB,FOLLOW_CHARB_in_final_charB5652); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charB"


    public static class final_charC_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charC"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:929:1: final_charC : CHARC ;
    public final HPRIMSParser.final_charC_return final_charC() throws RecognitionException {
        HPRIMSParser.final_charC_return retval = new HPRIMSParser.final_charC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:929:12: ( CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:929:14: CHARC
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_charC5660); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charC"


    public static class final_charD_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charD"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:930:1: final_charD : CHARD ;
    public final HPRIMSParser.final_charD_return final_charD() throws RecognitionException {
        HPRIMSParser.final_charD_return retval = new HPRIMSParser.final_charD_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:930:12: ( CHARD )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:930:14: CHARD
            {
            match(input,CHARD,FOLLOW_CHARD_in_final_charD5668); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charD"


    public static class final_charF_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charF"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:931:1: final_charF : CHARF ;
    public final HPRIMSParser.final_charF_return final_charF() throws RecognitionException {
        HPRIMSParser.final_charF_return retval = new HPRIMSParser.final_charF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:931:12: ( CHARF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:931:14: CHARF
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_charF5676); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charF"


    public static class final_charH_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charH"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:932:1: final_charH : CHARH ;
    public final HPRIMSParser.final_charH_return final_charH() throws RecognitionException {
        HPRIMSParser.final_charH_return retval = new HPRIMSParser.final_charH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:932:12: ( CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:932:14: CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_charH5684); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charH"


    public static class final_charI_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charI"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:933:1: final_charI : CHARI ;
    public final HPRIMSParser.final_charI_return final_charI() throws RecognitionException {
        HPRIMSParser.final_charI_return retval = new HPRIMSParser.final_charI_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:933:12: ( CHARI )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:933:14: CHARI
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_charI5692); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charI"


    public static class final_charL_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charL"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:934:1: final_charL : CHARL ;
    public final HPRIMSParser.final_charL_return final_charL() throws RecognitionException {
        HPRIMSParser.final_charL_return retval = new HPRIMSParser.final_charL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:934:12: ( CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:934:14: CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_charL5700); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charL"


    public static class final_charM_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charM"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:935:1: final_charM : CHARM ;
    public final HPRIMSParser.final_charM_return final_charM() throws RecognitionException {
        HPRIMSParser.final_charM_return retval = new HPRIMSParser.final_charM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:935:12: ( CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:935:14: CHARM
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_charM5708); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charM"


    public static class final_charN_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charN"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:936:1: final_charN : CHARN ;
    public final HPRIMSParser.final_charN_return final_charN() throws RecognitionException {
        HPRIMSParser.final_charN_return retval = new HPRIMSParser.final_charN_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:936:12: ( CHARN )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:936:14: CHARN
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_charN5716); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charN"


    public static class final_charO_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charO"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:937:1: final_charO : CHARO ;
    public final HPRIMSParser.final_charO_return final_charO() throws RecognitionException {
        HPRIMSParser.final_charO_return retval = new HPRIMSParser.final_charO_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:937:12: ( CHARO )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:937:14: CHARO
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_charO5724); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charO"


    public static class final_charP_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charP"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:1: final_charP : CHARP ;
    public final HPRIMSParser.final_charP_return final_charP() throws RecognitionException {
        HPRIMSParser.final_charP_return retval = new HPRIMSParser.final_charP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:12: ( CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:14: CHARP
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_charP5732); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charP"


    public static class final_charR_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charR"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:939:1: final_charR : CHARR ;
    public final HPRIMSParser.final_charR_return final_charR() throws RecognitionException {
        HPRIMSParser.final_charR_return retval = new HPRIMSParser.final_charR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:939:12: ( CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:939:14: CHARR
            {
            match(input,CHARR,FOLLOW_CHARR_in_final_charR5740); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charR"


    public static class final_charS_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charS"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:1: final_charS : CHARS ;
    public final HPRIMSParser.final_charS_return final_charS() throws RecognitionException {
        HPRIMSParser.final_charS_return retval = new HPRIMSParser.final_charS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:12: ( CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:14: CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_charS5748); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charS"


    public static class final_charT_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charT"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:941:1: final_charT : CHART ;
    public final HPRIMSParser.final_charT_return final_charT() throws RecognitionException {
        HPRIMSParser.final_charT_return retval = new HPRIMSParser.final_charT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:941:12: ( CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:941:14: CHART
            {
            match(input,CHART,FOLLOW_CHART_in_final_charT5756); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charT"


    public static class final_charU_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charU"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:942:1: final_charU : CHARU ;
    public final HPRIMSParser.final_charU_return final_charU() throws RecognitionException {
        HPRIMSParser.final_charU_return retval = new HPRIMSParser.final_charU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:942:12: ( CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:942:14: CHARU
            {
            match(input,CHARU,FOLLOW_CHARU_in_final_charU5764); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charU"


    public static class final_charW_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charW"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:943:1: final_charW : CHARW ;
    public final HPRIMSParser.final_charW_return final_charW() throws RecognitionException {
        HPRIMSParser.final_charW_return retval = new HPRIMSParser.final_charW_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:943:12: ( CHARW )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:943:14: CHARW
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_charW5772); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charW"


    public static class final_charX_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charX"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:944:1: final_charX : CHARX ;
    public final HPRIMSParser.final_charX_return final_charX() throws RecognitionException {
        HPRIMSParser.final_charX_return retval = new HPRIMSParser.final_charX_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:944:12: ( CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:944:14: CHARX
            {
            match(input,CHARX,FOLLOW_CHARX_in_final_charX5780); 

            content(input.toString(retval.start,input.LT(-1)));

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
    // $ANTLR end "final_charX"


    public static class delimiters_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "delimiters"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:947:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        startElement("H.2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:949:22: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:950:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5801); 

            content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            endElement();
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


    public static class character_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "character"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:955:1: character : ( lettre | chiffre ) ;
    public final HPRIMSParser.character_return character() throws RecognitionException {
        HPRIMSParser.character_return retval = new HPRIMSParser.character_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:955:10: ( ( lettre | chiffre ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:956:3: ( lettre | chiffre )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:956:3: ( lettre | chiffre )
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( ((LA209_0 >= CHARA && LA209_0 <= CHARu)||(LA209_0 >= LETTRE && LA209_0 <= POINT)) ) {
                alt209=1;
            }
            else if ( ((LA209_0 >= CHIFFRE0 && LA209_0 <= CHIFFRE9)) ) {
                alt209=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 209, 0, input);

                throw nvae;

            }
            switch (alt209) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:956:4: lettre
                    {
                    pushFollow(FOLLOW_lettre_in_character5817);
                    lettre();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:956:13: chiffre
                    {
                    pushFollow(FOLLOW_chiffre_in_character5821);
                    chiffre();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "character"



    // $ANTLR start "chiffre"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:958:1: chiffre : ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) ;
    public final void chiffre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:958:8: ( ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:
            {
            if ( (input.LA(1) >= CHIFFRE0 && input.LA(1) <= CHIFFRE9) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "chiffre"



    // $ANTLR start "lettre"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:962:1: lettre : ~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) ;
    public final void lettre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:962:7: (~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:
            {
            if ( (input.LA(1) >= CHARA && input.LA(1) <= CHARu)||(input.LA(1) >= LETTRE && input.LA(1) <= POINT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "lettre"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\100\uffff";
    static final String DFA1_eofS =
        "\100\uffff";
    static final String DFA1_minS =
        "\1\54\1\51\20\4\1\21\3\4\1\23\3\4\1\26\3\4\1\51\27\4\1\7\3\51\1"+
        "\13\1\40\1\60\1\37\2\uffff";
    static final String DFA1_maxS =
        "\1\54\1\51\20\60\1\21\3\60\1\23\3\60\1\26\3\60\1\51\3\60\1\61\2"+
        "\60\2\61\17\60\1\25\3\51\1\13\1\40\1\60\1\40\2\uffff";
    static final String DFA1_acceptS =
        "\76\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\100\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\32\3\12\4\1\uffff\1\5\3\uffff\4\3",
            "\32\3\12\4\1\uffff\1\5\3\uffff\4\3",
            "\32\3\12\4\1\uffff\1\5\3\uffff\4\3",
            "\32\6\12\7\1\uffff\1\10\3\uffff\4\6",
            "\32\6\12\7\1\uffff\1\10\3\uffff\4\6",
            "\32\6\12\7\1\uffff\1\10\3\uffff\4\6",
            "\32\11\12\12\5\uffff\4\11",
            "\32\11\12\12\2\uffff\1\13\2\uffff\4\11",
            "\32\11\12\12\2\uffff\1\13\2\uffff\4\11",
            "\32\14\12\15\5\uffff\4\14",
            "\32\14\12\15\1\uffff\1\16\3\uffff\4\14",
            "\32\14\12\15\1\uffff\1\16\3\uffff\4\14",
            "\32\17\12\20\1\uffff\1\22\1\21\2\uffff\4\17",
            "\32\17\12\20\1\uffff\1\22\1\21\2\uffff\4\17",
            "\32\17\12\20\1\uffff\1\22\1\21\2\uffff\4\17",
            "\32\23\12\24\1\uffff\1\22\1\25\2\uffff\4\23",
            "\1\26",
            "\32\23\12\24\1\uffff\1\22\1\25\2\uffff\4\23",
            "\32\23\12\24\1\uffff\1\22\1\25\2\uffff\4\23",
            "\32\27\12\30\1\uffff\1\22\1\31\2\uffff\4\27",
            "\1\32",
            "\32\27\12\30\1\uffff\1\22\1\31\2\uffff\4\27",
            "\32\27\12\30\1\uffff\1\22\1\31\2\uffff\4\27",
            "\32\33\12\34\1\uffff\1\22\1\35\2\uffff\4\33",
            "\1\36",
            "\32\33\12\34\1\uffff\1\22\1\35\2\uffff\4\33",
            "\32\33\12\34\1\uffff\1\22\1\35\2\uffff\4\33",
            "\32\37\12\40\1\uffff\1\22\1\41\2\uffff\4\37",
            "\1\42",
            "\32\37\12\40\1\uffff\1\22\1\41\2\uffff\4\37",
            "\32\37\12\40\1\uffff\1\22\1\41\2\uffff\4\37",
            "\32\43\12\44\1\uffff\1\22\3\uffff\4\43",
            "\32\45\12\46\1\uffff\1\50\3\uffff\4\45\1\47",
            "\32\43\12\44\1\uffff\1\22\3\uffff\4\43",
            "\32\43\12\44\1\uffff\1\22\3\uffff\4\43",
            "\32\45\12\46\1\uffff\1\50\3\uffff\4\45\1\47",
            "\32\45\12\46\1\uffff\1\50\3\uffff\4\45\1\47",
            "\32\51\12\52\1\uffff\1\50\3\uffff\4\51",
            "\32\53\12\54\1\uffff\1\55\3\uffff\4\53",
            "\32\51\12\52\1\uffff\1\50\3\uffff\4\51",
            "\32\51\12\52\1\uffff\1\50\3\uffff\4\51",
            "\32\53\12\54\1\uffff\1\55\3\uffff\4\53",
            "\32\53\12\54\1\uffff\1\55\3\uffff\4\53",
            "\32\56\12\57\5\uffff\4\56",
            "\32\56\12\57\2\uffff\1\60\2\uffff\4\56",
            "\32\56\12\57\2\uffff\1\60\2\uffff\4\56",
            "\32\61\12\62\5\uffff\4\61",
            "\32\61\12\62\1\uffff\1\63\3\uffff\4\61",
            "\32\61\12\62\1\uffff\1\63\3\uffff\4\61",
            "\32\64\12\65\1\uffff\1\66\3\uffff\4\64",
            "\32\64\12\65\1\uffff\1\66\3\uffff\4\64",
            "\32\64\12\65\1\uffff\1\66\3\uffff\4\64",
            "\1\70\12\uffff\1\67\2\uffff\1\71",
            "\1\72",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\1\76",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "205:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );";
        }
    }
 

    public static final BitSet FOLLOW_hprim_oru_2_2_in_hprim68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_oru_2_1_in_hprim72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_in_hprim_oru_2_292 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p2_1_in_hprim_oru_2_296 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l2_1_in_hprim_oru_2_2101 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_2105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_in_hprim_oru_2_1127 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p2_1_in_hprim_oru_2_1131 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l2_1_in_hprim_oru_2_1136 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_in_hprim_oru_2_0162 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p2_1_in_hprim_oru_2_0166 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l2_1_in_hprim_oru_2_0171 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_0175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_0180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p2_1_in_body_p2_1190 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_p2_1193 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr2_1_in_body_p2_1200 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_body_obr2_1212 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obr2_1215 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obx2_1_in_body_obr2_1223 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx2_1_in_body_obx2_1235 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obx2_1238 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_2261 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2265 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2267 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2272 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2274 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2279 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2281 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2286 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2288 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2293 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_2295 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2300 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_2302 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2307 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2309 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2314 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2316 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2321 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2323 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2328 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_2330 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2335 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2337 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2342 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2344 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_1369 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1373 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1375 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1380 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1382 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1387 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1389 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1394 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1396 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1401 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_1403 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1408 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_1410 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1415 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1417 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1422 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1424 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1429 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1431 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1436 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_1438 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1443 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1445 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1450 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1452 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_0476 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0480 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_0482 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0487 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_0489 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0494 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_0496 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0501 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_0503 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0508 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_0510 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0515 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_0517 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0522 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_0524 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0529 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_0531 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0536 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_0538 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0543 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_0545 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0550 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0552 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0557 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_0559 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p2_1_in_line_p2_2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p2_1592 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_p2_1594 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1598 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_p2_1600 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1605 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_8_3_in_line_p2_1607 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1612 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1614 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1620 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1622 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1629 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1631 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1639 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1641 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1650 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1652 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1662 = new BitSet(new long[]{0x0000020000408200L});
    public static final BitSet FOLLOW_spec_const_sexe_in_line_p2_1664 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1675 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p2_1677 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1689 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1691 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1704 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1706 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1720 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_p2_1722 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1761 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1763 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1767 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1769 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1787 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1789 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1806 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1808 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1841 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1843 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1878 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1880 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1900 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1902 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1906 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1908 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1931 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1933 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1937 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1939 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1963 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1965 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1988 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1990 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11014 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11016 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11041 = new BitSet(new long[]{0x000202FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11043 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_11047 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11049 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11077 = new BitSet(new long[]{0x0000020000069100L});
    public static final BitSet FOLLOW_spec_const_8_25_in_line_p2_11079 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11106 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_11108 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11161 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11163 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11192 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p2_11194 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11251 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11253 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11312 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11314 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11346 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11348 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11411 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11413 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11447 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11449 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11484 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11486 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_line_obr2_21592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2_11609 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obr2_11611 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obr2_11613 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_line_obr2_11615 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11619 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11621 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11626 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_3_in_line_obr2_11628 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11633 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11635 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11640 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11642 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11646 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11648 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11658 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11660 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11664 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11666 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11673 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11675 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11680 = new BitSet(new long[]{0x000200FFC0000000L});
    public static final BitSet FOLLOW_spec_non_sized_9_8_in_line_obr2_11682 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11687 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11689 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11697 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11699 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11704 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11706 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11714 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11716 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11725 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11727 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11734 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11736 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11744 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11746 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11755 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_16_in_line_obr2_11757 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11767 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11769 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11780 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_obr2_11782 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11794 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11796 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11809 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11811 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11825 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11827 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11842 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11844 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11860 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11862 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11879 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11881 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11899 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11901 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11920 = new BitSet(new long[]{0x00000200020E92C0L});
    public static final BitSet FOLLOW_spec_const_9_26_in_line_obr2_11922 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11942 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11944 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11965 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11967 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11989 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11991 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11995 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11997 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12022 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_12024 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12048 = new BitSet(new long[]{0x0000020001040040L});
    public static final BitSet FOLLOW_spec_const_9_31_in_line_obr2_12050 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12097 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_12099 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_12103 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_12105 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12133 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12135 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12162 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12164 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12192 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12194 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12223 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12225 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12255 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_12257 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2_12356 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obx2_12358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obx2_12360 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_line_obx2_12362 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12366 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12368 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12373 = new BitSet(new long[]{0x00000000003506D0L});
    public static final BitSet FOLLOW_spec_const_10_3_nm_in_line_obx2_12381 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12390 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12392 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12402 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12404 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12415 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12417 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12421 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12423 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_ce_in_line_obx2_12453 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12462 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12464 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12474 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12476 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12487 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12489 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12493 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12495 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_fic_in_line_obx2_12525 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12534 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12536 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12546 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12548 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12559 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12561 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12565 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12567 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_st_in_line_obx2_12597 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12606 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12608 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12618 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12620 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12631 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12633 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12637 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12639 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_gc_in_line_obx2_12669 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12678 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12680 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12690 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12692 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12703 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12705 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12709 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12711 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_tx_in_line_obx2_12741 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12750 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12752 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12762 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12764 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12775 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12777 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12781 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12783 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_std_in_line_obx2_12813 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12822 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12824 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12834 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12836 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12847 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12849 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12853 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12855 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62889 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62891 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62900 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62902 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62906 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62908 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62920 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62922 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62926 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62928 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62941 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62943 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62955 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62957 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62961 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62963 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62978 = new BitSet(new long[]{0x00000200024C12C0L});
    public static final BitSet FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62980 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62995 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62997 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63013 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63015 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63031 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_63033 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63050 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_63052 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63070 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63072 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c2_13114 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_c2_13116 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13120 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_c2_13122 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13127 = new BitSet(new long[]{0x0000020000044000L});
    public static final BitSet FOLLOW_spec_const_12_3_in_line_c2_13129 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13134 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13136 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c2_13140 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13142 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l2_13169 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_line_l2_13171 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13176 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13178 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13185 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_l2_13187 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13195 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13197 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13206 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13208 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13218 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_l2_13220 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_sexe3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_sexe3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_sexe3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03306 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03309 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13332 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13335 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23356 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23359 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_7_13_23380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_7_13_23384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_7_13_23388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORU_in_spec_const_7_7_contexte3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_7_123425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_7_123429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charT_in_spec_const_7_123433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PORT_in_spec_const_9_313453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_CART_in_spec_const_9_313457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WHLC_in_spec_const_9_313461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WALK_in_spec_const_9_313465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_OP_in_spec_const_8_253486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_IP_in_spec_const_8_253490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ER_in_spec_const_8_253494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PA_in_spec_const_8_253498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MP_in_spec_const_8_253502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_9_263523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_9_263527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_9_263531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_9_263535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_9_263539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_9_263543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_const_9_263547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_9_263553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_9_263557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_nm3578 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_spec_const_10_3_nm3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_ce3601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CHARE_in_spec_const_10_3_ce3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_spec_const_10_3_st3624 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_st3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_gc3647 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_gc3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_tx3671 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_spec_const_10_3_tx3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_spec_const_10_3_fic3694 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHARI_in_spec_const_10_3_fic3696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_fic3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3720 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3728 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_spec_const_10_3_std3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3736 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3746 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_spec_const_10_3_std3756 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3764 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_spec_const_10_3_std3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3782 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63807 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63813 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63815 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63822 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_10_93852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charH_in_spec_const_10_93856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_LL_in_spec_const_10_93860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_HH_in_spec_const_10_93864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_inf_in_spec_const_10_93868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_sup_in_spec_const_10_93872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_93878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_93882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_AA_in_spec_const_10_93886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_Null_in_spec_const_10_93890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_93894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_93898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charB_in_spec_const_10_93902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charW_in_spec_const_10_93908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_93912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_93916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_93920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MS_in_spec_const_10_93924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_VS_in_spec_const_10_93928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_113949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_113953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_113957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_113961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_123982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_10_123986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_10_123990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_10_123994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_123998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_124002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_10_124009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_124013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_12_34034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_12_34038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24058 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_24064 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24089 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_24095 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44122 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44128 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44130 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44137 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44139 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44147 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64178 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64185 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64187 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64195 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64197 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64206 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64208 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64218 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64220 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64231 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84266 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84272 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84274 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84281 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84283 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84291 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84293 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84302 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84304 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84314 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84316 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84327 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84329 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84341 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34380 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34386 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34388 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34395 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64420 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64426 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64428 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64435 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64437 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64445 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64447 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64456 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64458 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64468 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24499 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24504 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24531 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24536 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4561 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4568 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4570 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4578 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_spec_sized_8_34612 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34619 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34621 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34629 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34671 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_34677 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84704 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_non_sized_9_84711 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164734 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164740 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164742 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164749 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44778 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44784 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44786 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44793 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44795 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44803 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44805 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44814 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44816 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44826 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4885 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_sized_tn4891 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_optionnal4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_mandatory4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_non_sized_optionnal4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_nonsized_mandatory4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_sized_optionnal5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_optionnal5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_mandatory5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_mandatory5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_optionnal5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_content_spec_10_65236 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_DELIMITER2_in_content_spec_10_65242 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_content_spec_10_6_in_content_spec_10_65253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5265 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5267 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5271 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5273 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5275 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5279 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5282 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5284 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5289 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5291 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5293 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5297 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5300 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_final_st5321 = new BitSet(new long[]{0x0001E0FFFFFFFFF2L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5350 = new BitSet(new long[]{0x000100FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5354 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5356 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5366 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5368 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm_integer5385 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORU5397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORU5399 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CHARU_in_final_ORU5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_CART5410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_CART5412 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_CART5414 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_CART5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PORT5424 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_final_PORT5426 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_PORT5428 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_PORT5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WHLC5438 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_WHLC5440 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WHLC5442 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_final_WHLC5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WALK5452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_WALK5454 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WALK5456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_final_WALK5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5467 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5487 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MS5497 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_MS5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARV_in_final_VS5507 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_VS5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_Null5517 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CHARu_in_final_Null5519 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5521 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_05548 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_05550 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_05552 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CHIFFRE0_in_final_version_2_05554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_15562 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_15564 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_15566 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CHIFFRE1_in_final_version_2_15568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_25576 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25578 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_25580 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_OP5591 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_OP5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_IP5601 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_IP5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARE_in_final_ER5611 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ER5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PA5621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_PA5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MP5631 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_MP5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_charA5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARB_in_final_charB5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_charC5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_final_charD5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_charF5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_charH5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_charI5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_charL5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_charM5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_charN5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_charO5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_charP5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARR_in_final_charR5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_charS5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_charT5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARU_in_final_charU5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_charW5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARX_in_final_charX5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lettre_in_character5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_character5821 = new BitSet(new long[]{0x0000000000000002L});

}