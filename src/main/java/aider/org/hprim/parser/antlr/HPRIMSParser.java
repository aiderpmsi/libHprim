// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-04-06 10:44:40

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:205:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 | hprim_oru_2_0 | hprim_orm_2_2 | hprim_orm_2_1 | hprim_orm_2_0 | hprim_ora_2_2 | hprim_ora_2_1 | hprim_ora_2_0 );
    public final void hprim() throws RecognitionException {
        startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:207:23: ( hprim_oru_2_2 | hprim_oru_2_1 | hprim_oru_2_0 | hprim_orm_2_2 | hprim_orm_2_1 | hprim_orm_2_0 | hprim_ora_2_2 | hprim_ora_2_1 | hprim_ora_2_0 )
            int alt1=9;
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
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:208:35: hprim_oru_2_0
                    {
                    pushFollow(FOLLOW_hprim_oru_2_0_in_hprim76);
                    hprim_oru_2_0();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:209:3: hprim_orm_2_2
                    {
                    pushFollow(FOLLOW_hprim_orm_2_2_in_hprim82);
                    hprim_orm_2_2();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:209:19: hprim_orm_2_1
                    {
                    pushFollow(FOLLOW_hprim_orm_2_1_in_hprim86);
                    hprim_orm_2_1();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:209:35: hprim_orm_2_0
                    {
                    pushFollow(FOLLOW_hprim_orm_2_0_in_hprim90);
                    hprim_orm_2_0();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:3: hprim_ora_2_2
                    {
                    pushFollow(FOLLOW_hprim_ora_2_2_in_hprim96);
                    hprim_ora_2_2();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:19: hprim_ora_2_1
                    {
                    pushFollow(FOLLOW_hprim_ora_2_1_in_hprim100);
                    hprim_ora_2_1();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:35: hprim_ora_2_0
                    {
                    pushFollow(FOLLOW_hprim_ora_2_0_in_hprim104);
                    hprim_ora_2_0();

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:213:1: hprim_oru_2_2 : line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF ;
    public final void hprim_oru_2_2() throws RecognitionException {
        startElement("HPRIM.ORU.2.2");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:215:35: ( line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:216:3: line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_oru_in_hprim_oru_2_2123);
            line_h2_2_oru();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:3: ( body_p_oru )+
            int cnt2=0;
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:3: body_p_oru
            	    {
            	    pushFollow(FOLLOW_body_p_oru_in_hprim_oru_2_2127);
            	    body_p_oru();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_oru_2_2132);
            line_l();

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
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_2136); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_2141); 

            }

            endElement();endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:1: hprim_oru_2_1 : line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF ;
    public final void hprim_oru_2_1() throws RecognitionException {
        startElement("HPRIM.ORU.2.1");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:224:35: ( line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:225:3: line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_oru_in_hprim_oru_2_1158);
            line_h2_1_oru();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:3: ( body_p_oru )+
            int cnt4=0;
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:3: body_p_oru
            	    {
            	    pushFollow(FOLLOW_body_p_oru_in_hprim_oru_2_1162);
            	    body_p_oru();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_oru_2_1167);
            line_l();

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
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_1171); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_1176); 

            }

            endElement();endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:1: hprim_oru_2_0 : line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF ;
    public final void hprim_oru_2_0() throws RecognitionException {
        startElement("HPRIM.ORU.2.0");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:233:35: ( line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:234:3: line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_0_oru_in_hprim_oru_2_0193);
            line_h2_0_oru();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:3: ( body_p_oru )+
            int cnt6=0;
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:3: body_p_oru
            	    {
            	    pushFollow(FOLLOW_body_p_oru_in_hprim_oru_2_0197);
            	    body_p_oru();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_oru_2_0202);
            line_l();

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
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_0206); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_0211); 

            }

            endElement();endElement();
        }
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



    // $ANTLR start "hprim_ora_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:1: hprim_ora_2_2 : line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF ;
    public final void hprim_ora_2_2() throws RecognitionException {
        startElement("HPRIM.ORA.2.2");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:35: ( line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:244:3: line_h2_2_ora ( body_p_ora )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_ora_in_hprim_ora_2_2229);
            line_h2_2_ora();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:3: ( body_p_ora )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CR) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==CHARP) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:3: body_p_ora
            	    {
            	    pushFollow(FOLLOW_body_p_ora_in_hprim_ora_2_2233);
            	    body_p_ora();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_ora_2_2238);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:3: ( CR )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_ora_2_2242); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_ora_2_2247); 

            }

            endElement();endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_ora_2_2"



    // $ANTLR start "hprim_ora_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:1: hprim_ora_2_1 : line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF ;
    public final void hprim_ora_2_1() throws RecognitionException {
        startElement("HPRIM.ORA.2.1");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:252:35: ( line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:253:3: line_h2_1_ora ( body_p_ora )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_ora_in_hprim_ora_2_1264);
            line_h2_1_ora();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:254:3: ( body_p_ora )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==CR) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==CHARP) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:254:3: body_p_ora
            	    {
            	    pushFollow(FOLLOW_body_p_ora_in_hprim_ora_2_1268);
            	    body_p_ora();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_ora_2_1273);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:256:3: ( CR )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:256:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_ora_2_1277); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_ora_2_1282); 

            }

            endElement();endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_ora_2_1"



    // $ANTLR start "hprim_ora_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:259:1: hprim_ora_2_0 : line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF ;
    public final void hprim_ora_2_0() throws RecognitionException {
        startElement("HPRIM.ORA.2.0");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:35: ( line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:262:3: line_h2_0_ora ( body_p_ora )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_0_ora_in_hprim_ora_2_0299);
            line_h2_0_ora();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:3: ( body_p_ora )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==CR) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==CHARP) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:3: body_p_ora
            	    {
            	    pushFollow(FOLLOW_body_p_ora_in_hprim_ora_2_0303);
            	    body_p_ora();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_ora_2_0308);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:3: ( CR )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==CR) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_ora_2_0312); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_ora_2_0317); 

            }

            endElement();endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_ora_2_0"



    // $ANTLR start "hprim_orm_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:269:1: hprim_orm_2_2 : line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF ;
    public final void hprim_orm_2_2() throws RecognitionException {
        startElement("HPRIM.ORM.2.2");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:35: ( line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:3: line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_orm_in_hprim_orm_2_2335);
            line_h2_2_orm();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:273:3: ( body_p_orm )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==CR) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==CHARP) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:273:3: body_p_orm
            	    {
            	    pushFollow(FOLLOW_body_p_orm_in_hprim_orm_2_2339);
            	    body_p_orm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_orm_2_2344);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:3: ( CR )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CR) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_orm_2_2348); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_orm_2_2353); 

            }

            endElement();endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_orm_2_2"



    // $ANTLR start "hprim_orm_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:1: hprim_orm_2_1 : line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF ;
    public final void hprim_orm_2_1() throws RecognitionException {
        startElement("HPRIM.ORM.2.1");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:280:35: ( line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:281:3: line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_orm_in_hprim_orm_2_1370);
            line_h2_1_orm();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:3: ( body_p_orm )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CR) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==CHARP) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:3: body_p_orm
            	    {
            	    pushFollow(FOLLOW_body_p_orm_in_hprim_orm_2_1374);
            	    body_p_orm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_orm_2_1379);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:284:3: ( CR )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:284:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_orm_2_1383); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_orm_2_1388); 

            }

            endElement();endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_orm_2_1"



    // $ANTLR start "hprim_orm_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:287:1: hprim_orm_2_0 : line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF ;
    public final void hprim_orm_2_0() throws RecognitionException {
        startElement("HPRIM.ORM.2.0");startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:289:35: ( line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:3: line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_0_orm_in_hprim_orm_2_0405);
            line_h2_0_orm();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:291:3: ( body_p_orm )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==CR) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==CHARP) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:291:3: body_p_orm
            	    {
            	    pushFollow(FOLLOW_body_p_orm_in_hprim_orm_2_0409);
            	    body_p_orm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            pushFollow(FOLLOW_line_l_in_hprim_orm_2_0414);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:293:3: ( CR )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CR) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:293:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_orm_2_0418); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_orm_2_0423); 

            }

            endElement();endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_orm_2_0"



    // $ANTLR start "body_p_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:297:1: body_p_orm : line_p ( line_c )* ( body_obr_orm )+ ;
    public final void body_p_orm() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:23: ( line_p ( line_c )* ( body_obr_orm )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:3: line_p ( line_c )* ( body_obr_orm )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_orm442);
            line_p();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:10: ( line_c )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==CR) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==CHARC) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:11: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_orm445);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:3: ( body_obr_orm )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==CR) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==CHARO) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:3: body_obr_orm
            	    {
            	    pushFollow(FOLLOW_body_obr_orm_in_body_p_orm451);
            	    body_obr_orm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // $ANTLR end "body_p_orm"



    // $ANTLR start "body_obr_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:303:1: body_obr_orm : line_obr ( line_c )* ( body_obx_orm )* ;
    public final void body_obr_orm() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:23: ( line_obr ( line_c )* ( body_obx_orm )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:4: line_obr ( line_c )* ( body_obx_orm )*
            {
            pushFollow(FOLLOW_line_obr_in_body_obr_orm471);
            line_obr();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:13: ( line_c )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==CR) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==CHARC) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obr_orm474);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:4: ( body_obx_orm )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==CR) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==CHARO) ) {
                        int LA23_3 = input.LA(3);

                        if ( (LA23_3==CHARB) ) {
                            int LA23_4 = input.LA(4);

                            if ( (LA23_4==CHARX) ) {
                                alt23=1;
                            }


                        }


                    }


                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:4: body_obx_orm
            	    {
            	    pushFollow(FOLLOW_body_obx_orm_in_body_obr_orm481);
            	    body_obx_orm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "body_obr_orm"



    // $ANTLR start "body_obx_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:1: body_obx_orm : line_obx ( line_c )* ;
    public final void body_obx_orm() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:23: ( line_obx ( line_c )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:4: line_obx ( line_c )*
            {
            pushFollow(FOLLOW_line_obx_in_body_obx_orm501);
            line_obx();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:13: ( line_c )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==CR) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==CHARC) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obx_orm504);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "body_obx_orm"



    // $ANTLR start "body_p_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:1: body_p_ora : line_p ( line_c )* ( body_ap_ora )* ;
    public final void body_p_ora() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:23: ( line_p ( line_c )* ( body_ap_ora )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:3: line_p ( line_c )* ( body_ap_ora )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_ora528);
            line_p();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:10: ( line_c )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==CR) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==CHARC) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:11: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_ora531);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:3: ( body_ap_ora )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==CR) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==CHARA) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:3: body_ap_ora
            	    {
            	    pushFollow(FOLLOW_body_ap_ora_in_body_p_ora537);
            	    body_ap_ora();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "body_p_ora"



    // $ANTLR start "body_ap_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:1: body_ap_ora : line_ap ( line_c )* body_ac_ora ;
    public final void body_ap_ora() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:23: ( line_ap ( line_c )* body_ac_ora )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:3: line_ap ( line_c )* body_ac_ora
            {
            pushFollow(FOLLOW_line_ap_in_body_ap_ora556);
            line_ap();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:11: ( line_c )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==CR) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==CHARC) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_ap_ora559);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_body_ac_ora_in_body_ap_ora565);
            body_ac_ora();

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
    // $ANTLR end "body_ap_ora"



    // $ANTLR start "body_ac_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:1: body_ac_ora : ( body_ac_ora_second_level )* ( body_obr_ora )+ ;
    public final void body_ac_ora() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:23: ( ( body_ac_ora_second_level )* ( body_obr_ora )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:3: ( body_ac_ora_second_level )* ( body_obr_ora )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:3: ( body_ac_ora_second_level )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==CR) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==CHARA) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:3: body_ac_ora_second_level
            	    {
            	    pushFollow(FOLLOW_body_ac_ora_second_level_in_body_ac_ora583);
            	    body_ac_ora_second_level();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:3: ( body_obr_ora )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==CR) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==CHARO) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:3: body_obr_ora
            	    {
            	    pushFollow(FOLLOW_body_obr_ora_in_body_ac_ora588);
            	    body_obr_ora();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
    // $ANTLR end "body_ac_ora"



    // $ANTLR start "body_ac_ora_second_level"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:1: body_ac_ora_second_level : line_ac ( line_c )* ;
    public final void body_ac_ora_second_level() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:23: ( line_ac ( line_c )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:3: line_ac ( line_c )*
            {
            pushFollow(FOLLOW_line_ac_in_body_ac_ora_second_level607);
            line_ac();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:11: ( line_c )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==CR) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==CHARC) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_ac_ora_second_level610);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "body_ac_ora_second_level"



    // $ANTLR start "body_obr_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:1: body_obr_ora : line_obr ( line_c )* ( body_obx_ora )* ;
    public final void body_obr_ora() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:23: ( line_obr ( line_c )* ( body_obx_ora )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:4: line_obr ( line_c )* ( body_obx_ora )*
            {
            pushFollow(FOLLOW_line_obr_in_body_obr_ora631);
            line_obr();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:13: ( line_c )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==CR) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==CHARC) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obr_ora634);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:4: ( body_obx_ora )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==CR) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==CHARO) ) {
                        int LA32_3 = input.LA(3);

                        if ( (LA32_3==CHARB) ) {
                            int LA32_4 = input.LA(4);

                            if ( (LA32_4==CHARX) ) {
                                alt32=1;
                            }


                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:4: body_obx_ora
            	    {
            	    pushFollow(FOLLOW_body_obx_ora_in_body_obr_ora641);
            	    body_obx_ora();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "body_obr_ora"



    // $ANTLR start "body_obx_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:1: body_obx_ora : line_obx ( line_c )* ;
    public final void body_obx_ora() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:23: ( line_obx ( line_c )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:4: line_obx ( line_c )*
            {
            pushFollow(FOLLOW_line_obx_in_body_obx_ora661);
            line_obx();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:13: ( line_c )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==CR) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==CHARC) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obx_ora664);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "body_obx_ora"



    // $ANTLR start "body_p_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:350:1: body_p_oru : line_p ( line_c )* ( body_obr_oru )+ ;
    public final void body_p_oru() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:23: ( line_p ( line_c )* ( body_obr_oru )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:3: line_p ( line_c )* ( body_obr_oru )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru688);
            line_p();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:10: ( line_c )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==CR) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==CHARC) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:11: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_oru691);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:3: ( body_obr_oru )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==CR) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==CHARO) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:3: body_obr_oru
            	    {
            	    pushFollow(FOLLOW_body_obr_oru_in_body_p_oru697);
            	    body_obr_oru();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // $ANTLR end "body_p_oru"



    // $ANTLR start "body_obr_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:1: body_obr_oru : line_obr ( line_c )* ( body_obx_oru )+ ;
    public final void body_obr_oru() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:23: ( line_obr ( line_c )* ( body_obx_oru )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:4: line_obr ( line_c )* ( body_obx_oru )+
            {
            pushFollow(FOLLOW_line_obr_in_body_obr_oru717);
            line_obr();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:13: ( line_c )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==CR) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==CHARC) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obr_oru720);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:4: ( body_obx_oru )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==CR) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==CHARO) ) {
                        int LA37_3 = input.LA(3);

                        if ( (LA37_3==CHARB) ) {
                            int LA37_4 = input.LA(4);

                            if ( (LA37_4==CHARX) ) {
                                alt37=1;
                            }


                        }


                    }


                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:4: body_obx_oru
            	    {
            	    pushFollow(FOLLOW_body_obx_oru_in_body_obr_oru727);
            	    body_obx_oru();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // $ANTLR end "body_obr_oru"



    // $ANTLR start "body_obx_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:1: body_obx_oru : line_obx ( line_c )* ;
    public final void body_obx_oru() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:23: ( line_obx ( line_c )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:4: line_obx ( line_c )*
            {
            pushFollow(FOLLOW_line_obx_in_body_obx_oru747);
            line_obx();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:13: ( line_c )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==CR) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==CHARC) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obx_oru750);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "body_obx_oru"



    // $ANTLR start "body_p_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:1: body_p_adm : line_p ( line_c )* ( body_ap_adm )* ;
    public final void body_p_adm() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:370:23: ( line_p ( line_c )* ( body_ap_adm )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:371:3: line_p ( line_c )* ( body_ap_adm )*
            {
            pushFollow(FOLLOW_line_p_in_body_p_adm771);
            line_p();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:371:10: ( line_c )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==CR) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==CHARC) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:371:11: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_adm774);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:3: ( body_ap_adm )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==CR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:3: body_ap_adm
            	    {
            	    pushFollow(FOLLOW_body_ap_adm_in_body_p_adm780);
            	    body_ap_adm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "body_p_adm"



    // $ANTLR start "body_ap_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:374:1: body_ap_adm : line_ap ( line_c )* body_ac_adm ;
    public final void body_ap_adm() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:23: ( line_ap ( line_c )* body_ac_adm )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:3: line_ap ( line_c )* body_ac_adm
            {
            pushFollow(FOLLOW_line_ap_in_body_ap_adm799);
            line_ap();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:11: ( line_c )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==CR) ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==CHARC) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_ap_adm802);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            pushFollow(FOLLOW_body_ac_adm_in_body_ap_adm808);
            body_ac_adm();

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
    // $ANTLR end "body_ap_adm"



    // $ANTLR start "body_ac_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:1: body_ac_adm : line_ac ( line_c )* ;
    public final void body_ac_adm() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:382:23: ( line_ac ( line_c )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:3: line_ac ( line_c )*
            {
            pushFollow(FOLLOW_line_ac_in_body_ac_adm826);
            line_ac();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:11: ( line_c )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==CR) ) {
                    int LA42_2 = input.LA(2);

                    if ( (LA42_2==CHARC) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:12: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_ac_adm829);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "body_ac_adm"



    // $ANTLR start "start_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:1: start_line_h : delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:14: ( delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:389:3: delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100]
            {
            startElement("H.1");content("H");endElement();

            pushFollow(FOLLOW_delimiters_in_start_line_h846);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h850); 

            pushFollow(FOLLOW_st_sized_optionnal_in_start_line_h852);
            st_sized_optionnal("H.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h857); 

            pushFollow(FOLLOW_st_sized_optionnal_in_start_line_h859);
            st_sized_optionnal("H.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h864); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_start_line_h866);
            spec_sized_mult_lvl1_st_mandatory_2("H.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h871); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_start_line_h873);
            spec_sized_mult_lvl1_st_optionnal_6("H.6", 100);

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
    // $ANTLR end "start_line_h"



    // $ANTLR start "midd_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:396:1: midd_line_h : DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:396:13: ( DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:3: DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h885); 

            pushFollow(FOLLOW_spec_sized_tn_in_midd_line_h887);
            spec_sized_tn("H.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h892); 

            pushFollow(FOLLOW_st_sized_optionnal_in_midd_line_h894);
            st_sized_optionnal("H.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h899); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_midd_line_h901);
            spec_sized_mult_lvl1_st_mandatory_2("H.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h906); 

            pushFollow(FOLLOW_st_sized_optionnal_in_midd_line_h908);
            st_sized_optionnal("H.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h913); 

            pushFollow(FOLLOW_spec_const_7_12_in_midd_line_h915);
            spec_const_7_12("H.12");

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
    // $ANTLR end "midd_line_h"



    // $ANTLR start "line_h2_2_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:1: line_h2_2_oru : start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:406:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_2_oru928);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru932); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_2_oru934);
            spec_const_7_7_contexte_ORU("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_2_oru939);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru943); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_oru945);
            spec_const_7_13_version_2_2("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru950); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2_oru952);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:3: ( DELIMITER1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==DELIMITER1) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru957); 

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
    // $ANTLR end "line_h2_2_oru"



    // $ANTLR start "line_h2_1_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:1: line_h2_1_oru : start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:416:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_1_oru970);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru974); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_1_oru976);
            spec_const_7_7_contexte_ORU("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_1_oru981);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru985); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_oru987);
            spec_const_7_13_version_2_1("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru992); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1_oru994);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:3: ( DELIMITER1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DELIMITER1) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru999); 

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
    // $ANTLR end "line_h2_1_oru"



    // $ANTLR start "line_h2_0_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:1: line_h2_0_oru : start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_0_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_0_oru1011);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru1015); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_0_oru1017);
            spec_const_7_7_contexte_ORU("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_0_oru1022);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru1026); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_oru1028);
            spec_const_7_13_version_2_0("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru1033); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_0_oru1035);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:3: ( DELIMITER1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==DELIMITER1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru1040); 

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
    // $ANTLR end "line_h2_0_oru"



    // $ANTLR start "line_h2_2_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:1: line_h2_2_orm : start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_2_orm1052);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm1056); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_2_orm1058);
            spec_const_7_7_contexte_ORM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_2_orm1063);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm1067); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_orm1069);
            spec_const_7_13_version_2_2("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm1074); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2_orm1076);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:3: ( DELIMITER1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DELIMITER1) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm1081); 

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
    // $ANTLR end "line_h2_2_orm"



    // $ANTLR start "line_h2_1_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:1: line_h2_1_orm : start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_1_orm1092);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm1096); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_1_orm1098);
            spec_const_7_7_contexte_ORM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_1_orm1103);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm1107); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_orm1109);
            spec_const_7_13_version_2_1("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm1114); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1_orm1116);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:3: ( DELIMITER1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DELIMITER1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm1121); 

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
    // $ANTLR end "line_h2_1_orm"



    // $ANTLR start "line_h2_0_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:1: line_h2_0_orm : start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_0_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:450:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_0_orm1132);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm1136); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_0_orm1138);
            spec_const_7_7_contexte_ORM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_0_orm1143);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm1147); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_orm1149);
            spec_const_7_13_version_2_0("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm1154); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_0_orm1156);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:455:3: ( DELIMITER1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DELIMITER1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:455:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm1161); 

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
    // $ANTLR end "line_h2_0_orm"



    // $ANTLR start "line_h2_2_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:1: line_h2_2_ora : start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2_ora() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:459:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_2_ora1173);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_ora1177); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORA_in_line_h2_2_ora1179);
            spec_const_7_7_contexte_ORA("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_2_ora1184);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_ora1188); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_ora1190);
            spec_const_7_13_version_2_2("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_ora1195); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2_ora1197);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:464:3: ( DELIMITER1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DELIMITER1) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:464:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_ora1202); 

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
    // $ANTLR end "line_h2_2_ora"



    // $ANTLR start "line_h2_1_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:1: line_h2_1_ora : start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1_ora() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_1_ora1213);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_ora1217); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORA_in_line_h2_1_ora1219);
            spec_const_7_7_contexte_ORA("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_1_ora1224);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_ora1228); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_ora1230);
            spec_const_7_13_version_2_1("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_ora1235); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1_ora1237);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:472:3: ( DELIMITER1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DELIMITER1) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:472:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_ora1242); 

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
    // $ANTLR end "line_h2_1_ora"



    // $ANTLR start "line_h2_0_ora"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:1: line_h2_0_ora : start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_0_ora() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORA[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_0_ora1253);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_ora1257); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORA_in_line_h2_0_ora1259);
            spec_const_7_7_contexte_ORA("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_0_ora1264);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_ora1268); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_ora1270);
            spec_const_7_13_version_2_0("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_ora1275); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_0_ora1277);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:3: ( DELIMITER1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==DELIMITER1) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_ora1282); 

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
    // $ANTLR end "line_h2_0_ora"



    // $ANTLR start "line_h2_2_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:1: line_h2_2_adm : start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_2_adm1294);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_adm1298); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ADM_in_line_h2_2_adm1300);
            spec_const_7_7_contexte_ADM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_2_adm1305);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_adm1309); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_adm1311);
            spec_const_7_13_version_2_2("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_adm1316); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2_adm1318);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:489:3: ( DELIMITER1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==DELIMITER1) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:489:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_adm1323); 

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
    // $ANTLR end "line_h2_2_adm"



    // $ANTLR start "line_h2_1_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:1: line_h2_1_adm : start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:492:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_1_adm1334);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_adm1338); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ADM_in_line_h2_1_adm1340);
            spec_const_7_7_contexte_ADM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_1_adm1345);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_adm1349); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_adm1351);
            spec_const_7_13_version_2_1("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_adm1356); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1_adm1358);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:497:3: ( DELIMITER1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==DELIMITER1) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:497:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_adm1363); 

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
    // $ANTLR end "line_h2_1_adm"



    // $ANTLR start "line_h2_0_adm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:1: line_h2_0_adm : start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_0_adm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:15: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ADM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_0_adm1374);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_adm1378); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ADM_in_line_h2_0_adm1380);
            spec_const_7_7_contexte_ADM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_0_adm1385);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_adm1389); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_adm1391);
            spec_const_7_13_version_2_0("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_adm1396); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_0_adm1398);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:3: ( DELIMITER1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==DELIMITER1) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_adm1403); 

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
    // $ANTLR end "line_h2_0_adm"



    // $ANTLR start "line_ap"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:508:1: line_ap : ( CR CHARA CHARP ) DELIMITER1 nm_integer_sized_mandatory[\"AP.2\", 4] DELIMITER1 st_sized_mandatory[\"AP.3\", 2] DELIMITER1 ts_sized_optionnal[\"AP.4\", 8] DELIMITER1 ts_sized_optionnal[\"AP.5\", 8] DELIMITER1 nm_integer_sized_mandatory[\"AP.6\", 15] DELIMITER1 st_sized_mandatory[\"AP.7\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.8\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.9\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.10\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 st_sized_mandatory[\"AP.12\", 1] DELIMITER1 st_sized_mandatory[\"AP.13\", 2] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_6[\"AP.14\", 48] DELIMITER1 st_sized_optionnal[\"AP.15\", 24] DELIMITER1 nm_integer_sized_mandatory[\"AP.16\", 6] ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )? ;
    public final void line_ap() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:508:9: ( ( CR CHARA CHARP ) DELIMITER1 nm_integer_sized_mandatory[\"AP.2\", 4] DELIMITER1 st_sized_mandatory[\"AP.3\", 2] DELIMITER1 ts_sized_optionnal[\"AP.4\", 8] DELIMITER1 ts_sized_optionnal[\"AP.5\", 8] DELIMITER1 nm_integer_sized_mandatory[\"AP.6\", 15] DELIMITER1 st_sized_mandatory[\"AP.7\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.8\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.9\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.10\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 st_sized_mandatory[\"AP.12\", 1] DELIMITER1 st_sized_mandatory[\"AP.13\", 2] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_6[\"AP.14\", 48] DELIMITER1 st_sized_optionnal[\"AP.15\", 24] DELIMITER1 nm_integer_sized_mandatory[\"AP.16\", 6] ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:509:3: ( CR CHARA CHARP ) DELIMITER1 nm_integer_sized_mandatory[\"AP.2\", 4] DELIMITER1 st_sized_mandatory[\"AP.3\", 2] DELIMITER1 ts_sized_optionnal[\"AP.4\", 8] DELIMITER1 ts_sized_optionnal[\"AP.5\", 8] DELIMITER1 nm_integer_sized_mandatory[\"AP.6\", 15] DELIMITER1 st_sized_mandatory[\"AP.7\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.8\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.9\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.10\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 st_sized_mandatory[\"AP.12\", 1] DELIMITER1 st_sized_mandatory[\"AP.13\", 2] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_6[\"AP.14\", 48] DELIMITER1 st_sized_optionnal[\"AP.15\", 24] DELIMITER1 nm_integer_sized_mandatory[\"AP.16\", 6] ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:509:3: ( CR CHARA CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:509:4: CR CHARA CHARP
            {
            match(input,CR,FOLLOW_CR_in_line_ap1416); 

            match(input,CHARA,FOLLOW_CHARA_in_line_ap1418); 

            match(input,CHARP,FOLLOW_CHARP_in_line_ap1420); 

            }


            startElement("AP.1");content("AP");endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1427); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1429);
            nm_integer_sized_mandatory("AP.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1434); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap1436);
            st_sized_mandatory("AP.3", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1441); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap1443);
            ts_sized_optionnal("AP.4", 8);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1448); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap1450);
            ts_sized_optionnal("AP.5", 8);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1455); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1457);
            nm_integer_sized_mandatory("AP.6", 15);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1462); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap1464);
            st_sized_mandatory("AP.7", 3);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1469); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1471);
            nm_integer_sized_mandatory("AP.8", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1476); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1478);
            nm_integer_sized_mandatory("AP.9", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1483); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1485);
            nm_integer_sized_mandatory("AP.10", 3);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1490); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1492);
            nm_integer_sized_mandatory("AP.11", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1497); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1499);
            nm_integer_sized_mandatory("AP.11", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1504); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap1506);
            st_sized_mandatory("AP.12", 1);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1511); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap1513);
            st_sized_mandatory("AP.13", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1518); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_6_in_line_ap1520);
            spec_sized_mult_lvl1_st_mandatory_6("AP.14", 48);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1525); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_ap1527);
            st_sized_optionnal("AP.15", 24);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1532); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap1534);
            nm_integer_sized_mandatory("AP.16", 6);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:3: ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==DELIMITER1) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:4: DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1540); 

                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_ap1542);
                    nm_sized_optionnal("AP.17", 9);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:527:4: ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==DELIMITER1) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:527:5: DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1549); 

                            pushFollow(FOLLOW_spec_on_optionnal_in_line_ap1551);
                            spec_on_optionnal("AP.18");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:5: ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==DELIMITER1) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:6: DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1559); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap1561);
                                    ts_sized_optionnal("AP.19", 8);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:529:6: ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )?
                                    int alt59=2;
                                    int LA59_0 = input.LA(1);

                                    if ( (LA59_0==DELIMITER1) ) {
                                        alt59=1;
                                    }
                                    switch (alt59) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:529:7: DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1570); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap1572);
                                            ts_sized_optionnal("AP.20", 8);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:7: ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )?
                                            int alt58=2;
                                            int LA58_0 = input.LA(1);

                                            if ( (LA58_0==DELIMITER1) ) {
                                                alt58=1;
                                            }
                                            switch (alt58) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:8: DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1582); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_ap1584);
                                                    st_sized_optionnal("AP.21", 30);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:8: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )?
                                                    int alt57=2;
                                                    int LA57_0 = input.LA(1);

                                                    if ( (LA57_0==DELIMITER1) ) {
                                                        alt57=1;
                                                    }
                                                    switch (alt57) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:9: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1595); 

                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_ap1597);
                                                            spec_sized_mult_lvl1_st_optionnal_6("AP.22", 200);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:9: ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )?
                                                            int alt56=2;
                                                            int LA56_0 = input.LA(1);

                                                            if ( (LA56_0==DELIMITER1) ) {
                                                                alt56=1;
                                                            }
                                                            switch (alt56) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:10: DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1609); 

                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap1611);
                                                                    ts_sized_optionnal("AP.23", 15);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:10: ( DELIMITER1 )?
                                                                    int alt55=2;
                                                                    int LA55_0 = input.LA(1);

                                                                    if ( (LA55_0==DELIMITER1) ) {
                                                                        alt55=1;
                                                                    }
                                                                    switch (alt55) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:10: DELIMITER1
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap1623); 

                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_ap"



    // $ANTLR start "line_ac"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:1: line_ac : ( CR CHARA CHARC ) DELIMITER1 nm_integer_sized_mandatory[\"AC.2\", 4] DELIMITER1 st_sized_mandatory[\"AC.3\", 9] DELIMITER1 st_sized_mandatory[\"AC.4\", 15] DELIMITER1 ts_sized_optionnal[\"AC.5\", 8] DELIMITER1 ts_sized_mandatory[\"AC.6\", 8] DELIMITER1 st_sized_optionnal[\"AC.7\", 28] DELIMITER1 spec_ac_8[\"AC.8\", 10] ( DELIMITER1 st_sized_optionnal[\"AC.9\", 40] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AC.10\", 200] ( DELIMITER1 )? )? )? ;
    public final void line_ac() throws RecognitionException {
        startElement("AC");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:22: ( ( CR CHARA CHARC ) DELIMITER1 nm_integer_sized_mandatory[\"AC.2\", 4] DELIMITER1 st_sized_mandatory[\"AC.3\", 9] DELIMITER1 st_sized_mandatory[\"AC.4\", 15] DELIMITER1 ts_sized_optionnal[\"AC.5\", 8] DELIMITER1 ts_sized_mandatory[\"AC.6\", 8] DELIMITER1 st_sized_optionnal[\"AC.7\", 28] DELIMITER1 spec_ac_8[\"AC.8\", 10] ( DELIMITER1 st_sized_optionnal[\"AC.9\", 40] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AC.10\", 200] ( DELIMITER1 )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:3: ( CR CHARA CHARC ) DELIMITER1 nm_integer_sized_mandatory[\"AC.2\", 4] DELIMITER1 st_sized_mandatory[\"AC.3\", 9] DELIMITER1 st_sized_mandatory[\"AC.4\", 15] DELIMITER1 ts_sized_optionnal[\"AC.5\", 8] DELIMITER1 ts_sized_mandatory[\"AC.6\", 8] DELIMITER1 st_sized_optionnal[\"AC.7\", 28] DELIMITER1 spec_ac_8[\"AC.8\", 10] ( DELIMITER1 st_sized_optionnal[\"AC.9\", 40] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AC.10\", 200] ( DELIMITER1 )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:3: ( CR CHARA CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:4: CR CHARA CHARC
            {
            match(input,CR,FOLLOW_CR_in_line_ac1657); 

            match(input,CHARA,FOLLOW_CHARA_in_line_ac1659); 

            match(input,CHARC,FOLLOW_CHARC_in_line_ac1661); 

            }


            startElement("AC.1");content("AC");endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1668); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ac1670);
            nm_integer_sized_mandatory("AC.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1675); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ac1677);
            st_sized_mandatory("AC.3", 9);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1682); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ac1684);
            st_sized_mandatory("AC.4", 15);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1689); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_ac1691);
            ts_sized_optionnal("AC.5", 8);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1696); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_ac1698);
            ts_sized_mandatory("AC.6", 8);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1703); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_ac1705);
            st_sized_optionnal("AC.7", 28);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1710); 

            pushFollow(FOLLOW_spec_ac_8_in_line_ac1712);
            spec_ac_8("AC.8", 10);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:3: ( DELIMITER1 st_sized_optionnal[\"AC.9\", 40] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AC.10\", 200] ( DELIMITER1 )? )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==DELIMITER1) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:4: DELIMITER1 st_sized_optionnal[\"AC.9\", 40] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AC.10\", 200] ( DELIMITER1 )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1718); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_ac1720);
                    st_sized_optionnal("AC.9", 40);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AC.10\", 200] ( DELIMITER1 )? )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==DELIMITER1) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AC.10\", 200] ( DELIMITER1 )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1727); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_ac1729);
                            spec_sized_mult_lvl1_st_optionnal_6("AC.10", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:5: ( DELIMITER1 )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==DELIMITER1) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:5: DELIMITER1
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ac1736); 

                                    }
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
    // $ANTLR end "line_ac"



    // $ANTLR start "line_p"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:552:1: line_p : ( CR CHARP ) DELIMITER1 nm_integer_sized_mandatory[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:552:8: ( ( CR CHARP ) DELIMITER1 nm_integer_sized_mandatory[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:553:3: ( CR CHARP ) DELIMITER1 nm_integer_sized_mandatory[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:553:3: ( CR CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:553:4: CR CHARP
            {
            match(input,CR,FOLLOW_CR_in_line_p1757); 

            match(input,CHARP,FOLLOW_CHARP_in_line_p1759); 

            }


            startElement("P.1");content("P");endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1766); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_p1768);
            nm_integer_sized_mandatory("P.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1773); 

            pushFollow(FOLLOW_spec_sized_8_3_in_line_p1775);
            spec_sized_8_3("P.3", 36);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1780); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1782);
            st_sized_optionnal("P.4", 16);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:3: ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==DELIMITER1) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:4: DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1788); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1790);
                    st_sized_optionnal("P.5", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==DELIMITER1) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1797); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1799);
                            spec_sized_mult_lvl1_st_optionnal_6("P.6", 48);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:5: ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==DELIMITER1) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:6: DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1807); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1809);
                                    st_sized_optionnal("P.7", 24);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:6: ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt97=2;
                                    int LA97_0 = input.LA(1);

                                    if ( (LA97_0==DELIMITER1) ) {
                                        alt97=1;
                                    }
                                    switch (alt97) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:7: DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1818); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p1820);
                                            ts_sized_optionnal("P.8", 26);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:7: ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt96=2;
                                            int LA96_0 = input.LA(1);

                                            if ( (LA96_0==DELIMITER1) ) {
                                                alt96=1;
                                            }
                                            switch (alt96) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:8: DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1830); 

                                                    pushFollow(FOLLOW_spec_const_sexe_in_line_p1832);
                                                    spec_const_sexe("P.9");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:8: ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt95=2;
                                                    int LA95_0 = input.LA(1);

                                                    if ( (LA95_0==DELIMITER1) ) {
                                                        alt95=1;
                                                    }
                                                    switch (alt95) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:9: DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1843); 

                                                            pushFollow(FOLLOW_spec_const_race_in_line_p1845);
                                                            spec_const_race("P.10");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:563:9: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt94=2;
                                                            int LA94_0 = input.LA(1);

                                                            if ( (LA94_0==DELIMITER1) ) {
                                                                alt94=1;
                                                            }
                                                            switch (alt94) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:563:10: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1857); 

                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1859);
                                                                    spec_sized_mult_lvl1_st_optionnal_6("P.11", 200);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:10: ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt93=2;
                                                                    int LA93_0 = input.LA(1);

                                                                    if ( (LA93_0==DELIMITER1) ) {
                                                                        alt93=1;
                                                                    }
                                                                    switch (alt93) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:11: DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1872); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1874);
                                                                            st_sized_optionnal("P.12", 120);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:565:11: ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt92=2;
                                                                            int LA92_0 = input.LA(1);

                                                                            if ( (LA92_0==DELIMITER1) ) {
                                                                                alt92=1;
                                                                            }
                                                                            switch (alt92) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:565:12: DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1888); 

                                                                                    pushFollow(FOLLOW_spec_sized_tn_in_line_p1890);
                                                                                    spec_sized_tn("P.13", 40);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:12: ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt91=2;
                                                                                    int LA91_0 = input.LA(1);

                                                                                    if ( (LA91_0==DELIMITER1) ) {
                                                                                        alt91=1;
                                                                                    }
                                                                                    switch (alt91) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:13: DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1929); 

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p1931);
                                                                                            spec_sized_cna("P.14", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:51: ( REPETITEUR spec_sized_cna[\"P.14\", 60] )*
                                                                                            loop66:
                                                                                            do {
                                                                                                int alt66=2;
                                                                                                int LA66_0 = input.LA(1);

                                                                                                if ( (LA66_0==REPETITEUR) ) {
                                                                                                    alt66=1;
                                                                                                }


                                                                                                switch (alt66) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:52: REPETITEUR spec_sized_cna[\"P.14\", 60]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1935); 

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p1937);
                                                                                            	    spec_sized_cna("P.14", 60);

                                                                                            	    state._fsp--;


                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop66;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:13: ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt90=2;
                                                                                            int LA90_0 = input.LA(1);

                                                                                            if ( (LA90_0==DELIMITER1) ) {
                                                                                                alt90=1;
                                                                                            }
                                                                                            switch (alt90) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:14: DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1955); 

                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1957);
                                                                                                    st_sized_optionnal("P.15", 60);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:570:14: ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt89=2;
                                                                                                    int LA89_0 = input.LA(1);

                                                                                                    if ( (LA89_0==DELIMITER1) ) {
                                                                                                        alt89=1;
                                                                                                    }
                                                                                                    switch (alt89) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:570:15: DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1974); 

                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1976);
                                                                                                            st_sized_optionnal("P.16", 60);

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:572:15: ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt88=2;
                                                                                                            int LA88_0 = input.LA(1);

                                                                                                            if ( (LA88_0==DELIMITER1) ) {
                                                                                                                alt88=1;
                                                                                                            }
                                                                                                            switch (alt88) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:572:16: DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2009); 

                                                                                                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2011);
                                                                                                                    nm_sized_optionnal("P.17", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:574:16: ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt87=2;
                                                                                                                    int LA87_0 = input.LA(1);

                                                                                                                    if ( (LA87_0==DELIMITER1) ) {
                                                                                                                        alt87=1;
                                                                                                                    }
                                                                                                                    switch (alt87) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:574:17: DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2046); 

                                                                                                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2048);
                                                                                                                            nm_sized_optionnal("P.18", 10);

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:575:17: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt86=2;
                                                                                                                            int LA86_0 = input.LA(1);

                                                                                                                            if ( (LA86_0==DELIMITER1) ) {
                                                                                                                                alt86=1;
                                                                                                                            }
                                                                                                                            switch (alt86) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:575:18: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2068); 

                                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2070);
                                                                                                                                    spec_sized_mult_lvl1_st_optionnal_6("P.19", 200);

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:575:78: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )*
                                                                                                                                    loop67:
                                                                                                                                    do {
                                                                                                                                        int alt67=2;
                                                                                                                                        int LA67_0 = input.LA(1);

                                                                                                                                        if ( (LA67_0==REPETITEUR) ) {
                                                                                                                                            alt67=1;
                                                                                                                                        }


                                                                                                                                        switch (alt67) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:575:79: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2074); 

                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2076);
                                                                                                                                    	    spec_sized_mult_lvl1_st_optionnal_6("P.19", 200);

                                                                                                                                    	    state._fsp--;


                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop67;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:576:18: ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt85=2;
                                                                                                                                    int LA85_0 = input.LA(1);

                                                                                                                                    if ( (LA85_0==DELIMITER1) ) {
                                                                                                                                        alt85=1;
                                                                                                                                    }
                                                                                                                                    switch (alt85) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:576:19: DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2099); 

                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2101);
                                                                                                                                            st_sized_optionnal("P.20", 200);

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:576:62: ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )*
                                                                                                                                            loop68:
                                                                                                                                            do {
                                                                                                                                                int alt68=2;
                                                                                                                                                int LA68_0 = input.LA(1);

                                                                                                                                                if ( (LA68_0==REPETITEUR) ) {
                                                                                                                                                    alt68=1;
                                                                                                                                                }


                                                                                                                                                switch (alt68) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:576:63: REPETITEUR st_sized_optionnal[\"P.20\", 200]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2105); 

                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2107);
                                                                                                                                            	    st_sized_optionnal("P.20", 200);

                                                                                                                                            	    state._fsp--;


                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop68;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:577:19: ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt84=2;
                                                                                                                                            int LA84_0 = input.LA(1);

                                                                                                                                            if ( (LA84_0==DELIMITER1) ) {
                                                                                                                                                alt84=1;
                                                                                                                                            }
                                                                                                                                            switch (alt84) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:577:20: DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2131); 

                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2133);
                                                                                                                                                    st_sized_optionnal("P.21", 200);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:20: ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt83=2;
                                                                                                                                                    int LA83_0 = input.LA(1);

                                                                                                                                                    if ( (LA83_0==DELIMITER1) ) {
                                                                                                                                                        alt83=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt83) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:21: DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2156); 

                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2158);
                                                                                                                                                            st_sized_optionnal("P.22", 60);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:579:21: ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt82=2;
                                                                                                                                                            int LA82_0 = input.LA(1);

                                                                                                                                                            if ( (LA82_0==DELIMITER1) ) {
                                                                                                                                                                alt82=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt82) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:579:22: DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2182); 

                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2184);
                                                                                                                                                                    st_sized_optionnal("P.23", 60);

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:22: ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt81=2;
                                                                                                                                                                    int LA81_0 = input.LA(1);

                                                                                                                                                                    if ( (LA81_0==DELIMITER1) ) {
                                                                                                                                                                        alt81=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt81) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:23: DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2209); 

                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2211);
                                                                                                                                                                            ts_sized_optionnal("P.24", 26);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:65: ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )?
                                                                                                                                                                            int alt69=2;
                                                                                                                                                                            int LA69_0 = input.LA(1);

                                                                                                                                                                            if ( (LA69_0==REPETITEUR) ) {
                                                                                                                                                                                alt69=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt69) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:66: REPETITEUR ts_sized_optionnal[\"P.24\", 26]
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2215); 

                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2217);
                                                                                                                                                                                    ts_sized_optionnal("P.24", 26);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:23: ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt80=2;
                                                                                                                                                                            int LA80_0 = input.LA(1);

                                                                                                                                                                            if ( (LA80_0==DELIMITER1) ) {
                                                                                                                                                                                alt80=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt80) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:24: DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2245); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_const_8_25_in_line_p2247);
                                                                                                                                                                                    spec_const_8_25("P.25");

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:582:24: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt79=2;
                                                                                                                                                                                    int LA79_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA79_0==DELIMITER1) ) {
                                                                                                                                                                                        alt79=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt79) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:582:25: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2274); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2276);
                                                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_8("P.26", 100);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:25: ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt78=2;
                                                                                                                                                                                            int LA78_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA78_0==DELIMITER1) ) {
                                                                                                                                                                                                alt78=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt78) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:26: DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2329); 

                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2331);
                                                                                                                                                                                                    st_sized_optionnal("P.27", 100);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:26: ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt77=2;
                                                                                                                                                                                                    int LA77_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA77_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt77=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt77) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:27: DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2360); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_p2362);
                                                                                                                                                                                                            spec_const_race("P.28");

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:27: ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt76=2;
                                                                                                                                                                                                            int LA76_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA76_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt76=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt76) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:28: DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2419); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2421);
                                                                                                                                                                                                                    st_sized_optionnal("P.29", 2);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:589:28: ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt75=2;
                                                                                                                                                                                                                    int LA75_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA75_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt75=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt75) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:589:29: DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2480); 

                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2482);
                                                                                                                                                                                                                            st_sized_optionnal("P.30", 20);

                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:590:29: ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt74=2;
                                                                                                                                                                                                                            int LA74_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA74_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt74=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt74) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:590:30: DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2514); 

                                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2516);
                                                                                                                                                                                                                                    st_sized_optionnal("P.31", 20);

                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:592:30: ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt73=2;
                                                                                                                                                                                                                                    int LA73_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA73_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt73=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt73) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:592:31: DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2579); 

                                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2581);
                                                                                                                                                                                                                                            st_sized_optionnal("P.32", 20);

                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:593:31: ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt72=2;
                                                                                                                                                                                                                                            int LA72_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA72_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt72=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt72) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:593:32: DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2615); 

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2617);
                                                                                                                                                                                                                                                    ts_sized_optionnal("P.33", 26);

                                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:594:32: ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt71=2;
                                                                                                                                                                                                                                                    int LA71_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA71_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt71=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt71) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:594:33: DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2652); 

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2654);
                                                                                                                                                                                                                                                            ts_sized_optionnal("P.34", 26);

                                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt70=2;
                                                                                                                                                                                                                                                            int LA70_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA70_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt70=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt70) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2689); 

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_p"



    // $ANTLR start "line_obr"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:597:1: line_obr : ( CR CHARO CHARB CHARR ) DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:597:10: ( ( CR CHARO CHARB CHARR ) DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:598:3: ( CR CHARO CHARB CHARR ) DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:598:3: ( CR CHARO CHARB CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:598:4: CR CHARO CHARB CHARR
            {
            match(input,CR,FOLLOW_CR_in_line_obr2761); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obr2763); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obr2765); 

            match(input,CHARR,FOLLOW_CHARR_in_line_obr2767); 

            }


            startElement("OBR.1");content("OBR");endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2774); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obr2776);
            nm_integer_sized_mandatory("OBR.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2781); 

            pushFollow(FOLLOW_spec_sized_9_3_in_line_obr2783);
            spec_sized_9_3("OBR.3", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2788); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2790);
            spec_sized_mult_lvl1_st_optionnal_2("OBR.4", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2795); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2797);
            spec_sized_mult_lvl1_st_optionnal_6("OBR.5", 640000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:67: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==REPETITEUR) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:68: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2801); 

            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2803);
            	    spec_sized_mult_lvl1_st_optionnal_6("OBR.5", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2813); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2815);
            st_sized_optionnal("OBR.6", 2);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:45: ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==REPETITEUR) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:46: REPETITEUR st_sized_optionnal[\"OBR.6\", 2]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2819); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2821);
            	    st_sized_optionnal("OBR.6", 2);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2828); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2830);
            ts_sized_optionnal("OBR.7", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2835); 

            pushFollow(FOLLOW_spec_non_sized_9_8_in_line_obr2837);
            spec_non_sized_9_8("OBR.8");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2842); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2844);
            ts_sized_optionnal("OBR.9", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2852); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2854);
            st_sized_optionnal("OBR.10", 20);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2859); 

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2861);
            spec_sized_cna("OBR.11", 60);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2869); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2871);
            st_sized_optionnal("OBR.12", 1);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:3: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==DELIMITER1) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:4: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2880); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2882);
                    spec_sized_mult_lvl1_st_optionnal_2("OBR.13", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:4: ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==DELIMITER1) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:5: DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2889); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2891);
                            st_sized_optionnal("OBR.14", 300);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:616:5: ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt128=2;
                            int LA128_0 = input.LA(1);

                            if ( (LA128_0==DELIMITER1) ) {
                                alt128=1;
                            }
                            switch (alt128) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:616:6: DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2899); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2901);
                                    ts_sized_optionnal("OBR.15", 26);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:617:6: ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt127=2;
                                    int LA127_0 = input.LA(1);

                                    if ( (LA127_0==DELIMITER1) ) {
                                        alt127=1;
                                    }
                                    switch (alt127) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:617:7: DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2910); 

                                            pushFollow(FOLLOW_spec_sized_9_16_in_line_obr2912);
                                            spec_sized_9_16("OBR.16", 300);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:618:7: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt126=2;
                                            int LA126_0 = input.LA(1);

                                            if ( (LA126_0==DELIMITER1) ) {
                                                alt126=1;
                                            }
                                            switch (alt126) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:618:8: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2922); 

                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2924);
                                                    spec_sized_mult_lvl1_st_optionnal_6("OBR.17", 60);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:619:8: ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt125=2;
                                                    int LA125_0 = input.LA(1);

                                                    if ( (LA125_0==DELIMITER1) ) {
                                                        alt125=1;
                                                    }
                                                    switch (alt125) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:619:9: DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2935); 

                                                            pushFollow(FOLLOW_spec_sized_tn_in_line_obr2937);
                                                            spec_sized_tn("OBR.18", 40);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:9: ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt124=2;
                                                            int LA124_0 = input.LA(1);

                                                            if ( (LA124_0==DELIMITER1) ) {
                                                                alt124=1;
                                                            }
                                                            switch (alt124) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:10: DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2949); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2951);
                                                                    st_sized_optionnal("OBR.19", 60);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:621:10: ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt123=2;
                                                                    int LA123_0 = input.LA(1);

                                                                    if ( (LA123_0==DELIMITER1) ) {
                                                                        alt123=1;
                                                                    }
                                                                    switch (alt123) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:621:11: DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2964); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2966);
                                                                            st_sized_optionnal("OBR.20", 60);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:622:11: ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt122=2;
                                                                            int LA122_0 = input.LA(1);

                                                                            if ( (LA122_0==DELIMITER1) ) {
                                                                                alt122=1;
                                                                            }
                                                                            switch (alt122) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:622:12: DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2980); 

                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2982);
                                                                                    st_sized_optionnal("OBR.21", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:12: ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt121=2;
                                                                                    int LA121_0 = input.LA(1);

                                                                                    if ( (LA121_0==DELIMITER1) ) {
                                                                                        alt121=1;
                                                                                    }
                                                                                    switch (alt121) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:13: DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2997); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2999);
                                                                                            st_sized_optionnal("OBR.22", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:624:13: ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt120=2;
                                                                                            int LA120_0 = input.LA(1);

                                                                                            if ( (LA120_0==DELIMITER1) ) {
                                                                                                alt120=1;
                                                                                            }
                                                                                            switch (alt120) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:624:14: DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3015); 

                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr3017);
                                                                                                    ts_sized_optionnal("OBR.23", 26);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:14: ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt119=2;
                                                                                                    int LA119_0 = input.LA(1);

                                                                                                    if ( (LA119_0==DELIMITER1) ) {
                                                                                                        alt119=1;
                                                                                                    }
                                                                                                    switch (alt119) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:15: DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3034); 

                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr3036);
                                                                                                            spec_const_race("OBR.24");

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:15: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt118=2;
                                                                                                            int LA118_0 = input.LA(1);

                                                                                                            if ( (LA118_0==DELIMITER1) ) {
                                                                                                                alt118=1;
                                                                                                            }
                                                                                                            switch (alt118) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:16: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3054); 

                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr3056);
                                                                                                                    spec_sized_mult_lvl1_st_optionnal_2("OBR.25", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:627:16: ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt117=2;
                                                                                                                    int LA117_0 = input.LA(1);

                                                                                                                    if ( (LA117_0==DELIMITER1) ) {
                                                                                                                        alt117=1;
                                                                                                                    }
                                                                                                                    switch (alt117) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:627:17: DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3075); 

                                                                                                                            pushFollow(FOLLOW_spec_const_9_26_in_line_obr3077);
                                                                                                                            spec_const_9_26("OBR.26");

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:628:17: ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt116=2;
                                                                                                                            int LA116_0 = input.LA(1);

                                                                                                                            if ( (LA116_0==DELIMITER1) ) {
                                                                                                                                alt116=1;
                                                                                                                            }
                                                                                                                            switch (alt116) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:628:18: DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3097); 

                                                                                                                                    pushFollow(FOLLOW_spec_const_race_in_line_obr3099);
                                                                                                                                    spec_const_race("OBR.27");

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:629:18: ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt115=2;
                                                                                                                                    int LA115_0 = input.LA(1);

                                                                                                                                    if ( (LA115_0==DELIMITER1) ) {
                                                                                                                                        alt115=1;
                                                                                                                                    }
                                                                                                                                    switch (alt115) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:629:19: DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3120); 

                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr3122);
                                                                                                                                            spec_const_race("OBR.28");

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt114=2;
                                                                                                                                            int LA114_0 = input.LA(1);

                                                                                                                                            if ( (LA114_0==DELIMITER1) ) {
                                                                                                                                                alt114=1;
                                                                                                                                            }
                                                                                                                                            switch (alt114) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:20: DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3144); 

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3146);
                                                                                                                                                    spec_sized_cna("OBR.29", 150);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:61: ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )*
                                                                                                                                                    loop103:
                                                                                                                                                    do {
                                                                                                                                                        int alt103=2;
                                                                                                                                                        int LA103_0 = input.LA(1);

                                                                                                                                                        if ( (LA103_0==REPETITEUR) ) {
                                                                                                                                                            alt103=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt103) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:62: REPETITEUR spec_sized_cna[\"OBR.29\", 150]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr3150); 

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3152);
                                                                                                                                                    	    spec_sized_cna("OBR.29", 150);

                                                                                                                                                    	    state._fsp--;


                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop103;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:20: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt113=2;
                                                                                                                                                    int LA113_0 = input.LA(1);

                                                                                                                                                    if ( (LA113_0==DELIMITER1) ) {
                                                                                                                                                        alt113=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt113) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:21: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3177); 

                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr3179);
                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_4("OBR.30", 150);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:632:21: ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt112=2;
                                                                                                                                                            int LA112_0 = input.LA(1);

                                                                                                                                                            if ( (LA112_0==DELIMITER1) ) {
                                                                                                                                                                alt112=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt112) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:632:22: DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3203); 

                                                                                                                                                                    pushFollow(FOLLOW_spec_const_9_31_in_line_obr3205);
                                                                                                                                                                    spec_const_9_31("OBR.31");

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:22: ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    int alt111=2;
                                                                                                                                                                    int LA111_0 = input.LA(1);

                                                                                                                                                                    if ( (LA111_0==DELIMITER1) ) {
                                                                                                                                                                        alt111=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt111) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:23: DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3252); 

                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr3254);
                                                                                                                                                                            st_sized_optionnal("OBR.32", 300);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:68: ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )*
                                                                                                                                                                            loop104:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt104=2;
                                                                                                                                                                                int LA104_0 = input.LA(1);

                                                                                                                                                                                if ( (LA104_0==REPETITEUR) ) {
                                                                                                                                                                                    alt104=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt104) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:69: REPETITEUR st_sized_optionnal[\"OBR.32\", 300]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr3258); 

                                                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr3260);
                                                                                                                                                                            	    st_sized_optionnal("OBR.32", 300);

                                                                                                                                                                            	    state._fsp--;


                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop104;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:635:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            int alt110=2;
                                                                                                                                                                            int LA110_0 = input.LA(1);

                                                                                                                                                                            if ( (LA110_0==DELIMITER1) ) {
                                                                                                                                                                                alt110=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt110) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:635:24: DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3288); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3290);
                                                                                                                                                                                    spec_sized_cna("OBR.33", 60);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    int alt109=2;
                                                                                                                                                                                    int LA109_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA109_0==DELIMITER1) ) {
                                                                                                                                                                                        alt109=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt109) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:25: DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3317); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr3319);
                                                                                                                                                                                            spec_sized_cna("OBR.34", 60);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            int alt108=2;
                                                                                                                                                                                            int LA108_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA108_0==DELIMITER1) ) {
                                                                                                                                                                                                alt108=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt108) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:26: DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3347); 

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr3349);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", 60);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:638:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    int alt107=2;
                                                                                                                                                                                                    int LA107_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA107_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt107=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt107) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:638:27: DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3378); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr3380);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", 60);

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:639:27: ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            int alt106=2;
                                                                                                                                                                                                            int LA106_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA106_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt106=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt106) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:639:28: DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3410); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr3412);
                                                                                                                                                                                                                    ts_sized_optionnal("OBR.37", 26);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:640:29: ( DELIMITER1 )?
                                                                                                                                                                                                                    int alt105=2;
                                                                                                                                                                                                                    int LA105_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA105_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt105=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt105) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:640:29: DELIMITER1
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr3443); 

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_obr"



    // $ANTLR start "line_obx"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:1: line_obx : ( CR CHARO CHARB CHARX ) DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) ;
    public final void line_obx() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:10: ( ( CR CHARO CHARB CHARX ) DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:3: ( CR CHARO CHARB CHARX ) DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:3: ( CR CHARO CHARB CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:4: CR CHARO CHARB CHARX
            {
            match(input,CR,FOLLOW_CR_in_line_obx3505); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obx3507); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obx3509); 

            match(input,CHARX,FOLLOW_CHARX_in_line_obx3511); 

            }


            startElement("OBX.1");content("OBX");endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3518); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obx3520);
            nm_integer_sized_mandatory("OBX.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3525); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:646:5: ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            int alt166=7;
            switch ( input.LA(1) ) {
            case CHARN:
                {
                alt166=1;
                }
                break;
            case CHARC:
                {
                int LA166_2 = input.LA(2);

                if ( (LA166_2==CHARE) ) {
                    alt166=2;
                }
                else if ( (LA166_2==CHARK||LA166_2==CHARN) ) {
                    alt166=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 166, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARF:
                {
                alt166=3;
                }
                break;
            case CHARS:
                {
                alt166=4;
                }
                break;
            case CHARG:
                {
                int LA166_5 = input.LA(2);

                if ( (LA166_5==CHARC) ) {
                    alt166=5;
                }
                else if ( (LA166_5==CHARB||LA166_5==CHARN) ) {
                    alt166=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 166, 5, input);

                    throw nvae;

                }
                }
                break;
            case CHART:
                {
                int LA166_6 = input.LA(2);

                if ( (LA166_6==CHARX) ) {
                    alt166=6;
                }
                else if ( (LA166_6==CHARN) ) {
                    alt166=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 166, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARA:
            case CHARD:
            case CHARP:
                {
                alt166=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;

            }

            switch (alt166) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:646:6: ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:646:6: ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:646:7: spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_nm_in_line_obx3533);
                    spec_const_10_3_nm("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==DELIMITER1) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3542); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3544);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:648:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt134=2;
                            int LA134_0 = input.LA(1);

                            if ( (LA134_0==DELIMITER1) ) {
                                alt134=1;
                            }
                            switch (alt134) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:648:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3554); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3556);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:8: ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt133=2;
                                    int LA133_0 = input.LA(1);

                                    if ( (LA133_0==DELIMITER1) ) {
                                        alt133=1;
                                    }
                                    switch (alt133) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:9: DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3567); 

                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx3569);
                                            nm_sized_optionnal("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:55: ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )*
                                            loop131:
                                            do {
                                                int alt131=2;
                                                int LA131_0 = input.LA(1);

                                                if ( (LA131_0==REPETITEUR) ) {
                                                    alt131=1;
                                                }


                                                switch (alt131) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:56: REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3573); 

                                            	    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx3575);
                                            	    nm_sized_optionnal("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop131;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:650:9: ( line_obx2_1_post10_6 )?
                                            int alt132=2;
                                            int LA132_0 = input.LA(1);

                                            if ( (LA132_0==DELIMITER1) ) {
                                                alt132=1;
                                            }
                                            switch (alt132) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:650:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3588);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:7: ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:7: ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:8: spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_ce_in_line_obx3605);
                    spec_const_10_3_ce("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==DELIMITER1) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3614); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3616);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:653:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt139=2;
                            int LA139_0 = input.LA(1);

                            if ( (LA139_0==DELIMITER1) ) {
                                alt139=1;
                            }
                            switch (alt139) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:653:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3626); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3628);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:8: ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt138=2;
                                    int LA138_0 = input.LA(1);

                                    if ( (LA138_0==DELIMITER1) ) {
                                        alt138=1;
                                    }
                                    switch (alt138) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:9: DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3639); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx3641);
                                            spec_sized_10_6("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:52: ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )*
                                            loop136:
                                            do {
                                                int alt136=2;
                                                int LA136_0 = input.LA(1);

                                                if ( (LA136_0==REPETITEUR) ) {
                                                    alt136=1;
                                                }


                                                switch (alt136) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:53: REPETITEUR spec_sized_10_6[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3645); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx3647);
                                            	    spec_sized_10_6("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop136;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:655:9: ( line_obx2_1_post10_6 )?
                                            int alt137=2;
                                            int LA137_0 = input.LA(1);

                                            if ( (LA137_0==DELIMITER1) ) {
                                                alt137=1;
                                            }
                                            switch (alt137) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:655:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3660);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:656:7: ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:656:7: ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:656:8: spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_fic_in_line_obx3677);
                    spec_const_10_3_fic("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:657:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==DELIMITER1) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:657:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3686); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3688);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:658:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt144=2;
                            int LA144_0 = input.LA(1);

                            if ( (LA144_0==DELIMITER1) ) {
                                alt144=1;
                            }
                            switch (alt144) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:658:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3698); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3700);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:8: ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt143=2;
                                    int LA143_0 = input.LA(1);

                                    if ( (LA143_0==DELIMITER1) ) {
                                        alt143=1;
                                    }
                                    switch (alt143) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:9: DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3711); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx3713);
                                            spec_sized_10_6("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:52: ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )*
                                            loop141:
                                            do {
                                                int alt141=2;
                                                int LA141_0 = input.LA(1);

                                                if ( (LA141_0==REPETITEUR) ) {
                                                    alt141=1;
                                                }


                                                switch (alt141) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:53: REPETITEUR spec_sized_10_6[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3717); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx3719);
                                            	    spec_sized_10_6("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop141;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:9: ( line_obx2_1_post10_6 )?
                                            int alt142=2;
                                            int LA142_0 = input.LA(1);

                                            if ( (LA142_0==DELIMITER1) ) {
                                                alt142=1;
                                            }
                                            switch (alt142) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3732);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:661:7: ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:661:7: ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:661:8: spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_st_in_line_obx3749);
                    spec_const_10_3_st("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:662:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==DELIMITER1) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:662:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3758); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3760);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:663:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt149=2;
                            int LA149_0 = input.LA(1);

                            if ( (LA149_0==DELIMITER1) ) {
                                alt149=1;
                            }
                            switch (alt149) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:663:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3770); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3772);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt148=2;
                                    int LA148_0 = input.LA(1);

                                    if ( (LA148_0==DELIMITER1) ) {
                                        alt148=1;
                                    }
                                    switch (alt148) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:9: DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3783); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3785);
                                            spec_sized_10_6_tx("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:55: ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )*
                                            loop146:
                                            do {
                                                int alt146=2;
                                                int LA146_0 = input.LA(1);

                                                if ( (LA146_0==REPETITEUR) ) {
                                                    alt146=1;
                                                }


                                                switch (alt146) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:56: REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3789); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3791);
                                            	    spec_sized_10_6_tx("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop146;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:665:9: ( line_obx2_1_post10_6 )?
                                            int alt147=2;
                                            int LA147_0 = input.LA(1);

                                            if ( (LA147_0==DELIMITER1) ) {
                                                alt147=1;
                                            }
                                            switch (alt147) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:665:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3804);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:7: ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:7: ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:8: spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_gc_in_line_obx3821);
                    spec_const_10_3_gc("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==DELIMITER1) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3830); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3832);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt154=2;
                            int LA154_0 = input.LA(1);

                            if ( (LA154_0==DELIMITER1) ) {
                                alt154=1;
                            }
                            switch (alt154) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3842); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3844);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:8: ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt153=2;
                                    int LA153_0 = input.LA(1);

                                    if ( (LA153_0==DELIMITER1) ) {
                                        alt153=1;
                                    }
                                    switch (alt153) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:9: DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3855); 

                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3857);
                                            spec_sized_mult_lvl1_nm_optionnal_2("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:72: ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )*
                                            loop151:
                                            do {
                                                int alt151=2;
                                                int LA151_0 = input.LA(1);

                                                if ( (LA151_0==REPETITEUR) ) {
                                                    alt151=1;
                                                }


                                                switch (alt151) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:73: REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3861); 

                                            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3863);
                                            	    spec_sized_mult_lvl1_nm_optionnal_2("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop151;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:9: ( line_obx2_1_post10_6 )?
                                            int alt152=2;
                                            int LA152_0 = input.LA(1);

                                            if ( (LA152_0==DELIMITER1) ) {
                                                alt152=1;
                                            }
                                            switch (alt152) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3876);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:671:7: ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:671:7: ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:671:8: spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_tx_in_line_obx3893);
                    spec_const_10_3_tx("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==DELIMITER1) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3902); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3904);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:673:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt159=2;
                            int LA159_0 = input.LA(1);

                            if ( (LA159_0==DELIMITER1) ) {
                                alt159=1;
                            }
                            switch (alt159) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:673:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3914); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3916);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:674:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt158=2;
                                    int LA158_0 = input.LA(1);

                                    if ( (LA158_0==DELIMITER1) ) {
                                        alt158=1;
                                    }
                                    switch (alt158) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:674:9: DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3927); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3929);
                                            spec_sized_10_6_tx("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:674:55: ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )*
                                            loop156:
                                            do {
                                                int alt156=2;
                                                int LA156_0 = input.LA(1);

                                                if ( (LA156_0==REPETITEUR) ) {
                                                    alt156=1;
                                                }


                                                switch (alt156) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:674:56: REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3933); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3935);
                                            	    spec_sized_10_6_tx("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop156;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:675:9: ( line_obx2_1_post10_6 )?
                                            int alt157=2;
                                            int LA157_0 = input.LA(1);

                                            if ( (LA157_0==DELIMITER1) ) {
                                                alt157=1;
                                            }
                                            switch (alt157) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:675:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3948);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:676:7: ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:676:7: ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:676:8: spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_std_in_line_obx3965);
                    spec_const_10_3_std("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==DELIMITER1) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3974); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3976);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt164=2;
                            int LA164_0 = input.LA(1);

                            if ( (LA164_0==DELIMITER1) ) {
                                alt164=1;
                            }
                            switch (alt164) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3986); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3988);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:8: ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt163=2;
                                    int LA163_0 = input.LA(1);

                                    if ( (LA163_0==DELIMITER1) ) {
                                        alt163=1;
                                    }
                                    switch (alt163) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:9: DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3999); 

                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx4001);
                                            st_sized_optionnal("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:55: ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )*
                                            loop161:
                                            do {
                                                int alt161=2;
                                                int LA161_0 = input.LA(1);

                                                if ( (LA161_0==REPETITEUR) ) {
                                                    alt161=1;
                                                }


                                                switch (alt161) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:56: REPETITEUR st_sized_optionnal[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx4005); 

                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx4007);
                                            	    st_sized_optionnal("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop161;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:680:9: ( line_obx2_1_post10_6 )?
                                            int alt162=2;
                                            int LA162_0 = input.LA(1);

                                            if ( (LA162_0==DELIMITER1) ) {
                                                alt162=1;
                                            }
                                            switch (alt162) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:680:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx4020);
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

        }
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



    // $ANTLR start "line_obx2_1_post10_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:682:1: line_obx2_1_post10_6 : ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) ;
    public final void line_obx2_1_post10_6() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:682:21: ( ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:5: ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:5: ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:6: DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64041); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64043);
            st_sized_optionnal("OBX.7", 20);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:684:6: ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==DELIMITER1) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:684:7: DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64052); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64054);
                    st_sized_optionnal("OBX.8", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:684:50: ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )*
                    loop167:
                    do {
                        int alt167=2;
                        int LA167_0 = input.LA(1);

                        if ( (LA167_0==REPETITEUR) ) {
                            alt167=1;
                        }


                        switch (alt167) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:684:51: REPETITEUR st_sized_optionnal[\"OBX.8\", 60]
                    	    {
                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_64058); 

                    	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64060);
                    	    st_sized_optionnal("OBX.8", 60);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop167;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:7: ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==DELIMITER1) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:8: DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64072); 

                            pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_64074);
                            spec_const_10_9("OBX.9");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:44: ( REPETITEUR spec_const_10_9[\"OBX.9\"] )*
                            loop168:
                            do {
                                int alt168=2;
                                int LA168_0 = input.LA(1);

                                if ( (LA168_0==REPETITEUR) ) {
                                    alt168=1;
                                }


                                switch (alt168) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:45: REPETITEUR spec_const_10_9[\"OBX.9\"]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_64078); 

                            	    pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_64080);
                            	    spec_const_10_9("OBX.9");

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop168;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:686:8: ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            int alt178=2;
                            int LA178_0 = input.LA(1);

                            if ( (LA178_0==DELIMITER1) ) {
                                alt178=1;
                            }
                            switch (alt178) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:686:9: DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64093); 

                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_64095);
                                    nm_sized_optionnal("OBX.10", 5);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:9: ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    int alt177=2;
                                    int LA177_0 = input.LA(1);

                                    if ( (LA177_0==DELIMITER1) ) {
                                        alt177=1;
                                    }
                                    switch (alt177) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:10: DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64107); 

                                            pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_64109);
                                            spec_const_10_11("OBX.11");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:48: ( REPETITEUR spec_const_10_11[\"OBX.11\"] )*
                                            loop169:
                                            do {
                                                int alt169=2;
                                                int LA169_0 = input.LA(1);

                                                if ( (LA169_0==REPETITEUR) ) {
                                                    alt169=1;
                                                }


                                                switch (alt169) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:49: REPETITEUR spec_const_10_11[\"OBX.11\"]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_64113); 

                                            	    pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_64115);
                                            	    spec_const_10_11("OBX.11");

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop169;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:10: ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            int alt176=2;
                                            int LA176_0 = input.LA(1);

                                            if ( (LA176_0==DELIMITER1) ) {
                                                alt176=1;
                                            }
                                            switch (alt176) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:11: DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64130); 

                                                    pushFollow(FOLLOW_spec_const_10_12_in_line_obx2_1_post10_64132);
                                                    spec_const_10_12("OBX.12");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:689:11: ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    int alt175=2;
                                                    int LA175_0 = input.LA(1);

                                                    if ( (LA175_0==DELIMITER1) ) {
                                                        alt175=1;
                                                    }
                                                    switch (alt175) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:689:12: DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64147); 

                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_64149);
                                                            ts_sized_optionnal("OBX.13", 26);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:12: ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            int alt174=2;
                                                            int LA174_0 = input.LA(1);

                                                            if ( (LA174_0==DELIMITER1) ) {
                                                                alt174=1;
                                                            }
                                                            switch (alt174) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:13: DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64165); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64167);
                                                                    st_sized_optionnal("OBX.14", 20);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:13: ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    int alt173=2;
                                                                    int LA173_0 = input.LA(1);

                                                                    if ( (LA173_0==DELIMITER1) ) {
                                                                        alt173=1;
                                                                    }
                                                                    switch (alt173) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:14: DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64183); 

                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_64185);
                                                                            ts_sized_optionnal("OBX.15", 26);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:692:14: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )?
                                                                            int alt172=2;
                                                                            int LA172_0 = input.LA(1);

                                                                            if ( (LA172_0==DELIMITER1) ) {
                                                                                alt172=1;
                                                                            }
                                                                            switch (alt172) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:692:15: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64202); 

                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_64204);
                                                                                    spec_sized_mult_lvl1_st_optionnal_6("OBX.16", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:693:15: ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )?
                                                                                    int alt171=2;
                                                                                    int LA171_0 = input.LA(1);

                                                                                    if ( (LA171_0==DELIMITER1) ) {
                                                                                        alt171=1;
                                                                                    }
                                                                                    switch (alt171) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:693:16: DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64222); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64224);
                                                                                            st_sized_optionnal("OBX.17", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:693:60: ( DELIMITER1 )?
                                                                                            int alt170=2;
                                                                                            int LA170_0 = input.LA(1);

                                                                                            if ( (LA170_0==DELIMITER1) ) {
                                                                                                alt170=1;
                                                                                            }
                                                                                            switch (alt170) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:693:60: DELIMITER1
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_64227); 

                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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



    // $ANTLR start "line_c"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:1: line_c : CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:697:22: ( CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:698:3: CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )?
            {
            match(input,CR,FOLLOW_CR_in_line_c4266); 

            match(input,CHARC,FOLLOW_CHARC_in_line_c4268); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c4272); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_c4274);
            nm_integer_sized_mandatory("C.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c4279); 

            pushFollow(FOLLOW_spec_const_12_3_in_line_c4281);
            spec_const_12_3("C.3");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c4286); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_c4288);
            st_sized_optionnal("C.4", 64000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:47: ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )*
            loop181:
            do {
                int alt181=2;
                int LA181_0 = input.LA(1);

                if ( (LA181_0==REPETITEUR) ) {
                    alt181=1;
                }


                switch (alt181) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:48: REPETITEUR st_sized_optionnal[\"C.4\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c4292); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_c4294);
            	    st_sized_optionnal("C.4", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop181;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:702:3: ( DELIMITER1 )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==DELIMITER1) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:702:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c4303); 

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
    // $ANTLR end "line_c"



    // $ANTLR start "line_l"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:1: line_l : CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )? ;
    public final void line_l() throws RecognitionException {
        startElement("L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:22: ( CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:707:3: CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l4321); 

            match(input,CHARL,FOLLOW_CHARL_in_line_l4323); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:3: ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==DELIMITER1) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:4: DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l4328); 

                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l4330);
                    nm_integer_sized_optionnal("L.2", 1);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:709:4: ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    int alt187=2;
                    int LA187_0 = input.LA(1);

                    if ( (LA187_0==DELIMITER1) ) {
                        alt187=1;
                    }
                    switch (alt187) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:709:5: DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l4337); 

                            pushFollow(FOLLOW_spec_const_race_in_line_l4339);
                            spec_const_race("L.3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:710:5: ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )?
                            int alt186=2;
                            int LA186_0 = input.LA(1);

                            if ( (LA186_0==DELIMITER1) ) {
                                alt186=1;
                            }
                            switch (alt186) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:710:6: DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l4347); 

                                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l4349);
                                    nm_integer_sized_optionnal("L.4", 4);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:711:6: ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )?
                                    int alt185=2;
                                    int LA185_0 = input.LA(1);

                                    if ( (LA185_0==DELIMITER1) ) {
                                        alt185=1;
                                    }
                                    switch (alt185) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:711:7: DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l4358); 

                                            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l4360);
                                            nm_integer_sized_optionnal("L.5", 10);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:7: ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )?
                                            int alt184=2;
                                            int LA184_0 = input.LA(1);

                                            if ( (LA184_0==DELIMITER1) ) {
                                                alt184=1;
                                            }
                                            switch (alt184) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:8: DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l4370); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_l4372);
                                                    st_sized_optionnal("L.6", 12);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:49: ( DELIMITER1 )?
                                                    int alt183=2;
                                                    int LA183_0 = input.LA(1);

                                                    if ( (LA183_0==DELIMITER1) ) {
                                                        alt183=1;
                                                    }
                                                    switch (alt183) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:49: DELIMITER1
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l4375); 

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_l"


    public static class spec_ac_8_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_ac_8"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:722:1: spec_ac_8[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 spec_ac_8_2[$nameElement + \".2\"] DELIMITER2 spec_ac_8_3[$nameElement + \".3\"] nm_nonsized_mandatory[$nameElement + \".4\"] ;
    public final HPRIMSParser.spec_ac_8_return spec_ac_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_ac_8_return retval = new HPRIMSParser.spec_ac_8_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:724:22: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 spec_ac_8_2[$nameElement + \".2\"] DELIMITER2 spec_ac_8_3[$nameElement + \".3\"] nm_nonsized_mandatory[$nameElement + \".4\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 spec_ac_8_2[$nameElement + \".2\"] DELIMITER2 spec_ac_8_3[$nameElement + \".3\"] nm_nonsized_mandatory[$nameElement + \".4\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_ac_84412);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_ac_84417); 

            pushFollow(FOLLOW_spec_ac_8_2_in_spec_ac_84419);
            spec_ac_8_2(nameElement + ".2");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_ac_84424); 

            pushFollow(FOLLOW_spec_ac_8_3_in_spec_ac_84426);
            spec_ac_8_3(nameElement + ".3");

            state._fsp--;


            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_ac_84431);
            nm_nonsized_mandatory(nameElement + ".4");

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
    // $ANTLR end "spec_ac_8"



    // $ANTLR start "spec_ac_8_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:1: spec_ac_8_2[String nameElement] : ( final_TM | final_TR | final_FR );
    public final void spec_ac_8_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:733:22: ( final_TM | final_TR | final_FR )
            int alt189=3;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==CHART) ) {
                int LA189_1 = input.LA(2);

                if ( (LA189_1==CHARM) ) {
                    alt189=1;
                }
                else if ( (LA189_1==CHARR) ) {
                    alt189=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 189, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA189_0==CHARF) ) {
                alt189=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;

            }
            switch (alt189) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:3: final_TM
                    {
                    pushFollow(FOLLOW_final_TM_in_spec_ac_8_24454);
                    final_TM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:14: final_TR
                    {
                    pushFollow(FOLLOW_final_TR_in_spec_ac_8_24458);
                    final_TR();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:25: final_FR
                    {
                    pushFollow(FOLLOW_final_FR_in_spec_ac_8_24462);
                    final_FR();

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
    // $ANTLR end "spec_ac_8_2"



    // $ANTLR start "spec_ac_8_3"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:736:1: spec_ac_8_3[String nameElement] : ( final_PF | final_SS | final_TR );
    public final void spec_ac_8_3(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:738:22: ( final_PF | final_SS | final_TR )
            int alt190=3;
            switch ( input.LA(1) ) {
            case CHARP:
                {
                alt190=1;
                }
                break;
            case CHARS:
                {
                alt190=2;
                }
                break;
            case CHART:
                {
                alt190=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 190, 0, input);

                throw nvae;

            }

            switch (alt190) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:739:3: final_PF
                    {
                    pushFollow(FOLLOW_final_PF_in_spec_ac_8_34482);
                    final_PF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:739:14: final_SS
                    {
                    pushFollow(FOLLOW_final_SS_in_spec_ac_8_34486);
                    final_SS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:739:25: final_TR
                    {
                    pushFollow(FOLLOW_final_TR_in_spec_ac_8_34490);
                    final_TR();

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
    // $ANTLR end "spec_ac_8_3"



    // $ANTLR start "spec_on_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:742:1: spec_on_optionnal[String nameElement] : ( final_charO | final_charN )? ;
    public final void spec_on_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:744:22: ( ( final_charO | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:3: ( final_charO | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:3: ( final_charO | final_charN )?
            int alt191=3;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==CHARO) ) {
                alt191=1;
            }
            else if ( (LA191_0==CHARN) ) {
                alt191=2;
            }
            switch (alt191) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:4: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_on_optionnal4510);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:18: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_on_optionnal4514);
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
    // $ANTLR end "spec_on_optionnal"



    // $ANTLR start "spec_const_sexe"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:747:1: spec_const_sexe[String nameElement] : ( final_charM | final_charF | final_charU )? ;
    public final void spec_const_sexe(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:749:22: ( ( final_charM | final_charF | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:3: ( final_charM | final_charF | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:3: ( final_charM | final_charF | final_charU )?
            int alt192=4;
            switch ( input.LA(1) ) {
                case CHARM:
                    {
                    alt192=1;
                    }
                    break;
                case CHARF:
                    {
                    alt192=2;
                    }
                    break;
                case CHARU:
                    {
                    alt192=3;
                    }
                    break;
            }

            switch (alt192) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:4: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_sexe4535);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:18: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_sexe4539);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:32: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_sexe4543);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:1: spec_const_race[String nameElement] :;
    public final void spec_const_race(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:22: ()
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:755:3: 
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:757:1: spec_const_7_13_version_2_0[String nameElement] : spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_0(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:759:22: ( spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:760:3: spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_04580);
            spec_const_7_13_1_version_2_0(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_04583); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_04585);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:1: spec_const_7_13_version_2_1[String nameElement] : spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_1(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:22: ( spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:3: spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_14606);
            spec_const_7_13_1_version_2_1(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_14609); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_14611);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:767:1: spec_const_7_13_version_2_2[String nameElement] : spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:22: ( spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:770:3: spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_24630);
            spec_const_7_13_1_version_2_2(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_24633); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_24635);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:1: spec_const_7_13_2[String nameElement] : ( final_charC | final_charL | final_charR );
    public final void spec_const_7_13_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:774:22: ( final_charC | final_charL | final_charR )
            int alt193=3;
            switch ( input.LA(1) ) {
            case CHARC:
                {
                alt193=1;
                }
                break;
            case CHARL:
                {
                alt193=2;
                }
                break;
            case CHARR:
                {
                alt193=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 193, 0, input);

                throw nvae;

            }

            switch (alt193) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:3: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_7_13_24654);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:17: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_7_13_24658);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:31: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_7_13_24662);
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



    // $ANTLR start "spec_const_7_7_contexte_ORU"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:777:1: spec_const_7_7_contexte_ORU[String nameElement] : final_ORU ;
    public final void spec_const_7_7_contexte_ORU(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:22: ( final_ORU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:3: final_ORU
            {
            pushFollow(FOLLOW_final_ORU_in_spec_const_7_7_contexte_ORU4680);
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
    // $ANTLR end "spec_const_7_7_contexte_ORU"



    // $ANTLR start "spec_const_7_7_contexte_ORM"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:782:1: spec_const_7_7_contexte_ORM[String nameElement] : final_ORM ;
    public final void spec_const_7_7_contexte_ORM(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:22: ( final_ORM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:3: final_ORM
            {
            pushFollow(FOLLOW_final_ORM_in_spec_const_7_7_contexte_ORM4698);
            final_ORM();

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
    // $ANTLR end "spec_const_7_7_contexte_ORM"



    // $ANTLR start "spec_const_7_7_contexte_ORA"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:787:1: spec_const_7_7_contexte_ORA[String nameElement] : final_ORA ;
    public final void spec_const_7_7_contexte_ORA(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:22: ( final_ORA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:3: final_ORA
            {
            pushFollow(FOLLOW_final_ORA_in_spec_const_7_7_contexte_ORA4716);
            final_ORA();

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
    // $ANTLR end "spec_const_7_7_contexte_ORA"



    // $ANTLR start "spec_const_7_7_contexte_ADM"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:792:1: spec_const_7_7_contexte_ADM[String nameElement] : final_ADM ;
    public final void spec_const_7_7_contexte_ADM(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:22: ( final_ADM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:3: final_ADM
            {
            pushFollow(FOLLOW_final_ADM_in_spec_const_7_7_contexte_ADM4734);
            final_ADM();

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
    // $ANTLR end "spec_const_7_7_contexte_ADM"



    // $ANTLR start "spec_const_7_12"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:797:1: spec_const_7_12[String nameElement] : ( final_charP | final_charD | final_charT ) ;
    public final void spec_const_7_12(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:799:22: ( ( final_charP | final_charD | final_charT ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:3: ( final_charP | final_charD | final_charT )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:3: ( final_charP | final_charD | final_charT )
            int alt194=3;
            switch ( input.LA(1) ) {
            case CHARP:
                {
                alt194=1;
                }
                break;
            case CHARD:
                {
                alt194=2;
                }
                break;
            case CHART:
                {
                alt194=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 194, 0, input);

                throw nvae;

            }

            switch (alt194) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_7_124753);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:18: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_7_124757);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:32: final_charT
                    {
                    pushFollow(FOLLOW_final_charT_in_spec_const_7_124761);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:1: spec_const_9_31[String nameElement] : ( final_PORT | final_CART | final_WHLC | final_WALK )? ;
    public final void spec_const_9_31(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:22: ( ( final_PORT | final_CART | final_WHLC | final_WALK )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            int alt195=5;
            switch ( input.LA(1) ) {
                case CHARP:
                    {
                    alt195=1;
                    }
                    break;
                case CHARC:
                    {
                    alt195=2;
                    }
                    break;
                case CHARW:
                    {
                    int LA195_3 = input.LA(2);

                    if ( (LA195_3==CHARH) ) {
                        alt195=3;
                    }
                    else if ( (LA195_3==CHARA) ) {
                        alt195=4;
                    }
                    }
                    break;
            }

            switch (alt195) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:4: final_PORT
                    {
                    pushFollow(FOLLOW_final_PORT_in_spec_const_9_314781);
                    final_PORT();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:17: final_CART
                    {
                    pushFollow(FOLLOW_final_CART_in_spec_const_9_314785);
                    final_CART();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:30: final_WHLC
                    {
                    pushFollow(FOLLOW_final_WHLC_in_spec_const_9_314789);
                    final_WHLC();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:43: final_WALK
                    {
                    pushFollow(FOLLOW_final_WALK_in_spec_const_9_314793);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:1: spec_const_8_25[String nameElement] : ( final_OP | final_IP | final_ER | final_PA | final_MP )? ;
    public final void spec_const_8_25(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:22: ( ( final_OP | final_IP | final_ER | final_PA | final_MP )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            int alt196=6;
            switch ( input.LA(1) ) {
                case CHARO:
                    {
                    alt196=1;
                    }
                    break;
                case CHARI:
                    {
                    alt196=2;
                    }
                    break;
                case CHARE:
                    {
                    alt196=3;
                    }
                    break;
                case CHARP:
                    {
                    alt196=4;
                    }
                    break;
                case CHARM:
                    {
                    alt196=5;
                    }
                    break;
            }

            switch (alt196) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:4: final_OP
                    {
                    pushFollow(FOLLOW_final_OP_in_spec_const_8_254814);
                    final_OP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:15: final_IP
                    {
                    pushFollow(FOLLOW_final_IP_in_spec_const_8_254818);
                    final_IP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:26: final_ER
                    {
                    pushFollow(FOLLOW_final_ER_in_spec_const_8_254822);
                    final_ER();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:37: final_PA
                    {
                    pushFollow(FOLLOW_final_PA_in_spec_const_8_254826);
                    final_PA();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:48: final_MP
                    {
                    pushFollow(FOLLOW_final_MP_in_spec_const_8_254830);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:1: spec_const_9_26[String nameElement] : ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? ;
    public final void spec_const_9_26(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:22: ( ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            int alt197=10;
            switch ( input.LA(1) ) {
                case CHARF:
                    {
                    alt197=1;
                    }
                    break;
                case CHARP:
                    {
                    alt197=2;
                    }
                    break;
                case CHARM:
                    {
                    alt197=3;
                    }
                    break;
                case CHARI:
                    {
                    alt197=4;
                    }
                    break;
                case CHARR:
                    {
                    alt197=5;
                    }
                    break;
                case CHARC:
                    {
                    alt197=6;
                    }
                    break;
                case CHARO:
                    {
                    alt197=7;
                    }
                    break;
                case CHARD:
                    {
                    alt197=8;
                    }
                    break;
                case CHARX:
                    {
                    alt197=9;
                    }
                    break;
            }

            switch (alt197) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:4: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_9_264851);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_9_264855);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:32: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_9_264859);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:46: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_9_264863);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:60: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_9_264867);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:74: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_9_264871);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:88: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_const_9_264875);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:3: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_9_264881);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:17: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_9_264885);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:818:1: spec_const_10_3_nm[String nameElement] : CHARN CHARM ;
    public final HPRIMSParser.spec_const_10_3_nm_return spec_const_10_3_nm(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_nm_return retval = new HPRIMSParser.spec_const_10_3_nm_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:22: ( CHARN CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:821:3: CHARN CHARM
            {
            match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_nm4906); 

            match(input,CHARM,FOLLOW_CHARM_in_spec_const_10_3_nm4908); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:1: spec_const_10_3_ce[String nameElement] : CHARC CHARE ;
    public final HPRIMSParser.spec_const_10_3_ce_return spec_const_10_3_ce(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_ce_return retval = new HPRIMSParser.spec_const_10_3_ce_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:22: ( CHARC CHARE )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:826:3: CHARC CHARE
            {
            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_ce4929); 

            match(input,CHARE,FOLLOW_CHARE_in_spec_const_10_3_ce4931); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:1: spec_const_10_3_st[String nameElement] : CHARS CHART ;
    public final HPRIMSParser.spec_const_10_3_st_return spec_const_10_3_st(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_st_return retval = new HPRIMSParser.spec_const_10_3_st_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:22: ( CHARS CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:831:3: CHARS CHART
            {
            match(input,CHARS,FOLLOW_CHARS_in_spec_const_10_3_st4952); 

            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_st4954); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:1: spec_const_10_3_gc[String nameElement] : CHARG CHARC ;
    public final HPRIMSParser.spec_const_10_3_gc_return spec_const_10_3_gc(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_gc_return retval = new HPRIMSParser.spec_const_10_3_gc_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:835:22: ( CHARG CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:3: CHARG CHARC
            {
            match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_gc4975); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_gc4977); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:838:1: spec_const_10_3_tx[String nameElement] : CHART CHARX ;
    public final HPRIMSParser.spec_const_10_3_tx_return spec_const_10_3_tx(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_tx_return retval = new HPRIMSParser.spec_const_10_3_tx_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:840:22: ( CHART CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:841:3: CHART CHARX
            {
            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_tx4999); 

            match(input,CHARX,FOLLOW_CHARX_in_spec_const_10_3_tx5001); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:843:1: spec_const_10_3_fic[String nameElement] : ( CHARF CHARI CHARC ) ;
    public final HPRIMSParser.spec_const_10_3_fic_return spec_const_10_3_fic(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_fic_return retval = new HPRIMSParser.spec_const_10_3_fic_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:845:22: ( ( CHARF CHARI CHARC ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:3: ( CHARF CHARI CHARC )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:3: ( CHARF CHARI CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:4: CHARF CHARI CHARC
            {
            match(input,CHARF,FOLLOW_CHARF_in_spec_const_10_3_fic5022); 

            match(input,CHARI,FOLLOW_CHARI_in_spec_const_10_3_fic5024); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_fic5026); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:1: spec_const_10_3_std[String nameElement] : ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) );
    public final HPRIMSParser.spec_const_10_3_std_return spec_const_10_3_std(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_std_return retval = new HPRIMSParser.spec_const_10_3_std_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:22: ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) )
            int alt198=8;
            switch ( input.LA(1) ) {
            case CHARA:
                {
                alt198=1;
                }
                break;
            case CHARC:
                {
                int LA198_2 = input.LA(2);

                if ( (LA198_2==CHARK) ) {
                    alt198=2;
                }
                else if ( (LA198_2==CHARN) ) {
                    alt198=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 198, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARD:
                {
                alt198=4;
                }
                break;
            case CHARP:
                {
                alt198=5;
                }
                break;
            case CHART:
                {
                alt198=6;
                }
                break;
            case CHARG:
                {
                int LA198_6 = input.LA(2);

                if ( (LA198_6==CHARB) ) {
                    alt198=7;
                }
                else if ( (LA198_6==CHARN) ) {
                    alt198=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 198, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 198, 0, input);

                throw nvae;

            }

            switch (alt198) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:3: ( CHARA CHARD )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:3: ( CHARA CHARD )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:4: CHARA CHARD
                    {
                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std5048); 

                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std5050); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:19: ( CHARC CHARK )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:19: ( CHARC CHARK )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:20: CHARC CHARK
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std5056); 

                    match(input,CHARK,FOLLOW_CHARK_in_spec_const_10_3_std5058); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:35: ( CHARC CHARN CHARA )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:35: ( CHARC CHARN CHARA )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:36: CHARC CHARN CHARA
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std5064); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std5066); 

                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std5068); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:57: ( CHARD CHART )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:57: ( CHARD CHART )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:58: CHARD CHART
                    {
                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std5074); 

                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std5076); 

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:3: ( CHARP CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:3: ( CHARP CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:4: CHARP CHARN
                    {
                    match(input,CHARP,FOLLOW_CHARP_in_spec_const_10_3_std5084); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std5086); 

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:19: ( CHART CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:19: ( CHART CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:20: CHART CHARN
                    {
                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std5092); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std5094); 

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:3: ( CHARG CHARB )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:3: ( CHARG CHARB )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:4: CHARG CHARB
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std5102); 

                    match(input,CHARB,FOLLOW_CHARB_in_spec_const_10_3_std5104); 

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:19: ( CHARG CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:19: ( CHARG CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:20: CHARG CHARN
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std5110); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std5112); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:857:1: spec_sized_10_6[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? ;
    public final HPRIMSParser.spec_sized_10_6_return spec_sized_10_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_6_return retval = new HPRIMSParser.spec_sized_10_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:859:22: ( st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:860:3: st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_65135);
            st_sized_optionnal(nameElement + ".1", 10);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==DELIMITER2) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_65141); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_65143);
                    st_sized_optionnal(nameElement + ".2", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:4: ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==DELIMITER2) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:5: DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_65150); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_65152);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:865:1: spec_const_10_9[String nameElement] : ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? ;
    public final void spec_const_10_9(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:867:22: ( ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            int alt201=20;
            switch ( input.LA(1) ) {
                case CHARL:
                    {
                    int LA201_1 = input.LA(2);

                    if ( (LA201_1==CHARL) ) {
                        alt201=3;
                    }
                    else if ( ((LA201_1 >= CR && LA201_1 <= DELIMITER1)||LA201_1==REPETITEUR) ) {
                        alt201=1;
                    }
                    }
                    break;
                case CHARH:
                    {
                    int LA201_2 = input.LA(2);

                    if ( (LA201_2==CHARH) ) {
                        alt201=4;
                    }
                    else if ( ((LA201_2 >= CR && LA201_2 <= DELIMITER1)||LA201_2==REPETITEUR) ) {
                        alt201=2;
                    }
                    }
                    break;
                case CHAR_SYMBOL_INF:
                    {
                    alt201=5;
                    }
                    break;
                case CHAR_SYMBOL_SUP:
                    {
                    alt201=6;
                    }
                    break;
                case CHARN:
                    {
                    int LA201_5 = input.LA(2);

                    if ( (LA201_5==CHARu) ) {
                        alt201=10;
                    }
                    else if ( ((LA201_5 >= CR && LA201_5 <= DELIMITER1)||LA201_5==REPETITEUR) ) {
                        alt201=7;
                    }
                    }
                    break;
                case CHARA:
                    {
                    int LA201_6 = input.LA(2);

                    if ( (LA201_6==CHARA) ) {
                        alt201=9;
                    }
                    else if ( ((LA201_6 >= CR && LA201_6 <= DELIMITER1)||LA201_6==REPETITEUR) ) {
                        alt201=8;
                    }
                    }
                    break;
                case CHARU:
                    {
                    alt201=11;
                    }
                    break;
                case CHARD:
                    {
                    alt201=12;
                    }
                    break;
                case CHARB:
                    {
                    alt201=13;
                    }
                    break;
                case CHARW:
                    {
                    alt201=14;
                    }
                    break;
                case CHARR:
                    {
                    alt201=15;
                    }
                    break;
                case CHARI:
                    {
                    alt201=16;
                    }
                    break;
                case CHARS:
                    {
                    alt201=17;
                    }
                    break;
                case CHARM:
                    {
                    alt201=18;
                    }
                    break;
                case CHARV:
                    {
                    alt201=19;
                    }
                    break;
            }

            switch (alt201) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:4: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_10_95180);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:18: final_charH
                    {
                    pushFollow(FOLLOW_final_charH_in_spec_const_10_95184);
                    final_charH();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:32: final_LL
                    {
                    pushFollow(FOLLOW_final_LL_in_spec_const_10_95188);
                    final_LL();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:43: final_HH
                    {
                    pushFollow(FOLLOW_final_HH_in_spec_const_10_95192);
                    final_HH();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:54: final_symbol_inf
                    {
                    pushFollow(FOLLOW_final_symbol_inf_in_spec_const_10_95196);
                    final_symbol_inf();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:73: final_symbol_sup
                    {
                    pushFollow(FOLLOW_final_symbol_sup_in_spec_const_10_95200);
                    final_symbol_sup();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:3: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_95206);
                    final_charN();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:17: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_95210);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:31: final_AA
                    {
                    pushFollow(FOLLOW_final_AA_in_spec_const_10_95214);
                    final_AA();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:42: final_Null
                    {
                    pushFollow(FOLLOW_final_Null_in_spec_const_10_95218);
                    final_Null();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:55: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_95222);
                    final_charU();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:69: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_95226);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:83: final_charB
                    {
                    pushFollow(FOLLOW_final_charB_in_spec_const_10_95230);
                    final_charB();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:3: final_charW
                    {
                    pushFollow(FOLLOW_final_charW_in_spec_const_10_95236);
                    final_charW();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:17: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_95240);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:31: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_95244);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:45: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_95248);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:59: final_MS
                    {
                    pushFollow(FOLLOW_final_MS_in_spec_const_10_95252);
                    final_MS();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:870:70: final_VS
                    {
                    pushFollow(FOLLOW_final_VS_in_spec_const_10_95256);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:872:1: spec_const_10_11[String nameElement] : ( final_charA | final_charS | final_charR | final_charN )? ;
    public final void spec_const_10_11(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:22: ( ( final_charA | final_charS | final_charR | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:3: ( final_charA | final_charS | final_charR | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:3: ( final_charA | final_charS | final_charR | final_charN )?
            int alt202=5;
            switch ( input.LA(1) ) {
                case CHARA:
                    {
                    alt202=1;
                    }
                    break;
                case CHARS:
                    {
                    alt202=2;
                    }
                    break;
                case CHARR:
                    {
                    alt202=3;
                    }
                    break;
                case CHARN:
                    {
                    alt202=4;
                    }
                    break;
            }

            switch (alt202) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:4: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_115277);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:18: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_115281);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:32: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_115285);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:46: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_115289);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:877:1: spec_const_10_12[String nameElement] : ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? ;
    public final void spec_const_10_12(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:879:22: ( ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            int alt203=9;
            switch ( input.LA(1) ) {
                case CHARR:
                    {
                    alt203=1;
                    }
                    break;
                case CHARP:
                    {
                    alt203=2;
                    }
                    break;
                case CHARF:
                    {
                    alt203=3;
                    }
                    break;
                case CHARC:
                    {
                    alt203=4;
                    }
                    break;
                case CHARI:
                    {
                    alt203=5;
                    }
                    break;
                case CHARD:
                    {
                    alt203=6;
                    }
                    break;
                case CHARX:
                    {
                    alt203=7;
                    }
                    break;
                case CHARU:
                    {
                    alt203=8;
                    }
                    break;
            }

            switch (alt203) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:4: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_125310);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_10_125314);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:32: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_10_125318);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:46: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_10_125322);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:60: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_125326);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:880:74: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_125330);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:881:4: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_10_125337);
                    final_charX();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:881:18: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_125341);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:1: spec_const_12_3[String nameElement] : ( final_charP | final_charL )? ;
    public final void spec_const_12_3(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:885:22: ( ( final_charP | final_charL )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:886:3: ( final_charP | final_charL )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:886:3: ( final_charP | final_charL )?
            int alt204=3;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==CHARP) ) {
                alt204=1;
            }
            else if ( (LA204_0==CHARL) ) {
                alt204=2;
            }
            switch (alt204) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:886:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_12_35362);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:886:18: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_12_35366);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:888:1: spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return spec_sized_mult_lvl1_st_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:890:22: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:891:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_25386);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_25392); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_25394);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:895:1: spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return spec_sized_mult_lvl1_st_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:897:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:898:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_25417);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:899:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==DELIMITER2) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:899:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_25423); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_25425);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:903:1: spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return spec_sized_mult_lvl1_st_optionnal_4(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:906:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45450);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:907:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==DELIMITER2) ) {
                alt208=1;
            }
            switch (alt208) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:907:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_45456); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45458);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:908:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==DELIMITER2) ) {
                        alt207=1;
                    }
                    switch (alt207) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:908:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_45465); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45467);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            int alt206=2;
                            int LA206_0 = input.LA(1);

                            if ( (LA206_0==DELIMITER2) ) {
                                alt206=1;
                            }
                            switch (alt206) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_45475); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45477);
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


    public static class spec_sized_mult_lvl1_st_mandatory_6_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_st_mandatory_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:913:1: spec_sized_mult_lvl1_st_mandatory_6[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".3\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".4\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".5\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".6\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_6_return spec_sized_mult_lvl1_st_mandatory_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:22: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".3\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".4\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".5\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".6\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:916:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".3\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".4\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".5\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".6\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65506);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65512); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65514);
            st_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65521); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65523);
            st_nonsized_mandatory(nameElement + ".3");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65531); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65533);
            st_nonsized_mandatory(nameElement + ".4");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65542); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65544);
            st_nonsized_mandatory(nameElement + ".5");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65554); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65556);
            st_nonsized_mandatory(nameElement + ".6");

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
    // $ANTLR end "spec_sized_mult_lvl1_st_mandatory_6"


    public static class spec_sized_mult_lvl1_st_optionnal_6_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_sized_mult_lvl1_st_optionnal_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:924:1: spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return spec_sized_mult_lvl1_st_optionnal_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:926:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:927:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65579);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:928:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt213=2;
            int LA213_0 = input.LA(1);

            if ( (LA213_0==DELIMITER2) ) {
                alt213=1;
            }
            switch (alt213) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:928:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65586); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65588);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:929:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==DELIMITER2) ) {
                        alt212=1;
                    }
                    switch (alt212) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:929:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65596); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65598);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:930:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt211=2;
                            int LA211_0 = input.LA(1);

                            if ( (LA211_0==DELIMITER2) ) {
                                alt211=1;
                            }
                            switch (alt211) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:930:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65607); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65609);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:931:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt210=2;
                                    int LA210_0 = input.LA(1);

                                    if ( (LA210_0==DELIMITER2) ) {
                                        alt210=1;
                                    }
                                    switch (alt210) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:931:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65619); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65621);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:932:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt209=2;
                                            int LA209_0 = input.LA(1);

                                            if ( (LA209_0==DELIMITER2) ) {
                                                alt209=1;
                                            }
                                            switch (alt209) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:932:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65632); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65634);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:936:1: spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return spec_sized_mult_lvl1_st_optionnal_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:938:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:939:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85667);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==DELIMITER2) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85673); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85675);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:941:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    int alt219=2;
                    int LA219_0 = input.LA(1);

                    if ( (LA219_0==DELIMITER2) ) {
                        alt219=1;
                    }
                    switch (alt219) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:941:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85682); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85684);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:942:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            int alt218=2;
                            int LA218_0 = input.LA(1);

                            if ( (LA218_0==DELIMITER2) ) {
                                alt218=1;
                            }
                            switch (alt218) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:942:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85692); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85694);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:943:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    int alt217=2;
                                    int LA217_0 = input.LA(1);

                                    if ( (LA217_0==DELIMITER2) ) {
                                        alt217=1;
                                    }
                                    switch (alt217) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:943:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85703); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85705);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:944:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            int alt216=2;
                                            int LA216_0 = input.LA(1);

                                            if ( (LA216_0==DELIMITER2) ) {
                                                alt216=1;
                                            }
                                            switch (alt216) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:944:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85715); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85717);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:945:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    int alt215=2;
                                                    int LA215_0 = input.LA(1);

                                                    if ( (LA215_0==DELIMITER2) ) {
                                                        alt215=1;
                                                    }
                                                    switch (alt215) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:945:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            {
                                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85728); 

                                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85730);
                                                            st_non_sized_optionnal(nameElement + ".7");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:946:9: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            int alt214=2;
                                                            int LA214_0 = input.LA(1);

                                                            if ( (LA214_0==DELIMITER2) ) {
                                                                alt214=1;
                                                            }
                                                            switch (alt214) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:946:10: DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"]
                                                                    {
                                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85742); 

                                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85744);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:950:1: spec_sized_mult_lvl2_st_optionnal_3[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_3(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:952:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:953:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_35781);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:954:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==DELIMITER3) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:954:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_35787); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_35789);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:955:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( (LA221_0==DELIMITER3) ) {
                        alt221=1;
                    }
                    switch (alt221) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:955:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_35796); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_35798);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:957:1: spec_sized_mult_lvl2_st_optionnal_6[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_6(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:959:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:960:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65821);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:961:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt227=2;
            int LA227_0 = input.LA(1);

            if ( (LA227_0==DELIMITER3) ) {
                alt227=1;
            }
            switch (alt227) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:961:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65827); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65829);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:962:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt226=2;
                    int LA226_0 = input.LA(1);

                    if ( (LA226_0==DELIMITER3) ) {
                        alt226=1;
                    }
                    switch (alt226) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:962:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65836); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65838);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:963:5: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt225=2;
                            int LA225_0 = input.LA(1);

                            if ( (LA225_0==DELIMITER3) ) {
                                alt225=1;
                            }
                            switch (alt225) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:963:6: DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65846); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65848);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:964:6: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt224=2;
                                    int LA224_0 = input.LA(1);

                                    if ( (LA224_0==DELIMITER3) ) {
                                        alt224=1;
                                    }
                                    switch (alt224) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:964:7: DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65857); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65859);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:965:7: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt223=2;
                                            int LA223_0 = input.LA(1);

                                            if ( (LA223_0==DELIMITER3) ) {
                                                alt223=1;
                                            }
                                            switch (alt223) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:965:8: DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65869); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65871);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:967:1: spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize] : nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return spec_sized_mult_lvl1_nm_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:969:22: ( nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:970:3: nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25900);
            nm_nonsized_optionnal(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_25905); 

            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25907);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:974:1: spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return spec_sized_mult_lvl1_nm_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:976:22: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:977:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25932);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_25937); 

            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25939);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:981:1: spec_sized_cna[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_cna_return spec_sized_cna(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_cna_return retval = new HPRIMSParser.spec_sized_cna_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:983:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:984:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5962);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:985:4: ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==DELIMITER2) ) {
                alt229=1;
            }
            switch (alt229) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:985:5: DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna5969); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna5971);
                    spec_sized_mult_lvl2_st_optionnal_6(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:986:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt228=2;
                    int LA228_0 = input.LA(1);

                    if ( (LA228_0==DELIMITER2) ) {
                        alt228=1;
                    }
                    switch (alt228) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:986:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna5979); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5981);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:994:1: spec_sized_8_3[String nameElement, int maxSize] : ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_8_3_return spec_sized_8_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_8_3_return retval = new HPRIMSParser.spec_sized_8_3_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:22: ( ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( ((LA231_0 >= CHARA && LA231_0 <= CHIFFRE9)||(LA231_0 >= LETTRE && LA231_0 <= POINT)) ) {
                alt231=1;
            }
            switch (alt231) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:4: st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    pushFollow(FOLLOW_st_sized_mandatory_in_spec_sized_8_36013);
                    st_sized_mandatory(nameElement + ".1", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:998:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt230=2;
                    int LA230_0 = input.LA(1);

                    if ( (LA230_0==DELIMITER2) ) {
                        alt230=1;
                    }
                    switch (alt230) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:998:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_36020); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_36022);
                            st_non_sized_optionnal(nameElement + ".2");

                            state._fsp--;


                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_36030); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_36032);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1010:1: spec_sized_9_3[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? ;
    public final HPRIMSParser.spec_sized_9_3_return spec_sized_9_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_3_return retval = new HPRIMSParser.spec_sized_9_3_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1012:22: ( st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1014:3: st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_36072);
            st_sized_optionnal(nameElement + ".1", 12);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1015:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            int alt232=2;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==DELIMITER2) ) {
                alt232=1;
            }
            switch (alt232) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1015:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_36078); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_36080);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1018:1: spec_non_sized_9_8[String nameElement] : ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? ;
    public final void spec_non_sized_9_8(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1020:22: ( ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1021:3: ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            {
            pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_86105);
            ts_sized_optionnal(nameElement + ".1", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1022:4: ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            int alt233=2;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==REPETITEUR) ) {
                alt233=1;
            }
            switch (alt233) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1022:5: REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_non_sized_9_86112); 

                    pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_86114);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1024:1: spec_sized_9_16[String nameElement, int maxSize] : spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_9_16_return spec_sized_9_16(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_16_return retval = new HPRIMSParser.spec_sized_9_16_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1026:22: ( spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1027:3: spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_166135);
            spec_sized_mult_lvl2_st_optionnal_3(nameElement + ".2");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1028:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==DELIMITER2) ) {
                alt235=1;
            }
            switch (alt235) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1028:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_166141); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_166143);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1029:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt234=2;
                    int LA234_0 = input.LA(1);

                    if ( (LA234_0==DELIMITER2) ) {
                        alt234=1;
                    }
                    switch (alt234) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1029:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_166150); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_166152);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1032:1: spec_sized_10_4[String nameElement, int maxsize] : st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_10_4_return spec_sized_10_4(String nameElement, int maxsize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_4_return retval = new HPRIMSParser.spec_sized_10_4_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1034:22: ( st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1035:3: st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_10_46179);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1036:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt240=2;
            int LA240_0 = input.LA(1);

            if ( (LA240_0==DELIMITER2) ) {
                alt240=1;
            }
            switch (alt240) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1036:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_46185); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46187);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1037:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt239=2;
                    int LA239_0 = input.LA(1);

                    if ( (LA239_0==DELIMITER2) ) {
                        alt239=1;
                    }
                    switch (alt239) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1037:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_46194); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46196);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1038:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt238=2;
                            int LA238_0 = input.LA(1);

                            if ( (LA238_0==DELIMITER2) ) {
                                alt238=1;
                            }
                            switch (alt238) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1038:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_46204); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46206);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1039:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt237=2;
                                    int LA237_0 = input.LA(1);

                                    if ( (LA237_0==DELIMITER2) ) {
                                        alt237=1;
                                    }
                                    switch (alt237) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1039:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_46215); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46217);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1040:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt236=2;
                                            int LA236_0 = input.LA(1);

                                            if ( (LA236_0==DELIMITER2) ) {
                                                alt236=1;
                                            }
                                            switch (alt236) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1040:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_46227); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46229);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1043:1: spec_sized_10_6_tx[String nameElement, int maxSize] : (g= final_spec_10_6_tx )? ;
    public final void spec_sized_10_6_tx(String nameElement, int maxSize) throws RecognitionException {
        String g =null;



          ParserRuleReturnScope retval = new ParserRuleReturnScope();
          retval.start = input.LT(1);
          startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1048:22: ( (g= final_spec_10_6_tx )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1049:3: (g= final_spec_10_6_tx )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1049:4: (g= final_spec_10_6_tx )?
            int alt241=2;
            int LA241_0 = input.LA(1);

            if ( ((LA241_0 >= CHARA && LA241_0 <= CHIFFRE9)||LA241_0==DELIMITER2||(LA241_0 >= LETTRE && LA241_0 <= POINT)) ) {
                alt241=1;
            }
            switch (alt241) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1049:4: g= final_spec_10_6_tx
                    {
                    pushFollow(FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx6264);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1053:1: spec_sized_tn[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_tn_return spec_sized_tn(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_tn_return retval = new HPRIMSParser.spec_sized_tn_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1055:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1056:2: st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn6286);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1057:3: ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt242=2;
            int LA242_0 = input.LA(1);

            if ( (LA242_0==REPETITEUR) ) {
                alt242=1;
            }
            switch (alt242) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1057:4: REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_sized_tn6292); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn6294);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1063:1: st_sized_optionnal[String nameElement, int maxSize] : ( final_st )? ;
    public final HPRIMSParser.st_sized_optionnal_return st_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_optionnal_return retval = new HPRIMSParser.st_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1065:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1066:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1066:3: ( final_st )?
            int alt243=2;
            int LA243_0 = input.LA(1);

            if ( ((LA243_0 >= CHARA && LA243_0 <= CHIFFRE9)||(LA243_0 >= LETTRE && LA243_0 <= POINT)) ) {
                alt243=1;
            }
            switch (alt243) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1066:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_sized_optionnal6322);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1070:1: st_sized_mandatory[String nameElement, int maxSize] : final_st ;
    public final HPRIMSParser.st_sized_mandatory_return st_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_mandatory_return retval = new HPRIMSParser.st_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1072:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1073:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_sized_mandatory6345);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1076:1: st_non_sized_optionnal[String nameElement] : ( final_st )? ;
    public final void st_non_sized_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1078:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1079:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1079:3: ( final_st )?
            int alt244=2;
            int LA244_0 = input.LA(1);

            if ( ((LA244_0 >= CHARA && LA244_0 <= CHIFFRE9)||(LA244_0 >= LETTRE && LA244_0 <= POINT)) ) {
                alt244=1;
            }
            switch (alt244) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1079:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_non_sized_optionnal6367);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1081:1: st_nonsized_mandatory[String nameElement] : final_st ;
    public final void st_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1083:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1084:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_nonsized_mandatory6386);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1086:1: nm_sized_optionnal[String nameElement, int maxSize] : ( final_nm )? ;
    public final HPRIMSParser.nm_sized_optionnal_return nm_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_sized_optionnal_return retval = new HPRIMSParser.nm_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1088:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1089:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1089:3: ( final_nm )?
            int alt245=2;
            int LA245_0 = input.LA(1);

            if ( ((LA245_0 >= CHIFFRE0 && LA245_0 <= CHIFFRE9)||(LA245_0 >= MOINS && LA245_0 <= POINT)) ) {
                alt245=1;
            }
            switch (alt245) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1089:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_sized_optionnal6404);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1093:1: nm_integer_sized_optionnal[String nameElement, int maxSize] : ( final_nm_integer )? ;
    public final HPRIMSParser.nm_integer_sized_optionnal_return nm_integer_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_optionnal_return retval = new HPRIMSParser.nm_integer_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1095:22: ( ( final_nm_integer )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1096:3: ( final_nm_integer )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1096:3: ( final_nm_integer )?
            int alt246=2;
            int LA246_0 = input.LA(1);

            if ( ((LA246_0 >= CHIFFRE0 && LA246_0 <= CHIFFRE9)) ) {
                alt246=1;
            }
            switch (alt246) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1096:3: final_nm_integer
                    {
                    pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal6427);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1100:1: nm_integer_sized_mandatory[String nameElement, int maxSize] : final_nm_integer ;
    public final HPRIMSParser.nm_integer_sized_mandatory_return nm_integer_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_mandatory_return retval = new HPRIMSParser.nm_integer_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1102:22: ( final_nm_integer )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1103:3: final_nm_integer
            {
            pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory6455);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1107:1: ts_sized_optionnal[String nameElement, int maxSize] : ( final_ts )? ;
    public final HPRIMSParser.ts_sized_optionnal_return ts_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_optionnal_return retval = new HPRIMSParser.ts_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1109:22: ( ( final_ts )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1110:3: ( final_ts )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1110:3: ( final_ts )?
            int alt247=2;
            int LA247_0 = input.LA(1);

            if ( ((LA247_0 >= CHIFFRE0 && LA247_0 <= CHIFFRE9)) ) {
                alt247=1;
            }
            switch (alt247) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1110:3: final_ts
                    {
                    pushFollow(FOLLOW_final_ts_in_ts_sized_optionnal6478);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1114:1: ts_sized_mandatory[String nameElement, int maxSize] : final_ts ;
    public final HPRIMSParser.ts_sized_mandatory_return ts_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_mandatory_return retval = new HPRIMSParser.ts_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1116:22: ( final_ts )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1117:3: final_ts
            {
            pushFollow(FOLLOW_final_ts_in_ts_sized_mandatory6501);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1120:1: nm_nonsized_mandatory[String nameElement] : final_nm ;
    public final void nm_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1122:22: ( final_nm )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1123:3: final_nm
            {
            pushFollow(FOLLOW_final_nm_in_nm_nonsized_mandatory6523);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1125:1: nm_nonsized_optionnal[String nameElement] : ( final_nm )? ;
    public final void nm_nonsized_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1127:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1128:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1128:3: ( final_nm )?
            int alt248=2;
            int LA248_0 = input.LA(1);

            if ( ((LA248_0 >= CHIFFRE0 && LA248_0 <= CHIFFRE9)||(LA248_0 >= MOINS && LA248_0 <= POINT)) ) {
                alt248=1;
            }
            switch (alt248) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1128:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_nonsized_optionnal6541);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1130:1: spec_const_7_13_1_version_2_0[String nameElement] : final_version_2_0 ;
    public final void spec_const_7_13_1_version_2_0(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1132:22: ( final_version_2_0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1133:3: final_version_2_0
            {
            pushFollow(FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_06560);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1135:1: spec_const_7_13_1_version_2_1[String nameElement] : final_version_2_1 ;
    public final void spec_const_7_13_1_version_2_1(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1137:22: ( final_version_2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1138:3: final_version_2_1
            {
            pushFollow(FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_16578);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1140:1: spec_const_7_13_1_version_2_2[String nameElement] : final_version_2_2 ;
    public final void spec_const_7_13_1_version_2_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1142:22: ( final_version_2_2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1143:3: final_version_2_2
            {
            pushFollow(FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_26598);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1147:1: final_spec_10_6_tx returns [String consoText] : g= content_spec_10_6 ;
    public final String final_spec_10_6_tx() throws RecognitionException {
        String consoText = null;


        String g =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1147:46: (g= content_spec_10_6 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1148:3: g= content_spec_10_6
            {
            pushFollow(FOLLOW_content_spec_10_6_in_final_spec_10_6_tx6615);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1152:1: content_spec_10_6 returns [String consoText] : (r= character | DELIMITER2 ) (p= content_spec_10_6 )? ;
    public final String content_spec_10_6() throws RecognitionException {
        String consoText = null;


        HPRIMSParser.character_return r =null;

        String p =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1152:45: ( (r= character | DELIMITER2 ) (p= content_spec_10_6 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1153:3: (r= character | DELIMITER2 ) (p= content_spec_10_6 )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1153:3: (r= character | DELIMITER2 )
            int alt249=2;
            int LA249_0 = input.LA(1);

            if ( ((LA249_0 >= CHARA && LA249_0 <= CHIFFRE9)||(LA249_0 >= LETTRE && LA249_0 <= POINT)) ) {
                alt249=1;
            }
            else if ( (LA249_0==DELIMITER2) ) {
                alt249=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 249, 0, input);

                throw nvae;

            }
            switch (alt249) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1153:4: r= character
                    {
                    pushFollow(FOLLOW_character_in_content_spec_10_66637);
                    r=character();

                    state._fsp--;


                    consoText = (r!=null?input.toString(r.start,r.stop):null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1153:42: DELIMITER2
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_content_spec_10_66643); 

                    consoText = "\n";

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1154:6: (p= content_spec_10_6 )?
            int alt250=2;
            int LA250_0 = input.LA(1);

            if ( ((LA250_0 >= CHARA && LA250_0 <= CHIFFRE9)||LA250_0==DELIMITER2||(LA250_0 >= LETTRE && LA250_0 <= POINT)) ) {
                alt250=1;
            }
            switch (alt250) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1154:6: p= content_spec_10_6
                    {
                    pushFollow(FOLLOW_content_spec_10_6_in_content_spec_10_66654);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1156:1: final_ts : chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? ;
    public final HPRIMSParser.final_ts_return final_ts() throws RecognitionException {
        HPRIMSParser.final_ts_return retval = new HPRIMSParser.final_ts_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1156:9: ( chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1157:3: chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            {
            pushFollow(FOLLOW_chiffre_in_final_ts6666);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts6668);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts6672);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts6674);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts6676);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts6680);
            chiffre();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1159:11: ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            int alt253=2;
            int LA253_0 = input.LA(1);

            if ( ((LA253_0 >= CHIFFRE0 && LA253_0 <= CHIFFRE9)) ) {
                alt253=1;
            }
            switch (alt253) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1159:12: chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    {
                    pushFollow(FOLLOW_chiffre_in_final_ts6683);
                    chiffre();

                    state._fsp--;


                    pushFollow(FOLLOW_chiffre_in_final_ts6685);
                    chiffre();

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1160:3: ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    int alt252=2;
                    int LA252_0 = input.LA(1);

                    if ( ((LA252_0 >= CHIFFRE0 && LA252_0 <= CHIFFRE9)) ) {
                        alt252=1;
                    }
                    switch (alt252) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1160:4: chiffre chiffre chiffre chiffre ( chiffre chiffre )?
                            {
                            pushFollow(FOLLOW_chiffre_in_final_ts6690);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts6692);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts6694);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts6698);
                            chiffre();

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1161:11: ( chiffre chiffre )?
                            int alt251=2;
                            int LA251_0 = input.LA(1);

                            if ( ((LA251_0 >= CHIFFRE0 && LA251_0 <= CHIFFRE9)) ) {
                                alt251=1;
                            }
                            switch (alt251) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1161:12: chiffre chiffre
                                    {
                                    pushFollow(FOLLOW_chiffre_in_final_ts6701);
                                    chiffre();

                                    state._fsp--;


                                    pushFollow(FOLLOW_chiffre_in_final_ts6703);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1164:1: final_st : ( character )+ ;
    public final HPRIMSParser.final_st_return final_st() throws RecognitionException {
        HPRIMSParser.final_st_return retval = new HPRIMSParser.final_st_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1164:9: ( ( character )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1165:3: ( character )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1165:3: ( character )+
            int cnt254=0;
            loop254:
            do {
                int alt254=2;
                int LA254_0 = input.LA(1);

                if ( ((LA254_0 >= CHARA && LA254_0 <= CHIFFRE9)||(LA254_0 >= LETTRE && LA254_0 <= POINT)) ) {
                    alt254=1;
                }


                switch (alt254) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1165:3: character
            	    {
            	    pushFollow(FOLLOW_character_in_final_st6722);
            	    character();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt254 >= 1 ) break loop254;
                        EarlyExitException eee =
                            new EarlyExitException(254, input);
                        throw eee;
                }
                cnt254++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1168:1: final_nm : ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) ;
    public final HPRIMSParser.final_nm_return final_nm() throws RecognitionException {
        HPRIMSParser.final_nm_return retval = new HPRIMSParser.final_nm_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1168:9: ( ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1169:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1169:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1169:4: ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1169:4: ( PLUS | MOINS )?
            int alt255=2;
            int LA255_0 = input.LA(1);

            if ( ((LA255_0 >= MOINS && LA255_0 <= PLUS)) ) {
                alt255=1;
            }
            switch (alt255) {
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:3: ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            int alt260=2;
            int LA260_0 = input.LA(1);

            if ( ((LA260_0 >= CHIFFRE0 && LA260_0 <= CHIFFRE9)) ) {
                alt260=1;
            }
            else if ( (LA260_0==POINT) ) {
                alt260=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 260, 0, input);

                throw nvae;

            }
            switch (alt260) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:5: ( chiffre )+ ( POINT ( chiffre )* )?
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:5: ( chiffre )+
                    int cnt256=0;
                    loop256:
                    do {
                        int alt256=2;
                        int LA256_0 = input.LA(1);

                        if ( ((LA256_0 >= CHIFFRE0 && LA256_0 <= CHIFFRE9)) ) {
                            alt256=1;
                        }


                        switch (alt256) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:5: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm6751);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt256 >= 1 ) break loop256;
                                EarlyExitException eee =
                                    new EarlyExitException(256, input);
                                throw eee;
                        }
                        cnt256++;
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:14: ( POINT ( chiffre )* )?
                    int alt258=2;
                    int LA258_0 = input.LA(1);

                    if ( (LA258_0==POINT) ) {
                        alt258=1;
                    }
                    switch (alt258) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:15: POINT ( chiffre )*
                            {
                            match(input,POINT,FOLLOW_POINT_in_final_nm6755); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:21: ( chiffre )*
                            loop257:
                            do {
                                int alt257=2;
                                int LA257_0 = input.LA(1);

                                if ( ((LA257_0 >= CHIFFRE0 && LA257_0 <= CHIFFRE9)) ) {
                                    alt257=1;
                                }


                                switch (alt257) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1170:21: chiffre
                            	    {
                            	    pushFollow(FOLLOW_chiffre_in_final_nm6757);
                            	    chiffre();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop257;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1171:4: ( POINT ( chiffre )+ )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1171:4: ( POINT ( chiffre )+ )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1171:5: POINT ( chiffre )+
                    {
                    match(input,POINT,FOLLOW_POINT_in_final_nm6767); 

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1171:11: ( chiffre )+
                    int cnt259=0;
                    loop259:
                    do {
                        int alt259=2;
                        int LA259_0 = input.LA(1);

                        if ( ((LA259_0 >= CHIFFRE0 && LA259_0 <= CHIFFRE9)) ) {
                            alt259=1;
                        }


                        switch (alt259) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1171:11: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm6769);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt259 >= 1 ) break loop259;
                                EarlyExitException eee =
                                    new EarlyExitException(259, input);
                                throw eee;
                        }
                        cnt259++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1174:1: final_nm_integer : ( chiffre )+ ;
    public final HPRIMSParser.final_nm_integer_return final_nm_integer() throws RecognitionException {
        HPRIMSParser.final_nm_integer_return retval = new HPRIMSParser.final_nm_integer_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1174:17: ( ( chiffre )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1175:3: ( chiffre )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1175:3: ( chiffre )+
            int cnt261=0;
            loop261:
            do {
                int alt261=2;
                int LA261_0 = input.LA(1);

                if ( ((LA261_0 >= CHIFFRE0 && LA261_0 <= CHIFFRE9)) ) {
                    alt261=1;
                }


                switch (alt261) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1175:3: chiffre
            	    {
            	    pushFollow(FOLLOW_chiffre_in_final_nm_integer6786);
            	    chiffre();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt261 >= 1 ) break loop261;
                        EarlyExitException eee =
                            new EarlyExitException(261, input);
                        throw eee;
                }
                cnt261++;
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


    public static class final_ADM_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_ADM"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1178:1: final_ADM : CHARA CHARD CHARM ;
    public final HPRIMSParser.final_ADM_return final_ADM() throws RecognitionException {
        HPRIMSParser.final_ADM_return retval = new HPRIMSParser.final_ADM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1178:10: ( CHARA CHARD CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1178:12: CHARA CHARD CHARM
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_ADM6798); 

            match(input,CHARD,FOLLOW_CHARD_in_final_ADM6800); 

            match(input,CHARM,FOLLOW_CHARM_in_final_ADM6802); 

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
    // $ANTLR end "final_ADM"


    public static class final_ORA_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_ORA"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1179:1: final_ORA : CHARO CHARR CHARA ;
    public final HPRIMSParser.final_ORA_return final_ORA() throws RecognitionException {
        HPRIMSParser.final_ORA_return retval = new HPRIMSParser.final_ORA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1179:10: ( CHARO CHARR CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1179:12: CHARO CHARR CHARA
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORA6810); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORA6812); 

            match(input,CHARA,FOLLOW_CHARA_in_final_ORA6814); 

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
    // $ANTLR end "final_ORA"


    public static class final_ORU_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_ORU"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1180:1: final_ORU : CHARO CHARR CHARU ;
    public final HPRIMSParser.final_ORU_return final_ORU() throws RecognitionException {
        HPRIMSParser.final_ORU_return retval = new HPRIMSParser.final_ORU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1180:10: ( CHARO CHARR CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1180:12: CHARO CHARR CHARU
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORU6822); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORU6824); 

            match(input,CHARU,FOLLOW_CHARU_in_final_ORU6826); 

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


    public static class final_ORM_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_ORM"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1181:1: final_ORM : CHARO CHARR CHARM ;
    public final HPRIMSParser.final_ORM_return final_ORM() throws RecognitionException {
        HPRIMSParser.final_ORM_return retval = new HPRIMSParser.final_ORM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1181:10: ( CHARO CHARR CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1181:12: CHARO CHARR CHARM
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORM6834); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORM6836); 

            match(input,CHARM,FOLLOW_CHARM_in_final_ORM6838); 

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
    // $ANTLR end "final_ORM"


    public static class final_CART_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_CART"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1183:1: final_CART : CHARC CHARA CHARR CHART ;
    public final HPRIMSParser.final_CART_return final_CART() throws RecognitionException {
        HPRIMSParser.final_CART_return retval = new HPRIMSParser.final_CART_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1183:11: ( CHARC CHARA CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1183:13: CHARC CHARA CHARR CHART
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_CART6847); 

            match(input,CHARA,FOLLOW_CHARA_in_final_CART6849); 

            match(input,CHARR,FOLLOW_CHARR_in_final_CART6851); 

            match(input,CHART,FOLLOW_CHART_in_final_CART6853); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1184:1: final_PORT : CHARP CHARO CHARR CHART ;
    public final HPRIMSParser.final_PORT_return final_PORT() throws RecognitionException {
        HPRIMSParser.final_PORT_return retval = new HPRIMSParser.final_PORT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1184:11: ( CHARP CHARO CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1184:13: CHARP CHARO CHARR CHART
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PORT6861); 

            match(input,CHARO,FOLLOW_CHARO_in_final_PORT6863); 

            match(input,CHARR,FOLLOW_CHARR_in_final_PORT6865); 

            match(input,CHART,FOLLOW_CHART_in_final_PORT6867); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1185:1: final_WHLC : CHARW CHARH CHARL CHARC ;
    public final HPRIMSParser.final_WHLC_return final_WHLC() throws RecognitionException {
        HPRIMSParser.final_WHLC_return retval = new HPRIMSParser.final_WHLC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1185:11: ( CHARW CHARH CHARL CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1185:13: CHARW CHARH CHARL CHARC
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WHLC6875); 

            match(input,CHARH,FOLLOW_CHARH_in_final_WHLC6877); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WHLC6879); 

            match(input,CHARC,FOLLOW_CHARC_in_final_WHLC6881); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1186:1: final_WALK : CHARW CHARA CHARL CHARK ;
    public final HPRIMSParser.final_WALK_return final_WALK() throws RecognitionException {
        HPRIMSParser.final_WALK_return retval = new HPRIMSParser.final_WALK_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1186:11: ( CHARW CHARA CHARL CHARK )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1186:13: CHARW CHARA CHARL CHARK
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WALK6889); 

            match(input,CHARA,FOLLOW_CHARA_in_final_WALK6891); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WALK6893); 

            match(input,CHARK,FOLLOW_CHARK_in_final_WALK6895); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1188:1: final_LL : CHARL CHARL ;
    public final HPRIMSParser.final_LL_return final_LL() throws RecognitionException {
        HPRIMSParser.final_LL_return retval = new HPRIMSParser.final_LL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1188:9: ( CHARL CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1188:11: CHARL CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_LL6904); 

            match(input,CHARL,FOLLOW_CHARL_in_final_LL6906); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1189:1: final_AA : CHARA CHARA ;
    public final HPRIMSParser.final_AA_return final_AA() throws RecognitionException {
        HPRIMSParser.final_AA_return retval = new HPRIMSParser.final_AA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1189:9: ( CHARA CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1189:11: CHARA CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_AA6914); 

            match(input,CHARA,FOLLOW_CHARA_in_final_AA6916); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1190:1: final_HH : CHARH CHARH ;
    public final HPRIMSParser.final_HH_return final_HH() throws RecognitionException {
        HPRIMSParser.final_HH_return retval = new HPRIMSParser.final_HH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1190:9: ( CHARH CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1190:11: CHARH CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_HH6924); 

            match(input,CHARH,FOLLOW_CHARH_in_final_HH6926); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1191:1: final_MS : CHARM CHARS ;
    public final HPRIMSParser.final_MS_return final_MS() throws RecognitionException {
        HPRIMSParser.final_MS_return retval = new HPRIMSParser.final_MS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1191:9: ( CHARM CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1191:11: CHARM CHARS
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MS6934); 

            match(input,CHARS,FOLLOW_CHARS_in_final_MS6936); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1192:1: final_VS : CHARV CHARS ;
    public final HPRIMSParser.final_VS_return final_VS() throws RecognitionException {
        HPRIMSParser.final_VS_return retval = new HPRIMSParser.final_VS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1192:9: ( CHARV CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1192:11: CHARV CHARS
            {
            match(input,CHARV,FOLLOW_CHARV_in_final_VS6944); 

            match(input,CHARS,FOLLOW_CHARS_in_final_VS6946); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1193:1: final_Null : CHARN CHARu CHARl CHARl ;
    public final HPRIMSParser.final_Null_return final_Null() throws RecognitionException {
        HPRIMSParser.final_Null_return retval = new HPRIMSParser.final_Null_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1193:11: ( CHARN CHARu CHARl CHARl )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1193:13: CHARN CHARu CHARl CHARl
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_Null6954); 

            match(input,CHARu,FOLLOW_CHARu_in_final_Null6956); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null6958); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null6960); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1194:1: final_symbol_inf : CHAR_SYMBOL_INF ;
    public final HPRIMSParser.final_symbol_inf_return final_symbol_inf() throws RecognitionException {
        HPRIMSParser.final_symbol_inf_return retval = new HPRIMSParser.final_symbol_inf_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1194:17: ( CHAR_SYMBOL_INF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1194:19: CHAR_SYMBOL_INF
            {
            match(input,CHAR_SYMBOL_INF,FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf6968); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1195:1: final_symbol_sup : CHAR_SYMBOL_SUP ;
    public final HPRIMSParser.final_symbol_sup_return final_symbol_sup() throws RecognitionException {
        HPRIMSParser.final_symbol_sup_return retval = new HPRIMSParser.final_symbol_sup_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1195:17: ( CHAR_SYMBOL_SUP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1195:19: CHAR_SYMBOL_SUP
            {
            match(input,CHAR_SYMBOL_SUP,FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup6976); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1197:1: final_version_2_0 : CHARH CHIFFRE2 POINT CHIFFRE0 ;
    public final HPRIMSParser.final_version_2_0_return final_version_2_0() throws RecognitionException {
        HPRIMSParser.final_version_2_0_return retval = new HPRIMSParser.final_version_2_0_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1197:18: ( CHARH CHIFFRE2 POINT CHIFFRE0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1197:20: CHARH CHIFFRE2 POINT CHIFFRE0
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_06985); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_06987); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_06989); 

            match(input,CHIFFRE0,FOLLOW_CHIFFRE0_in_final_version_2_06991); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1198:1: final_version_2_1 : CHARH CHIFFRE2 POINT CHIFFRE1 ;
    public final HPRIMSParser.final_version_2_1_return final_version_2_1() throws RecognitionException {
        HPRIMSParser.final_version_2_1_return retval = new HPRIMSParser.final_version_2_1_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1198:18: ( CHARH CHIFFRE2 POINT CHIFFRE1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1198:20: CHARH CHIFFRE2 POINT CHIFFRE1
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_16999); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_17001); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_17003); 

            match(input,CHIFFRE1,FOLLOW_CHIFFRE1_in_final_version_2_17005); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1199:1: final_version_2_2 : CHARH CHIFFRE2 POINT CHIFFRE2 ;
    public final HPRIMSParser.final_version_2_2_return final_version_2_2() throws RecognitionException {
        HPRIMSParser.final_version_2_2_return retval = new HPRIMSParser.final_version_2_2_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1199:18: ( CHARH CHIFFRE2 POINT CHIFFRE2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1199:20: CHARH CHIFFRE2 POINT CHIFFRE2
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_27013); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_27015); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_27017); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_27019); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1201:1: final_OP : CHARO CHARP ;
    public final HPRIMSParser.final_OP_return final_OP() throws RecognitionException {
        HPRIMSParser.final_OP_return retval = new HPRIMSParser.final_OP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1201:9: ( CHARO CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1201:11: CHARO CHARP
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_OP7028); 

            match(input,CHARP,FOLLOW_CHARP_in_final_OP7030); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1202:1: final_IP : CHARI CHARP ;
    public final HPRIMSParser.final_IP_return final_IP() throws RecognitionException {
        HPRIMSParser.final_IP_return retval = new HPRIMSParser.final_IP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1202:9: ( CHARI CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1202:11: CHARI CHARP
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_IP7038); 

            match(input,CHARP,FOLLOW_CHARP_in_final_IP7040); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1203:1: final_ER : CHARE CHARR ;
    public final HPRIMSParser.final_ER_return final_ER() throws RecognitionException {
        HPRIMSParser.final_ER_return retval = new HPRIMSParser.final_ER_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1203:9: ( CHARE CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1203:11: CHARE CHARR
            {
            match(input,CHARE,FOLLOW_CHARE_in_final_ER7048); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ER7050); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1204:1: final_PA : CHARP CHARA ;
    public final HPRIMSParser.final_PA_return final_PA() throws RecognitionException {
        HPRIMSParser.final_PA_return retval = new HPRIMSParser.final_PA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1204:9: ( CHARP CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1204:11: CHARP CHARA
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PA7058); 

            match(input,CHARA,FOLLOW_CHARA_in_final_PA7060); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1205:1: final_MP : CHARM CHARP ;
    public final HPRIMSParser.final_MP_return final_MP() throws RecognitionException {
        HPRIMSParser.final_MP_return retval = new HPRIMSParser.final_MP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1205:9: ( CHARM CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1205:11: CHARM CHARP
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MP7068); 

            match(input,CHARP,FOLLOW_CHARP_in_final_MP7070); 

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


    public static class final_TM_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_TM"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1206:1: final_TM : CHART CHARM ;
    public final HPRIMSParser.final_TM_return final_TM() throws RecognitionException {
        HPRIMSParser.final_TM_return retval = new HPRIMSParser.final_TM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1206:9: ( CHART CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1206:11: CHART CHARM
            {
            match(input,CHART,FOLLOW_CHART_in_final_TM7078); 

            match(input,CHARM,FOLLOW_CHARM_in_final_TM7080); 

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
    // $ANTLR end "final_TM"


    public static class final_TR_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_TR"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1207:1: final_TR : CHART CHARR ;
    public final HPRIMSParser.final_TR_return final_TR() throws RecognitionException {
        HPRIMSParser.final_TR_return retval = new HPRIMSParser.final_TR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1207:9: ( CHART CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1207:11: CHART CHARR
            {
            match(input,CHART,FOLLOW_CHART_in_final_TR7088); 

            match(input,CHARR,FOLLOW_CHARR_in_final_TR7090); 

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
    // $ANTLR end "final_TR"


    public static class final_FR_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_FR"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1208:1: final_FR : CHARF CHARR ;
    public final HPRIMSParser.final_FR_return final_FR() throws RecognitionException {
        HPRIMSParser.final_FR_return retval = new HPRIMSParser.final_FR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1208:9: ( CHARF CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1208:11: CHARF CHARR
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_FR7098); 

            match(input,CHARR,FOLLOW_CHARR_in_final_FR7100); 

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
    // $ANTLR end "final_FR"


    public static class final_PF_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_PF"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1209:1: final_PF : CHARP CHARF ;
    public final HPRIMSParser.final_PF_return final_PF() throws RecognitionException {
        HPRIMSParser.final_PF_return retval = new HPRIMSParser.final_PF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1209:9: ( CHARP CHARF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1209:11: CHARP CHARF
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PF7108); 

            match(input,CHARF,FOLLOW_CHARF_in_final_PF7110); 

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
    // $ANTLR end "final_PF"


    public static class final_SS_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_SS"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1210:1: final_SS : CHARS CHARS ;
    public final HPRIMSParser.final_SS_return final_SS() throws RecognitionException {
        HPRIMSParser.final_SS_return retval = new HPRIMSParser.final_SS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1210:9: ( CHARS CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1210:11: CHARS CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_SS7118); 

            match(input,CHARS,FOLLOW_CHARS_in_final_SS7120); 

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
    // $ANTLR end "final_SS"


    public static class final_charA_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "final_charA"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1212:1: final_charA : CHARA ;
    public final HPRIMSParser.final_charA_return final_charA() throws RecognitionException {
        HPRIMSParser.final_charA_return retval = new HPRIMSParser.final_charA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1212:12: ( CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1212:14: CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_charA7129); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1213:1: final_charB : CHARB ;
    public final HPRIMSParser.final_charB_return final_charB() throws RecognitionException {
        HPRIMSParser.final_charB_return retval = new HPRIMSParser.final_charB_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1213:12: ( CHARB )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1213:14: CHARB
            {
            match(input,CHARB,FOLLOW_CHARB_in_final_charB7137); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1214:1: final_charC : CHARC ;
    public final HPRIMSParser.final_charC_return final_charC() throws RecognitionException {
        HPRIMSParser.final_charC_return retval = new HPRIMSParser.final_charC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1214:12: ( CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1214:14: CHARC
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_charC7145); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1215:1: final_charD : CHARD ;
    public final HPRIMSParser.final_charD_return final_charD() throws RecognitionException {
        HPRIMSParser.final_charD_return retval = new HPRIMSParser.final_charD_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1215:12: ( CHARD )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1215:14: CHARD
            {
            match(input,CHARD,FOLLOW_CHARD_in_final_charD7153); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1216:1: final_charF : CHARF ;
    public final HPRIMSParser.final_charF_return final_charF() throws RecognitionException {
        HPRIMSParser.final_charF_return retval = new HPRIMSParser.final_charF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1216:12: ( CHARF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1216:14: CHARF
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_charF7161); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1217:1: final_charH : CHARH ;
    public final HPRIMSParser.final_charH_return final_charH() throws RecognitionException {
        HPRIMSParser.final_charH_return retval = new HPRIMSParser.final_charH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1217:12: ( CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1217:14: CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_charH7169); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1218:1: final_charI : CHARI ;
    public final HPRIMSParser.final_charI_return final_charI() throws RecognitionException {
        HPRIMSParser.final_charI_return retval = new HPRIMSParser.final_charI_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1218:12: ( CHARI )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1218:14: CHARI
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_charI7177); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1219:1: final_charL : CHARL ;
    public final HPRIMSParser.final_charL_return final_charL() throws RecognitionException {
        HPRIMSParser.final_charL_return retval = new HPRIMSParser.final_charL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1219:12: ( CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1219:14: CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_charL7185); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1220:1: final_charM : CHARM ;
    public final HPRIMSParser.final_charM_return final_charM() throws RecognitionException {
        HPRIMSParser.final_charM_return retval = new HPRIMSParser.final_charM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1220:12: ( CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1220:14: CHARM
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_charM7193); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1221:1: final_charN : CHARN ;
    public final HPRIMSParser.final_charN_return final_charN() throws RecognitionException {
        HPRIMSParser.final_charN_return retval = new HPRIMSParser.final_charN_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1221:12: ( CHARN )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1221:14: CHARN
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_charN7201); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1222:1: final_charO : CHARO ;
    public final HPRIMSParser.final_charO_return final_charO() throws RecognitionException {
        HPRIMSParser.final_charO_return retval = new HPRIMSParser.final_charO_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1222:12: ( CHARO )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1222:14: CHARO
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_charO7209); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1223:1: final_charP : CHARP ;
    public final HPRIMSParser.final_charP_return final_charP() throws RecognitionException {
        HPRIMSParser.final_charP_return retval = new HPRIMSParser.final_charP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1223:12: ( CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1223:14: CHARP
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_charP7217); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1224:1: final_charR : CHARR ;
    public final HPRIMSParser.final_charR_return final_charR() throws RecognitionException {
        HPRIMSParser.final_charR_return retval = new HPRIMSParser.final_charR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1224:12: ( CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1224:14: CHARR
            {
            match(input,CHARR,FOLLOW_CHARR_in_final_charR7225); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1225:1: final_charS : CHARS ;
    public final HPRIMSParser.final_charS_return final_charS() throws RecognitionException {
        HPRIMSParser.final_charS_return retval = new HPRIMSParser.final_charS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1225:12: ( CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1225:14: CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_charS7233); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1226:1: final_charT : CHART ;
    public final HPRIMSParser.final_charT_return final_charT() throws RecognitionException {
        HPRIMSParser.final_charT_return retval = new HPRIMSParser.final_charT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1226:12: ( CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1226:14: CHART
            {
            match(input,CHART,FOLLOW_CHART_in_final_charT7241); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1227:1: final_charU : CHARU ;
    public final HPRIMSParser.final_charU_return final_charU() throws RecognitionException {
        HPRIMSParser.final_charU_return retval = new HPRIMSParser.final_charU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1227:12: ( CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1227:14: CHARU
            {
            match(input,CHARU,FOLLOW_CHARU_in_final_charU7249); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1228:1: final_charW : CHARW ;
    public final HPRIMSParser.final_charW_return final_charW() throws RecognitionException {
        HPRIMSParser.final_charW_return retval = new HPRIMSParser.final_charW_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1228:12: ( CHARW )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1228:14: CHARW
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_charW7257); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1229:1: final_charX : CHARX ;
    public final HPRIMSParser.final_charX_return final_charX() throws RecognitionException {
        HPRIMSParser.final_charX_return retval = new HPRIMSParser.final_charX_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1229:12: ( CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1229:14: CHARX
            {
            match(input,CHARX,FOLLOW_CHARX_in_final_charX7265); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1232:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        startElement("H.2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1234:22: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1235:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters7286); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1240:1: character : ( lettre | chiffre ) ;
    public final HPRIMSParser.character_return character() throws RecognitionException {
        HPRIMSParser.character_return retval = new HPRIMSParser.character_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1240:10: ( ( lettre | chiffre ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1241:3: ( lettre | chiffre )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1241:3: ( lettre | chiffre )
            int alt262=2;
            int LA262_0 = input.LA(1);

            if ( ((LA262_0 >= CHARA && LA262_0 <= CHARu)||(LA262_0 >= LETTRE && LA262_0 <= POINT)) ) {
                alt262=1;
            }
            else if ( ((LA262_0 >= CHIFFRE0 && LA262_0 <= CHIFFRE9)) ) {
                alt262=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 262, 0, input);

                throw nvae;

            }
            switch (alt262) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1241:4: lettre
                    {
                    pushFollow(FOLLOW_lettre_in_character7302);
                    lettre();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1241:13: chiffre
                    {
                    pushFollow(FOLLOW_chiffre_in_character7306);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1243:1: chiffre : ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) ;
    public final void chiffre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1243:8: ( ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) )
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1247:1: lettre : ~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) ;
    public final void lettre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1247:7: (~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) )
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
        "\175\uffff";
    static final String DFA1_eofS =
        "\175\uffff";
    static final String DFA1_minS =
        "\1\54\1\51\20\4\1\21\3\4\1\23\7\4\3\51\67\4\1\7\2\4\1\7\2\4\1\7"+
        "\11\51\3\13\3\40\3\60\3\36\11\uffff";
    static final String DFA1_maxS =
        "\1\54\1\51\20\60\1\21\3\60\1\23\3\60\1\26\3\60\3\51\3\60\3\61\2"+
        "\60\2\61\2\60\2\61\2\60\2\61\45\60\1\25\2\60\1\25\2\60\1\25\11\51"+
        "\3\13\3\40\3\60\3\40\11\uffff";
    static final String DFA1_acceptS =
        "\164\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA1_specialS =
        "\175\uffff}>";
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
            "\1\40\12\uffff\1\37\6\uffff\1\36",
            "\32\33\12\34\1\uffff\1\22\1\35\2\uffff\4\33",
            "\32\33\12\34\1\uffff\1\22\1\35\2\uffff\4\33",
            "\32\41\12\42\1\uffff\1\22\1\43\2\uffff\4\41",
            "\1\44",
            "\1\45",
            "\1\46",
            "\32\41\12\42\1\uffff\1\22\1\43\2\uffff\4\41",
            "\32\41\12\42\1\uffff\1\22\1\43\2\uffff\4\41",
            "\32\47\12\50\1\uffff\1\22\3\uffff\4\47",
            "\32\51\12\52\1\uffff\1\54\3\uffff\4\51\1\53",
            "\32\55\12\56\1\uffff\1\60\3\uffff\4\55\1\57",
            "\32\61\12\62\1\uffff\1\64\3\uffff\4\61\1\63",
            "\32\47\12\50\1\uffff\1\22\3\uffff\4\47",
            "\32\47\12\50\1\uffff\1\22\3\uffff\4\47",
            "\32\51\12\52\1\uffff\1\54\3\uffff\4\51\1\53",
            "\32\51\12\52\1\uffff\1\54\3\uffff\4\51\1\53",
            "\32\65\12\66\1\uffff\1\54\3\uffff\4\65",
            "\32\67\12\70\1\uffff\1\71\3\uffff\4\67",
            "\32\55\12\56\1\uffff\1\60\3\uffff\4\55\1\57",
            "\32\55\12\56\1\uffff\1\60\3\uffff\4\55\1\57",
            "\32\72\12\73\1\uffff\1\60\3\uffff\4\72",
            "\32\74\12\75\1\uffff\1\76\3\uffff\4\74",
            "\32\61\12\62\1\uffff\1\64\3\uffff\4\61\1\63",
            "\32\61\12\62\1\uffff\1\64\3\uffff\4\61\1\63",
            "\32\77\12\100\1\uffff\1\64\3\uffff\4\77",
            "\32\101\12\102\1\uffff\1\103\3\uffff\4\101",
            "\32\65\12\66\1\uffff\1\54\3\uffff\4\65",
            "\32\65\12\66\1\uffff\1\54\3\uffff\4\65",
            "\32\67\12\70\1\uffff\1\71\3\uffff\4\67",
            "\32\67\12\70\1\uffff\1\71\3\uffff\4\67",
            "\32\104\12\105\5\uffff\4\104",
            "\32\72\12\73\1\uffff\1\60\3\uffff\4\72",
            "\32\72\12\73\1\uffff\1\60\3\uffff\4\72",
            "\32\74\12\75\1\uffff\1\76\3\uffff\4\74",
            "\32\74\12\75\1\uffff\1\76\3\uffff\4\74",
            "\32\106\12\107\5\uffff\4\106",
            "\32\77\12\100\1\uffff\1\64\3\uffff\4\77",
            "\32\77\12\100\1\uffff\1\64\3\uffff\4\77",
            "\32\101\12\102\1\uffff\1\103\3\uffff\4\101",
            "\32\101\12\102\1\uffff\1\103\3\uffff\4\101",
            "\32\110\12\111\5\uffff\4\110",
            "\32\104\12\105\2\uffff\1\112\2\uffff\4\104",
            "\32\104\12\105\2\uffff\1\112\2\uffff\4\104",
            "\32\106\12\107\2\uffff\1\113\2\uffff\4\106",
            "\32\106\12\107\2\uffff\1\113\2\uffff\4\106",
            "\32\110\12\111\2\uffff\1\114\2\uffff\4\110",
            "\32\110\12\111\2\uffff\1\114\2\uffff\4\110",
            "\32\115\12\116\5\uffff\4\115",
            "\32\117\12\120\5\uffff\4\117",
            "\32\121\12\122\5\uffff\4\121",
            "\32\115\12\116\1\uffff\1\123\3\uffff\4\115",
            "\32\115\12\116\1\uffff\1\123\3\uffff\4\115",
            "\32\117\12\120\1\uffff\1\124\3\uffff\4\117",
            "\32\117\12\120\1\uffff\1\124\3\uffff\4\117",
            "\32\121\12\122\1\uffff\1\125\3\uffff\4\121",
            "\32\121\12\122\1\uffff\1\125\3\uffff\4\121",
            "\32\126\12\127\1\uffff\1\130\3\uffff\4\126",
            "\32\131\12\132\1\uffff\1\133\3\uffff\4\131",
            "\32\134\12\135\1\uffff\1\136\3\uffff\4\134",
            "\32\126\12\127\1\uffff\1\130\3\uffff\4\126",
            "\32\126\12\127\1\uffff\1\130\3\uffff\4\126",
            "\1\140\12\uffff\1\137\2\uffff\1\141",
            "\32\131\12\132\1\uffff\1\133\3\uffff\4\131",
            "\32\131\12\132\1\uffff\1\133\3\uffff\4\131",
            "\1\143\12\uffff\1\142\2\uffff\1\144",
            "\32\134\12\135\1\uffff\1\136\3\uffff\4\134",
            "\32\134\12\135\1\uffff\1\136\3\uffff\4\134",
            "\1\146\12\uffff\1\145\2\uffff\1\147",
            "\1\150",
            "\1\150",
            "\1\150",
            "\1\151",
            "\1\151",
            "\1\151",
            "\1\152",
            "\1\152",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\166\1\165\1\164",
            "\1\171\1\170\1\167",
            "\1\174\1\173\1\172",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "205:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 | hprim_oru_2_0 | hprim_orm_2_2 | hprim_orm_2_1 | hprim_orm_2_0 | hprim_ora_2_2 | hprim_ora_2_1 | hprim_ora_2_0 );";
        }
    }
 

    public static final BitSet FOLLOW_hprim_oru_2_2_in_hprim68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_oru_2_1_in_hprim72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_oru_2_0_in_hprim76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_orm_2_2_in_hprim82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_orm_2_1_in_hprim86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_orm_2_0_in_hprim90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_ora_2_2_in_hprim96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_ora_2_1_in_hprim100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_ora_2_0_in_hprim104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_hprim_oru_2_2123 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim_oru_2_2127 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_oru_2_2132 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_2136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_hprim_oru_2_1158 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim_oru_2_1162 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_oru_2_1167 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_hprim_oru_2_0193 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim_oru_2_0197 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_oru_2_0202 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_0206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_0211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_ora_in_hprim_ora_2_2229 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_ora_in_hprim_ora_2_2233 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_ora_2_2238 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_ora_2_2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_ora_2_2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_ora_in_hprim_ora_2_1264 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_ora_in_hprim_ora_2_1268 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_ora_2_1273 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_ora_2_1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_ora_2_1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_ora_in_hprim_ora_2_0299 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_ora_in_hprim_ora_2_0303 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_ora_2_0308 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_ora_2_0312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_ora_2_0317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_orm_in_hprim_orm_2_2335 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim_orm_2_2339 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_orm_2_2344 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_orm_2_2348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_orm_2_2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_orm_in_hprim_orm_2_1370 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim_orm_2_1374 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_orm_2_1379 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_orm_2_1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_orm_2_1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_orm_in_hprim_orm_2_0405 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim_orm_2_0409 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_orm_2_0414 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_orm_2_0418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_orm_2_0423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_orm442 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm445 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr_orm_in_body_p_orm451 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr_in_body_obr_orm471 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_obr_orm474 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_body_obx_orm_in_body_obr_orm481 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx_in_body_obx_orm501 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_obx_orm504 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_ora528 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_p_ora531 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_body_ap_ora_in_body_p_ora537 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_ap_in_body_ap_ora556 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_ap_ora559 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_ac_ora_in_body_ap_ora565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_body_ac_ora_second_level_in_body_ac_ora583 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr_ora_in_body_ac_ora588 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_ac_in_body_ac_ora_second_level607 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_ac_ora_second_level610 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr_in_body_obr_ora631 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_obr_ora634 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_body_obx_ora_in_body_obr_ora641 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx_in_body_obx_ora661 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_obx_ora664 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_oru688 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru691 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr_oru_in_body_p_oru697 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr_in_body_obr_oru717 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_obr_oru720 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obx_oru_in_body_obr_oru727 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx_in_body_obx_oru747 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_obx_oru750 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_adm771 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_p_adm774 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_body_ap_adm_in_body_p_adm780 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_ap_in_body_ap_adm799 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_ap_adm802 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_ac_adm_in_body_ap_adm808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_ac_in_body_ac_adm826 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_ac_adm829 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h846 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h850 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_start_line_h852 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h857 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_start_line_h859 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h864 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_start_line_h866 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h871 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_start_line_h873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h885 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_midd_line_h887 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h892 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_midd_line_h894 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h899 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_midd_line_h901 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h906 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_midd_line_h908 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h913 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_midd_line_h915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_2_oru928 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru932 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_2_oru934 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_2_oru939 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru943 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_oru945 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru950 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2_oru952 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_1_oru970 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru974 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_1_oru976 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_1_oru981 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru985 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_oru987 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru992 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1_oru994 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_0_oru1011 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru1015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_0_oru1017 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_0_oru1022 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru1026 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_oru1028 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru1033 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_0_oru1035 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_2_orm1052 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm1056 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_2_orm1058 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_2_orm1063 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm1067 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_orm1069 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm1074 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2_orm1076 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_1_orm1092 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm1096 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_1_orm1098 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_1_orm1103 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm1107 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_orm1109 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm1114 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1_orm1116 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_0_orm1132 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm1136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_0_orm1138 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_0_orm1143 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm1147 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_orm1149 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm1154 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_0_orm1156 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_2_ora1173 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_ora1177 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORA_in_line_h2_2_ora1179 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_2_ora1184 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_ora1188 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_ora1190 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_ora1195 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2_ora1197 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_ora1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_1_ora1213 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_ora1217 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORA_in_line_h2_1_ora1219 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_1_ora1224 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_ora1228 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_ora1230 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_ora1235 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1_ora1237 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_ora1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_0_ora1253 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_ora1257 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORA_in_line_h2_0_ora1259 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_0_ora1264 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_ora1268 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_ora1270 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_ora1275 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_0_ora1277 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_ora1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_2_adm1294 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_adm1298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ADM_in_line_h2_2_adm1300 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_2_adm1305 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_adm1309 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_adm1311 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_adm1316 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2_adm1318 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_adm1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_1_adm1334 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_adm1338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ADM_in_line_h2_1_adm1340 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_1_adm1345 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_adm1349 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_adm1351 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_adm1356 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1_adm1358 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_adm1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_0_adm1374 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_adm1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ADM_in_line_h2_0_adm1380 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_0_adm1385 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_adm1389 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_adm1391 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_adm1396 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_0_adm1398 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_adm1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_ap1416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_line_ap1418 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_ap1420 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1427 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1429 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1434 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap1436 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1441 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap1443 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1448 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap1450 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1455 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1457 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1462 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap1464 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1469 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1471 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1476 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1478 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1483 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1485 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1490 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1492 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1497 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1499 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1504 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap1506 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1511 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap1513 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1518 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_6_in_line_ap1520 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1525 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_ap1527 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1532 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap1534 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1540 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_ap1542 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1549 = new BitSet(new long[]{0x0000020000030000L});
    public static final BitSet FOLLOW_spec_on_optionnal_in_line_ap1551 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1559 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap1561 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1570 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap1572 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1582 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_ap1584 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1595 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_ap1597 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1609 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap1611 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_ac1657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_line_ac1659 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_ac1661 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1668 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ac1670 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1675 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ac1677 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1682 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ac1684 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1689 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ac1691 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1696 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_ac1698 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1703 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_ac1705 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1710 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_spec_ac_8_in_line_ac1712 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1718 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_ac1720 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1727 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_ac1729 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ac1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p1757 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_p1759 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1766 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_p1768 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1773 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_8_3_in_line_p1775 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1780 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1782 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1788 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1790 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1797 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1799 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1807 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1809 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1818 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p1820 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1830 = new BitSet(new long[]{0x0000020000408200L});
    public static final BitSet FOLLOW_spec_const_sexe_in_line_p1832 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1843 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p1845 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1857 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1859 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1872 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1874 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1888 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_p1890 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1929 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p1931 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1935 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p1937 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1955 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1957 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1974 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1976 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2009 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2011 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2046 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2048 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2068 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2070 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2074 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2076 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2099 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2101 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2105 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2107 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2131 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2133 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2156 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2158 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2182 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2184 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2209 = new BitSet(new long[]{0x000202FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2211 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2215 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2217 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2245 = new BitSet(new long[]{0x0000020000069100L});
    public static final BitSet FOLLOW_spec_const_8_25_in_line_p2247 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2274 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2276 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2329 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2331 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2360 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p2362 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2419 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2421 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2480 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2482 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2514 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2516 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2579 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2581 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2615 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2617 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2652 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2654 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2761 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obr2763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obr2765 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_line_obr2767 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2774 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obr2776 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2781 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_3_in_line_obr2783 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2788 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2790 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2795 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2797 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2801 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2803 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2813 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2815 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2819 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2821 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2828 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2830 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2835 = new BitSet(new long[]{0x000200FFC0000000L});
    public static final BitSet FOLLOW_spec_non_sized_9_8_in_line_obr2837 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2842 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2844 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2852 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2854 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2859 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2861 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2869 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2871 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2880 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2882 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2889 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2891 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2899 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2901 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2910 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_16_in_line_obr2912 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2922 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2924 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2935 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_obr2937 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2949 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2951 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2964 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2966 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2980 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2982 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2997 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2999 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3015 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr3017 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3034 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr3036 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3054 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr3056 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3075 = new BitSet(new long[]{0x00000200020E92C0L});
    public static final BitSet FOLLOW_spec_const_9_26_in_line_obr3077 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3097 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr3099 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3120 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr3122 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3144 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3146 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr3150 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3152 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3177 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr3179 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3203 = new BitSet(new long[]{0x0000020001040040L});
    public static final BitSet FOLLOW_spec_const_9_31_in_line_obr3205 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3252 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr3254 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr3258 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr3260 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3288 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3290 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3317 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3319 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3347 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3349 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3378 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr3380 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3410 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr3412 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx3505 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obx3507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obx3509 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_line_obx3511 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3518 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obx3520 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3525 = new BitSet(new long[]{0x00000000003506D0L});
    public static final BitSet FOLLOW_spec_const_10_3_nm_in_line_obx3533 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3542 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3544 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3554 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3556 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3567 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx3569 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3573 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx3575 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_ce_in_line_obx3605 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3614 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3616 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3626 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3628 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3639 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx3641 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3645 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx3647 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_fic_in_line_obx3677 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3686 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3688 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3698 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3700 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3711 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx3713 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3717 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx3719 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_st_in_line_obx3749 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3758 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3760 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3770 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3772 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3783 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3785 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3789 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3791 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_gc_in_line_obx3821 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3830 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3832 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3842 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3844 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3855 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3857 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3861 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3863 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_tx_in_line_obx3893 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3902 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3904 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3914 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3916 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3927 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3929 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3933 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3935 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_std_in_line_obx3965 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3974 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3976 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3986 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3988 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3999 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx4001 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx4005 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx4007 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64041 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64043 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64052 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64054 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_64058 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64060 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64072 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_64074 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_64078 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_64080 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64093 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_64095 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64107 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_64109 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_64113 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_64115 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64130 = new BitSet(new long[]{0x00000200024C12C0L});
    public static final BitSet FOLLOW_spec_const_10_12_in_line_obx2_1_post10_64132 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64147 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_64149 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64165 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64167 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64183 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_64185 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64202 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_64204 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64222 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_64224 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_64227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c4266 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_c4268 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c4272 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_c4274 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c4279 = new BitSet(new long[]{0x0000020000044000L});
    public static final BitSet FOLLOW_spec_const_12_3_in_line_c4281 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c4286 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c4288 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c4292 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c4294 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l4321 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_line_l4323 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l4328 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l4330 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l4337 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_l4339 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l4347 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l4349 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l4358 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l4360 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l4370 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_l4372 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_ac_84412 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_ac_84417 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_spec_ac_8_2_in_spec_ac_84419 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_ac_84424 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_spec_ac_8_3_in_spec_ac_84426 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_ac_84431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_TM_in_spec_ac_8_24454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_TR_in_spec_ac_8_24458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_FR_in_spec_ac_8_24462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PF_in_spec_ac_8_34482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_SS_in_spec_ac_8_34486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_TR_in_spec_ac_8_34490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_on_optionnal4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_on_optionnal4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_sexe4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_sexe4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_sexe4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_04580 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_04583 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_04585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_14606 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_14609 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_14611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_24630 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_24633 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_24635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_7_13_24654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_7_13_24658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_7_13_24662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORU_in_spec_const_7_7_contexte_ORU4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORM_in_spec_const_7_7_contexte_ORM4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORA_in_spec_const_7_7_contexte_ORA4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ADM_in_spec_const_7_7_contexte_ADM4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_7_124753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_7_124757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charT_in_spec_const_7_124761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PORT_in_spec_const_9_314781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_CART_in_spec_const_9_314785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WHLC_in_spec_const_9_314789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WALK_in_spec_const_9_314793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_OP_in_spec_const_8_254814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_IP_in_spec_const_8_254818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ER_in_spec_const_8_254822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PA_in_spec_const_8_254826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MP_in_spec_const_8_254830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_9_264851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_9_264855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_9_264859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_9_264863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_9_264867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_9_264871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_const_9_264875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_9_264881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_9_264885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_nm4906 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_spec_const_10_3_nm4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_ce4929 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CHARE_in_spec_const_10_3_ce4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_spec_const_10_3_st4952 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_st4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_gc4975 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_gc4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_tx4999 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_spec_const_10_3_tx5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_spec_const_10_3_fic5022 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHARI_in_spec_const_10_3_fic5024 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_fic5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std5048 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std5056 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_spec_const_10_3_std5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std5064 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std5066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std5074 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_spec_const_10_3_std5084 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std5092 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std5102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_spec_const_10_3_std5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std5110 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_65135 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_65141 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_65143 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_65150 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_65152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_10_95180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charH_in_spec_const_10_95184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_LL_in_spec_const_10_95188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_HH_in_spec_const_10_95192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_inf_in_spec_const_10_95196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_sup_in_spec_const_10_95200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_95206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_95210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_AA_in_spec_const_10_95214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_Null_in_spec_const_10_95218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_95222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_95226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charB_in_spec_const_10_95230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charW_in_spec_const_10_95236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_95240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_95244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_95248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MS_in_spec_const_10_95252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_VS_in_spec_const_10_95256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_115277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_115281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_115285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_115289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_125310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_10_125314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_10_125318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_10_125322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_125326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_125330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_10_125337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_125341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_12_35362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_12_35366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_25386 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_25392 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_25394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_25417 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_25423 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_25425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45450 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_45456 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45458 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_45465 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45467 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_45475 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_45477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65506 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65512 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65514 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65521 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65523 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65531 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65533 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65542 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65544 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_65554 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_65556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65579 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65586 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65588 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65596 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65598 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65607 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65609 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65619 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65621 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_65632 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_65634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85667 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85673 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85675 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85682 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85684 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85692 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85694 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85703 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85705 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85715 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85717 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85728 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85730 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_85742 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_85744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_35781 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_35787 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_35789 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_35796 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_35798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65821 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65827 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65829 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65836 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65838 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65846 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65848 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65857 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65859 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_65869 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25900 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_25905 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25932 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_25937 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5962 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna5969 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna5971 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna5979 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_spec_sized_8_36013 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_36020 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_36022 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_36030 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_36032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_36072 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_36078 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_36080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_86105 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_non_sized_9_86112 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_86114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_166135 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_166141 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_166143 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_166150 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_166152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_10_46179 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_46185 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46187 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_46194 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46196 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_46204 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46206 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_46215 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46217 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_46227 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_46229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn6286 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_sized_tn6292 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_optionnal6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_mandatory6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_non_sized_optionnal6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_nonsized_mandatory6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_sized_optionnal6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_optionnal6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_mandatory6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_mandatory6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_optionnal6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_06560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_16578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_26598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_spec_10_6_in_final_spec_10_6_tx6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_content_spec_10_66637 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_DELIMITER2_in_content_spec_10_66643 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_content_spec_10_6_in_content_spec_10_66654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6666 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6668 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6672 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6674 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6676 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6680 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6683 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6685 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6690 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6692 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6694 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6698 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6701 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_final_st6722 = new BitSet(new long[]{0x0001E0FFFFFFFFF2L});
    public static final BitSet FOLLOW_chiffre_in_final_nm6751 = new BitSet(new long[]{0x000100FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm6755 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm6757 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm6767 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_nm6769 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm_integer6786 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_CHARA_in_final_ADM6798 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_final_ADM6800 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_final_ADM6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORA6810 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORA6812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_ORA6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORU6822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORU6824 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CHARU_in_final_ORU6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORM6834 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORM6836 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_final_ORM6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_CART6847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_CART6849 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_CART6851 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_CART6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PORT6861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_final_PORT6863 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_PORT6865 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_PORT6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WHLC6875 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_WHLC6877 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WHLC6879 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_final_WHLC6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WALK6889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_WALK6891 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WALK6893 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_final_WALK6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_LL6904 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_LL6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_AA6914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_AA6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_HH6924 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_HH6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MS6934 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_MS6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARV_in_final_VS6944 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_VS6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_Null6954 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CHARu_in_final_Null6956 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null6958 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_06985 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_06987 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_06989 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CHIFFRE0_in_final_version_2_06991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_16999 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_17001 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_17003 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CHIFFRE1_in_final_version_2_17005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_27013 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_27015 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_27017 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_27019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_OP7028 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_OP7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_IP7038 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_IP7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARE_in_final_ER7048 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ER7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PA7058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_PA7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MP7068 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_MP7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_TM7078 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_final_TM7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_TR7088 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_TR7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_FR7098 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_FR7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PF7108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CHARF_in_final_PF7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_SS7118 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_SS7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_charA7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARB_in_final_charB7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_charC7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_final_charD7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_charF7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_charH7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_charI7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_charL7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_charM7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_charN7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_charO7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_charP7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARR_in_final_charR7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_charS7233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_charT7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARU_in_final_charU7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_charW7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARX_in_final_charX7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lettre_in_character7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_character7306 = new BitSet(new long[]{0x0000000000000002L});

}