// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-03-31 15:40:51

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
      public void startElement(String typeElement, String nameElement) throws ContentHandlerException {
          try {
              // Enregistrement de cet élément
              XmlElement xmlElement = new XmlElement();
              xmlElement.uri = "";
              xmlElement.localName = typeElement;
              xmlElement.qName = typeElement;
              xmlElements.add(xmlElement);
              // Définition des attributs
              AttributesImpl atts = new AttributesImpl();
              atts.addAttribute("", "nom", "nom", "string", nameElement);
              // Ajout de ce élément
              contentHandler.startElement("", typeElement, typeElement, atts);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:208:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );
    public final void hprim() throws RecognitionException {
        startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:23: ( hprim_oru_2_2 | hprim_oru_2_1 )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:211:3: hprim_oru_2_2
                    {
                    pushFollow(FOLLOW_hprim_oru_2_2_in_hprim68);
                    hprim_oru_2_2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:211:19: hprim_oru_2_1
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:216:1: hprim_oru_2_2 : line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_2() throws RecognitionException {
        startElement("message", "hprim_oru_2_2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:218:22: ( line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:219:3: line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_in_hprim_oru_2_292);
            line_h2_2();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:220:3: ( body_p2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:220:3: body_p2_1
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:3: ( CR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:3: CR
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:225:1: hprim_oru_2_1 : line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_1() throws RecognitionException {
        startElement("message", "hprim_oru_2_1");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:227:22: ( line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:228:3: line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_in_hprim_oru_2_1127);
            line_h2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:3: ( body_p2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:3: body_p2_1
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:3: ( CR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:3: CR
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



    // $ANTLR start "body_p2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:234:1: body_p2_1 : line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ ;
    public final void body_p2_1() throws RecognitionException {
        startElement("body", "P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:236:22: ( line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:3: line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+
            {
            pushFollow(FOLLOW_line_p2_1_in_body_p2_1162);
            line_p2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:13: ( line_c2_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CR) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==CHARC) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:14: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_p2_1165);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:238:4: ( body_obr2_1 )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CR) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==CHARO) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:238:4: body_obr2_1
            	    {
            	    pushFollow(FOLLOW_body_obr2_1_in_body_p2_1172);
            	    body_obr2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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
    // $ANTLR end "body_p2_1"



    // $ANTLR start "body_obr2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:240:1: body_obr2_1 : line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ ;
    public final void body_obr2_1() throws RecognitionException {
        startElement("body", "OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:242:22: ( line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:4: line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+
            {
            pushFollow(FOLLOW_line_obr2_1_in_body_obr2_1191);
            line_obr2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:16: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obr2_1194);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:244:5: ( body_obx2_1 )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CR) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==CHARO) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==CHARB) ) {
                            int LA9_4 = input.LA(4);

                            if ( (LA9_4==CHARX) ) {
                                alt9=1;
                            }


                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:244:5: body_obx2_1
            	    {
            	    pushFollow(FOLLOW_body_obx2_1_in_body_obr2_1202);
            	    body_obx2_1();

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
    // $ANTLR end "body_obr2_1"



    // $ANTLR start "body_obx2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:1: body_obx2_1 : line_obx2_1 ( line_c2_1 )* ;
    public final void body_obx2_1() throws RecognitionException {
        startElement("body", "OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:22: ( line_obx2_1 ( line_c2_1 )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:4: line_obx2_1 ( line_c2_1 )*
            {
            pushFollow(FOLLOW_line_obx2_1_in_body_obx2_1221);
            line_obx2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:16: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obx2_1224);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "body_obx2_1"



    // $ANTLR start "line_h2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:255:1: line_h2_2 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2() throws RecognitionException {
        startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:257:22: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:258:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_2247);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2251); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2253);
            st_sized_optionnal("H_7.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2258); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2260);
            st_sized_optionnal("H_7.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2265); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2267);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2272); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2274);
            spec_sized_mult_lvl1_st_optionnal_6("H_7.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2279); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_2281);
            spec_const_7_7_contexte("H_7.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2286); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_2288);
            spec_sized_tn("H_7.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2293); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2295);
            st_sized_optionnal("H_7.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2300); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2302);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2307); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2309);
            st_sized_optionnal("H_7.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2314); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_2316);
            spec_const_7_12("H_7.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2321); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2323);
            spec_const_7_13_version_2_2("H_7.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2328); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2330);
            ts_sized_mandatory("H_7.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:3: ( DELIMITER1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DELIMITER1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2335); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:1: line_h2_1 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1() throws RecognitionException {
        startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:22: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_1355);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1359); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1361);
            st_sized_optionnal("H_7.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1366); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1368);
            st_sized_optionnal("H_7.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1373); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1375);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1380); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1382);
            spec_sized_mult_lvl1_st_optionnal_6("H_7.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1387); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_1389);
            spec_const_7_7_contexte("H_7.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1394); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_1396);
            spec_sized_tn("H_7.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1401); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1403);
            st_sized_optionnal("H_7.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1408); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1410);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1415); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1417);
            st_sized_optionnal("H_7.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1422); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_1424);
            spec_const_7_12("H_7.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1432); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:14: ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CHARH) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==CHIFFRE2) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==POINT) ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==CHIFFRE0) ) {
                            alt12=1;
                        }
                        else if ( (LA12_3==CHIFFRE1) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:15: spec_const_7_13_version_2_0[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_1435);
                    spec_const_7_13_version_2_0("H_7.13");

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:55: spec_const_7_13_version_2_1[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1440);
                    spec_const_7_13_version_2_1("H_7.13");

                    state._fsp--;


                    }
                    break;

            }


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1446); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1448);
            ts_sized_mandatory("H_7.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:292:3: ( DELIMITER1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DELIMITER1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:292:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1453); 

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



    // $ANTLR start "line_p2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:295:1: line_p2_2 : line_p2_1 ;
    public final void line_p2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:295:10: ( line_p2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:3: line_p2_1
            {
            pushFollow(FOLLOW_line_p2_1_in_line_p2_2464);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:298:1: line_p2_1 : CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p2_1() throws RecognitionException {
        startElement("ligne", "P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:22: ( CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:3: CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p2_1481); 

            match(input,CHARP,FOLLOW_CHARP_in_line_p2_1483); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1487); 

            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_p2_1489);
            nm_integer_sized_optionnal("P_8.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1494); 

            pushFollow(FOLLOW_spec_sized_8_3_in_line_p2_1496);
            spec_sized_8_3("P_8.3", 36);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1501); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1503);
            st_sized_optionnal("P_8.4", 16);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:3: ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DELIMITER1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:4: DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1509); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1511);
                    st_sized_optionnal("P_8.5", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DELIMITER1) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1518); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1520);
                            spec_sized_mult_lvl1_st_optionnal_6("P_8.6", 48);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:5: ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==DELIMITER1) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:6: DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1528); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1530);
                                    st_sized_optionnal("P_8.7", 24);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:6: ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt45=2;
                                    int LA45_0 = input.LA(1);

                                    if ( (LA45_0==DELIMITER1) ) {
                                        alt45=1;
                                    }
                                    switch (alt45) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:7: DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1539); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1541);
                                            ts_sized_optionnal("P_8.8", 26);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:7: ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt44=2;
                                            int LA44_0 = input.LA(1);

                                            if ( (LA44_0==DELIMITER1) ) {
                                                alt44=1;
                                            }
                                            switch (alt44) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:8: DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1551); 

                                                    pushFollow(FOLLOW_spec_const_sexe_in_line_p2_1553);
                                                    spec_const_sexe("P_8.9");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:8: ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt43=2;
                                                    int LA43_0 = input.LA(1);

                                                    if ( (LA43_0==DELIMITER1) ) {
                                                        alt43=1;
                                                    }
                                                    switch (alt43) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:9: DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1564); 

                                                            pushFollow(FOLLOW_spec_const_race_in_line_p2_1566);
                                                            spec_const_race("P_8.10");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:9: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt42=2;
                                                            int LA42_0 = input.LA(1);

                                                            if ( (LA42_0==DELIMITER1) ) {
                                                                alt42=1;
                                                            }
                                                            switch (alt42) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:10: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1578); 

                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1580);
                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.11", 200);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:10: ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt41=2;
                                                                    int LA41_0 = input.LA(1);

                                                                    if ( (LA41_0==DELIMITER1) ) {
                                                                        alt41=1;
                                                                    }
                                                                    switch (alt41) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:11: DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1593); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1595);
                                                                            st_sized_optionnal("P_8.12", 120);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:11: ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt40=2;
                                                                            int LA40_0 = input.LA(1);

                                                                            if ( (LA40_0==DELIMITER1) ) {
                                                                                alt40=1;
                                                                            }
                                                                            switch (alt40) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:12: DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1609); 

                                                                                    pushFollow(FOLLOW_spec_sized_tn_in_line_p2_1611);
                                                                                    spec_sized_tn("P_8.13", 40);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:12: ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt39=2;
                                                                                    int LA39_0 = input.LA(1);

                                                                                    if ( (LA39_0==DELIMITER1) ) {
                                                                                        alt39=1;
                                                                                    }
                                                                                    switch (alt39) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:13: DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1650); 

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1652);
                                                                                            spec_sized_cna("P_8.14", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:53: ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )*
                                                                                            loop14:
                                                                                            do {
                                                                                                int alt14=2;
                                                                                                int LA14_0 = input.LA(1);

                                                                                                if ( (LA14_0==REPETITEUR) ) {
                                                                                                    alt14=1;
                                                                                                }


                                                                                                switch (alt14) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:54: REPETITEUR spec_sized_cna[\"P_8.14\", 60]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1656); 

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1658);
                                                                                            	    spec_sized_cna("P_8.14", 60);

                                                                                            	    state._fsp--;


                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop14;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:13: ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt38=2;
                                                                                            int LA38_0 = input.LA(1);

                                                                                            if ( (LA38_0==DELIMITER1) ) {
                                                                                                alt38=1;
                                                                                            }
                                                                                            switch (alt38) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:14: DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1676); 

                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1678);
                                                                                                    st_sized_optionnal("P_8.15", 60);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:14: ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt37=2;
                                                                                                    int LA37_0 = input.LA(1);

                                                                                                    if ( (LA37_0==DELIMITER1) ) {
                                                                                                        alt37=1;
                                                                                                    }
                                                                                                    switch (alt37) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:15: DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1695); 

                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1697);
                                                                                                            st_sized_optionnal("P_8.16", 60);

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:320:15: ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt36=2;
                                                                                                            int LA36_0 = input.LA(1);

                                                                                                            if ( (LA36_0==DELIMITER1) ) {
                                                                                                                alt36=1;
                                                                                                            }
                                                                                                            switch (alt36) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:320:16: DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1730); 

                                                                                                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1732);
                                                                                                                    nm_sized_optionnal("P_8.17", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:16: ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt35=2;
                                                                                                                    int LA35_0 = input.LA(1);

                                                                                                                    if ( (LA35_0==DELIMITER1) ) {
                                                                                                                        alt35=1;
                                                                                                                    }
                                                                                                                    switch (alt35) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:17: DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1767); 

                                                                                                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1769);
                                                                                                                            nm_sized_optionnal("P_8.18", 10);

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:17: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt34=2;
                                                                                                                            int LA34_0 = input.LA(1);

                                                                                                                            if ( (LA34_0==DELIMITER1) ) {
                                                                                                                                alt34=1;
                                                                                                                            }
                                                                                                                            switch (alt34) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:18: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1789); 

                                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1791);
                                                                                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:80: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )*
                                                                                                                                    loop15:
                                                                                                                                    do {
                                                                                                                                        int alt15=2;
                                                                                                                                        int LA15_0 = input.LA(1);

                                                                                                                                        if ( (LA15_0==REPETITEUR) ) {
                                                                                                                                            alt15=1;
                                                                                                                                        }


                                                                                                                                        switch (alt15) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:81: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1795); 

                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1797);
                                                                                                                                    	    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    	    state._fsp--;


                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop15;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:18: ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt33=2;
                                                                                                                                    int LA33_0 = input.LA(1);

                                                                                                                                    if ( (LA33_0==DELIMITER1) ) {
                                                                                                                                        alt33=1;
                                                                                                                                    }
                                                                                                                                    switch (alt33) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:19: DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1820); 

                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1822);
                                                                                                                                            st_sized_optionnal("P_8.20", 200);

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:64: ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )*
                                                                                                                                            loop16:
                                                                                                                                            do {
                                                                                                                                                int alt16=2;
                                                                                                                                                int LA16_0 = input.LA(1);

                                                                                                                                                if ( (LA16_0==REPETITEUR) ) {
                                                                                                                                                    alt16=1;
                                                                                                                                                }


                                                                                                                                                switch (alt16) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:65: REPETITEUR st_sized_optionnal[\"P_8.20\", 200]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1826); 

                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1828);
                                                                                                                                            	    st_sized_optionnal("P_8.20", 200);

                                                                                                                                            	    state._fsp--;


                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop16;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:19: ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt32=2;
                                                                                                                                            int LA32_0 = input.LA(1);

                                                                                                                                            if ( (LA32_0==DELIMITER1) ) {
                                                                                                                                                alt32=1;
                                                                                                                                            }
                                                                                                                                            switch (alt32) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:20: DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1852); 

                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1854);
                                                                                                                                                    st_sized_optionnal("P_8.21", 200);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:20: ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt31=2;
                                                                                                                                                    int LA31_0 = input.LA(1);

                                                                                                                                                    if ( (LA31_0==DELIMITER1) ) {
                                                                                                                                                        alt31=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt31) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:21: DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1877); 

                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1879);
                                                                                                                                                            st_sized_optionnal("P_8.22", 60);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:21: ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt30=2;
                                                                                                                                                            int LA30_0 = input.LA(1);

                                                                                                                                                            if ( (LA30_0==DELIMITER1) ) {
                                                                                                                                                                alt30=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt30) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:22: DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1903); 

                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1905);
                                                                                                                                                                    st_sized_optionnal("P_8.23", 60);

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:22: ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt29=2;
                                                                                                                                                                    int LA29_0 = input.LA(1);

                                                                                                                                                                    if ( (LA29_0==DELIMITER1) ) {
                                                                                                                                                                        alt29=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt29) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:23: DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1930); 

                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1932);
                                                                                                                                                                            ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:67: ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )?
                                                                                                                                                                            int alt17=2;
                                                                                                                                                                            int LA17_0 = input.LA(1);

                                                                                                                                                                            if ( (LA17_0==REPETITEUR) ) {
                                                                                                                                                                                alt17=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt17) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:68: REPETITEUR ts_sized_optionnal[\"P_8.24\", 26]
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1936); 

                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1938);
                                                                                                                                                                                    ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:23: ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt28=2;
                                                                                                                                                                            int LA28_0 = input.LA(1);

                                                                                                                                                                            if ( (LA28_0==DELIMITER1) ) {
                                                                                                                                                                                alt28=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt28) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:24: DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1966); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_const_8_25_in_line_p2_1968);
                                                                                                                                                                                    spec_const_8_25("P_8.25");

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:24: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt27=2;
                                                                                                                                                                                    int LA27_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA27_0==DELIMITER1) ) {
                                                                                                                                                                                        alt27=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt27) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:25: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1995); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1997);
                                                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_8("P_8.26", 100);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:332:25: ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt26=2;
                                                                                                                                                                                            int LA26_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA26_0==DELIMITER1) ) {
                                                                                                                                                                                                alt26=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt26) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:332:26: DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11050); 

                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11052);
                                                                                                                                                                                                    st_sized_optionnal("P_8.27", 100);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:26: ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt25=2;
                                                                                                                                                                                                    int LA25_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA25_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt25=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt25) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:27: DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11081); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_p2_11083);
                                                                                                                                                                                                            spec_const_race("P_8.28");

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:27: ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt24=2;
                                                                                                                                                                                                            int LA24_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA24_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt24=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt24) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:28: DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11140); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11142);
                                                                                                                                                                                                                    st_sized_optionnal("P_8.29", 2);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:28: ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt23=2;
                                                                                                                                                                                                                    int LA23_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA23_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt23=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt23) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:29: DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11201); 

                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11203);
                                                                                                                                                                                                                            st_sized_optionnal("P_8.30", 20);

                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:29: ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt22=2;
                                                                                                                                                                                                                            int LA22_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA22_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt22=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt22) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:30: DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11235); 

                                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11237);
                                                                                                                                                                                                                                    st_sized_optionnal("P_8.31", 20);

                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:30: ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt21=2;
                                                                                                                                                                                                                                    int LA21_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA21_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt21=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt21) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:31: DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11300); 

                                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11302);
                                                                                                                                                                                                                                            st_sized_optionnal("P_8.32", 20);

                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:31: ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt20=2;
                                                                                                                                                                                                                                            int LA20_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA20_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt20=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt20) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:32: DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11336); 

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11338);
                                                                                                                                                                                                                                                    ts_sized_optionnal("P_8.33", 26);

                                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:32: ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt19=2;
                                                                                                                                                                                                                                                    int LA19_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA19_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt19=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt19) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:33: DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11373); 

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11375);
                                                                                                                                                                                                                                                            ts_sized_optionnal("P_8.34", 26);

                                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt18=2;
                                                                                                                                                                                                                                                            int LA18_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA18_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt18=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt18) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11410); 

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:1: line_obr2_2 : line_obr2_1 ;
    public final void line_obr2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:12: ( line_obr2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:3: line_obr2_1
            {
            pushFollow(FOLLOW_line_obr2_1_in_line_obr2_21481);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:1: line_obr2_1 : CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr2_1() throws RecognitionException {
        startElement("ligne", "OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:22: ( CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:3: CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2_11498); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obr2_11500); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obr2_11502); 

            match(input,CHARR,FOLLOW_CHARR_in_line_obr2_11504); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11508); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11510);
            nm_integer_sized_mandatory("OBR_9.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11515); 

            pushFollow(FOLLOW_spec_sized_9_3_in_line_obr2_11517);
            spec_sized_9_3("OBR_9.3", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11522); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11524);
            spec_sized_mult_lvl1_st_optionnal_2("OBR_9.4", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11529); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11531);
            spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 640000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:69: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==REPETITEUR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:70: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11535); 

            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11537);
            	    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11547); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11549);
            st_sized_optionnal("OBR_9.6", 2);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:47: ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==REPETITEUR) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:48: REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11553); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11555);
            	    st_sized_optionnal("OBR_9.6", 2);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11562); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11564);
            ts_sized_optionnal("OBR_9.7", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11569); 

            pushFollow(FOLLOW_spec_non_sized_9_8_in_line_obr2_11571);
            spec_non_sized_9_8("OBR_9.8");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11576); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11578);
            ts_sized_optionnal("OBR_9.9", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11586); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11588);
            st_sized_optionnal("OBR_9.10", 20);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11593); 

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11595);
            spec_sized_cna("OBR_9.11", 60);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11603); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11605);
            st_sized_optionnal("OBR_9.12", 1);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:3: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==DELIMITER1) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:4: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11614); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11616);
                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.13", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:4: ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==DELIMITER1) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:5: DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11623); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11625);
                            st_sized_optionnal("OBR_9.14", 300);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:370:5: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==DELIMITER1) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:370:6: DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11633); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11635);
                                    ts_sized_optionnal("OBR_9.15", 26);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:371:6: ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt75=2;
                                    int LA75_0 = input.LA(1);

                                    if ( (LA75_0==DELIMITER1) ) {
                                        alt75=1;
                                    }
                                    switch (alt75) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:371:7: DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11644); 

                                            pushFollow(FOLLOW_spec_sized_9_16_in_line_obr2_11646);
                                            spec_sized_9_16("OBR_9_16", 300);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:7: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt74=2;
                                            int LA74_0 = input.LA(1);

                                            if ( (LA74_0==DELIMITER1) ) {
                                                alt74=1;
                                            }
                                            switch (alt74) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:8: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11656); 

                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11658);
                                                    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.17", 60);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:373:8: ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt73=2;
                                                    int LA73_0 = input.LA(1);

                                                    if ( (LA73_0==DELIMITER1) ) {
                                                        alt73=1;
                                                    }
                                                    switch (alt73) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:373:9: DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11669); 

                                                            pushFollow(FOLLOW_spec_sized_tn_in_line_obr2_11671);
                                                            spec_sized_tn("OBR_9.18", 40);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:374:9: ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt72=2;
                                                            int LA72_0 = input.LA(1);

                                                            if ( (LA72_0==DELIMITER1) ) {
                                                                alt72=1;
                                                            }
                                                            switch (alt72) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:374:10: DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11683); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11685);
                                                                    st_sized_optionnal("OBR_9.19", 60);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:10: ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt71=2;
                                                                    int LA71_0 = input.LA(1);

                                                                    if ( (LA71_0==DELIMITER1) ) {
                                                                        alt71=1;
                                                                    }
                                                                    switch (alt71) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:11: DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11698); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11700);
                                                                            st_sized_optionnal("OBR_9.20", 60);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:11: ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt70=2;
                                                                            int LA70_0 = input.LA(1);

                                                                            if ( (LA70_0==DELIMITER1) ) {
                                                                                alt70=1;
                                                                            }
                                                                            switch (alt70) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:12: DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11714); 

                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11716);
                                                                                    st_sized_optionnal("OBR_9.21", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:12: ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt69=2;
                                                                                    int LA69_0 = input.LA(1);

                                                                                    if ( (LA69_0==DELIMITER1) ) {
                                                                                        alt69=1;
                                                                                    }
                                                                                    switch (alt69) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:13: DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11731); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11733);
                                                                                            st_sized_optionnal("OBR_9.22", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:378:13: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt68=2;
                                                                                            int LA68_0 = input.LA(1);

                                                                                            if ( (LA68_0==DELIMITER1) ) {
                                                                                                alt68=1;
                                                                                            }
                                                                                            switch (alt68) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:378:14: DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11749); 

                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11751);
                                                                                                    ts_sized_optionnal("OBR_9.23", 26);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:379:14: ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt67=2;
                                                                                                    int LA67_0 = input.LA(1);

                                                                                                    if ( (LA67_0==DELIMITER1) ) {
                                                                                                        alt67=1;
                                                                                                    }
                                                                                                    switch (alt67) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:379:15: DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11768); 

                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2_11770);
                                                                                                            spec_const_race("OBR_9.24");

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:15: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt66=2;
                                                                                                            int LA66_0 = input.LA(1);

                                                                                                            if ( (LA66_0==DELIMITER1) ) {
                                                                                                                alt66=1;
                                                                                                            }
                                                                                                            switch (alt66) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:16: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11788); 

                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11790);
                                                                                                                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.25", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:381:16: ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt65=2;
                                                                                                                    int LA65_0 = input.LA(1);

                                                                                                                    if ( (LA65_0==DELIMITER1) ) {
                                                                                                                        alt65=1;
                                                                                                                    }
                                                                                                                    switch (alt65) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:381:17: DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11809); 

                                                                                                                            pushFollow(FOLLOW_spec_const_9_26_in_line_obr2_11811);
                                                                                                                            spec_const_9_26("OBR_9.26");

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:382:17: ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt64=2;
                                                                                                                            int LA64_0 = input.LA(1);

                                                                                                                            if ( (LA64_0==DELIMITER1) ) {
                                                                                                                                alt64=1;
                                                                                                                            }
                                                                                                                            switch (alt64) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:382:18: DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11831); 

                                                                                                                                    pushFollow(FOLLOW_spec_const_race_in_line_obr2_11833);
                                                                                                                                    spec_const_race("OBR_9.27");

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:18: ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt63=2;
                                                                                                                                    int LA63_0 = input.LA(1);

                                                                                                                                    if ( (LA63_0==DELIMITER1) ) {
                                                                                                                                        alt63=1;
                                                                                                                                    }
                                                                                                                                    switch (alt63) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:19: DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11854); 

                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2_11856);
                                                                                                                                            spec_const_race("OBR_9.28");

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:19: ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt62=2;
                                                                                                                                            int LA62_0 = input.LA(1);

                                                                                                                                            if ( (LA62_0==DELIMITER1) ) {
                                                                                                                                                alt62=1;
                                                                                                                                            }
                                                                                                                                            switch (alt62) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:20: DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11878); 

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11880);
                                                                                                                                                    spec_sized_cna("OBR_9.29", 150);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:63: ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )*
                                                                                                                                                    loop51:
                                                                                                                                                    do {
                                                                                                                                                        int alt51=2;
                                                                                                                                                        int LA51_0 = input.LA(1);

                                                                                                                                                        if ( (LA51_0==REPETITEUR) ) {
                                                                                                                                                            alt51=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt51) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:64: REPETITEUR spec_sized_cna[\"OBR_9.29\", 150]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11884); 

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11886);
                                                                                                                                                    	    spec_sized_cna("OBR_9.29", 150);

                                                                                                                                                    	    state._fsp--;


                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop51;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:385:20: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt61=2;
                                                                                                                                                    int LA61_0 = input.LA(1);

                                                                                                                                                    if ( (LA61_0==DELIMITER1) ) {
                                                                                                                                                        alt61=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt61) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:385:21: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11911); 

                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11913);
                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_4("OBR_9.30", 150);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:21: ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt60=2;
                                                                                                                                                            int LA60_0 = input.LA(1);

                                                                                                                                                            if ( (LA60_0==DELIMITER1) ) {
                                                                                                                                                                alt60=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt60) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:22: DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11937); 

                                                                                                                                                                    pushFollow(FOLLOW_spec_const_9_31_in_line_obr2_11939);
                                                                                                                                                                    spec_const_9_31("OBR_9.31");

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:22: ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    int alt59=2;
                                                                                                                                                                    int LA59_0 = input.LA(1);

                                                                                                                                                                    if ( (LA59_0==DELIMITER1) ) {
                                                                                                                                                                        alt59=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt59) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:23: DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11986); 

                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11988);
                                                                                                                                                                            st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:70: ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )*
                                                                                                                                                                            loop52:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt52=2;
                                                                                                                                                                                int LA52_0 = input.LA(1);

                                                                                                                                                                                if ( (LA52_0==REPETITEUR) ) {
                                                                                                                                                                                    alt52=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt52) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:71: REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11992); 

                                                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11994);
                                                                                                                                                                            	    st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            	    state._fsp--;


                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop52;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:389:23: ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            int alt58=2;
                                                                                                                                                                            int LA58_0 = input.LA(1);

                                                                                                                                                                            if ( (LA58_0==DELIMITER1) ) {
                                                                                                                                                                                alt58=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt58) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:389:24: DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12022); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12024);
                                                                                                                                                                                    spec_sized_cna("OBR_9.33", 60);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:390:24: ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    int alt57=2;
                                                                                                                                                                                    int LA57_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA57_0==DELIMITER1) ) {
                                                                                                                                                                                        alt57=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt57) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:390:25: DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12051); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12053);
                                                                                                                                                                                            spec_sized_cna("OBR_9.34", 60);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:391:25: ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            int alt56=2;
                                                                                                                                                                                            int LA56_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA56_0==DELIMITER1) ) {
                                                                                                                                                                                                alt56=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt56) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:391:26: DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12081); 

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12083);
                                                                                                                                                                                                    spec_sized_cna("OBR_9.35", 60);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:392:26: ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    int alt55=2;
                                                                                                                                                                                                    int LA55_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA55_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt55=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt55) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:392:27: DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12112); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12114);
                                                                                                                                                                                                            spec_sized_cna("OBR_9.36", 60);

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:393:27: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            int alt54=2;
                                                                                                                                                                                                            int LA54_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA54_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt54=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt54) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:393:28: DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12144); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_12146);
                                                                                                                                                                                                                    ts_sized_optionnal("OBR_9.37", 26);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:29: ( DELIMITER1 )?
                                                                                                                                                                                                                    int alt53=2;
                                                                                                                                                                                                                    int LA53_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA53_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt53=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt53) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:29: DELIMITER1
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12177); 

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:396:1: line_obx2_1 : CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) ;
    public final void line_obx2_1() throws RecognitionException {
        startElement("ligne", "OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:398:22: ( CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:3: CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2_12245); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obx2_12247); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obx2_12249); 

            match(input,CHARX,FOLLOW_CHARX_in_line_obx2_12251); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12255); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12257);
            nm_integer_sized_mandatory("OBX_10.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12262); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:5: ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            int alt114=7;
            switch ( input.LA(1) ) {
            case CHARN:
                {
                alt114=1;
                }
                break;
            case CHARC:
                {
                int LA114_2 = input.LA(2);

                if ( (LA114_2==CHARE) ) {
                    alt114=2;
                }
                else if ( (LA114_2==CHARK||LA114_2==CHARN) ) {
                    alt114=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARF:
                {
                alt114=3;
                }
                break;
            case CHARS:
                {
                alt114=4;
                }
                break;
            case CHARG:
                {
                int LA114_5 = input.LA(2);

                if ( (LA114_5==CHARC) ) {
                    alt114=5;
                }
                else if ( (LA114_5==CHARB||LA114_5==CHARN) ) {
                    alt114=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 5, input);

                    throw nvae;

                }
                }
                break;
            case CHART:
                {
                int LA114_6 = input.LA(2);

                if ( (LA114_6==CHARX) ) {
                    alt114=6;
                }
                else if ( (LA114_6==CHARN) ) {
                    alt114=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARA:
            case CHARD:
            case CHARP:
                {
                alt114=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:7: spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_nm_in_line_obx2_12270);
                    spec_const_10_3_nm("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:403:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==DELIMITER1) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:403:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12279); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12281);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==DELIMITER1) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12291); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12293);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt81=2;
                                    int LA81_0 = input.LA(1);

                                    if ( (LA81_0==DELIMITER1) ) {
                                        alt81=1;
                                    }
                                    switch (alt81) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12304); 

                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12306);
                                            nm_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:58: ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop79:
                                            do {
                                                int alt79=2;
                                                int LA79_0 = input.LA(1);

                                                if ( (LA79_0==REPETITEUR) ) {
                                                    alt79=1;
                                                }


                                                switch (alt79) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:59: REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12310); 

                                            	    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12312);
                                            	    nm_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop79;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:406:9: ( line_obx2_1_post10_6 )?
                                            int alt80=2;
                                            int LA80_0 = input.LA(1);

                                            if ( (LA80_0==DELIMITER1) ) {
                                                alt80=1;
                                            }
                                            switch (alt80) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:406:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12325);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:407:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:407:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:407:8: spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_ce_in_line_obx2_12342);
                    spec_const_10_3_ce("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:408:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==DELIMITER1) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:408:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12351); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12353);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==DELIMITER1) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12363); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12365);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt86=2;
                                    int LA86_0 = input.LA(1);

                                    if ( (LA86_0==DELIMITER1) ) {
                                        alt86=1;
                                    }
                                    switch (alt86) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12376); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12378);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop84:
                                            do {
                                                int alt84=2;
                                                int LA84_0 = input.LA(1);

                                                if ( (LA84_0==REPETITEUR) ) {
                                                    alt84=1;
                                                }


                                                switch (alt84) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12382); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12384);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop84;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:9: ( line_obx2_1_post10_6 )?
                                            int alt85=2;
                                            int LA85_0 = input.LA(1);

                                            if ( (LA85_0==DELIMITER1) ) {
                                                alt85=1;
                                            }
                                            switch (alt85) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12397);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:8: spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_fic_in_line_obx2_12414);
                    spec_const_10_3_fic("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:413:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DELIMITER1) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:413:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12423); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12425);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:414:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==DELIMITER1) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:414:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12435); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12437);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt91=2;
                                    int LA91_0 = input.LA(1);

                                    if ( (LA91_0==DELIMITER1) ) {
                                        alt91=1;
                                    }
                                    switch (alt91) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12448); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12450);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop89:
                                            do {
                                                int alt89=2;
                                                int LA89_0 = input.LA(1);

                                                if ( (LA89_0==REPETITEUR) ) {
                                                    alt89=1;
                                                }


                                                switch (alt89) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12454); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12456);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop89;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:416:9: ( line_obx2_1_post10_6 )?
                                            int alt90=2;
                                            int LA90_0 = input.LA(1);

                                            if ( (LA90_0==DELIMITER1) ) {
                                                alt90=1;
                                            }
                                            switch (alt90) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:416:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12469);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:8: spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_st_in_line_obx2_12486);
                    spec_const_10_3_st("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:418:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DELIMITER1) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:418:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12495); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12497);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:419:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==DELIMITER1) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:419:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12507); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12509);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt96=2;
                                    int LA96_0 = input.LA(1);

                                    if ( (LA96_0==DELIMITER1) ) {
                                        alt96=1;
                                    }
                                    switch (alt96) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12520); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12522);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop94:
                                            do {
                                                int alt94=2;
                                                int LA94_0 = input.LA(1);

                                                if ( (LA94_0==REPETITEUR) ) {
                                                    alt94=1;
                                                }


                                                switch (alt94) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12526); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12528);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop94;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:9: ( line_obx2_1_post10_6 )?
                                            int alt95=2;
                                            int LA95_0 = input.LA(1);

                                            if ( (LA95_0==DELIMITER1) ) {
                                                alt95=1;
                                            }
                                            switch (alt95) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12541);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:8: spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_gc_in_line_obx2_12558);
                    spec_const_10_3_gc("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==DELIMITER1) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12567); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12569);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt102=2;
                            int LA102_0 = input.LA(1);

                            if ( (LA102_0==DELIMITER1) ) {
                                alt102=1;
                            }
                            switch (alt102) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12579); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12581);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:8: ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt101=2;
                                    int LA101_0 = input.LA(1);

                                    if ( (LA101_0==DELIMITER1) ) {
                                        alt101=1;
                                    }
                                    switch (alt101) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:9: DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12592); 

                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12594);
                                            spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:75: ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )*
                                            loop99:
                                            do {
                                                int alt99=2;
                                                int LA99_0 = input.LA(1);

                                                if ( (LA99_0==REPETITEUR) ) {
                                                    alt99=1;
                                                }


                                                switch (alt99) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:76: REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12598); 

                                            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12600);
                                            	    spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop99;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:426:9: ( line_obx2_1_post10_6 )?
                                            int alt100=2;
                                            int LA100_0 = input.LA(1);

                                            if ( (LA100_0==DELIMITER1) ) {
                                                alt100=1;
                                            }
                                            switch (alt100) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:426:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12613);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:8: spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_tx_in_line_obx2_12630);
                    spec_const_10_3_tx("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==DELIMITER1) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12639); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12641);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:429:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==DELIMITER1) ) {
                                alt107=1;
                            }
                            switch (alt107) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:429:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12651); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12653);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt106=2;
                                    int LA106_0 = input.LA(1);

                                    if ( (LA106_0==DELIMITER1) ) {
                                        alt106=1;
                                    }
                                    switch (alt106) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12664); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12666);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop104:
                                            do {
                                                int alt104=2;
                                                int LA104_0 = input.LA(1);

                                                if ( (LA104_0==REPETITEUR) ) {
                                                    alt104=1;
                                                }


                                                switch (alt104) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12670); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12672);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop104;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:431:9: ( line_obx2_1_post10_6 )?
                                            int alt105=2;
                                            int LA105_0 = input.LA(1);

                                            if ( (LA105_0==DELIMITER1) ) {
                                                alt105=1;
                                            }
                                            switch (alt105) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:431:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12685);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:8: spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_std_in_line_obx2_12702);
                    spec_const_10_3_std("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==DELIMITER1) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12711); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12713);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt112=2;
                            int LA112_0 = input.LA(1);

                            if ( (LA112_0==DELIMITER1) ) {
                                alt112=1;
                            }
                            switch (alt112) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12723); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12725);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:8: ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt111=2;
                                    int LA111_0 = input.LA(1);

                                    if ( (LA111_0==DELIMITER1) ) {
                                        alt111=1;
                                    }
                                    switch (alt111) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:9: DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12736); 

                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12738);
                                            st_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:58: ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop109:
                                            do {
                                                int alt109=2;
                                                int LA109_0 = input.LA(1);

                                                if ( (LA109_0==REPETITEUR) ) {
                                                    alt109=1;
                                                }


                                                switch (alt109) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:59: REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12742); 

                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12744);
                                            	    st_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop109;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:436:9: ( line_obx2_1_post10_6 )?
                                            int alt110=2;
                                            int LA110_0 = input.LA(1);

                                            if ( (LA110_0==DELIMITER1) ) {
                                                alt110=1;
                                            }
                                            switch (alt110) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:436:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12757);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:1: line_obx2_1_post10_6 : ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) ;
    public final void line_obx2_1_post10_6() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:21: ( ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:6: DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62778); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62780);
            st_sized_optionnal("OBX_10.7", 20);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:6: ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==DELIMITER1) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:7: DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62789); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62791);
                    st_sized_optionnal("OBX_10.8", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:53: ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==REPETITEUR) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:54: REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60]
                    	    {
                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62795); 

                    	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62797);
                    	    st_sized_optionnal("OBX_10.8", 60);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:7: ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==DELIMITER1) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:8: DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62809); 

                            pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62811);
                            spec_const_10_9("OBX_10.9");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:47: ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )*
                            loop116:
                            do {
                                int alt116=2;
                                int LA116_0 = input.LA(1);

                                if ( (LA116_0==REPETITEUR) ) {
                                    alt116=1;
                                }


                                switch (alt116) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:48: REPETITEUR spec_const_10_9[\"OBX_10.9\"]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62815); 

                            	    pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62817);
                            	    spec_const_10_9("OBX_10.9");

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop116;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            int alt126=2;
                            int LA126_0 = input.LA(1);

                            if ( (LA126_0==DELIMITER1) ) {
                                alt126=1;
                            }
                            switch (alt126) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62830); 

                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62832);
                                    nm_sized_optionnal("OBX_10.10", 5);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:9: ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    int alt125=2;
                                    int LA125_0 = input.LA(1);

                                    if ( (LA125_0==DELIMITER1) ) {
                                        alt125=1;
                                    }
                                    switch (alt125) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:10: DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62844); 

                                            pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62846);
                                            spec_const_10_11("OBX_10.11");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:51: ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )*
                                            loop117:
                                            do {
                                                int alt117=2;
                                                int LA117_0 = input.LA(1);

                                                if ( (LA117_0==REPETITEUR) ) {
                                                    alt117=1;
                                                }


                                                switch (alt117) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:52: REPETITEUR spec_const_10_11[\"OBX_10.11\"]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62850); 

                                            	    pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62852);
                                            	    spec_const_10_11("OBX_10.11");

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop117;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:444:10: ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            int alt124=2;
                                            int LA124_0 = input.LA(1);

                                            if ( (LA124_0==DELIMITER1) ) {
                                                alt124=1;
                                            }
                                            switch (alt124) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:444:11: DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62867); 

                                                    pushFollow(FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62869);
                                                    spec_const_10_12("OBX_10.12");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:11: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    int alt123=2;
                                                    int LA123_0 = input.LA(1);

                                                    if ( (LA123_0==DELIMITER1) ) {
                                                        alt123=1;
                                                    }
                                                    switch (alt123) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:12: DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62884); 

                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62886);
                                                            ts_sized_optionnal("OBX_10.13", 26);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:12: ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            int alt122=2;
                                                            int LA122_0 = input.LA(1);

                                                            if ( (LA122_0==DELIMITER1) ) {
                                                                alt122=1;
                                                            }
                                                            switch (alt122) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:13: DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62902); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62904);
                                                                    st_sized_optionnal("OBX_10.14", 20);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:13: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    int alt121=2;
                                                                    int LA121_0 = input.LA(1);

                                                                    if ( (LA121_0==DELIMITER1) ) {
                                                                        alt121=1;
                                                                    }
                                                                    switch (alt121) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:14: DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62920); 

                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62922);
                                                                            ts_sized_optionnal("OBX_10.15", 26);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:14: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            int alt120=2;
                                                                            int LA120_0 = input.LA(1);

                                                                            if ( (LA120_0==DELIMITER1) ) {
                                                                                alt120=1;
                                                                            }
                                                                            switch (alt120) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:15: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62939); 

                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62941);
                                                                                    spec_sized_mult_lvl1_st_optionnal_6("OBX_10.16", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:15: ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    int alt119=2;
                                                                                    int LA119_0 = input.LA(1);

                                                                                    if ( (LA119_0==DELIMITER1) ) {
                                                                                        alt119=1;
                                                                                    }
                                                                                    switch (alt119) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:16: DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62959); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62961);
                                                                                            st_sized_optionnal("OBX_10.17", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:63: ( DELIMITER1 )?
                                                                                            int alt118=2;
                                                                                            int LA118_0 = input.LA(1);

                                                                                            if ( (LA118_0==DELIMITER1) ) {
                                                                                                alt118=1;
                                                                                            }
                                                                                            switch (alt118) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:63: DELIMITER1
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62964); 

                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:1: line_c2_1 : CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? ;
    public final void line_c2_1() throws RecognitionException {
        startElement("ligne", "C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:22: ( CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:454:3: CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )?
            {
            match(input,CR,FOLLOW_CR_in_line_c2_13003); 

            match(input,CHARC,FOLLOW_CHARC_in_line_c2_13005); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13009); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_c2_13011);
            nm_integer_sized_mandatory("C_12.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13016); 

            pushFollow(FOLLOW_spec_const_12_3_in_line_c2_13018);
            spec_const_12_3("C_12.3");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13023); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13025);
            st_sized_optionnal("C_12.4", 64000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:50: ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==REPETITEUR) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:51: REPETITEUR st_sized_optionnal[\"C_12.4\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c2_13029); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13031);
            	    st_sized_optionnal("C_12.4", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:3: ( DELIMITER1 )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==DELIMITER1) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13040); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:460:1: line_l2_1 : CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? ;
    public final void line_l2_1() throws RecognitionException {
        startElement("ligne", "L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:462:22: ( CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:3: CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l2_13058); 

            match(input,CHARL,FOLLOW_CHARL_in_line_l2_13060); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:464:3: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==DELIMITER1) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:464:4: DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13065); 

                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13067);
                    nm_integer_sized_optionnal("L_14.2", 1);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:465:4: ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==DELIMITER1) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:465:5: DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13074); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:5: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            int alt134=2;
                            int LA134_0 = input.LA(1);

                            if ( (LA134_0==DELIMITER1) ) {
                                alt134=1;
                            }
                            switch (alt134) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:6: DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13081); 

                                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13083);
                                    nm_integer_sized_optionnal("L_14.4", 4);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:6: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    int alt133=2;
                                    int LA133_0 = input.LA(1);

                                    if ( (LA133_0==DELIMITER1) ) {
                                        alt133=1;
                                    }
                                    switch (alt133) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:7: DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13092); 

                                            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13094);
                                            nm_integer_sized_optionnal("L_14.5", 10);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:7: ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            int alt132=2;
                                            int LA132_0 = input.LA(1);

                                            if ( (LA132_0==DELIMITER1) ) {
                                                alt132=1;
                                            }
                                            switch (alt132) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:8: DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13104); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_l2_13106);
                                                    st_sized_optionnal("L_14.6", 12);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:52: ( DELIMITER1 )?
                                                    int alt131=2;
                                                    int LA131_0 = input.LA(1);

                                                    if ( (LA131_0==DELIMITER1) ) {
                                                        alt131=1;
                                                    }
                                                    switch (alt131) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:52: DELIMITER1
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13109); 

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:478:1: spec_const_sexe[String nameElement] : ( final_charM | final_charF | final_charU )? ;
    public final void spec_const_sexe(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:22: ( ( final_charM | final_charF | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:3: ( final_charM | final_charF | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:3: ( final_charM | final_charF | final_charU )?
            int alt137=4;
            switch ( input.LA(1) ) {
                case CHARM:
                    {
                    alt137=1;
                    }
                    break;
                case CHARF:
                    {
                    alt137=2;
                    }
                    break;
                case CHARU:
                    {
                    alt137=3;
                    }
                    break;
            }

            switch (alt137) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:4: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_sexe3147);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:18: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_sexe3151);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:32: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_sexe3155);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:1: spec_const_race[String nameElement] :;
    public final void spec_const_race(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:22: ()
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:3: 
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:488:1: spec_const_7_13_version_2_0[String nameElement] : spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_0(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:490:22: ( spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:3: spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03192);
            spec_const_7_13_1_version_2_0(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03195); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03197);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:493:1: spec_const_7_13_version_2_1[String nameElement] : spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_1(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:495:22: ( spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:496:3: spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13218);
            spec_const_7_13_1_version_2_1(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13221); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13223);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:1: spec_const_7_13_version_2_2[String nameElement] : spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_2(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:22: ( spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:501:3: spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23242);
            spec_const_7_13_1_version_2_2(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23245); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23247);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:503:1: spec_const_7_13_2[String nameElement] : ( final_charC | final_charL | final_charR );
    public final void spec_const_7_13_2(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:22: ( final_charC | final_charL | final_charR )
            int alt138=3;
            switch ( input.LA(1) ) {
            case CHARC:
                {
                alt138=1;
                }
                break;
            case CHARL:
                {
                alt138=2;
                }
                break;
            case CHARR:
                {
                alt138=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;

            }

            switch (alt138) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:3: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_7_13_23266);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:17: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_7_13_23270);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:31: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_7_13_23274);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:508:1: spec_const_7_7_contexte[String nameElement] : final_ORU ;
    public final void spec_const_7_7_contexte(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:22: ( final_ORU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:511:3: final_ORU
            {
            pushFollow(FOLLOW_final_ORU_in_spec_const_7_7_contexte3292);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:1: spec_const_7_12[String nameElement] : ( final_charP | final_charD | final_charT ) ;
    public final void spec_const_7_12(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:22: ( ( final_charP | final_charD | final_charT ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:3: ( final_charP | final_charD | final_charT )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:3: ( final_charP | final_charD | final_charT )
            int alt139=3;
            switch ( input.LA(1) ) {
            case CHARP:
                {
                alt139=1;
                }
                break;
            case CHARD:
                {
                alt139=2;
                }
                break;
            case CHART:
                {
                alt139=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }

            switch (alt139) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_7_123311);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:18: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_7_123315);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:32: final_charT
                    {
                    pushFollow(FOLLOW_final_charT_in_spec_const_7_123319);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:518:1: spec_const_9_31[String nameElement] : ( final_PORT | final_CART | final_WHLC | final_WALK )? ;
    public final void spec_const_9_31(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:22: ( ( final_PORT | final_CART | final_WHLC | final_WALK )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            int alt140=5;
            switch ( input.LA(1) ) {
                case CHARP:
                    {
                    alt140=1;
                    }
                    break;
                case CHARC:
                    {
                    alt140=2;
                    }
                    break;
                case CHARW:
                    {
                    int LA140_3 = input.LA(2);

                    if ( (LA140_3==CHARH) ) {
                        alt140=3;
                    }
                    else if ( (LA140_3==CHARA) ) {
                        alt140=4;
                    }
                    }
                    break;
            }

            switch (alt140) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:4: final_PORT
                    {
                    pushFollow(FOLLOW_final_PORT_in_spec_const_9_313339);
                    final_PORT();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:17: final_CART
                    {
                    pushFollow(FOLLOW_final_CART_in_spec_const_9_313343);
                    final_CART();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:30: final_WHLC
                    {
                    pushFollow(FOLLOW_final_WHLC_in_spec_const_9_313347);
                    final_WHLC();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:43: final_WALK
                    {
                    pushFollow(FOLLOW_final_WALK_in_spec_const_9_313351);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:1: spec_const_8_25[String nameElement] : ( final_OP | final_IP | final_ER | final_PA | final_MP )? ;
    public final void spec_const_8_25(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:22: ( ( final_OP | final_IP | final_ER | final_PA | final_MP )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            int alt141=6;
            switch ( input.LA(1) ) {
                case CHARO:
                    {
                    alt141=1;
                    }
                    break;
                case CHARI:
                    {
                    alt141=2;
                    }
                    break;
                case CHARE:
                    {
                    alt141=3;
                    }
                    break;
                case CHARP:
                    {
                    alt141=4;
                    }
                    break;
                case CHARM:
                    {
                    alt141=5;
                    }
                    break;
            }

            switch (alt141) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:4: final_OP
                    {
                    pushFollow(FOLLOW_final_OP_in_spec_const_8_253372);
                    final_OP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:15: final_IP
                    {
                    pushFollow(FOLLOW_final_IP_in_spec_const_8_253376);
                    final_IP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:26: final_ER
                    {
                    pushFollow(FOLLOW_final_ER_in_spec_const_8_253380);
                    final_ER();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:37: final_PA
                    {
                    pushFollow(FOLLOW_final_PA_in_spec_const_8_253384);
                    final_PA();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:48: final_MP
                    {
                    pushFollow(FOLLOW_final_MP_in_spec_const_8_253388);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:1: spec_const_9_26[String nameElement] : ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? ;
    public final void spec_const_9_26(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:22: ( ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            int alt142=10;
            switch ( input.LA(1) ) {
                case CHARF:
                    {
                    alt142=1;
                    }
                    break;
                case CHARP:
                    {
                    alt142=2;
                    }
                    break;
                case CHARM:
                    {
                    alt142=3;
                    }
                    break;
                case CHARI:
                    {
                    alt142=4;
                    }
                    break;
                case CHARR:
                    {
                    alt142=5;
                    }
                    break;
                case CHARC:
                    {
                    alt142=6;
                    }
                    break;
                case CHARO:
                    {
                    alt142=7;
                    }
                    break;
                case CHARD:
                    {
                    alt142=8;
                    }
                    break;
                case CHARX:
                    {
                    alt142=9;
                    }
                    break;
            }

            switch (alt142) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:4: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_9_263409);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_9_263413);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:32: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_9_263417);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:46: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_9_263421);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:60: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_9_263425);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:74: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_9_263429);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:88: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_const_9_263433);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:3: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_9_263439);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:17: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_9_263443);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:1: spec_const_10_3_nm[String nameElement] : CHARN CHARM ;
    public final HPRIMSParser.spec_const_10_3_nm_return spec_const_10_3_nm(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_nm_return retval = new HPRIMSParser.spec_const_10_3_nm_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:22: ( CHARN CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:537:3: CHARN CHARM
            {
            match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_nm3464); 

            match(input,CHARM,FOLLOW_CHARM_in_spec_const_10_3_nm3466); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:1: spec_const_10_3_ce[String nameElement] : CHARC CHARE ;
    public final HPRIMSParser.spec_const_10_3_ce_return spec_const_10_3_ce(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_ce_return retval = new HPRIMSParser.spec_const_10_3_ce_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:541:22: ( CHARC CHARE )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:542:3: CHARC CHARE
            {
            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_ce3487); 

            match(input,CHARE,FOLLOW_CHARE_in_spec_const_10_3_ce3489); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:1: spec_const_10_3_st[String nameElement] : CHARS CHART ;
    public final HPRIMSParser.spec_const_10_3_st_return spec_const_10_3_st(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_st_return retval = new HPRIMSParser.spec_const_10_3_st_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:546:22: ( CHARS CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:3: CHARS CHART
            {
            match(input,CHARS,FOLLOW_CHARS_in_spec_const_10_3_st3510); 

            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_st3512); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:1: spec_const_10_3_gc[String nameElement] : CHARG CHARC ;
    public final HPRIMSParser.spec_const_10_3_gc_return spec_const_10_3_gc(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_gc_return retval = new HPRIMSParser.spec_const_10_3_gc_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:551:22: ( CHARG CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:552:3: CHARG CHARC
            {
            match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_gc3533); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_gc3535); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:554:1: spec_const_10_3_tx[String nameElement] : CHART CHARX ;
    public final HPRIMSParser.spec_const_10_3_tx_return spec_const_10_3_tx(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_tx_return retval = new HPRIMSParser.spec_const_10_3_tx_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:556:22: ( CHART CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:3: CHART CHARX
            {
            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_tx3557); 

            match(input,CHARX,FOLLOW_CHARX_in_spec_const_10_3_tx3559); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:1: spec_const_10_3_fic[String nameElement] : ( CHARF CHARI CHARC ) ;
    public final HPRIMSParser.spec_const_10_3_fic_return spec_const_10_3_fic(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_fic_return retval = new HPRIMSParser.spec_const_10_3_fic_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:22: ( ( CHARF CHARI CHARC ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:3: ( CHARF CHARI CHARC )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:3: ( CHARF CHARI CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:4: CHARF CHARI CHARC
            {
            match(input,CHARF,FOLLOW_CHARF_in_spec_const_10_3_fic3580); 

            match(input,CHARI,FOLLOW_CHARI_in_spec_const_10_3_fic3582); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_fic3584); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:1: spec_const_10_3_std[String nameElement] : ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) );
    public final HPRIMSParser.spec_const_10_3_std_return spec_const_10_3_std(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_std_return retval = new HPRIMSParser.spec_const_10_3_std_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:566:22: ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) )
            int alt143=8;
            switch ( input.LA(1) ) {
            case CHARA:
                {
                alt143=1;
                }
                break;
            case CHARC:
                {
                int LA143_2 = input.LA(2);

                if ( (LA143_2==CHARK) ) {
                    alt143=2;
                }
                else if ( (LA143_2==CHARN) ) {
                    alt143=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARD:
                {
                alt143=4;
                }
                break;
            case CHARP:
                {
                alt143=5;
                }
                break;
            case CHART:
                {
                alt143=6;
                }
                break;
            case CHARG:
                {
                int LA143_6 = input.LA(2);

                if ( (LA143_6==CHARB) ) {
                    alt143=7;
                }
                else if ( (LA143_6==CHARN) ) {
                    alt143=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }

            switch (alt143) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:3: ( CHARA CHARD )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:3: ( CHARA CHARD )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:4: CHARA CHARD
                    {
                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3606); 

                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3608); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:19: ( CHARC CHARK )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:19: ( CHARC CHARK )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:20: CHARC CHARK
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3614); 

                    match(input,CHARK,FOLLOW_CHARK_in_spec_const_10_3_std3616); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:35: ( CHARC CHARN CHARA )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:35: ( CHARC CHARN CHARA )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:36: CHARC CHARN CHARA
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3622); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3624); 

                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3626); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:57: ( CHARD CHART )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:57: ( CHARD CHART )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:58: CHARD CHART
                    {
                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3632); 

                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3634); 

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:3: ( CHARP CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:3: ( CHARP CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:4: CHARP CHARN
                    {
                    match(input,CHARP,FOLLOW_CHARP_in_spec_const_10_3_std3642); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3644); 

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:19: ( CHART CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:19: ( CHART CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:20: CHART CHARN
                    {
                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3650); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3652); 

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:3: ( CHARG CHARB )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:3: ( CHARG CHARB )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:4: CHARG CHARB
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3660); 

                    match(input,CHARB,FOLLOW_CHARB_in_spec_const_10_3_std3662); 

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:19: ( CHARG CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:19: ( CHARG CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:20: CHARG CHARN
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3668); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3670); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:573:1: spec_sized_10_6[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? ;
    public final HPRIMSParser.spec_sized_10_6_return spec_sized_10_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_6_return retval = new HPRIMSParser.spec_sized_10_6_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:575:22: ( st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:576:3: st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63693);
            st_sized_optionnal(nameElement + ".1", 10);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:577:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==DELIMITER2) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:577:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63699); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63701);
                    st_sized_optionnal(nameElement + ".2", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:4: ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==DELIMITER2) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:5: DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63708); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63710);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:1: spec_const_10_9[String nameElement] : ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? ;
    public final void spec_const_10_9(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:583:22: ( ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            int alt146=20;
            switch ( input.LA(1) ) {
                case CHARL:
                    {
                    int LA146_1 = input.LA(2);

                    if ( (LA146_1==CHARL) ) {
                        alt146=3;
                    }
                    else if ( ((LA146_1 >= CR && LA146_1 <= DELIMITER1)||LA146_1==REPETITEUR) ) {
                        alt146=1;
                    }
                    }
                    break;
                case CHARH:
                    {
                    int LA146_2 = input.LA(2);

                    if ( (LA146_2==CHARH) ) {
                        alt146=4;
                    }
                    else if ( ((LA146_2 >= CR && LA146_2 <= DELIMITER1)||LA146_2==REPETITEUR) ) {
                        alt146=2;
                    }
                    }
                    break;
                case CHAR_SYMBOL_INF:
                    {
                    alt146=5;
                    }
                    break;
                case CHAR_SYMBOL_SUP:
                    {
                    alt146=6;
                    }
                    break;
                case CHARN:
                    {
                    int LA146_5 = input.LA(2);

                    if ( (LA146_5==CHARu) ) {
                        alt146=10;
                    }
                    else if ( ((LA146_5 >= CR && LA146_5 <= DELIMITER1)||LA146_5==REPETITEUR) ) {
                        alt146=7;
                    }
                    }
                    break;
                case CHARA:
                    {
                    int LA146_6 = input.LA(2);

                    if ( (LA146_6==CHARA) ) {
                        alt146=9;
                    }
                    else if ( ((LA146_6 >= CR && LA146_6 <= DELIMITER1)||LA146_6==REPETITEUR) ) {
                        alt146=8;
                    }
                    }
                    break;
                case CHARU:
                    {
                    alt146=11;
                    }
                    break;
                case CHARD:
                    {
                    alt146=12;
                    }
                    break;
                case CHARB:
                    {
                    alt146=13;
                    }
                    break;
                case CHARW:
                    {
                    alt146=14;
                    }
                    break;
                case CHARR:
                    {
                    alt146=15;
                    }
                    break;
                case CHARI:
                    {
                    alt146=16;
                    }
                    break;
                case CHARS:
                    {
                    alt146=17;
                    }
                    break;
                case CHARM:
                    {
                    alt146=18;
                    }
                    break;
                case CHARV:
                    {
                    alt146=19;
                    }
                    break;
            }

            switch (alt146) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:4: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_10_93738);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:18: final_charH
                    {
                    pushFollow(FOLLOW_final_charH_in_spec_const_10_93742);
                    final_charH();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:32: final_LL
                    {
                    pushFollow(FOLLOW_final_LL_in_spec_const_10_93746);
                    final_LL();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:43: final_HH
                    {
                    pushFollow(FOLLOW_final_HH_in_spec_const_10_93750);
                    final_HH();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:54: final_symbol_inf
                    {
                    pushFollow(FOLLOW_final_symbol_inf_in_spec_const_10_93754);
                    final_symbol_inf();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:73: final_symbol_sup
                    {
                    pushFollow(FOLLOW_final_symbol_sup_in_spec_const_10_93758);
                    final_symbol_sup();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:3: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_93764);
                    final_charN();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:17: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_93768);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:31: final_AA
                    {
                    pushFollow(FOLLOW_final_AA_in_spec_const_10_93772);
                    final_AA();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:42: final_Null
                    {
                    pushFollow(FOLLOW_final_Null_in_spec_const_10_93776);
                    final_Null();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:55: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_93780);
                    final_charU();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:69: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_93784);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:83: final_charB
                    {
                    pushFollow(FOLLOW_final_charB_in_spec_const_10_93788);
                    final_charB();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:3: final_charW
                    {
                    pushFollow(FOLLOW_final_charW_in_spec_const_10_93794);
                    final_charW();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:17: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_93798);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:31: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_93802);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:45: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_93806);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:59: final_MS
                    {
                    pushFollow(FOLLOW_final_MS_in_spec_const_10_93810);
                    final_MS();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:70: final_VS
                    {
                    pushFollow(FOLLOW_final_VS_in_spec_const_10_93814);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:588:1: spec_const_10_11[String nameElement] : ( final_charA | final_charS | final_charR | final_charN )? ;
    public final void spec_const_10_11(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:590:22: ( ( final_charA | final_charS | final_charR | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:3: ( final_charA | final_charS | final_charR | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:3: ( final_charA | final_charS | final_charR | final_charN )?
            int alt147=5;
            switch ( input.LA(1) ) {
                case CHARA:
                    {
                    alt147=1;
                    }
                    break;
                case CHARS:
                    {
                    alt147=2;
                    }
                    break;
                case CHARR:
                    {
                    alt147=3;
                    }
                    break;
                case CHARN:
                    {
                    alt147=4;
                    }
                    break;
            }

            switch (alt147) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:4: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_113835);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:18: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_113839);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:32: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_113843);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:46: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_113847);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:593:1: spec_const_10_12[String nameElement] : ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? ;
    public final void spec_const_10_12(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:22: ( ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            int alt148=9;
            switch ( input.LA(1) ) {
                case CHARR:
                    {
                    alt148=1;
                    }
                    break;
                case CHARP:
                    {
                    alt148=2;
                    }
                    break;
                case CHARF:
                    {
                    alt148=3;
                    }
                    break;
                case CHARC:
                    {
                    alt148=4;
                    }
                    break;
                case CHARI:
                    {
                    alt148=5;
                    }
                    break;
                case CHARD:
                    {
                    alt148=6;
                    }
                    break;
                case CHARX:
                    {
                    alt148=7;
                    }
                    break;
                case CHARU:
                    {
                    alt148=8;
                    }
                    break;
            }

            switch (alt148) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:4: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_123868);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_10_123872);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:32: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_10_123876);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:46: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_10_123880);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:60: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_123884);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:74: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_123888);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:597:4: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_10_123895);
                    final_charX();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:597:18: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_123899);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:599:1: spec_const_12_3[String nameElement] : ( final_charP | final_charL )? ;
    public final void spec_const_12_3(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:601:22: ( ( final_charP | final_charL )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:3: ( final_charP | final_charL )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:3: ( final_charP | final_charL )?
            int alt149=3;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==CHARP) ) {
                alt149=1;
            }
            else if ( (LA149_0==CHARL) ) {
                alt149=2;
            }
            switch (alt149) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_12_33920);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:18: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_12_33924);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:1: spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return spec_sized_mult_lvl1_st_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:606:22: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:607:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23944);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23950); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23952);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:611:1: spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return spec_sized_mult_lvl1_st_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:613:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23975);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==DELIMITER2) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23981); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23983);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:619:1: spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return spec_sized_mult_lvl1_st_optionnal_4(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:621:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:622:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44008);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==DELIMITER2) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44014); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44016);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:624:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==DELIMITER2) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:624:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44023); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44025);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            int alt151=2;
                            int LA151_0 = input.LA(1);

                            if ( (LA151_0==DELIMITER2) ) {
                                alt151=1;
                            }
                            switch (alt151) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44033); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44035);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:629:1: spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return spec_sized_mult_lvl1_st_optionnal_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:632:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64064);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==DELIMITER2) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64071); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64073);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==DELIMITER2) ) {
                        alt157=1;
                    }
                    switch (alt157) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64081); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64083);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:635:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt156=2;
                            int LA156_0 = input.LA(1);

                            if ( (LA156_0==DELIMITER2) ) {
                                alt156=1;
                            }
                            switch (alt156) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:635:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64092); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64094);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt155=2;
                                    int LA155_0 = input.LA(1);

                                    if ( (LA155_0==DELIMITER2) ) {
                                        alt155=1;
                                    }
                                    switch (alt155) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64104); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64106);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt154=2;
                                            int LA154_0 = input.LA(1);

                                            if ( (LA154_0==DELIMITER2) ) {
                                                alt154=1;
                                            }
                                            switch (alt154) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64117); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64119);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:1: spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return spec_sized_mult_lvl1_st_optionnal_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:644:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84152);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:645:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==DELIMITER2) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:645:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84158); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84160);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:646:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==DELIMITER2) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:646:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84167); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84169);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            int alt163=2;
                            int LA163_0 = input.LA(1);

                            if ( (LA163_0==DELIMITER2) ) {
                                alt163=1;
                            }
                            switch (alt163) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84177); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84179);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:648:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    int alt162=2;
                                    int LA162_0 = input.LA(1);

                                    if ( (LA162_0==DELIMITER2) ) {
                                        alt162=1;
                                    }
                                    switch (alt162) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:648:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84188); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84190);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            int alt161=2;
                                            int LA161_0 = input.LA(1);

                                            if ( (LA161_0==DELIMITER2) ) {
                                                alt161=1;
                                            }
                                            switch (alt161) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84200); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84202);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:650:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    int alt160=2;
                                                    int LA160_0 = input.LA(1);

                                                    if ( (LA160_0==DELIMITER2) ) {
                                                        alt160=1;
                                                    }
                                                    switch (alt160) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:650:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            {
                                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84213); 

                                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84215);
                                                            st_non_sized_optionnal(nameElement + ".7");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:9: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            int alt159=2;
                                                            int LA159_0 = input.LA(1);

                                                            if ( (LA159_0==DELIMITER2) ) {
                                                                alt159=1;
                                                            }
                                                            switch (alt159) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:10: DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"]
                                                                    {
                                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84227); 

                                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84229);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:655:1: spec_sized_mult_lvl2_st_optionnal_3[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_3(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:657:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:658:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34266);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==DELIMITER3) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34272); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34274);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==DELIMITER3) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34281); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34283);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:662:1: spec_sized_mult_lvl2_st_optionnal_6[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_6(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:665:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64306);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==DELIMITER3) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64312); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64314);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==DELIMITER3) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64321); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64323);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:5: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt170=2;
                            int LA170_0 = input.LA(1);

                            if ( (LA170_0==DELIMITER3) ) {
                                alt170=1;
                            }
                            switch (alt170) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:6: DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64331); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64333);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:6: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt169=2;
                                    int LA169_0 = input.LA(1);

                                    if ( (LA169_0==DELIMITER3) ) {
                                        alt169=1;
                                    }
                                    switch (alt169) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:7: DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64342); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64344);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:7: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt168=2;
                                            int LA168_0 = input.LA(1);

                                            if ( (LA168_0==DELIMITER3) ) {
                                                alt168=1;
                                            }
                                            switch (alt168) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:8: DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64354); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64356);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:1: spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize] : nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return spec_sized_mult_lvl1_nm_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:674:22: ( nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:675:3: nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24385);
            nm_nonsized_optionnal(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24390); 

            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24392);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:1: spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return spec_sized_mult_lvl1_nm_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:681:22: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:682:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24417);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24422); 

            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24424);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:686:1: spec_sized_cna[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_cna_return spec_sized_cna(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_cna_return retval = new HPRIMSParser.spec_sized_cna_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:689:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4447);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:4: ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==DELIMITER2) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:5: DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4454); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4456);
                    spec_sized_mult_lvl2_st_optionnal_6(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==DELIMITER2) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4464); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4466);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:699:1: spec_sized_8_3[String nameElement, int maxSize] : ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_8_3_return spec_sized_8_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_8_3_return retval = new HPRIMSParser.spec_sized_8_3_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:22: ( ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:702:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:702:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( ((LA176_0 >= CHARA && LA176_0 <= CHIFFRE9)||(LA176_0 >= LETTRE && LA176_0 <= POINT)) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:702:4: st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    pushFollow(FOLLOW_st_sized_mandatory_in_spec_sized_8_34498);
                    st_sized_mandatory(nameElement + ".1", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:703:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==DELIMITER2) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:703:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34505); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34507);
                            st_non_sized_optionnal(nameElement + ".2");

                            state._fsp--;


                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34515); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34517);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:715:1: spec_sized_9_3[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? ;
    public final HPRIMSParser.spec_sized_9_3_return spec_sized_9_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_3_return retval = new HPRIMSParser.spec_sized_9_3_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:717:22: ( st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:719:3: st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34557);
            st_sized_optionnal(nameElement + ".1", 12);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:720:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==DELIMITER2) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:720:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_34563); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34565);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:723:1: spec_non_sized_9_8[String nameElement] : ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? ;
    public final void spec_non_sized_9_8(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:22: ( ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:726:3: ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            {
            pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84590);
            ts_sized_optionnal(nameElement + ".1", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:727:4: ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==REPETITEUR) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:727:5: REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_non_sized_9_84597); 

                    pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84599);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:729:1: spec_sized_9_16[String nameElement, int maxSize] : spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_9_16_return spec_sized_9_16(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_16_return retval = new HPRIMSParser.spec_sized_9_16_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:22: ( spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:732:3: spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164620);
            spec_sized_mult_lvl2_st_optionnal_3(nameElement + ".2");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:733:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==DELIMITER2) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:733:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164626); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164628);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==DELIMITER2) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164635); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164637);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:737:1: spec_sized_10_4[String my_NameElement, int my_maxsize] : st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_10_4_return spec_sized_10_4(String my_NameElement, int my_maxsize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_4_return retval = new HPRIMSParser.spec_sized_10_4_return();
        retval.start = input.LT(1);


        startElement("champ", my_NameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:739:22: ( st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:740:3: st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44664);
            st_nonsized_mandatory(my_NameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:741:3: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==DELIMITER2) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:741:4: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44670); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44672);
                    st_non_sized_optionnal(my_NameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:742:4: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    int alt184=2;
                    int LA184_0 = input.LA(1);

                    if ( (LA184_0==DELIMITER2) ) {
                        alt184=1;
                    }
                    switch (alt184) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:742:5: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44679); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44681);
                            st_non_sized_optionnal(my_NameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:743:5: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            int alt183=2;
                            int LA183_0 = input.LA(1);

                            if ( (LA183_0==DELIMITER2) ) {
                                alt183=1;
                            }
                            switch (alt183) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:743:6: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44689); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44691);
                                    st_non_sized_optionnal(my_NameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:744:6: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    int alt182=2;
                                    int LA182_0 = input.LA(1);

                                    if ( (LA182_0==DELIMITER2) ) {
                                        alt182=1;
                                    }
                                    switch (alt182) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:744:7: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44700); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44702);
                                            st_non_sized_optionnal(my_NameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:7: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            int alt181=2;
                                            int LA181_0 = input.LA(1);

                                            if ( (LA181_0==DELIMITER2) ) {
                                                alt181=1;
                                            }
                                            switch (alt181) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:8: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44712); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44714);
                                                    st_non_sized_optionnal(my_NameElement + ".6");

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


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + my_maxsize + "}$", retval.start);

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:748:1: spec_sized_10_6_tx[String nameElement, int maxSize] : (g= final_spec_10_6_tx )? ;
    public final void spec_sized_10_6_tx(String nameElement, int maxSize) throws RecognitionException {
        String g =null;



          ParserRuleReturnScope retval = new ParserRuleReturnScope();
          retval.start = input.LT(1);
          startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:753:22: ( (g= final_spec_10_6_tx )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:3: (g= final_spec_10_6_tx )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:4: (g= final_spec_10_6_tx )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( ((LA186_0 >= CHARA && LA186_0 <= CHIFFRE9)||LA186_0==DELIMITER2||(LA186_0 >= LETTRE && LA186_0 <= POINT)) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:4: g= final_spec_10_6_tx
                    {
                    pushFollow(FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4749);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:1: spec_sized_tn[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_tn_return spec_sized_tn(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_tn_return retval = new HPRIMSParser.spec_sized_tn_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:760:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:761:2: st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4771);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:3: ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==REPETITEUR) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:4: REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_sized_tn4777); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4779);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:1: st_sized_optionnal[String nameElement, int maxSize] : ( final_st )? ;
    public final HPRIMSParser.st_sized_optionnal_return st_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_optionnal_return retval = new HPRIMSParser.st_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:770:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:3: ( final_st )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( ((LA188_0 >= CHARA && LA188_0 <= CHIFFRE9)||(LA188_0 >= LETTRE && LA188_0 <= POINT)) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_sized_optionnal4807);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:1: st_sized_mandatory[String nameElement, int maxSize] : final_st ;
    public final HPRIMSParser.st_sized_mandatory_return st_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_mandatory_return retval = new HPRIMSParser.st_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:777:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:778:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_sized_mandatory4830);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:781:1: st_non_sized_optionnal[String nameElement] : ( final_st )? ;
    public final void st_non_sized_optionnal(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:783:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:3: ( final_st )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( ((LA189_0 >= CHARA && LA189_0 <= CHIFFRE9)||(LA189_0 >= LETTRE && LA189_0 <= POINT)) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_non_sized_optionnal4852);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:1: st_nonsized_mandatory[String nameElement] : final_st ;
    public final void st_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:788:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_nonsized_mandatory4871);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:791:1: nm_sized_optionnal[String nameElement, int maxSize] : ( final_nm )? ;
    public final HPRIMSParser.nm_sized_optionnal_return nm_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_sized_optionnal_return retval = new HPRIMSParser.nm_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:3: ( final_nm )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( ((LA190_0 >= CHIFFRE0 && LA190_0 <= CHIFFRE9)||(LA190_0 >= MOINS && LA190_0 <= POINT)) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_sized_optionnal4889);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:1: nm_integer_sized_optionnal[String nameElement, int maxSize] : ( final_nm_integer )? ;
    public final HPRIMSParser.nm_integer_sized_optionnal_return nm_integer_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_optionnal_return retval = new HPRIMSParser.nm_integer_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:22: ( ( final_nm_integer )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:3: ( final_nm_integer )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:3: ( final_nm_integer )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( ((LA191_0 >= CHIFFRE0 && LA191_0 <= CHIFFRE9)) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:3: final_nm_integer
                    {
                    pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4912);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:1: nm_integer_sized_mandatory[String nameElement, int maxSize] : final_nm_integer ;
    public final HPRIMSParser.nm_integer_sized_mandatory_return nm_integer_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_mandatory_return retval = new HPRIMSParser.nm_integer_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:22: ( final_nm_integer )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:808:3: final_nm_integer
            {
            pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4940);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:1: ts_sized_optionnal[String nameElement, int maxSize] : ( final_ts )? ;
    public final HPRIMSParser.ts_sized_optionnal_return ts_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_optionnal_return retval = new HPRIMSParser.ts_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:22: ( ( final_ts )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:3: ( final_ts )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:3: ( final_ts )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( ((LA192_0 >= CHIFFRE0 && LA192_0 <= CHIFFRE9)) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:3: final_ts
                    {
                    pushFollow(FOLLOW_final_ts_in_ts_sized_optionnal4963);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:819:1: ts_sized_mandatory[String nameElement, int maxSize] : final_ts ;
    public final HPRIMSParser.ts_sized_mandatory_return ts_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_mandatory_return retval = new HPRIMSParser.ts_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:821:22: ( final_ts )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:3: final_ts
            {
            pushFollow(FOLLOW_final_ts_in_ts_sized_mandatory4986);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:1: nm_nonsized_mandatory[String nameElement] : final_nm ;
    public final void nm_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:22: ( final_nm )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:3: final_nm
            {
            pushFollow(FOLLOW_final_nm_in_nm_nonsized_mandatory5008);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:1: nm_nonsized_optionnal[String nameElement] : ( final_nm )? ;
    public final void nm_nonsized_optionnal(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:3: ( final_nm )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( ((LA193_0 >= CHIFFRE0 && LA193_0 <= CHIFFRE9)||(LA193_0 >= MOINS && LA193_0 <= POINT)) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_nonsized_optionnal5026);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:835:1: spec_const_7_13_1_version_2_0[String nameElement] : final_version_2_0 ;
    public final void spec_const_7_13_1_version_2_0(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:837:22: ( final_version_2_0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:838:3: final_version_2_0
            {
            pushFollow(FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05045);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:840:1: spec_const_7_13_1_version_2_1[String nameElement] : final_version_2_1 ;
    public final void spec_const_7_13_1_version_2_1(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:842:22: ( final_version_2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:843:3: final_version_2_1
            {
            pushFollow(FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15063);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:845:1: spec_const_7_13_1_version_2_2[String nameElement] : final_version_2_2 ;
    public final void spec_const_7_13_1_version_2_2(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:847:22: ( final_version_2_2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:3: final_version_2_2
            {
            pushFollow(FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25083);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:1: final_spec_10_6_tx returns [String consoText] : g= content_spec_10_6 ;
    public final String final_spec_10_6_tx() throws RecognitionException {
        String consoText = null;


        String g =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:46: (g= content_spec_10_6 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:3: g= content_spec_10_6
            {
            pushFollow(FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5100);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:857:1: content_spec_10_6 returns [String consoText] : (r= character | DELIMITER2 ) (p= content_spec_10_6 )? ;
    public final String content_spec_10_6() throws RecognitionException {
        String consoText = null;


        HPRIMSParser.character_return r =null;

        String p =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:857:45: ( (r= character | DELIMITER2 ) (p= content_spec_10_6 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:3: (r= character | DELIMITER2 ) (p= content_spec_10_6 )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:3: (r= character | DELIMITER2 )
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( ((LA194_0 >= CHARA && LA194_0 <= CHIFFRE9)||(LA194_0 >= LETTRE && LA194_0 <= POINT)) ) {
                alt194=1;
            }
            else if ( (LA194_0==DELIMITER2) ) {
                alt194=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 194, 0, input);

                throw nvae;

            }
            switch (alt194) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:4: r= character
                    {
                    pushFollow(FOLLOW_character_in_content_spec_10_65122);
                    r=character();

                    state._fsp--;


                    consoText = (r!=null?input.toString(r.start,r.stop):null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:42: DELIMITER2
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_content_spec_10_65128); 

                    consoText = "\n";

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:859:6: (p= content_spec_10_6 )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( ((LA195_0 >= CHARA && LA195_0 <= CHIFFRE9)||LA195_0==DELIMITER2||(LA195_0 >= LETTRE && LA195_0 <= POINT)) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:859:6: p= content_spec_10_6
                    {
                    pushFollow(FOLLOW_content_spec_10_6_in_content_spec_10_65139);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:1: final_ts : chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? ;
    public final HPRIMSParser.final_ts_return final_ts() throws RecognitionException {
        HPRIMSParser.final_ts_return retval = new HPRIMSParser.final_ts_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:9: ( chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:3: chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            {
            pushFollow(FOLLOW_chiffre_in_final_ts5151);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5153);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5157);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5159);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5161);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5165);
            chiffre();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:864:11: ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( ((LA198_0 >= CHIFFRE0 && LA198_0 <= CHIFFRE9)) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:864:12: chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    {
                    pushFollow(FOLLOW_chiffre_in_final_ts5168);
                    chiffre();

                    state._fsp--;


                    pushFollow(FOLLOW_chiffre_in_final_ts5170);
                    chiffre();

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:865:3: ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( ((LA197_0 >= CHIFFRE0 && LA197_0 <= CHIFFRE9)) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:865:4: chiffre chiffre chiffre chiffre ( chiffre chiffre )?
                            {
                            pushFollow(FOLLOW_chiffre_in_final_ts5175);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5177);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5179);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5183);
                            chiffre();

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:866:11: ( chiffre chiffre )?
                            int alt196=2;
                            int LA196_0 = input.LA(1);

                            if ( ((LA196_0 >= CHIFFRE0 && LA196_0 <= CHIFFRE9)) ) {
                                alt196=1;
                            }
                            switch (alt196) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:866:12: chiffre chiffre
                                    {
                                    pushFollow(FOLLOW_chiffre_in_final_ts5186);
                                    chiffre();

                                    state._fsp--;


                                    pushFollow(FOLLOW_chiffre_in_final_ts5188);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:1: final_st : ( character )+ ;
    public final HPRIMSParser.final_st_return final_st() throws RecognitionException {
        HPRIMSParser.final_st_return retval = new HPRIMSParser.final_st_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:9: ( ( character )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:3: ( character )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:3: ( character )+
            int cnt199=0;
            loop199:
            do {
                int alt199=2;
                int LA199_0 = input.LA(1);

                if ( ((LA199_0 >= CHARA && LA199_0 <= CHIFFRE9)||(LA199_0 >= LETTRE && LA199_0 <= POINT)) ) {
                    alt199=1;
                }


                switch (alt199) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:3: character
            	    {
            	    pushFollow(FOLLOW_character_in_final_st5207);
            	    character();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt199 >= 1 ) break loop199;
                        EarlyExitException eee =
                            new EarlyExitException(199, input);
                        throw eee;
                }
                cnt199++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:873:1: final_nm : ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) ;
    public final HPRIMSParser.final_nm_return final_nm() throws RecognitionException {
        HPRIMSParser.final_nm_return retval = new HPRIMSParser.final_nm_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:873:9: ( ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:4: ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:4: ( PLUS | MOINS )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( ((LA200_0 >= MOINS && LA200_0 <= PLUS)) ) {
                alt200=1;
            }
            switch (alt200) {
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:3: ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( ((LA205_0 >= CHIFFRE0 && LA205_0 <= CHIFFRE9)) ) {
                alt205=1;
            }
            else if ( (LA205_0==POINT) ) {
                alt205=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 205, 0, input);

                throw nvae;

            }
            switch (alt205) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:5: ( chiffre )+ ( POINT ( chiffre )* )?
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:5: ( chiffre )+
                    int cnt201=0;
                    loop201:
                    do {
                        int alt201=2;
                        int LA201_0 = input.LA(1);

                        if ( ((LA201_0 >= CHIFFRE0 && LA201_0 <= CHIFFRE9)) ) {
                            alt201=1;
                        }


                        switch (alt201) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:5: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5236);
                    	    chiffre();

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


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:14: ( POINT ( chiffre )* )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==POINT) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:15: POINT ( chiffre )*
                            {
                            match(input,POINT,FOLLOW_POINT_in_final_nm5240); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:21: ( chiffre )*
                            loop202:
                            do {
                                int alt202=2;
                                int LA202_0 = input.LA(1);

                                if ( ((LA202_0 >= CHIFFRE0 && LA202_0 <= CHIFFRE9)) ) {
                                    alt202=1;
                                }


                                switch (alt202) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:21: chiffre
                            	    {
                            	    pushFollow(FOLLOW_chiffre_in_final_nm5242);
                            	    chiffre();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop202;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:4: ( POINT ( chiffre )+ )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:4: ( POINT ( chiffre )+ )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:5: POINT ( chiffre )+
                    {
                    match(input,POINT,FOLLOW_POINT_in_final_nm5252); 

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:11: ( chiffre )+
                    int cnt204=0;
                    loop204:
                    do {
                        int alt204=2;
                        int LA204_0 = input.LA(1);

                        if ( ((LA204_0 >= CHIFFRE0 && LA204_0 <= CHIFFRE9)) ) {
                            alt204=1;
                        }


                        switch (alt204) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:876:11: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5254);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt204 >= 1 ) break loop204;
                                EarlyExitException eee =
                                    new EarlyExitException(204, input);
                                throw eee;
                        }
                        cnt204++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:879:1: final_nm_integer : ( chiffre )+ ;
    public final HPRIMSParser.final_nm_integer_return final_nm_integer() throws RecognitionException {
        HPRIMSParser.final_nm_integer_return retval = new HPRIMSParser.final_nm_integer_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:879:17: ( ( chiffre )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:3: ( chiffre )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:3: ( chiffre )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:3: chiffre
            	    {
            	    pushFollow(FOLLOW_chiffre_in_final_nm_integer5271);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:1: final_ORU : CHARO CHARR CHARU ;
    public final HPRIMSParser.final_ORU_return final_ORU() throws RecognitionException {
        HPRIMSParser.final_ORU_return retval = new HPRIMSParser.final_ORU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:10: ( CHARO CHARR CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:12: CHARO CHARR CHARU
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORU5283); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORU5285); 

            match(input,CHARU,FOLLOW_CHARU_in_final_ORU5287); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:885:1: final_CART : CHARC CHARA CHARR CHART ;
    public final HPRIMSParser.final_CART_return final_CART() throws RecognitionException {
        HPRIMSParser.final_CART_return retval = new HPRIMSParser.final_CART_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:885:11: ( CHARC CHARA CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:885:13: CHARC CHARA CHARR CHART
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_CART5296); 

            match(input,CHARA,FOLLOW_CHARA_in_final_CART5298); 

            match(input,CHARR,FOLLOW_CHARR_in_final_CART5300); 

            match(input,CHART,FOLLOW_CHART_in_final_CART5302); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:886:1: final_PORT : CHARP CHARO CHARR CHART ;
    public final HPRIMSParser.final_PORT_return final_PORT() throws RecognitionException {
        HPRIMSParser.final_PORT_return retval = new HPRIMSParser.final_PORT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:886:11: ( CHARP CHARO CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:886:13: CHARP CHARO CHARR CHART
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PORT5310); 

            match(input,CHARO,FOLLOW_CHARO_in_final_PORT5312); 

            match(input,CHARR,FOLLOW_CHARR_in_final_PORT5314); 

            match(input,CHART,FOLLOW_CHART_in_final_PORT5316); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:887:1: final_WHLC : CHARW CHARH CHARL CHARC ;
    public final HPRIMSParser.final_WHLC_return final_WHLC() throws RecognitionException {
        HPRIMSParser.final_WHLC_return retval = new HPRIMSParser.final_WHLC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:887:11: ( CHARW CHARH CHARL CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:887:13: CHARW CHARH CHARL CHARC
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WHLC5324); 

            match(input,CHARH,FOLLOW_CHARH_in_final_WHLC5326); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WHLC5328); 

            match(input,CHARC,FOLLOW_CHARC_in_final_WHLC5330); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:888:1: final_WALK : CHARW CHARA CHARL CHARK ;
    public final HPRIMSParser.final_WALK_return final_WALK() throws RecognitionException {
        HPRIMSParser.final_WALK_return retval = new HPRIMSParser.final_WALK_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:888:11: ( CHARW CHARA CHARL CHARK )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:888:13: CHARW CHARA CHARL CHARK
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WALK5338); 

            match(input,CHARA,FOLLOW_CHARA_in_final_WALK5340); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WALK5342); 

            match(input,CHARK,FOLLOW_CHARK_in_final_WALK5344); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:890:1: final_LL : CHARL CHARL ;
    public final HPRIMSParser.final_LL_return final_LL() throws RecognitionException {
        HPRIMSParser.final_LL_return retval = new HPRIMSParser.final_LL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:890:9: ( CHARL CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:890:11: CHARL CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_LL5353); 

            match(input,CHARL,FOLLOW_CHARL_in_final_LL5355); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:891:1: final_AA : CHARA CHARA ;
    public final HPRIMSParser.final_AA_return final_AA() throws RecognitionException {
        HPRIMSParser.final_AA_return retval = new HPRIMSParser.final_AA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:891:9: ( CHARA CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:891:11: CHARA CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_AA5363); 

            match(input,CHARA,FOLLOW_CHARA_in_final_AA5365); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:1: final_HH : CHARH CHARH ;
    public final HPRIMSParser.final_HH_return final_HH() throws RecognitionException {
        HPRIMSParser.final_HH_return retval = new HPRIMSParser.final_HH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:9: ( CHARH CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:11: CHARH CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_HH5373); 

            match(input,CHARH,FOLLOW_CHARH_in_final_HH5375); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:1: final_MS : CHARM CHARS ;
    public final HPRIMSParser.final_MS_return final_MS() throws RecognitionException {
        HPRIMSParser.final_MS_return retval = new HPRIMSParser.final_MS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:9: ( CHARM CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:893:11: CHARM CHARS
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MS5383); 

            match(input,CHARS,FOLLOW_CHARS_in_final_MS5385); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:1: final_VS : CHARV CHARS ;
    public final HPRIMSParser.final_VS_return final_VS() throws RecognitionException {
        HPRIMSParser.final_VS_return retval = new HPRIMSParser.final_VS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:9: ( CHARV CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:894:11: CHARV CHARS
            {
            match(input,CHARV,FOLLOW_CHARV_in_final_VS5393); 

            match(input,CHARS,FOLLOW_CHARS_in_final_VS5395); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:895:1: final_Null : CHARN CHARu CHARl CHARl ;
    public final HPRIMSParser.final_Null_return final_Null() throws RecognitionException {
        HPRIMSParser.final_Null_return retval = new HPRIMSParser.final_Null_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:895:11: ( CHARN CHARu CHARl CHARl )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:895:13: CHARN CHARu CHARl CHARl
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_Null5403); 

            match(input,CHARu,FOLLOW_CHARu_in_final_Null5405); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5407); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5409); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:896:1: final_symbol_inf : CHAR_SYMBOL_INF ;
    public final HPRIMSParser.final_symbol_inf_return final_symbol_inf() throws RecognitionException {
        HPRIMSParser.final_symbol_inf_return retval = new HPRIMSParser.final_symbol_inf_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:896:17: ( CHAR_SYMBOL_INF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:896:19: CHAR_SYMBOL_INF
            {
            match(input,CHAR_SYMBOL_INF,FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5417); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:897:1: final_symbol_sup : CHAR_SYMBOL_SUP ;
    public final HPRIMSParser.final_symbol_sup_return final_symbol_sup() throws RecognitionException {
        HPRIMSParser.final_symbol_sup_return retval = new HPRIMSParser.final_symbol_sup_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:897:17: ( CHAR_SYMBOL_SUP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:897:19: CHAR_SYMBOL_SUP
            {
            match(input,CHAR_SYMBOL_SUP,FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5425); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:899:1: final_version_2_0 : CHARH CHIFFRE2 POINT CHIFFRE0 ;
    public final HPRIMSParser.final_version_2_0_return final_version_2_0() throws RecognitionException {
        HPRIMSParser.final_version_2_0_return retval = new HPRIMSParser.final_version_2_0_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:899:18: ( CHARH CHIFFRE2 POINT CHIFFRE0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:899:20: CHARH CHIFFRE2 POINT CHIFFRE0
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_05434); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_05436); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_05438); 

            match(input,CHIFFRE0,FOLLOW_CHIFFRE0_in_final_version_2_05440); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:900:1: final_version_2_1 : CHARH CHIFFRE2 POINT CHIFFRE1 ;
    public final HPRIMSParser.final_version_2_1_return final_version_2_1() throws RecognitionException {
        HPRIMSParser.final_version_2_1_return retval = new HPRIMSParser.final_version_2_1_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:900:18: ( CHARH CHIFFRE2 POINT CHIFFRE1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:900:20: CHARH CHIFFRE2 POINT CHIFFRE1
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_15448); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_15450); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_15452); 

            match(input,CHIFFRE1,FOLLOW_CHIFFRE1_in_final_version_2_15454); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:901:1: final_version_2_2 : CHARH CHIFFRE2 POINT CHIFFRE2 ;
    public final HPRIMSParser.final_version_2_2_return final_version_2_2() throws RecognitionException {
        HPRIMSParser.final_version_2_2_return retval = new HPRIMSParser.final_version_2_2_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:901:18: ( CHARH CHIFFRE2 POINT CHIFFRE2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:901:20: CHARH CHIFFRE2 POINT CHIFFRE2
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_25462); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25464); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_25466); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25468); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:903:1: final_OP : CHARO CHARP ;
    public final HPRIMSParser.final_OP_return final_OP() throws RecognitionException {
        HPRIMSParser.final_OP_return retval = new HPRIMSParser.final_OP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:903:9: ( CHARO CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:903:11: CHARO CHARP
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_OP5477); 

            match(input,CHARP,FOLLOW_CHARP_in_final_OP5479); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:904:1: final_IP : CHARI CHARP ;
    public final HPRIMSParser.final_IP_return final_IP() throws RecognitionException {
        HPRIMSParser.final_IP_return retval = new HPRIMSParser.final_IP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:904:9: ( CHARI CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:904:11: CHARI CHARP
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_IP5487); 

            match(input,CHARP,FOLLOW_CHARP_in_final_IP5489); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:1: final_ER : CHARE CHARR ;
    public final HPRIMSParser.final_ER_return final_ER() throws RecognitionException {
        HPRIMSParser.final_ER_return retval = new HPRIMSParser.final_ER_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:9: ( CHARE CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:11: CHARE CHARR
            {
            match(input,CHARE,FOLLOW_CHARE_in_final_ER5497); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ER5499); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:906:1: final_PA : CHARP CHARA ;
    public final HPRIMSParser.final_PA_return final_PA() throws RecognitionException {
        HPRIMSParser.final_PA_return retval = new HPRIMSParser.final_PA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:906:9: ( CHARP CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:906:11: CHARP CHARA
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PA5507); 

            match(input,CHARA,FOLLOW_CHARA_in_final_PA5509); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:907:1: final_MP : CHARM CHARP ;
    public final HPRIMSParser.final_MP_return final_MP() throws RecognitionException {
        HPRIMSParser.final_MP_return retval = new HPRIMSParser.final_MP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:907:9: ( CHARM CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:907:11: CHARM CHARP
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MP5517); 

            match(input,CHARP,FOLLOW_CHARP_in_final_MP5519); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:1: final_charA : CHARA ;
    public final HPRIMSParser.final_charA_return final_charA() throws RecognitionException {
        HPRIMSParser.final_charA_return retval = new HPRIMSParser.final_charA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:12: ( CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:14: CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_charA5530); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:910:1: final_charB : CHARB ;
    public final HPRIMSParser.final_charB_return final_charB() throws RecognitionException {
        HPRIMSParser.final_charB_return retval = new HPRIMSParser.final_charB_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:910:12: ( CHARB )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:910:14: CHARB
            {
            match(input,CHARB,FOLLOW_CHARB_in_final_charB5538); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:911:1: final_charC : CHARC ;
    public final HPRIMSParser.final_charC_return final_charC() throws RecognitionException {
        HPRIMSParser.final_charC_return retval = new HPRIMSParser.final_charC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:911:12: ( CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:911:14: CHARC
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_charC5546); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:912:1: final_charD : CHARD ;
    public final HPRIMSParser.final_charD_return final_charD() throws RecognitionException {
        HPRIMSParser.final_charD_return retval = new HPRIMSParser.final_charD_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:912:12: ( CHARD )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:912:14: CHARD
            {
            match(input,CHARD,FOLLOW_CHARD_in_final_charD5554); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:913:1: final_charF : CHARF ;
    public final HPRIMSParser.final_charF_return final_charF() throws RecognitionException {
        HPRIMSParser.final_charF_return retval = new HPRIMSParser.final_charF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:913:12: ( CHARF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:913:14: CHARF
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_charF5562); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:914:1: final_charH : CHARH ;
    public final HPRIMSParser.final_charH_return final_charH() throws RecognitionException {
        HPRIMSParser.final_charH_return retval = new HPRIMSParser.final_charH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:914:12: ( CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:914:14: CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_charH5570); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:1: final_charI : CHARI ;
    public final HPRIMSParser.final_charI_return final_charI() throws RecognitionException {
        HPRIMSParser.final_charI_return retval = new HPRIMSParser.final_charI_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:12: ( CHARI )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:14: CHARI
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_charI5578); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:916:1: final_charL : CHARL ;
    public final HPRIMSParser.final_charL_return final_charL() throws RecognitionException {
        HPRIMSParser.final_charL_return retval = new HPRIMSParser.final_charL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:916:12: ( CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:916:14: CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_charL5586); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:917:1: final_charM : CHARM ;
    public final HPRIMSParser.final_charM_return final_charM() throws RecognitionException {
        HPRIMSParser.final_charM_return retval = new HPRIMSParser.final_charM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:917:12: ( CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:917:14: CHARM
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_charM5594); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:918:1: final_charN : CHARN ;
    public final HPRIMSParser.final_charN_return final_charN() throws RecognitionException {
        HPRIMSParser.final_charN_return retval = new HPRIMSParser.final_charN_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:918:12: ( CHARN )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:918:14: CHARN
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_charN5602); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:919:1: final_charO : CHARO ;
    public final HPRIMSParser.final_charO_return final_charO() throws RecognitionException {
        HPRIMSParser.final_charO_return retval = new HPRIMSParser.final_charO_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:919:12: ( CHARO )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:919:14: CHARO
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_charO5610); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:920:1: final_charP : CHARP ;
    public final HPRIMSParser.final_charP_return final_charP() throws RecognitionException {
        HPRIMSParser.final_charP_return retval = new HPRIMSParser.final_charP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:920:12: ( CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:920:14: CHARP
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_charP5618); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:921:1: final_charR : CHARR ;
    public final HPRIMSParser.final_charR_return final_charR() throws RecognitionException {
        HPRIMSParser.final_charR_return retval = new HPRIMSParser.final_charR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:921:12: ( CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:921:14: CHARR
            {
            match(input,CHARR,FOLLOW_CHARR_in_final_charR5626); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:1: final_charS : CHARS ;
    public final HPRIMSParser.final_charS_return final_charS() throws RecognitionException {
        HPRIMSParser.final_charS_return retval = new HPRIMSParser.final_charS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:12: ( CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:14: CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_charS5634); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:923:1: final_charT : CHART ;
    public final HPRIMSParser.final_charT_return final_charT() throws RecognitionException {
        HPRIMSParser.final_charT_return retval = new HPRIMSParser.final_charT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:923:12: ( CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:923:14: CHART
            {
            match(input,CHART,FOLLOW_CHART_in_final_charT5642); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:924:1: final_charU : CHARU ;
    public final HPRIMSParser.final_charU_return final_charU() throws RecognitionException {
        HPRIMSParser.final_charU_return retval = new HPRIMSParser.final_charU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:924:12: ( CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:924:14: CHARU
            {
            match(input,CHARU,FOLLOW_CHARU_in_final_charU5650); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:925:1: final_charW : CHARW ;
    public final HPRIMSParser.final_charW_return final_charW() throws RecognitionException {
        HPRIMSParser.final_charW_return retval = new HPRIMSParser.final_charW_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:925:12: ( CHARW )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:925:14: CHARW
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_charW5658); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:926:1: final_charX : CHARX ;
    public final HPRIMSParser.final_charX_return final_charX() throws RecognitionException {
        HPRIMSParser.final_charX_return retval = new HPRIMSParser.final_charX_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:926:12: ( CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:926:14: CHARX
            {
            match(input,CHARX,FOLLOW_CHARX_in_final_charX5666); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:929:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        startElement("champ", "delimiteurs");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:931:22: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:932:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5687); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:937:1: character : ( lettre | chiffre ) ;
    public final HPRIMSParser.character_return character() throws RecognitionException {
        HPRIMSParser.character_return retval = new HPRIMSParser.character_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:937:10: ( ( lettre | chiffre ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:3: ( lettre | chiffre )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:3: ( lettre | chiffre )
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( ((LA207_0 >= CHARA && LA207_0 <= CHARu)||(LA207_0 >= LETTRE && LA207_0 <= POINT)) ) {
                alt207=1;
            }
            else if ( ((LA207_0 >= CHIFFRE0 && LA207_0 <= CHIFFRE9)) ) {
                alt207=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 207, 0, input);

                throw nvae;

            }
            switch (alt207) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:4: lettre
                    {
                    pushFollow(FOLLOW_lettre_in_character5703);
                    lettre();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:13: chiffre
                    {
                    pushFollow(FOLLOW_chiffre_in_character5707);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:1: chiffre : ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) ;
    public final void chiffre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:8: ( ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) )
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:944:1: lettre : ~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) ;
    public final void lettre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:944:7: (~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) )
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
        "\13\1\40\1\60\1\36\2\uffff";
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
            "\2\77\1\76",
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
            return "208:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );";
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
    public static final BitSet FOLLOW_line_p2_1_in_body_p2_1162 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_p2_1165 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr2_1_in_body_p2_1172 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_body_obr2_1191 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obr2_1194 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obx2_1_in_body_obr2_1202 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx2_1_in_body_obx2_1221 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obx2_1224 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_2247 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2251 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2253 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2258 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2260 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2265 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2267 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2272 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2274 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2279 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_2281 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2286 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_2288 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2293 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2295 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2300 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2302 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2307 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2309 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2314 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_2316 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2323 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2328 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2330 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_1355 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1359 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1361 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1366 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1368 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1373 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1375 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1380 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1382 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1387 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_1389 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1394 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_1396 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1401 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1403 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1408 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1410 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1415 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1417 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1422 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_1424 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1432 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_1435 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1440 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1446 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1448 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p2_1_in_line_p2_2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p2_1481 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_p2_1483 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1487 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_p2_1489 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1494 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_8_3_in_line_p2_1496 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1501 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1503 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1509 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1511 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1518 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1520 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1528 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1530 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1539 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1541 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1551 = new BitSet(new long[]{0x0000020000408200L});
    public static final BitSet FOLLOW_spec_const_sexe_in_line_p2_1553 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1564 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p2_1566 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1578 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1580 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1593 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1595 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1609 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_p2_1611 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1650 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1652 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1656 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1658 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1676 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1678 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1695 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1697 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1730 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1732 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1767 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1769 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1789 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1791 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1795 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1797 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1820 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1822 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1826 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1828 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1852 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1854 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1877 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1879 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1903 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1905 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1930 = new BitSet(new long[]{0x000202FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1932 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1936 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1938 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1966 = new BitSet(new long[]{0x0000020000069100L});
    public static final BitSet FOLLOW_spec_const_8_25_in_line_p2_1968 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1995 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1997 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11050 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11052 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11081 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p2_11083 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11140 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11142 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11201 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11203 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11235 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11237 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11300 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11302 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11336 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11338 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11373 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11375 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_line_obr2_21481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2_11498 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obr2_11500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obr2_11502 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_line_obr2_11504 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11508 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11510 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11515 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_3_in_line_obr2_11517 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11522 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11524 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11529 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11531 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11535 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11537 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11547 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11549 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11553 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11555 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11562 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11564 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11569 = new BitSet(new long[]{0x000200FFC0000000L});
    public static final BitSet FOLLOW_spec_non_sized_9_8_in_line_obr2_11571 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11576 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11578 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11586 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11588 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11593 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11595 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11603 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11605 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11614 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11616 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11623 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11625 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11633 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11635 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11644 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_16_in_line_obr2_11646 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11656 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11658 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11669 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_obr2_11671 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11683 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11685 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11698 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11700 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11714 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11716 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11731 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11733 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11749 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11751 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11768 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11770 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11788 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11790 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11809 = new BitSet(new long[]{0x00000200020E92C0L});
    public static final BitSet FOLLOW_spec_const_9_26_in_line_obr2_11811 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11831 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11833 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11854 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11856 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11878 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11880 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11884 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11886 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11911 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11913 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11937 = new BitSet(new long[]{0x0000020001040040L});
    public static final BitSet FOLLOW_spec_const_9_31_in_line_obr2_11939 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11986 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11988 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11992 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11994 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12022 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12024 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12051 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12053 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12081 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12083 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12112 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12114 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12144 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_12146 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2_12245 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obx2_12247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obx2_12249 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_line_obx2_12251 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12255 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12257 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12262 = new BitSet(new long[]{0x00000000003506D0L});
    public static final BitSet FOLLOW_spec_const_10_3_nm_in_line_obx2_12270 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12279 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12281 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12291 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12293 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12304 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12306 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12310 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12312 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_ce_in_line_obx2_12342 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12351 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12353 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12363 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12365 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12376 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12378 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12382 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12384 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_fic_in_line_obx2_12414 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12423 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12425 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12435 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12437 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12448 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12450 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12454 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12456 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_st_in_line_obx2_12486 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12495 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12497 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12507 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12509 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12520 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12522 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12526 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12528 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_gc_in_line_obx2_12558 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12567 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12569 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12579 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12581 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12592 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12594 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12598 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12600 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_tx_in_line_obx2_12630 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12639 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12641 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12651 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12653 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12664 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12666 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12670 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12672 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_std_in_line_obx2_12702 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12711 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12713 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12723 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12725 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12736 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12738 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12742 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12744 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62778 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62780 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62789 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62791 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62795 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62797 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62809 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62811 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62815 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62817 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62830 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62832 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62844 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62846 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62850 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62852 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62867 = new BitSet(new long[]{0x00000200024C12C0L});
    public static final BitSet FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62869 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62884 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62886 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62902 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62904 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62920 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62922 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62939 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62941 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62959 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62961 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c2_13003 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_c2_13005 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13009 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_c2_13011 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13016 = new BitSet(new long[]{0x0000020000044000L});
    public static final BitSet FOLLOW_spec_const_12_3_in_line_c2_13018 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13023 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13025 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c2_13029 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13031 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l2_13058 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_line_l2_13060 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13065 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13067 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13074 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13081 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13083 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13092 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13094 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13104 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_l2_13106 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_sexe3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_sexe3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_sexe3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03192 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03195 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13218 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13221 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23242 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23245 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_7_13_23266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_7_13_23270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_7_13_23274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORU_in_spec_const_7_7_contexte3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_7_123311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_7_123315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charT_in_spec_const_7_123319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PORT_in_spec_const_9_313339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_CART_in_spec_const_9_313343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WHLC_in_spec_const_9_313347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WALK_in_spec_const_9_313351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_OP_in_spec_const_8_253372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_IP_in_spec_const_8_253376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ER_in_spec_const_8_253380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PA_in_spec_const_8_253384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MP_in_spec_const_8_253388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_9_263409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_9_263413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_9_263417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_9_263421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_9_263425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_9_263429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_const_9_263433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_9_263439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_9_263443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_nm3464 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_spec_const_10_3_nm3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_ce3487 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CHARE_in_spec_const_10_3_ce3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_spec_const_10_3_st3510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_st3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_gc3533 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_gc3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_tx3557 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_spec_const_10_3_tx3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_spec_const_10_3_fic3580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHARI_in_spec_const_10_3_fic3582 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_fic3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3606 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3614 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_spec_const_10_3_std3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3622 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3632 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_spec_const_10_3_std3642 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3650 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_spec_const_10_3_std3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3668 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63693 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63699 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63701 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63708 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_10_93738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charH_in_spec_const_10_93742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_LL_in_spec_const_10_93746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_HH_in_spec_const_10_93750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_inf_in_spec_const_10_93754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_sup_in_spec_const_10_93758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_93764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_93768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_AA_in_spec_const_10_93772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_Null_in_spec_const_10_93776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_93780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_93784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charB_in_spec_const_10_93788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charW_in_spec_const_10_93794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_93798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_93802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_93806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MS_in_spec_const_10_93810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_VS_in_spec_const_10_93814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_113835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_113839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_113843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_113847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_123868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_10_123872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_10_123876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_10_123880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_123884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_123888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_10_123895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_123899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_12_33920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_12_33924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23944 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23950 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23975 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23981 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44008 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44014 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44016 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44023 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44025 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44033 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64064 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64071 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64073 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64081 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64083 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64092 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64094 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64104 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64106 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64117 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84152 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84158 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84160 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84167 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84169 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84177 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84179 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84188 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84190 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84200 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84202 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84213 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84215 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84227 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34266 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34272 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34274 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34281 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64306 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64312 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64314 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64321 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64323 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64331 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64333 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64342 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64344 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64354 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24385 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24390 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24417 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24422 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4447 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4454 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4456 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4464 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_spec_sized_8_34498 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34505 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34507 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34515 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34557 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_34563 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84590 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_non_sized_9_84597 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164620 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164626 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164628 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164635 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44664 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44670 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44672 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44679 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44681 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44689 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44691 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44700 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44702 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44712 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4771 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_sized_tn4777 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_optionnal4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_mandatory4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_non_sized_optionnal4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_nonsized_mandatory4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_sized_optionnal4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_optionnal4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_mandatory4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_mandatory5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_optionnal5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_content_spec_10_65122 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_DELIMITER2_in_content_spec_10_65128 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_content_spec_10_6_in_content_spec_10_65139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5151 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5153 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5157 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5159 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5161 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5165 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5168 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5170 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5175 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5177 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5179 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5183 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5186 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_final_st5207 = new BitSet(new long[]{0x0001E0FFFFFFFFF2L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5236 = new BitSet(new long[]{0x000100FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5240 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5242 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5252 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5254 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm_integer5271 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORU5283 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORU5285 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CHARU_in_final_ORU5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_CART5296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_CART5298 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_CART5300 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_CART5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PORT5310 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_final_PORT5312 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_PORT5314 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_PORT5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WHLC5324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_WHLC5326 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WHLC5328 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_final_WHLC5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WALK5338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_WALK5340 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WALK5342 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_final_WALK5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5353 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5373 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MS5383 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_MS5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARV_in_final_VS5393 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_VS5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_Null5403 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CHARu_in_final_Null5405 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5407 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_05434 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_05436 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_05438 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CHIFFRE0_in_final_version_2_05440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_15448 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_15450 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_15452 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CHIFFRE1_in_final_version_2_15454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_25462 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25464 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_25466 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_OP5477 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_OP5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_IP5487 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_IP5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARE_in_final_ER5497 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ER5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PA5507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_PA5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MP5517 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_MP5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_charA5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARB_in_final_charB5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_charC5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_final_charD5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_charF5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_charH5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_charI5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_charL5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_charM5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_charN5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_charO5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_charP5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARR_in_final_charR5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_charS5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_charT5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARU_in_final_charU5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_charW5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARX_in_final_charX5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lettre_in_character5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_character5707 = new BitSet(new long[]{0x0000000000000002L});

}